drop database if exists ejercicio342;
create database if not exists ejercicio342;
use ejercicio342;

create table if not exists CLIENTES(
ID int primary key,
DNI varchar (9) unique not null,
nombre varchar (50) not null,
apellidos varchar (100) not null
);

create table if not exists PEDIDOS(
ID int primary key,
fecha_pedido date not null,
id_cliente int not null,
constraint fk_pedido_cliente foreign key (id_cliente) references CLIENTES(ID)
);

create table if not exists DETALLES_PEDIDO(
NUM_LINEA int not null,
ID_PEDIDO int not null,
constraint fk_pedido_detalle foreign key (ID_PEDIDO) references PEDIDOS(ID),
primary key (NUM_LINEA, ID_PEDIDO),
producto varchar (50) not null,
cantidad int not null,
precio float not null
);

create table if not exists TARJETAS_PAGO(
ORDEN int not null,
ID_CLIENTE int not null,
constraint fk_cliente_tarjeta foreign key (ID_CLIENTE) references CLIENTES(ID),
primary key (ORDEN, ID_CLIENTE),
titular varchar (50) not null,
nºtarjeta int not null
);