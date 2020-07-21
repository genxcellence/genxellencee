class IndexRouter {


  constructor() {

    const express = require('express');

    this.router = express.Router();

    //router declaration
    const LoginRouter = require('./LoginRouter').LoginRouter;

    //controller declaration
    this.router.use('/login', new LoginRouter(express).getRoutes());
  }

  getRouter() {
    return this.router;
  }

}

exports.IndexRouter = IndexRouter;
