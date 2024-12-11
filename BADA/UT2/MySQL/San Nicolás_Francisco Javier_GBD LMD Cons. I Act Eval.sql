/* LMD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: LMD I */
-- NOMBRE DEL ALUMNO: Francisco Javier San Nicolás

-- Ejercicio 1 
use bdferreteria;
show tables;
describe productos;
select * from productos where fabrica = "aci";

-- Ejercicio 2 
select distinct descripcion from productos order by descripcion;
-- Ejercicio 3
select fabrica, id_producto, precio from productos where precio > 200 order by precio desc;
-- Ejercicio 4
select id_producto from productos where existencias > 100 and existencias < 200;
-- Ejercicio 5
select id_producto from productos where existencias > 100 and existencias < 200 and fabrica = "aci";

-- Ejercicio 6
select fabrica, id_producto, existencias from productos where existencias > 100 and existencias < 200 and (fabrica = "aci" or fabrica = "fea") order by existencias;
-- Ejercicio 7
select * from productos order by existencias limit 3;
-- Ejercicio 8
select * from productos where fabrica = "aci" order by existencias limit 3;
-- Ejercicio 9
select distinct fabrica from productos order by fabrica desc;
-- Ejercicio 10
select * from productos where (id_producto like "%y" or id_producto like "%x") and fabrica = "bic";
-- Ejercicio 11
select * from productos where (id_producto like "%y" or id_producto like "%x") and (fabrica = "bic" or fabrica ="fea");
-- Ejercicio 12
select concat(descripcion,"-",fabrica,"-",id_producto) as 'codificación' from productos order by fabrica;
-- Ejercicio 13
select concat(descripcion,"-",fabrica,"-",id_producto) as 'codificación' from productos where fabrica = "bic";

-- Ejercicio 14
select fabrica, precio, descripcion from productos where (descripcion = "Cubo" or descripcion = "Arandela") and (fabrica = "aci" or fabrica = "bic");
-- 4.7.1
select concat(nombre, ' ', apellidos) from empleados;
select concat(titulo,': ', precio) from libros;
select concat(destinatario,': ', importe,'€') from facturas;
select concat(upper(apellidos),', ',lower(nombre)) as 'Nombre Completo' from empleados;
select concat('Libros: ', titulo,'(',upper(tipo),')') as 'Libro' from libros;
select char_length(nombre) from personas;
select left(apellido,3) from personas;
select right(apellido,2) from personas;
select concat(left(upper(nombre),1),'. ', upper(apellido)) as "Nombre" from personas;
-- 4.7.2
select nombre, apellidos, round(sueldo,1) from empleados;
select titulo, round(precio,0) from libros;
select destinatario, round(importe,1) from facturas;
-- 4.7.3
-- 1
select destinatario, dayofmonth(fecha_hora) from facturas;
-- 3
select destinatario, month(fecha_hora) from facturas;
-- 4
select destinatario, year(fecha_hora) from facturas;
-- 7
select destinatario, date(now()) from facturas;
-- 8 
select destinatario, time(now()) from facturas;
-- 9
select destinatario, fecha_hora, datediff(now(),fecha_hora) from facturas;
-- 14
select NOMBRE, timestampdiff(month,fecha_alta, now()) as 'Antigüedad' from personas where fecha_baja is null;
-- 16
select nombre, timestampdiff(year,fecha_alta,now()) as 'Antigüedad' from personas;
-- 17
select nombre, timestampdiff(year,fecha_alta,01-06-2020) as 'Antiguedad el 01/06/2020' from personas;
-- 18
select distinct(monthname(fecha_alta)) from personas where puesto in('JUBILADO') and SEDE_TRABAJA in('AC');
-- 20
select
