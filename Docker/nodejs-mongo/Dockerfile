# nombre de la imagen seguido de la version, para crear un contenedor
FROM node:14
# dentro del contenedor que se creo con la imagen node, crea la carpeta /usr/src/app
RUN mkdir -p /usr/src/app
# me muevo a la carpeta que se creo (es como hacer un cd en la terminal)
WORKDIR /usr/src/app
# copia los package que tenemos en nuestro proyecto (my pc) dentro del directorio WORKDIR del contenedor
COPY package*.json ./
# luego ejecuta npm install para instalar todos los paquetes y crear la carpeta node_modules en el contenedor
RUN npm install
# copia todo lo del directorio de mi proyecto dentro del WORKDIR del contendor pero ignora lo del .dockerignore
COPY . ./
# el contenedor expone el puerto 3000 que es donde estara corriendo mi aplicacion
EXPOSE 300
# corre la aplicacion dentro del contenedor ejecutando el comando pasado
CMD ["npm", "run", "dev"]