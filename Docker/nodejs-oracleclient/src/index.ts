import app from './app';
import './database/database';


app.listen(app.get('port'), () => {
  console.log('server on port', app.get('port'));
});