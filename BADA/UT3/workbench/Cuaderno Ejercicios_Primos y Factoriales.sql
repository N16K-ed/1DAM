drop database if exists proceduresCursores;
create database if not exists proceduresCursores;
use proceduresCursores;

-- 6.4.1.1
drop procedure if exists numerosFactoriales;
delimiter $$
create procedure numerosFactoriales (numero int)
deterministic
begin
declare contador int default 2;
declare resultado int default 1;
while contador <= numero do
	set resultado = resultado * contador;
    set contador = contador + 1;
end while;
select concat(numero,'! = ', resultado) as 'Numero Factorial';
end $$
delimiter ;

call numerosFactoriales(7);

-- Numeros Primos

drop function if exists numerosPrimos;
delimiter $$
create function numerosPrimos (numero int) returns boolean
deterministic
begin
declare divisor int default 2;
if numero <= divisor then 
	return true;
else
	while numero > divisor do
		if numero % divisor = 0 then
			return false;
		else
			set divisor = divisor + 1;
		end if;
	end while;
end if;
return true;
end $$
delimiter ;

drop function if exists xPrimos;
delimiter $$
create function xPrimos (cantidad int) returns varchar(200)
deterministic
begin
declare contador int default 1;
declare resultado varchar(200) default concat("Los ", cantidad, ' primeros números primos son: ');
while contador <= cantidad do
	if numerosPrimos(contador) then
		set resultado = concat(resultado, contador, ', ');
	end if;
	set contador = contador + 1;
end while;
set resultado = substring(resultado, 1, char_length(resultado) -2);
set resultado = concat(resultado, ".");
return resultado;
end $$
delimiter ;

select xPrimos(7);