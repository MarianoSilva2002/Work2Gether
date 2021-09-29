INSERT INTO empresa(nombre,ruc,razon_social,direccion,distrito) VALUES ('Dubonp SA', 20269151634, 'Dubonp SA', 'Av. Brasil','San Isidro');
INSERT INTO empresa(nombre,ruc,razon_social,direccion,distrito) VALUES ('Alinorte SAC', 20600896297, 'Alinorte SAC', 'Av. Salaverry','Jesús María');

INSERT INTO roles(nombre) VALUES ('Jefe');
INSERT INTO roles(nombre) VALUES ('Empleado');
INSERT INTO roles(nombre) VALUES ('Supervisor');

INSERT INTO mes(mes) VALUES ('Enero');
INSERT INTO mes(mes) VALUES ('Febrero');
INSERT INTO mes(mes) VALUES ('Marzo');
INSERT INTO mes(mes) VALUES ('Abril');
INSERT INTO mes(mes) VALUES ('Mayo');
INSERT INTO mes(mes) VALUES ('Junio');
INSERT INTO mes(mes) VALUES ('Julio');
INSERT INTO mes(mes) VALUES ('Agosto');
INSERT INTO mes(mes) VALUES ('Septiembre');
INSERT INTO mes(mes) VALUES ('Octubre');
INSERT INTO mes(mes) VALUES ('Noviembre');
INSERT INTO mes(mes) VALUES ('Diciembre');

INSERT INTO anio(anio) VALUES(2010);
INSERT INTO anio(anio) VALUES(2011);
INSERT INTO anio(anio) VALUES(2012);
INSERT INTO anio(anio) VALUES(2013);
INSERT INTO anio(anio) VALUES(2014);
INSERT INTO anio(anio) VALUES(2015);
INSERT INTO anio(anio) VALUES(2016);
INSERT INTO anio(anio) VALUES(2017);
INSERT INTO anio(anio) VALUES(2018);
INSERT INTO anio(anio) VALUES(2019);
INSERT INTO anio(anio) VALUES(2020);
INSERT INTO anio(anio) VALUES(2021);

INSERT INTO jefe(nombre, apellidopaterno, apellidomaterno, genero, correo, contrasena, idempresa,idrol) VALUES ('Eduardo','Diaz','Duarte','Masculino','edduar@gmail.com','1234',1,1);
INSERT INTO jefe(nombre, apellidopaterno, apellidomaterno, genero, correo, contrasena, idempresa,idrol) VALUES ('Marcela','Rodriguez','Farias','Femenino','madfar@gmail.com','5678',2,1);

INSERT INTO empleado(nombre, apellidopaterno, apellidomaterno, genero, correo, contrasena, idjefe,idrol) VALUES ('Javier','Requena','Silva','Masculino','jaresi@gmail.com','abcd',1,2);
INSERT INTO empleado(nombre, apellidopaterno, apellidomaterno, genero, correo, contrasena, idjefe,idrol) VALUES ('Sebastian','Terans','Alvarez','Masculino','@gmail.com','efgh',2,2);
