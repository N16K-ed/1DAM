/* LMD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: PROGRAMACIÓN I  
(si se ve extraño no había plantilla en la tarea a si que he cogido la de la tarea anterior) 
*/
-- NOMBRE DEL ALUMNO: Francisco Javier San Nicolás

-- Ejercicio 1 
DROP DATABASE IF EXISTS proceduresyfunciones;
CREATE DATABASE proceduresyfunciones;

USE proceduresyfunciones;
DROP PROCEDURE IF EXISTS factorial;
DELIMITER $$
CREATE PROCEDURE factorial(numero INT)
DETERMINISTIC
BEGIN
    DECLARE resultado INT DEFAULT 1; 
    DECLARE i INT DEFAULT 1;

    IF numero < 0 THEN
        SELECT 'El número debe ser positivo.' AS Mensaje;
    ELSEIF numero >= 0 and numero <2 THEN
        SELECT CONCAT('El factorial de ', numero, ' es: ', resultado) AS Resultado;
    ELSE
        WHILE i <= numero DO
            SET resultado = resultado * i;
            SET i = i + 1;
        END WHILE;
        SELECT CONCAT('El factorial de ', numero, ' es: ', resultado) AS Resultado;
    END IF;
END$$
DELIMITER ;

CALL factorial(5);
CALL factorial(0);
CALL factorial(1);
CALL factorial(-3);
-- Ejercicio 2 

DROP PROCEDURE IF EXISTS esPrimo;
DELIMITER $$
CREATE PROCEDURE esPrimo(num INT)
DETERMINISTIC
BEGIN
    DECLARE divisor INT DEFAULT 2;
    DECLARE es_primo BOOLEAN DEFAULT TRUE;
	IF num < 2 AND num > 0 THEN
		SELECT concat(num, ' es un número primo') as Resultado;
    ELSEIF num <0 then
		SELECT concat('Por definición un numero negativo no puede ser primo.') as Resultado;
    ELSE
        WHILE divisor < num DO
            IF num % divisor = 0 THEN
                SET es_primo = FALSE;
            END IF;
            SET divisor = divisor + 1;
        END WHILE;

        IF es_primo THEN
            SELECT CONCAT(num, ' es un número primo.') AS Resultado;
        ELSE
            SELECT CONCAT(num, ' no es un número primo.') AS Resultado;
        END IF;
    END IF;
END$$
DELIMITER ;

CALL esPrimo(7);
CALL esPrimo(10);
CALL esPrimo(1);
CALL esPrimo(-7);

-- Ejercicio 3

DROP PROCEDURE IF EXISTS tablasMultiplicar;
DELIMITER $$
CREATE PROCEDURE tablasMultiplicar()
DETERMINISTIC
BEGIN
    DECLARE numeroDeTabla INT DEFAULT 1; 
    DECLARE multiplicador INT DEFAULT 1; 
	DECLARE Resultado VARCHAR(5000) DEFAULT "";
    WHILE numeroDeTabla <= 9 DO
        SET multiplicador = 1;
        WHILE multiplicador <= 10 DO
            SET resultado = CONCAT(resultado, numeroDeTabla, ' x ', multiplicador, ' = ', numeroDeTabla * multiplicador,'\n');
            SET multiplicador = multiplicador + 1;
        END WHILE;
        SET numeroDeTabla = numeroDeTabla + 1;
    END WHILE;
    SELECT Resultado;
END$$
DELIMITER ;

CALL tablasMultiplicar();

-- Ejercicio 4

DROP PROCEDURE IF EXISTS crearBaraja;
DELIMITER $$
CREATE PROCEDURE crearBaraja ()
BEGIN

DECLARE vOrden int default 1;
DECLARE vValor int;
DECLARE vPalo ENUM ('bastos', 'espadas', 'copas', 'oros') DEFAULT 'bastos';

DROP TABLE IF EXISTS BARAJA;
CREATE TABLE IF NOT EXISTS BARAJA (
    orden int PRIMARY KEY CHECK (orden BETWEEN 1 AND 48),
    valor int CHECK (valor BETWEEN 1 AND 12),
    palo ENUM ('bastos', 'espadas', 'copas', 'oros')
);
SET vValor = 1;
SET vPalo = 'bastos';
WHILE vValor <= 12 AND vPalo = 'bastos' DO	
	IF vValor NOT IN (8,9) THEN
		INSERT INTO BARAJA (orden, valor, palo) values (vOrden, vValor, vPalo);
		SET vOrden = vOrden + 1;
    END IF;
    SET vValor = vValor + 1;    
END WHILE;
SET vValor = 1;
SET vPalo = 'espadas';
WHILE vValor <= 12 AND vPalo = 'espadas' DO	
	IF vValor NOT IN (8,9) THEN	
		INSERT INTO BARAJA (orden, valor, palo) values (vOrden, vValor, vPalo);
		SET vOrden = vOrden + 1;
    END IF;
    SET vValor = vValor + 1;
END WHILE;
SET vValor = 1;
SET vPalo = 'copas';
WHILE vValor <= 12 AND vPalo = 'copas' DO	
	IF vValor NOT IN (8,9) THEN	
		INSERT INTO BARAJA (orden, valor, palo) values (vOrden, vValor, vPalo);
		SET vOrden = vOrden + 1;
    END IF;
    SET vValor = vValor + 1;
END WHILE;
SET vValor = 1;
SET vPalo = 'oros';
WHILE vValor <= 12 AND vPalo = 'oros' DO
	IF vValor NOT IN (8,9) THEN		
	INSERT INTO BARAJA (orden, valor, palo) values (vOrden, vValor, vPalo);
        SET vOrden = vOrden + 1;
    END IF;
    SET vValor = vValor + 1;
END WHILE;
SELECT * FROM BARAJA;
END $$
DELIMITER ;

CALL crearBaraja();
