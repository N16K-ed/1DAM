use bdempresa;

drop procedure if exists revisarSalarios;
delimiter $$
create procedure revisarSalarios ()
deterministic
begin
declare v_codigoEmpleado int;
declare v_oficio varchar(10);
declare v_salario double (6,2);
declare finCursor boolean default false;
declare cursor_Empleados cursor for
	select cod_empleado, oficio, salario from empleados;
declare continue handler for not found set finCursor = true;
open cursor_Empleados;
fetch cursor_Empleados into v_codigoEmpleado, v_oficio, v_salario;
while (not finCursor) do
	if 'JEFESECTOR' in (v_oficio) then
		set v_salario = v_salario * 1.05;
	elseif 'VENDEDOR' in (v_oficio) then
		set v_salario = v_salario * 1.02;
	elseif 'ANALISTA' in (v_oficio) then
		set v_salario = v_salario * 1.07;
	elseif 'EMPLEADO' in (v_oficio) then 
		set v_salario = v_salario * 1.01;
	end if;
    update empleados set salario = v_salario where cod_empleado = v_codigoEmpleado;
    fetch cursor_Empleados into v_codigoEmpleado, v_oficio, v_salario;
end while;
close cursor_Empleados;
select cod_empleado, oficio, salario from empleados;
end $$
delimiter ;

select cod_empleado, oficio, salario from empleados;
call bdempresa.revisarSalarios();