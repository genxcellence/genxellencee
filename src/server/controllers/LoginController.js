'use strict';

const http = require('http');
const JAVA_PORT = 4444;

class LoginController {


  constructor() {

  }

  login(request, response, next) {


    http.get(`http://localhost:${JAVA_PORT}/api/getPass/?id=${request.query.id}&pass=${request.query.pass}`, (resp) => {
            let data = '';
            resp.on('data', (chunk) => {
                data += chunk;
              });
            
              // whole response has been received.
              resp.on('end', () => {
                console.log(JSON.parse(data));
                response.send({
                    "status": 200,
                    "statusText": "Success",
                    "message": "Call Successful!",
                    "id": JSON.parse(data).id,
                    "pass": JSON.parse(data).pass
                });
              });

        }).on("error", (err) => {
            console.log("Error: " + err.message);
            response.send({
                "status": 401,
                "statusText": "Failed",
                "message": "Java Server not available",
            });
        });
  } 

}

exports.LoginController = LoginController;