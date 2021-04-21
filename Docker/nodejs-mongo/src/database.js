const mongoose = require('mongoose');

// se usaria localhost si la base de datos estuviera en mi equipo
/*mongoose.connect('mongodb://localhost/mydatabase')
    .then(db => console.log('DB is connected to', db.connection.host))
    .catch(err => console.error(err))*/

// como la base de datos esta en un contenedor toca poner el nombre del servicio
mongoose.connect('mongodb://mongo/mydatabase', {
    useNewUrlParser: true,
    useUnifiedTopology: true
})
    .then(db => console.log('DB is connected to', db.connection.host))
    .catch(err => console.error(err))