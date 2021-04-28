import dotenv from 'dotenv';

dotenv.config();

export default {
    PORT: process.env.PORT || process.env.PORT_TEST,
    USER_DB: process.env.USER_DB || process.env.USER_DB_TEST,
    PASS_DB: process.env.PASS_DB || process.env.PASS_DB_TEST,
    CONNECT_DB: process.env.CONNECT_DB || process.env.CONNECT_DB_TEST,
    PRIVILEGE_DB: process.env.PRIVILEGE_DB || process.env.PRIVILEGE_DB_TEST,
}