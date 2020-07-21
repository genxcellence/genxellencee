const winston = require('winston'),
  path = require('path');

require('winston-daily-rotate-file');


const myCustomLevels = {
  levels: {
    error: 0,
    warn: 1,
    info: 2,
    verbose: 3,
    debug: 4,
    silly: 5
  },
  colors: {
    error: 'red',
    warn: 'yellow',
    info: 'blue',
    verbose: 'green',
    debug:  'white',
    silly:  'white'
  }
};


winston.addColors(myCustomLevels.colors);


const loggingFileName = 'myLog';

const transport = new (winston.transports.DailyRotateFile)({
  datePattern: 'yyyy-MM-dd',
  filename: path.join(__dirname, "../log", `${loggingFileName}.log`),
});

transport.on('rotate', function(oldFilename, newFilename) {
  logger.info(`File Rotation; OldFile : ${oldFilename} to NewFile ${newFilename}`);
});

const logger = new (winston.Logger)({
  transports: [
    new(winston.transports.Console)({
      timestamp: function() {
        return (new Date())
          .toISOString();
      },
      colorize: true
    }),
    transport
  ]
});

logger.cli();
module.exports = logger;
