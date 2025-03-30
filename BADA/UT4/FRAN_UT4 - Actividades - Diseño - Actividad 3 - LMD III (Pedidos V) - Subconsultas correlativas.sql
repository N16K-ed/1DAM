-- FRAN SAN NICOLAS DAM 1B - PEDIDOS V
use bdpedidos;
-- EJERCICIO 1

select * from productos where precio > (select avg(precio) from productos where id_fabrica = 'aci');

-- EJERCICIO 2

select * from clientes where limite_credito < (select sum(pe.cantidad * pr.precio) from pedidos pe join productos pr on pe.fk_fabrica = pr.id_fabrica and pe.fk_modelo = pr.id_modelo where pe.fk_cliente = 2112);

-- EJERCICIO 3

select * from productos pr1 where precio > (select avg(precio) from productos pr2 where pr2.id_fabrica = pr1.id_fabrica);

-- EJERCICIO 4

select pr.id_fabrica as Fabrica, pr.id_modelo as Modelo, pr.Existencias from productos pr join pedidos pe 
on pr.id_fabrica = pe.fk_fabrica and pr.id_modelo = pe.fk_modelo
group by id_fabrica, id_modelo, existencias having sum(pe.cantidad) > pr.existencias;

-- EJERCICIO 5

select e1.num_empleado, e1.nombre, e1.fecha_contrato, e1.oficina, timestampdiff(day,e1.fecha_contrato, now()) as antiguedad_dias from empleados e1 join 
(select oficina, avg(timestampdiff(day, fecha_contrato, now())) as media_antiguedad from empleados group by oficina) e2 on e1.oficina = e2.oficina where timestampdiff(day,e1.fecha_contrato, now()) > e2.media_antiguedad;

-- EJERCICIO 6
-- max
select e.nombre, p.num_pedido, p.cantidad as cantidad from empleados e join pedidos p on e.num_empleado = p.fk_vendedor join productos pr on p.fk_fabrica = pr.id_fabrica and p.fk_modelo = pr.id_modelo
where p.cantidad = (select max(pe.cantidad) from pedidos pe where pe.fk_vendedor = e.num_empleado)order by e.nombre asc;
-- any o all
select e.nombre, p.num_pedido, p.cantidad as importe from empleados e join pedidos p on e.num_empleado = p.fk_vendedor join productos pr on p.fk_fabrica = pr.id_fabrica and p.fk_modelo = pr.id_modelo
where p.cantidad >= all (select pe.cantidad from pedidos pe where pe.fk_vendedor = e.num_empleado) order by e.nombre asc;
-- exists/not exists
select e.nombre, p.num_pedido, p.cantidad as importe from empleados e join pedidos p on e.num_empleado = p.fk_vendedor join productos pr on p.fk_fabrica = pr.id_fabrica and p.fk_modelo = pr.id_modelo
where not exists (select * from pedidos pe where pe.fk_vendedor = e.num_empleado and pe.cantidad > p.cantidad) order by e.nombre asc;

-- EJERCICIO 7
-- min
select pr.id_fabrica, pr.descripcion, p.num_pedido, p.cantidad from productos pr join pedidos p on pr.id_fabrica = p.fk_fabrica and pr.id_modelo = p.fk_modelo where pr.id_fabrica = 'aci'
and p.cantidad = (select min(pe.cantidad) from pedidos pe where pe.fk_fabrica = pr.id_fabrica and pe.fk_modelo = pr.id_modelo) order by p.cantidad asc;
-- any o all
select pr.id_fabrica, pr.descripcion, p.num_pedido, p.cantidad from productos pr join pedidos p on pr.id_fabrica = p.fk_fabrica and pr.id_modelo = p.fk_modelo where pr.id_fabrica = 'aci'
and p.cantidad <= all (select pe.cantidad from pedidos pe where pe.fk_fabrica = pr.id_fabrica and pe.fk_modelo = pr.id_modelo) order by p.cantidad asc;
-- exists o not exists
select pr.id_fabrica, pr.descripcion, p.num_pedido, p.cantidad from productos pr join pedidos p on pr.id_fabrica = p.fk_fabrica and pr.id_modelo = p.fk_modelo where pr.id_fabrica = 'aci'
and not exists (select * from pedidos pe where pe.fk_fabrica = pr.id_fabrica and pe.fk_modelo = pr.id_modelo and pe.cantidad < p.cantidad) order by p.cantidad asc;

-- EJERCICIO 8

select o.num_oficina, o.ciudad, e.nombre, e.objetivo from oficinas o join empleados e on o.num_oficina = e.oficina where not exists (select * from empleados e2 where e2.oficina = e.oficina and e2.objetivo > e.objetivo);


-- EJERCICIO 9
-- Usando LEFT JOIN sin COUNT()
select distinct o.num_oficina, o.ciudad from oficinas o left join empleados e on o.num_oficina = e.oficina left join pedidos p on e.num_empleado = p.fk_vendedor where p.num_pedido is null;
-- No detecta oficinas sin empleados, porque el LEFT JOIN con empleados filtra solo las oficinas con empleados, y luego solo se filtran los que no tienen pedidos.

-- Usando LEFT JOIN con COUNT()
select o.num_oficina, o.ciudad from oficinas o left join empleados e on o.num_oficina = e.oficina left join pedidos p on e.num_empleado = p.fk_vendedor group by o.num_oficina, o.ciudad having count(p.num_pedido) = 0;

-- Con exists/not exists
select o.num_oficina, o.ciudad from oficinas o where not exists (select * from empleados e join pedidos p on e.num_empleado = p.fk_vendedor where e.oficina = o.num_oficina);

-- Con in/not in
select o.num_oficina, o.ciudad from oficinas o where o.num_oficina not in (select distinct e.oficina from empleados e join pedidos p on e.num_empleado = p.fk_vendedor);

-- EJERCICIO 10

select c.num_cliente, c.nombre, c.limite_credito from clientes c left join pedidos p on c.num_cliente = p.fk_cliente left join productos pr on p.fk_fabrica = pr.id_fabrica and p.fk_modelo = pr.id_modelo group by 
c.num_cliente, c.nombre, c.limite_credito having c.limite_credito > sum(p.cantidad * pr.precio);

-- EJERCICIO 11

select o.num_oficina, o.ciudad, o.objetivo, sum(p.cantidad * pr.precio) as total_ventas from oficinas o left join empleados e on o.num_oficina = e.oficina left join pedidos p on e.num_empleado = p.fk_vendedor left join 
productos pr on p.fk_fabrica = pr.id_fabrica and p.fk_modelo = pr.id_modelo group by o.num_oficina, o.ciudad, o.objetivo having o.objetivo is not null and o.objetivo >= sum(p.cantidad * pr.precio);

-- EJERCICIO 12

-- any/all
select count(e.num_empleado) as 'Numero de empleados', o.num_oficina as Oficina from oficinas o left join empleados e on o.num_oficina = e.oficina group by o.num_oficina having count(e.num_empleado) >= all ( select count(e2.num_empleado)
from empleados e2 group by e2.oficina);
-- exists / not exists
select count(e.num_empleado) as 'Numero de empleados', o.num_oficina as Oficina from oficinas o left join empleados e on o.num_oficina = e.oficina group by o.num_oficina having not exists (select 1 from empleados e2
group by e2.oficina having count(e2.num_empleado) > count(e.num_empleado));
/* La original con select * en vez de select 1 daba el siguiente error:
Error Code: 1055. Expression #1 of SELECT list is not in GROUP BY clause and contains nonaggregated column 'bdpedidos.e2.num_empleado' which is not functionally dependent on columns in GROUP BY clause;
this is incompatible with sql_mode=only_full_group_by
Según chat GPT para arreglar esto o cambiamos * por 1 o desactivamos sql_mode=only_full_group_by */