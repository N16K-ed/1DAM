-- Cuaderno de ejercicios BBDD UT2
-- Ejercicio 4
-- 4.1
select * from empleados;
select * from facturas;
select * from libros;
select nombre, apellidos, puesto from empleados;
select titulo, precio from libros;
select destinatario, importe, fecha_hora from facturas;
-- 4.2
select nombre, apellidos, sueldo, sueldo * 1.2 as 'Subida de sueldo' from empleados;
select titulo, precio, precio * 0.75 as 'Precio con descuento' from libros;
select destinatario, importe, importe + 2.99 as 'Precio con gastos' from factura;
-- 4.3
-- 4.3.1
select * from empleados where sueldo < 2000;
select * from empleados where puesto = 'encargado';
select * from facturas where importe >= 100;
select * from libros where tipo <> 'divulgación';
select * from empleados where nombre != 'Luis';
-- 4.3.2
select * from empleados where sueldo < 2000 and nombre = 'David';
select * from libros where precio > 20 or autor = 'anónimo';
select * from facturas where importe >= 100;
select * from empleados where telefono > 948000000 and nombre <> 'Juan';
select * from empleados where importe > 50 and importe < 200;
select * from libros where precio > 30 or precio < 15;
-- 4.3.3
select * from empleados where telefono between 948000000 and 980000000;
select * from libros where precio between 15 and 30;
select * from libro where ISBN not between 431501467 and 705940145;
select * from facturas where importe not between 50 and 200;
-- 4.3.4
select * from empleados where apellidos like '%ez';
select * from empleados where apellidos like '%ez%';
select * from empleados where nombre like '%a';
select * from facturas where destinatario like 'Alan %';
select * from facturas where destinatario like '% _eumann';
select * from libros where titulo like 'El % de _or_es';
select * from libros where titulo like 'La%';
-- 4.3.5
select * from empleados where email is null;
select * from libros where autor is null;
select * from empleados where email is not null;
select * from libros where autor is not null;
-- 4.4
select * from empleados where sueldo > 1300 and sueldo < 1600 and email is not null;
select * from empleados where puesto in('operario','encargado') and sueldo >= 1300;
select * from empleados where puesto not in ('profesor', 'actor') and (sueldo > 1400 or telefono like "948%");
select * from empleados where (sueldo <= 1400 or puesto in ('supervisor') )and nombre not like "M%";
select * from empleados where (sueldo > 2000 or puesto in ('encargado')) and (telefono not like "948%" or email is null);
select * from empleados where (puesto in ('supervisor','operario') and sueldo < 1800 and email is null) or telefono like "979%";
-- 4.8
select sum(salario) from personas where SEDE_TRABAJA = "AC";
select avg(salario) from personas where SEDE_TRABAJA = "AC" and puesto = "operario";
select count(puesto in('jubilado')) from personas;
select max(año_nacimiento) from personas where puesto in('jubilado'); 
-- 4.9
select count( * )from personas group by sede_trabaja;
select sum(salario) from personas group by puesto, SEDE_TRABAJA;
select año_nacimiento, count(*) from personas group by año_nacimiento;
select sede_trabaja, avg(año_nacimiento) from personas group by SEDE_TRABAJA order by avg(año_nacimiento) desc limit 1;
select año_nacimiento, count(*) from personas where año_nacimiento > 1980 group by año_nacimiento;
-- 4.10
-- 4.10.1
select sede_trabaja, count(nombre) from personas
group by sede_trabaja
having count(nombre) > 3;
-- 4.10.2
select puesto, sum(salario) from personas
group by puesto
having sum(salario) > 5000;
-- 4.10.3
select puesto, sum(salario) from personas
where puesto like '%JUBILADO%'
group by puesto;
-- 4.10.4
select sum(salario),puesto from personas
group by puesto
having sum(salario) > 5000;
-- 4.10.5
select puesto, avg(salario) from personas
group by puesto
having avg(salario) between 800  and 1200;
-- 4.10.6
select year(fecha_alta), count(*) from personas
where año_nacimiento > 1980
group by year(fecha_alta)
having count(*) >= 2 ;
-- 4.10.7
select cargo, count(*) from empleados 
group by cargo
having count(*) > 1;

-- 4.10.8
select ext_telefono, count(*) from empleados
where ext_telefono is not null
group by ext_telefono
having count(*) >1; 

-- 5
-- 5.1
-- 5.1.1
select * from oficinas;
insert into oficinas (Oficina, Ciudad, Objetivo, Region) values (101, "Logroño", 500000, "Norte");
-- 5.2.1
update productos
set precio = precio * 1.1
where fabrica ='bic';
-- 5.2.2
update productos
set precio = precio - 1, existencias = existencias - 10
where fabrica in('aci');
-- 5.2.3
update productos
set id_producto = '4000z'
where id_producto = '4000y' and fabrica = 'fea';
-- 5.2.4
update productos
set descripcion = 'balde'
where descripcion = 'cubo';
-- 5.2.1.5
update productos set fabrica = 'aux' where fabrica = 'bic';
update productos set fabrica = 'bic' where fabrica = 'aci';
update productos set fabrica = 'aci' where fabrica = 'aux';
-- 5.2.2
-- 1

update empleados set oficina = 21 where oficinas = 30;







