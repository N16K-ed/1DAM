/*No tengo acceso a la plantilla para hacer el ejercicio y tampoco al nombre 
de la base de datos sobre la que hay que hacer el ejercicio

Nombre del alumno: FRANCISCO JAVIER SAN NICOLÁS
Curso: DAM1B
*/
-- Ejercicio 1

drop function if exists alumnoPuedeFCT; 
DELIMITER $$
create function alumnoPuedeFCT(param_id_estadistica INT)
returns int
begin
declare resultado int;
declare modulos_pendientes int default 0;
declare suma_horas int default 0;
if not exists (select 1 from estadisticas_no_relacional where id_estadistica = param_id_estadistica) then return -2;
end if;
select num_modulos_no_aprobados, num_horas_no_aprobadas
into modulos_pendientes, suma_horas
from estadisticas_no_relacional
where id_estadistica = param_id_estadistica;
if modulos_pendientes = 0 then
	set resultado = 0;
elseif modulos_pendientes = 1 and suma_horas <= 350 then
	set resultado = 1;
elseif modulos_pendientes = 2 and suma_horas <= 300 then
	set resultado = 1;
else
	set resultado = -1;
end if;
return resultado;
end $$
DELIMITER ;

-- SELECT alumnoPuedeFCT(id_estadistica); comentado para que no de error al no tener bd

-- Ejercicio 2

drop procedure if exists verificarFCT;
delimiter $$
create procedure verificarFCT(param_id_estadistica int)
begin
declare resultado int;
set resultado = alumnoPuedeFCT(param_id_estadistica);
case 
when resultado = 0 then
	select concat('El alumno con código ', param_id_estadistica, ' puede realizar las FCT: No tiene módulos pendientes.') as Mensaje;
when resultado = 1 then
	select concat('El alumno con código ', param_id_estadistica, ' puede realizar las FCT: Tiene 1 o 2 módulos pendientes dentro de los límites permitidos.') as Mensaje;
when resultado = -1 then
	select concat('El alumno con código ', param_id_estadistica, ' no puede realizar las FCT: Excede los límites de módulos o horas pendientes.') as Mensaje;
when resultado = -2 then
	select concat('El alumno con código ', param_id_estadistica, ' no existe en la base de datos.') as Mensaje;
end case;   
end $$
delimiter ;

-- call verificarFCT(id_estadistica);


