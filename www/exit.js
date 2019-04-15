var exec = require('cordova/exec');

//TEST
module.exports = function() {
    exec(null, null, 'Exit', 'exit', []);
};
