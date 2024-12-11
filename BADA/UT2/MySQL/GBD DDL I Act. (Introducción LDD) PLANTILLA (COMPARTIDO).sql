/* LDD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: LDD I */
-- NOMBRE DEL ALUMNO:
drop database awawawawa;
-- Ejercicio 1 
create database if not exists awawawawa;

-- Ejercicio 2 
show databases;

-- Ejercicio 3: Si. Para conectarse a un servidor y para el funcionamiento del sistema.

-- Ejercicio 4: Da error porque ya existe la base de datos. Borramos todo al principio y ponemos al crear la base de datos IF NOT EXIST para que no se pare la ejecución si ya existe una base de datos con el mismo nobre.

/* Ejercicio 5
create database IF NOT EXISTS nombre_bd;
drop database nombre_bd;
create database nombre_bd; */

-- Ejercicio 6: No, porque no habría manera de diferenciarlas.

-- Ejercicio 7: 
use sys;
show tables;

-- Ejercicio 8
use awawawawa;
show tables;
create table personas (
PRIMARY KEY (numero_documento_identificativo),
CONSTRAINT cl_al_alumnos UNIQUE (nombre, apellidos),
apellidos VARCHAR (50) NOT NULL,
nombre VARCHAR (25) NOT NULL,
compartir_datos ENUM ('progenitor1', 'progenitor2','todos','ninguno'),
fecha_nacimiento DATE,
num_telefono VARCHAR (12),
correo_electronico VARCHAR (70)
);

-- Ejercicio 9
show tables;

-- Ejercicio 10
create table personas;

-- Ejercicio 11: Da error porque la tabla ya existe. al crearla : create table IF NOT EXISTS personas;

-- Ejercicio 12: No, porque no se podrían diferenciar dentro de la base de datos.











