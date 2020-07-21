/*jshint node:true*/
'use strict';

const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const port = process.env.PORT || 3333;
const fs = require('fs');

const sessionexpress = require('express-session');
const cookieParser = require('cookie-parser');
const path = require('path');
const logger = require('./lib/logger');
const sticky = require('sticky-session');

// User defined
function getServer() {


  let server;

//   if (config.sslEnabled) {
    if (false) {    
    const https = require('https');
    const { constants } = require('crypto');
    const options = {
      //
      // This is the default secureProtocol used by Node.js, but it might be
      // sane to specify this by default as it's required if you want to
      // remove supported protocols from the list. This protocol supports:
      //
      // - SSLv2, SSLv3, TLSv1, TLSv1.1 and TLSv1.2
      //
      // secureProtocol: 'SSLv23_method',

      //
      // Supply `SSL_OP_NO_SSLv3` constant as secureOption to disable SSLv3
      // from the list of supported protocols that SSLv23_method supports.
      //
      // secureOptions: constants.SSL_OP_NO_SSLv3,

      secureOptions: constants.SSL_OP_NO_TLSv1 | constants.SSL_OP_NO_TLSv1_1, //| constants.SSL_OP_NO_TLSv1_2

      key: fs.readFileSync('../server.key'),
      cert: fs.readFileSync('../server.crt')
    };

    server = https.createServer(options, app); //.listen(port);
  } else {
    const http = require('http');
    server = http.createServer(app); //.listen(port);
  }
  return server;

}

let server = getServer();

if (!sticky.listen(server, port)) {
  // Master code
  server.once('listening', function() {
    logger.info(`server started on ${port} port`)
    console.log(`server started on ${port} port`);
  });
} else {
  // Worker code
}

const environment = process.env.NODE_ENV;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());


const logDirectory = path.join(__dirname, 'log');
// const logFile = path.join(logDirectory, 'combined.log');

// ensure log directory exists
fs.existsSync(logDirectory) || fs.mkdirSync(logDirectory);

// fs.existsSync(logFile) || fs.writeFileSync(logFile);

app.use(cookieParser());
app.use(bodyParser.json({
  limit: '50mb'
}));
app.use(bodyParser.raw({
  limit: '5mb'
}));
app.use(bodyParser.text({
  limit: '5mb'
}));

// allow cross-origin access
app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "*");
    res.header("Access-Control-Allow-Methods", "GET,POST,OPTIONS,DELETE,PUT");
    next();
});

//middleware to handle static file resirection with applikcation prefix, the order should be maintained
app.use(function(req, res, next) {
  req.custom = req.url;
  next();
});

const IndexRouter = require('./routers/IndexRouter').IndexRouter;
app.use('/api', new IndexRouter().getRouter());

console.log('About to crank up node');
console.log('PORT=' + port);
console.log('NODE_ENV=' + environment);

app.use(function(err, req, res, next) {
  logger.error(err.stack);    //log the errors
  if (req.headersSent) {
    return next(err);
  }
  if (req.xhr)
    res.status(500).send({ error: '500: Internal server error' });
  else {
    res.status(500);
    res.render('server-error', { error: err });
  }
});

process.on('uncaughtException', function(err) {
  let message = err.stack || JSON.stringify(err) || '';
  const errorMessage = `ProcessUncaughtException: ${message}`;
  logger.error(errorMessage);
});