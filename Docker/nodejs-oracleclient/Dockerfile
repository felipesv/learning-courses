FROM node:14

WORKDIR /tmp
RUN apt-get update && \
    apt-get -y upgrade && \
    apt-get -y dist-upgrade && \
    apt-get install -y alien libaio1
RUN wget https://yum.oracle.com/repo/OracleLinux/OL7/oracle/instantclient21/x86_64/getPackage/oracle-instantclient-basic-21.1.0.0.0-1.x86_64.rpm
RUN alien -i --scripts oracle-instantclient*.rpm
RUN rm -f oracle-instantclient*.rpm && \
    apt-get -y autoremove && \
    apt-get -y clean

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY package*.json ./
RUN npm install
COPY . ./
EXPOSE 3000
CMD ["npm", "run", "dev"]
