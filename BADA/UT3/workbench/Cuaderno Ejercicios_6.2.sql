use bdEmpresa;

-- 6.5.1.3

drop function if exists fn_edad;
DELIMITER $$
create function fn_edad (param_cod_empleado int) returns int
deterministic
BEGIN
declare vfecha_nac date;
declare edad int;
select fecha_nacimiento from empleados where cod_empleado in (param_cod_empleado) into vfecha_nac;
set edad = timestampdiff(year,vfecha_nac,now());
return edad;
END$$
delimiter ;

drop procedure if exists muestraEdades;
DELIMITER $$
create procedure muestraEdades ()
deterministic
begin
declare flag boolean default false;
declare msg varchar(2000) default " ";
declare vCodigo int;
declare vNombre varchar(100);
declare cCursor cursor for
	select cod_empleado, nombre from empleados;
declare continue handler for not found set flag = true;
open cCursor;
fetch cCursor into vCodigo, vNombre;
while not flag do
	set msg = concat(msg, "El empleado ", vNombre, " tiene ", fn_edad(vCodigo), " años.\n");
	fetch cCursor into vCodigo, vNombre;
end while;
select msg as Mensaje;
end $$
delimiter ;
call muestraEdades;

-- 6.5.2.1
use bdPedidos;

select * from productos;
drop procedure if exists balancePrecios;
DELIMITER $$
create procedure balancePrecios (param_id_fabrica varchar(3))
begin
declare flag boolean default false;
declare vModelo varchar(50);
declare vFabrica varchar(3);
declare vContador int;
declare cCursor cursor for
select fk_modelo, fk_fabrica, count(*) from pedidos 
where fk_fabrica in (param_id_fabrica)
group by fk_modelo, fk_fabrica;
declare continue handler for not found set flag = true;
open cCursor;
fetch cCursor into vModelo, vFabrica, vContador;
while not flag do
	if vFabrica in (param_id_fabrica) then
		if vContador >= 3 then
			update productos set precio = precio * 1.05 where id_modelo = vModelo;
		elseif vContador <3 then
			update productos set precio = precio * 0.9 where id_modelo = vModelo;
        end if;
    end if;
	fetch cCursor into vModelo, vFabrica, vContador;
end while;
close cCursor;
select * from productos;
end $$
delimiter ; 
call balancePrecios('aci');

-- 6.5.2.2

drop procedure if exists revisarVentas;
DELIMITER $$
create procedure revisarVentas ()
begin
declare flag boolean default false;
declare vEmpleado int;
declare vObjetivo int;
declare vTotal int;
declare cCursor cursor for
	select empleados.Num_empleado, empleados.Objetivo, sum(pedidos.cantidad*productos.precio) as 'Suma total vendido'
	from empleados
	join pedidos on empleados.num_empleado = pedidos.fk_vendedor
	join productos on pedidos.fk_fabrica = productos.id_fabrica 
	and pedidos.fk_modelo = productos.id_modelo
	group by empleados.num_empleado, empleados.objetivo;
declare continue handler for not found set flag = true;
open cCursor;
fetch cCursor into vEmpleado, vObjetivo, vTotal;
while not flag do
	if vTotal < vObjetivo then
		update empleados set objetivo = objetivo - 1000 where num_empleado = vEmpleado;
    end if;
	fetch cCursor into vEmpleado, vObjetivo, vTotal;
end while;
end $$
delimiter ;

select empleados.Num_empleado, empleados.Objetivo, sum(pedidos.cantidad*productos.precio) as 'Suma total vendido'
	from empleados
	join pedidos on empleados.num_empleado = pedidos.fk_vendedor
	join productos on pedidos.fk_fabrica = productos.id_fabrica 
	and pedidos.fk_modelo = productos.id_modelo
	group by empleados.num_empleado, empleados.objetivo;

call revisarVentas;

select empleados.Num_empleado, empleados.Objetivo, sum(pedidos.cantidad*productos.precio) as 'Suma total vendido'
	from empleados
	join pedidos on empleados.num_empleado = pedidos.fk_vendedor
	join productos on pedidos.fk_fabrica = productos.id_fabrica 
	and pedidos.fk_modelo = productos.id_modelo
	group by empleados.num_empleado, empleados.objetivo;