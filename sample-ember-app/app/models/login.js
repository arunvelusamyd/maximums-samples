import DS from 'ember-data';
const { Model, attr } = DS;

export default Model.extend({
  loginId: attr('string'),
  password: attr('string'),
  userName: attr('string'),
  status: attr('string'),
  level: attr('string')
});
