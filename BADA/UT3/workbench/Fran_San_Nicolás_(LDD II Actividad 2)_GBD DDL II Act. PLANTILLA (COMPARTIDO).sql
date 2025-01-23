/* LDD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: LDD II */
-- NOMBRE DEL ALUMNO: FRANCISCO JAVIER SAN NICOLÁS
drop database if exists ejercicioTarea2;
create database if not exists ejercicioTarea2;
use ejercicioTarea2;

create table if not exists ARTISTAS(
nombre varchar (50) not null,
id int primary key,
lugar_nacimiento varchar (50) not null,
estilo varchar (100),
fecha_nacimiento date not null
);

create table if not exists CLIENTES(
nombre varchar (50) not null,
cod_cliente int primary key,
direccion varchar (100),
dinero float not null
);

create table if not exists ARTISTA_CLIENTE(
cod_artista int,
cod_cliente int,
constraint fk1_artista_cliente_a foreign key (cod_artista) references ARTISTAS(id),
constraint fk2_artista_cliente_c foreign key (cod_cliente) references CLIENTES(cod_cliente),
primary key (cod_artista, cod_cliente)
);

create table if not exists CORRIENTES_ARTISTICAS(
nom_corriente varchar (50) primary key,
siglo int 
);

create table if not exists CLIENTE_CORRIENTE(
cod_cliente int,
nom_corriente varchar (50),
constraint fk1_cliente_corriente_cl foreign key (cod_cliente) references CLIENTES(cod_cliente),
constraint fk2_cliente_corriente_co foreign key (nom_corriente) references CORRIENTES_ARTISTICAS(nom_corriente),
primary key (cod_cliente, nom_corriente)
);

create table if not exists OBRAS(
titulo_obra varchar (100),
id_artista int,
constraint fk_id_aartista foreign key (id_artista) references ARTISTAS(id),
primary key (titulo_obra, id_artista),
precio float not null,
estilo varchar (50),
tipo varchar (50),
año int not null
); 

create table if not exists OBRA_CORRIENTE(
id_artista int,
nom_corriente varchar (50),
titulo_obra varchar (100),
constraint fk1_obra_corriente_o foreign key (id_artista, titulo_obra) references OBRAS(id_artista, titulo_obra),
constraint fk2_obra_corriente_c foreign key (nom_corriente) references CORRIENTES_ARTISTICAS(nom_corriente)
);