-- FRAN SAN NICOLÁS DAM1B Act Eval 3 LMD III (Pedidos IV)

use bdpedidos;

-- EJERCICIO 1

select id_modelo as 'id_producto', id_fabrica as 'id_fabrica',
descripcion as 'descripción' 
from productos 
where id_fabrica != any (select fk_fabrica 
						from pedidos join productos on pedidos.fk_fabrica = productos.id_fabrica
						where productos.precio * pedidos.cantidad > 500);

-- EJERCICIO 2
                   
select num_cliente as 'Id Cliente', nombre as 'Nombre Cliente', representante as 'Rep'
from clientes 
where (representante in (select num_empleado 
						 from empleados 
                         where nombre = "Antonio Viger"))
and num_cliente not in (select fk_cliente from pedidos ped 
						join productos pro on ped.fk_fabrica = pro.id_fabrica 
                        where pro.precio * ped.cantidad > 3000); 

-- EJERCICIO 3

select nombre as 'Nombre', num_empleado as 'Id empleado', oficina as 'Num oficina'
from empleados
where objetivo > all (select objetivo from empleados where oficina = 12);

-- EJERCICIO 4

select o.ciudad as 'Ciudad', count(*) as 'Núm. empleados', o.num_oficina as 'Num_oficina'
from oficinas o join empleados e on o.num_oficina = e.oficina 
group by o.num_oficina
having count(*) > (select count(*) from oficinas o 
					join empleados e on o.num_oficina = e.oficina
					where ciudad = "Madrid"); 

-- EJERCICIO 5

select nombre as 'Nombre', cargo as 'Cargo', num_empleado as 'Id empleado'
from empleados where cargo not in ("Dir Ventas") 
and
objetivo > any (select objetivo from empleados where cargo = "Dir Ventas") ;

-- EJERCICIO 6

select id_modelo as 'Modelo', descripcion as 'Producto', id_fabrica as 'Fabrica' 
from productos 
where id_fabrica = any (select id_fabrica 
						from productos 
						where descripcion in ("Manivela"))
order by descripcion ;

-- EJERCICIO 7

select id_modelo as 'Producto', precio as 'Precio', id_fabrica as 'Fabrica'
from productos 
where precio < all (select precio from productos where descripcion in ("Cubo"));