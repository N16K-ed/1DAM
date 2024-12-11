/* LMD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: LMD I */
-- NOMBRE DEL ALUMNO: FRANCISCO JAVIER SAN NICOLÁS

-- Ejercicio 1 
select nombre, cargo, fecha_nacimiento from empleados
where (month(fecha_nacimiento) = month(now())) and length(nombre) = 5 ;
-- Ejercicio 2 
select monthname(fecha_nacimiento) as "Mes", count(*) as "Núm. empleados" from empleados
group by monthname(fecha_nacimiento)
order by month(fecha_nacimiento);
-- Ejercicio 3
select concat(upper(apellidos),', ',upper(nombre)) as "nombre", timestampdiff(year,fecha_nacimiento,now()) as 'edad' from empleados
order by timestampdiff(year,fecha_nacimiento,now()) desc;
-- Ejercicio 4
select count(*) as 'Núm empleados 2ª quincena' from empleados
where dayofmonth(fecha_nacimiento) > 15;
-- Ejercicio 5
select sum(hijos) as 'Núm. hijos' from empleados
where cargo in('PRESIDENTE','JEFESECTOR','VENDEDOR');
-- Ejercicio 6
select count(nombre) as 'numEmpleados',count(distinct(ext_telefono)) as extensiones from empleados;
-- Ejercicio 7
select cargo as 'cargo', avg(hijos) as 'Media de hijos' from empleados
where hijos is not null
group by cargo
order by avg(hijos) desc;
-- Ejercicio 8
select hijos, count(*) as 'numEmpleados' from empleados
-- where hijos is not null
group by hijos;
-- Ejercicio 9
select left(cod_empleado,1) as 'Cifra inicial del código', count(*) as 'Núm Empleados' from empleados
group by left(cod_empleado, 1);
-- Ejercicio 10
select concat(upper(left(apellidos,1)), lower(substring(apellidos,2))) as 'Apellido' from empleados
where (cargo in('empleado') and hijos > 0) or (cargo in('vendedor') and year(fecha_nacimiento) between 1980 and 1989);




