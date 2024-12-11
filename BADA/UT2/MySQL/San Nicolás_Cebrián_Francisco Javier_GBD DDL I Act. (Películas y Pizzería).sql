/* LDD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: LDD I */
-- NOMBRE DEL ALUMNO: Francisco Javier San Nicolás
drop database obras_audiovisuales;
drop database negocio;
-- Ejercicio 1
create database if not exists obras_audiovisuales;
-- Ejercicio 2
use obras_audiovisuales;
create table if not exists largometrajes(
duracion INTEGER UNSIGNED,
constraint titulo_ano unique (titulo, ano_estreno) ,
titulo VARCHAR (30) not null,
codigo_largometraje INTEGER UNSIGNED PRIMARY KEY,
tipo_publico ENUM ('Infantil','Público general','Adultos'),
ano_estreno YEAR NOT NULL,
valoracion double
);
-- Ejercicio 3
describe largometrajes;
-- Ejercicio 4
rename table largometrajes to peliculones; 
-- Ejercicio 5
alter table peliculones change column tipo_publico publico_dirigido ENUM ('Infantil','Público general','Adultos');
-- Ejercicio 6
alter table peliculones add column fecha_hora datetime;
-- Ejercicio 7 
alter table peliculones change column fecha_hora fecha_hora datetime default now();
-- Ejercicio 8 
alter table peliculones drop primary key;
-- Ejercicio 9
alter table peliculones drop index titulo_ano;
-- Ejercicio 10
alter table peliculones add primary key (titulo, ano_estreno);
-- Ejercicio 11
describe peliculones;
-- Ejercicio 12
create database if not exists negocio;
-- Ejercicio 13
use negocio;
create table if not exists compras(
fecha_hora_entrega datetime,
fecha_hora_encargo datetime default now() not null,
enTienda_domicilio enum ('Recoger en tienda','Entregar a domicilio') not null,
direccion varchar (100),
cantidad_articulos integer unsigned default 1 not null,
precio_total double not null,
tipo_producto enum ('pizza','empanada') default 'empanada',
nombre_producto varchar (50) not null,
codigo_pedido integer unsigned primary key
);
-- Ejercicio 14
describe compras;
-- Ejercicio 15
alter table compras change column enTienda_domicilio a_domicilio enum ('si','no') default 'no';
-- Ejercicio 16
alter table compras add column telefono varchar (14) not null;
-- Ejercicio 17
alter table compras change column fecha_hora_entrega fecha_hora_entrega time;
-- Ejercicio 18
alter table compras change column fecha_hora_entrega hora_entrega time;
-- Ejercicio 19
alter table compras drop column cantidad_articulos;
-- Ejercicio 20
drop table if exists compras;
create table if not exists compras(
hora_entrega time,
fecha_hora_encargo datetime default now() not null,
a_domicilio enum ('si','no') default 'no',
direccion varchar (100),
precio_total double not null,
tipo_producto enum('pizza','empanada') default 'empanada',
nombre_producto varchar(50) not null,
codigo_pedido integer unsigned primary key,
telefono varchar(14) not null
);

