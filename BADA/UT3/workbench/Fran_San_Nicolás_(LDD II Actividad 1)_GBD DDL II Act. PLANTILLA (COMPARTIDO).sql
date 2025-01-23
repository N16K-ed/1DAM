/* LDD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: LDD II */
-- NOMBRE DEL ALUMNO: Francisco Javier San Nicolás

-- Ejercicio 1 
drop database if exists PersonalDpto;
create database if not exists PersonalDpto;

-- Ejercicio 2 
use PersonalDpto;

create table if not exists DPTO(
division varchar (30) not null,
cod_responsable int not null, 
cod int primary key,
localidad varchar (30) not null,
nombre varchar (20) not null
);

create table if not exists PERSONAL (
fecha_nacimiento date not null,
nombre_completo varchar (20) unique not null,
cod int primary key,
salario float (10,2) not null,
puesto varchar (15) not null,
cod_dpto int not null,
constraint fk_pk_en_DPTO foreign key (cod_dpto) references DPTO(cod),
-- ON UPDATE CASCADE ON DELETE SET NULL
comision_extra float (10,2)
);
-- Ejercicio 3
insert into DPTO (cod, nombre, division, localidad, cod_responsable) values (1, "nombre1", "division1", "localidad1", 1);
insert into DPTO (cod, nombre, division, localidad, cod_responsable) values (2, "nombre2", "division2", "localidad2", 2);


insert into PERSONAL (cod, nombre_completo, puesto, fecha_nacimiento, salario, comision_extra, cod_dpto)
values (1, "nombre completo1", "puesto1", '1999-01-21', 1350.00, 15.0, 1);
insert into PERSONAL (cod, nombre_completo, puesto, fecha_nacimiento, salario, comision_extra, cod_dpto) 
values (2, "nombre completo2", "puesto1", '2001-02-22', 1000.00, 0.0, 2);

-- Ejercicio 4
alter table DPTO add constraint fk_pk_en_PERSONAL foreign key (cod_responsable) references PERSONAL(cod);
/*ON UPDATE CASCADE
ON DELETE SET NULL;
*/ -- En mi workbench 8.03 y version server de mysql 5.7 si pongo esto da error.
-- Ejercicio 5
alter table PERSONAL add column fecha_contratacion date not null default '1000-01-01'; -- Si no hay un default da error al ser not null

-- Ejercicio 6
alter table PERSONAL drop column fecha_contratacion;

-- Ejercicio 7
alter table DPTO add constraint nombre_dpto_unico unique (nombre);












