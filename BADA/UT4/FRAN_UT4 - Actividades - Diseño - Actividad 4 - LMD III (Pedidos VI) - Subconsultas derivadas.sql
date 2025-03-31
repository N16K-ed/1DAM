-- FRAN SAN NICOLAS DAM 1B - PEDIDOS VI
use bdpedidos;
-- EJERCICIO 1

select nombre as 'nombre cliente', num_cliente as 'Nº Cliente', limite_credito as 'limite credito' from clientes where limite_credito > (select avg(limite_credito) from clientes);

-- EJERCICIO 2

select e.num_empleado as 'id empleado', e.nombre as 'nombre empleado', count(c.num_cliente) as 'total clientes' 
from empleados e join clientes c on e.num_empleado = c.representante group by e.num_empleado having count(c.num_cliente) > (select avg(total) 
																															from (select count(*) as total from clientes group by representante) as subconsulta);
-- EJERCICIO 3
select o.num_oficina as "numero oficina", o.ciudad as "ciudad", count(p.num_pedido) as "total pedidos" 
from oficinas o join empleados e on o.num_oficina = e.oficina join pedidos p on e.num_empleado = p.fk_vendedor 
group by o.num_oficina, o.ciudad 
having count(p.num_pedido) > (select avg(total_pedidos) from (select count(p.num_pedido) as total_pedidos 
from empleados e join pedidos p on e.num_empleado = p.fk_vendedor join oficinas o on e.oficina = o.num_oficina group by o.num_oficina) as subconsulta);

-- EJERCICIO 4
select p.id_fabrica, p.id_modelo, p.descripcion, sum(pe.cantidad) as "cantidad vendida", p.existencias
from productos p 
join pedidos pe on p.id_fabrica = pe.fk_fabrica and p.id_modelo = pe.fk_modelo
group by p.id_fabrica, p.id_modelo, p.descripcion, p.existencias
having sum(pe.cantidad) > p.existencias;

-- EJERCICIO 5
select p.id_fabrica, p.id_modelo, p.descripcion, sum(pe.cantidad) as "total vendido"
from productos p 
join pedidos pe on p.id_fabrica = pe.fk_fabrica and p.id_modelo = pe.fk_modelo
group by p.id_fabrica, p.id_modelo, p.descripcion
having sum(pe.cantidad) > (select avg(total_vendido) from (select sum(pe.cantidad) as total_vendido 
from pedidos pe group by pe.fk_fabrica, pe.fk_modelo) as subconsulta);

