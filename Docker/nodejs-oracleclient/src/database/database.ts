import config from '../config/config';

const oracledb = require('oracledb');

oracledb.getConnection({
    user: config.USER_DB,
    password: config.PASS_DB,
    connectString: config.CONNECT_DB
    //privilege: oracledb.SYSDBA
},
function(err: any, connection: any) {
    if (err) {
        console.error(err.message);
        return;
    }
    connection.execute('SELECT * FROM table_test', function(err: any, result: any) {
        if (err) {
            console.log(err.message);
            return;
        }
        console.log(result.rows);
    });
})