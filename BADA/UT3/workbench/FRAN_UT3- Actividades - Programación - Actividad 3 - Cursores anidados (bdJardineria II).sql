/* LMD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: PROGRAMACIÓN II  
( si se ve extraño no había plantilla en la tarea a si que he cogido la de la tarea anterior a la tarea anterior (: ) 
*/
-- NOMBRE DEL ALUMNO: Francisco Javier San Nicolás

-- Ejercicio 1
drop procedure if exists p_clientesjardineria2;

delimiter $$
create procedure p_clientesjardineria2 ()
deterministic
begin
declare flag boolean default false;
declare vCodCli int;
declare vNomCli varchar(30);
declare vApeCli varchar(30);
declare vCiudad varchar(50);
declare vPais varchar(50);
declare vDir1 varchar(50);
declare vDir2 varchar(50);

declare vCodPed int;
declare vFechaPed date;
declare vEstado varchar(15);
declare vCodCliPed int;

declare mensaje longtext default "";
declare cClientes cursor for
	select CodigoCliente, NombreContacto, ApellidoContacto, 
	Ciudad, Pais, LineaDireccion1, LineaDireccion2 from clientes;

declare cPedidos cursor for
	select CodigoPedido, FechaPedido, Estado, CodigoCliente from pedidos;
    
declare continue handler for not found set flag = true;

open cClientes;
fetch cClientes into vCodCli, vNomCli, vApeCli, vCiudad, vPais, vDir1, vDir2;
while not flag do
	set mensaje = concat(mensaje, 'El cliente ', vCodCli, ' se llama ', vNomCli,
    ' ', vApeCli, ' vive en ', vCiudad, ' ', vPais, ' ', vDir1, ' ',ifnull(vDir2, ''), '\n');
    open cPedidos;
    fetch cPedidos into vCodPed, vFechaPed, vEstado, vCodCliPed;
    while not flag do
		if vCodCliPed in (vCodCli) then
		set mensaje = concat(mensaje, '\tPedido: ', vCodPed, ' ', vFechaPed, ' ',vEstado, '\n');
		end if;
        fetch cPedidos into vCodPed, vFechaPed, vEstado, vCodCliPed;
	end while;
    close cPedidos;
    set flag = false;
    
    fetch cClientes into vCodCli, vNomCli, vApeCli, vCiudad, vPais, vDir1, vDir2;
end while;
close cClientes;
select mensaje;
end $$
delimiter ;

call p_clientesjardineria2();

-- Ejercicio 1

drop procedure if exists p_clientesjardineria3;
delimiter $$
create procedure p_clientesjardineria3 ()
deterministic
begin
declare flag boolean default false;
declare vCodCli int;
declare vNomCli varchar(30);
declare vApeCli varchar(30);
declare vCiudad varchar(50);
declare vPais varchar(50);
declare vDir1 varchar(50);
declare vDir2 varchar(50);

declare vCodPed int;
declare vFechaPed date;
declare vEstado varchar(15);
declare vCodCliPed int;

declare vCodCliProd int;
declare vCodPedProd int;
declare vCodProd varchar(15);
declare vNomProd varchar(70);
declare vGama varchar(50);
declare vPrecio decimal(15,2);

declare mensaje longtext default "";
declare cClientes cursor for
	select CodigoCliente, NombreContacto, ApellidoContacto, 
	Ciudad, Pais, LineaDireccion1, LineaDireccion2 from clientes;

declare cPedidos cursor for
	select CodigoPedido, FechaPedido, Estado, CodigoCliente from pedidos;

declare cProductos cursor for
	select CodigoCliente, dp.CodigoPedido, productos.CodigoProducto, 
	productos.nombre, productos.gama, productos.PrecioVenta from pedidos pe 
	join detallepedidos dp on pe.CodigoPedido = dp.CodigoPedido
	join productos on dp.CodigoProducto = productos.CodigoProducto;
    
declare continue handler for not found set flag = true;

open cClientes;
fetch cClientes into vCodCli, vNomCli, vApeCli, vCiudad, vPais, vDir1, vDir2;
while not flag do
	set mensaje = concat(mensaje, 'El cliente ', vCodCli, ' se llama ', vNomCli,
    ' ', vApeCli, ' vive en ', vCiudad, ' ', vPais, ' ', vDir1, ' ',ifnull(vDir2, ''), '\n');
    open cPedidos;
    fetch cPedidos into vCodPed, vFechaPed, vEstado, vCodCliPed;
    while not flag do
		if vCodCliPed in (vCodCli) then
		set mensaje = concat(mensaje, '\tPedido: ', vCodPed, ' ', vFechaPed, ' ',vEstado, '\n');
		open cProductos;
        fetch cProductos into vCodCliProd, vCodPedProd, vCodProd, vNomProd, vGama, vPrecio;
        while not flag do
			if vCodCliProd in (vCodCli) and vCodPedProd in (vCodPed) then
			set mensaje = concat(mensaje, '\t\tProducto: ', vCodProd, ' ', vNomProd, ' ', vGama, ' ->', vPrecio, '€\n');       
            end if;
			fetch cProductos into vCodCliProd, vCodPedProd, vCodProd, vNomProd, vGama, vPrecio;
		end while;
        close cProductos;
        set flag = false;
        
        end if;
        fetch cPedidos into vCodPed, vFechaPed, vEstado, vCodCliPed;
	end while;
    close cPedidos;
    set flag = false;
    
    fetch cClientes into vCodCli, vNomCli, vApeCli, vCiudad, vPais, vDir1, vDir2;
end while;
close cClientes;
select mensaje;


end$$
delimiter ;
call p_clientesjardineria3();