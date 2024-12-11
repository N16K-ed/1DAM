/* LMD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: LMD I */
-- NOMBRE DEL ALUMNO: FRANCISCO JAVIER SAN NICOLÁS

-- Ejercicio 1 
select count(*) as 'cantidad de arandelas y cubos' from productos
where descripcion in('arandela','cubo');
-- Ejercicio 2 
select fabrica, count(*) as 'cantidad' from productos
group by fabrica;
-- Ejercicio 3
select fabrica from productos
group by fabrica
having count(*)>=3;
-- Ejercicio 4 
select descripcion, count(*) as 'cantidad', sum(existencias) as 'existencias' 
from productos
group by descripcion
having count(*)>1;
-- Ejercicio 5
select fabrica, sum(existencias) as 'Nº de existencias'
from productos
group by fabrica
having sum(existencias) < 100;
-- Ejercicio 6
select fabrica, min(precio) as 'precio minimo'
from productos
group by fabrica
order by min(precio) asc;
-- Ejercicio 7
select fabrica, avg(precio) as 'Precio medio'
from productos
where fabrica in('bic','fea')
group by fabrica;
-- Ejercicio 8
select fabrica, round(avg(precio), 1) as 'Precio medio redondeado'
from productos
group by fabrica
having avg(precio) between 200 and 1000;
-- Ejercicio 9
select fabrica, max(precio) as 'Precio máximo', min(precio) as 'Precio mínimo', max(precio) - min(precio) as 'Diferencia'
from productos
group by fabrica;
-- Ejercicio 10
select fabrica, max(precio) as 'Precio máximo', min(precio) as 'Precio mínimo', max(precio) - min(precio) as 'Diferencia'
from productos
group by fabrica
having Diferencia > 100;




