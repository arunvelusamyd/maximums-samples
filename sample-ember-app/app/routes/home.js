import Ember from 'ember'

export default Ember.Route.extend({
    model() {
        return this.store.createRecord('login');
    },

    actions: {
        submission() {
          let loginRequest = this.modelFor(this.routeName);
          console.log("login id : "+ loginRequest.loginId);
          loginRequest.save().then((data) => {
            console.log("Saving the data");
            console.log(data);
          });
        }
      }
});