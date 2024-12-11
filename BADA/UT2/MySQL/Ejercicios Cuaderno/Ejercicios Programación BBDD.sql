-- Ejercicios programación

/* 6.3.2.2
drop procedure if exists muestraFechaDada;
Delimiter $$

create procedure muestraFechaDada() 
begin
declare dia int;
declare mes varchar(20);
declare anio int;
declare mensaje varchar(50);
set dia = day(now());
set mes = monthname(now());
set anio = year(now());
set mensaje = concat("The date is ", dia, " of ", mes, " ", anio);
select mensaje;
end $$
delimiter $$

-- 6.4.1.1

drop function if exists fn_diferenciaSalario;
DELIMITER $$
create function fn_diferenciaSalario(param_codigoEmpleado int(11)) returns double
begin 
declare media double;
set media = (select avg(salario) from empleados);
return(select round(media - salario,2) as 'Diferencia' from empleados where cod_empleado = param_codigoEmpleado);
end$$
DELIMITER $$


-- 6.4.2.1

drop function if exists fn_numPedidosPorEstado;
DELIMITER $$
create function fn_numPedidosPorEstado(param_Estado varchar(15)) returns int
begin
return(select count(*) from pedidos where Estado = param_Estado);
end$$
DELIMITER ;

-- 6.4.2.2

drop function if exists fn_sumaSalarioPorPuesto;
DELIMITeR $$
create function fn_sumaSalarioPorPuesto(param_puesto varchar(50)) returns float
begin
declare sumaSalario float;
set sumaSalario = (select sum(sueldo) from empleados where puesto = param_puesto);
return sumaSalario;
end$$
delimiter ;
select puesto, bdjardineria.fn_sumaSalarioPorPuesto(puesto) from empleados group by puesto;
*/

-- 6.4.3.3

drop function if exists fn_anyosTranscurridos;
delimiter $$
create function fn_anyosTranscurridos (fecha1 date, fecha2 date) returns varchar(100)
begin
return concat('Los años');
end$$
delimiter ;


