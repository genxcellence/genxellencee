'use strict';

const LoginController = require('../controllers/LoginController').LoginController;

class LoginRouter {

  constructor(express) {

    this.routes = express.Router();

    const loginController = new LoginController();

    this.routes.route('/')
      .get(loginController.login.bind(loginController));
  }

  getRoutes() {
    return this.routes;
  }

}


exports.LoginRouter = LoginRouter;
