##### DESDE el docker file

# crea el contenedor apartir del dockerfile
# docker build: comando docker para la imagen
# -t: tag, que es para poder agregar el nombre a la imagen
#    -t <nombre de la imagen>
# .: path, que es la ruta desde donde se va a ejecutar
docker build -t hellonode . 

# crear un contenedor con la imagen creada
# docker run: comando docker para correr una imagen y crear el contenedor
# -p: port le indica al contenedor que puerto interno va a usar y que puerto experto del pc va a estar disponible
#     <puerto del pc>:<puerto del contenedor>
# hellonode: nombre de la imagen
docker run -p 4000:3000 hellonode

### DESDE el docekr-compose

# crea la imagen
docker-compose build 

# levanta el servicio
docekr-compose up

# detener el servicio
docker-compose stop