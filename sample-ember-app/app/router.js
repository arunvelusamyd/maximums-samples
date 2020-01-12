import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route("login" , {path: '/'});
  this.route("home" , {path: '/home'});
});

export default Router;
