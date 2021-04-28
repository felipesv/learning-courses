import express from 'express';
import morgan from 'morgan';
import cors from 'cors';

import config from './config/config';
import testRoute from './routes/test.routes';

const app = express();

console.log(config.PORT)
app.set('port', config.PORT);

app.use(morgan('dev'));
app.use(cors());
app.use(express.json());
app.use(express.urlencoded({extended: false}));
app.use(testRoute);

export default app;