/*
Actividad evaluable Programación MySQL III Módulo:GEBD 	Ciclo: DAM1B

Nombre del alumno/a: FRANCISCO JAVIER SAN NICOLÁS
*/

/*Ejercicio 1*/

drop procedure if exists suma;
DELIMITER $$
create procedure suma (var1 float, var2 float)
begin
declare a float;
declare b float;
declare resultado float;
set a = var1;
set b = var2;
set resultado = a + b;
select round(resultado,2) as 'Suma a + b';
end$$
DELIMITER ;


/*Ejercicio 2*/

drop procedure if exists masDe50;
DELIMITER $$
create procedure masDe50 ()
begin
select count(*) as 'Mas de 50 existencias' from productos where existencias > 50;
end$$
DELIMITER ;

/*Ejercicio 3*/

drop procedure if exists masDeNumero;
DELIMITER $$
create procedure masDeNumero(a int)
begin
declare numero int;
set numero = a;
select count(*) as'Mas de numero existencias' from productos where existencias > numero;
end$$
DELIMITER ;

/*Ejercicio 4*/

drop procedure if exists insertar;
DELIMITER $$
create procedure insertar (fabricaP varchar(3), idProdP varchar(5), descP varchar(25), precioP decimal(6,2), existenciasP int(10))
begin
declare fabrica varchar(3);
declare id varchar (5);
declare descrip varchar (25);
declare precio decimal(6,2);
declare existencias int(10);
set fabrica = fabricaP;
set id = idProdP;
set descrip = descP;
set precio = precioP;
set existencias = existenciasP;
insert into productos values (fabrica, id, descrip, precio, existencias); 
end$$
DELIMITER ;

/*Ejercicio 5*/

drop procedure if exists actualizarDescripcion;
DELIMITER $$
create procedure actualizarDescripcion(fab varchar(3), idP varchar(5), nuevaDesc varchar (25))
begin
declare fabrica varchar(3);
declare id varchar (5);
declare nueva varchar (25);
set fabrica = fab;
set id = idP;
set nueva = nuevaDesc;
update productos set descripcion = nueva where fabrica = fab and id_producto = id;
end$$
DELIMITER ;

/*Ejercicio 6*/

drop procedure if exists eliminarProducto
DELIMITER $$
create procedure eliminarProducto (fab varchar(3), idP varchar(5))
begin
declare fabrica varchar(3);
declare id varchar (5);
set fabrica = fab;
set id = idP;
delete from productos where fabrica = fab and id_producto = id;
end$$
