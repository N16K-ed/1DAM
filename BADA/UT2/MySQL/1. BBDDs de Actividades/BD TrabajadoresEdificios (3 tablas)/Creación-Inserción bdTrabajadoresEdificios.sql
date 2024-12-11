
drop database if exists bdTrabajadoresEdificios;
create database bdTrabajadoresEdificios;
use bdTrabajadoresEdificios;
  /*CREACION DE TABLAS*/
create table trabajador(
id_trabajador smallint, 
nom_trabajador varchar(25) UNIQUE NOT NULL,
tarifa_hr decimal(19,4) NOT NULL,
oficio varchar(25) NOT NULL,
id_supv smallint,
constraint pk_trabajador primary key(id_trabajador)
);
create table edificio(
id_edificio smallint,
dir_edificio varchar(25) not null,
tipo varchar(25) not null,
nivel_calidad smallint not null,
categoria smallint not null default (1),
constraint pk_edificio primary key(id_edificio),
constraint ck_edificio check (categoria>=1 and categoria<=3)
);
create table asignacion(
id_trabajador smallint,
id_edificio smallint,
fecha_inicio date not null,
num_dias smallint not null,
constraint fk_asignacion_trabajador  foreign key (id_trabajador) references trabajador(id_trabajador),
constraint fk_asignacion_edificio  foreign key (id_edificio) references edificio(id_edificio)
);
/*INSERCCIONES*/
insert into trabajador (id_trabajador,nom_trabajador,tarifa_hr,oficio,id_supv) VALUES(1235,'M Faraday',12.50, 'Electricista',1311);
insert into trabajador (id_trabajador,nom_trabajador,tarifa_hr,oficio,id_supv) VALUES(1520,'H Rickover',11.75, 'Fontanero',1520);
insert into trabajador (id_trabajador,nom_trabajador,tarifa_hr,oficio,id_supv) VALUES(1311,'C Coulomb',15.50, 'Electricista',1311);
insert into trabajador (id_trabajador,nom_trabajador,tarifa_hr,oficio,id_supv) VALUES(3001,'J Barrister',8.20, 'Carpintero',3231);
insert into trabajador (id_trabajador,nom_trabajador,tarifa_hr,oficio,id_supv) VALUES(1412,'C Nemo',13.75, 'Fontanero',1520);
insert into trabajador (id_trabajador,nom_trabajador,tarifa_hr,oficio,id_supv) VALUES(2920,'R Garret',10.00, 'Albañil',2920);
insert into trabajador (id_trabajador,nom_trabajador,tarifa_hr,oficio,id_supv) VALUES(3231,'P Mason',17.40, 'Carpintero',3231);
insert into trabajador (id_trabajador,nom_trabajador,tarifa_hr,oficio,id_supv) VALUES (1478,'L Dorado',8.4560,'Informático',1235);

/* insercciones edificio*/
insert into edificio (id_edificio,dir_edificio,tipo,nivel_calidad,categoria)values( 312, '123 Elm', 'Oficina',2,2);
insert into edificio (id_edificio,dir_edificio,tipo,nivel_calidad,categoria)values( 435, '456 Maple', 'Comercio',1,1);
insert into edificio (id_edificio,dir_edificio,tipo,nivel_calidad,categoria)values( 515, '789 Oak', 'Residencia',3,1);
insert into edificio (id_edificio,dir_edificio,tipo,nivel_calidad,categoria)values( 210, '1011Birch', 'Oficina',3,1);
insert into edificio (id_edificio,dir_edificio,tipo,nivel_calidad,categoria)values( 111, '1213 Aspen', 'Oficina',4,1);
insert into edificio (id_edificio,dir_edificio,tipo,nivel_calidad,categoria)values( 460, '1415 Beech', 'Almacen',3,3);
/* inserciones asigancion*/
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1235,312,'10-10-20', 5);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1412,312,'01-10-20', 10);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1235,515,'17-10-20', 22);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(2920,460,'05-10-20', 18);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1412,460,'08-12-20',18);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(2920,435,'28-10-20', 10);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(2920,210,'10-11-20', 15);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(3231,111,'10-11-20', 8);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1412,435,'15-10-20', 15);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1412,515,'05-11-20', 8);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(3231,312,'24-10-20',20);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1520,515,'09-10-20', 14);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1311,435,'08-10-20', 12);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1412,210,'15-11-20', 12);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1412,111,'01-12-20', 4);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(3001,111,'08-10-20', 14);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1311,460,'23-10-20', 24);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(1520,312,'30-10-20', 17);
insert into asignacion (id_trabajador,id_edificio,fecha_inicio,num_dias)values(3001,210,'27-10-20', 14);