-- Subqueries Cuaderno Ejercicios UT4

-- 4.1.3.1

use bdtrabajadoresedificios;

select nom_trabajador from trabajador 
where id_trabajador in (select id_trabajador from asignacion 
						where id_edificio in (select id_edificio from edificio 
                        where tipo in ("oficina")));
                        
-- 4.1.3.2

select nom_trabajador from trabajador 
where tarifa_hr > any (select tarifa_hr from trabajador);

-- 4.2.2.1

use bdempleadosoficinas;

select nombre from clientes 
where repclie in(select numemp from empleados where nombre like "%Juan%");

-- 4.2.2.2

select numemp, nombre, oficina from empleados 
where oficina not in(select oficina from oficinas where ventas < objetivo);

-- 4.2.2.3

select numemp, nombre, oficina from empleados 
where numemp not in (108) and jefe not in (select dir from oficinas where dir in(108))
and oficina is not null order by numemp;

-- 4.5.2.1

select pr.Nombre, pr.Gama, pr.PrecioVenta, aux.media, abs(pr.PrecioVenta - aux.media) as Varianza 
from productos pr 
join (select gama, avg(precioVenta) as media 
	  from productos group by gama) as aux on pr.gama = aux.gama
where abs(pr.PrecioVenta - aux.media) <= ALL (select abs(pr.PrecioVenta - aux.media) as Varianza2 
											  from productos pr2 where pr.gama = pr2.gama);
