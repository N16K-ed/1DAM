-- Ejercicios EV2 LMD
-- 4.2.1.1
use bdcomercioinformatica;  

select fabricante.nombre as Fabricantes, count(producto.codigo_fabricante) as 'Nº Productos'
from fabricante join producto on fabricante.codigo = producto.codigo_fabricante
group by fabricante.nombre
having count(*) > 1;
-- 4.2.2.2
use bdtrabajadoresedificios;

select tr.nom_trabajador as 'Nombre Trabajador', count(ed.id_edificio) as 'Nº Edificios', avg(ed.nivel_calidad) as 'Calidad Media'
from edificio ed join asignacion nm on ed.id_edificio = nm.id_edificio
join trabajador tr on nm.id_trabajador = tr.id_trabajador
group by tr.nom_trabajador
having count(ed.id_edificio) >= 3
order by count(ed.id_edificio) asc, avg(ed.nivel_calidad) asc;

-- 4.2.4.4

use bdempleadosoficinas;
select * from productos prod 
join pedidos ped on prod.Idproducto = ped.producto and prod.idfab = ped.fab;


select prod.descripcion as descripcion, prod.precio as precio, sum(ped.cant) as cantidad,
prod.existencias as existencias, (100*sum(ped.cant) / prod.existencias)  as '% stock pedido'
from productos prod 
join pedidos ped on prod.Idproducto = ped.producto and prod.idfab = ped.fab
group by prod.descripcion, prod.precio, prod.existencias
having (100*sum(ped.cant) / prod.existencias) > 85
order by sum(ped.cant) desc;





