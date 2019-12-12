import Ember from 'ember'

export default Ember.Route.extend({
    model() {
        return this.store.createRecord('login-request');
    },

    actions: {
        submission() {
          let loginRequest = this.modelFor(this.routeName);
          console.log("login id : "+ loginRequest.loginId);
          console.log("password : "+ loginRequest.password);

        }
      }
});