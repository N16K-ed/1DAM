/* LMD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: PROGRAMACIÓN II  
( si se ve extraño no había plantilla en la tarea a si que he cogido la de la tarea anterior a la tarea anterior (: ) 
*/
-- NOMBRE DEL ALUMNO: Francisco Javier San Nicolás

-- Ejercicio 1
DROP FUNCTION IF EXISTS fn_numEmpleadosOficina;
DELIMITER $$
CREATE FUNCTION fn_numEmpleadosOficina(p_codigoOficina VARCHAR(10)) RETURNS INT 
DETERMINISTIC
BEGIN
    DECLARE numEmpleados INT;
    
    IF p_codigoOficina NOT IN (SELECT CodigoOficina FROM Oficinas) THEN
        RETURN -1; 
    END IF;
    
    SELECT COUNT(*) INTO numEmpleados FROM Empleados WHERE CodigoOficina = p_codigoOficina;
    
    RETURN IFNULL(numEmpleados, 0);
END$$
DELIMITER ;

SELECT CodigoOficina, fn_numEmpleadosOficina(CodigoOficina) AS NumEmpleados from oficinas;

-- Ejercicio 2

DROP PROCEDURE IF EXISTS p_empleadosjardineria;

DELIMITER $$
CREATE PROCEDURE p_empleadosjardineria()
DETERMINISTIC
BEGIN
    DECLARE flag BOOLEAN DEFAULT FALSE;
    DECLARE codOficina VARCHAR(10);
    DECLARE v_ciudad VARCHAR(30);
    DECLARE v_pais VARCHAR(50);
    DECLARE v_region VARCHAR(50);
    DECLARE dir1 VARCHAR(50);
    DECLARE dir2 VARCHAR(50);
    DECLARE empCount INT;
    DECLARE resultado VARCHAR(5000) DEFAULT ' ';
    DECLARE cCursor CURSOR FOR 
        SELECT CodigoOficina, Ciudad, Pais, Region, LineaDireccion1, LineaDireccion2 
        FROM Oficinas;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET flag = TRUE;

    OPEN cCursor;
	FETCH cCursor INTO codOficina, v_ciudad, v_pais, v_region, dir1, dir2;
    WHILE NOT flag DO
		SET empCount = fn_numEmpleadosOficina(codOficina);	
        
		SET resultado = CONCAT(resultado, 'La oficina ', codOficina, ' está en ', v_ciudad, ' (',v_region , ') ',v_pais , ' ', dir1, ' ', IFNULL(dir2, ""), ' y tiene ', empCount, ' empleados.\n');
		FETCH cCursor INTO codOficina, v_ciudad, v_pais, v_region, dir1, dir2;
    END WHILE;
    CLOSE cCursor;

    SELECT resultado AS Resultado;
END$$

DELIMITER ;

call p_empleadosjardineria();

-- Ejercicio 3

DROP PROCEDURE IF EXISTS p_cambiaPaisCliente ;
DELIMITER $$
CREATE PROCEDURE p_cambiaPaisCliente()
DETERMINISTIC
BEGIN
    DECLARE flag BOOLEAN DEFAULT FALSE;
    DECLARE clienteID INT;
    DECLARE paisActual VARCHAR(50);  
    DECLARE cCursor CURSOR FOR 
        SELECT CodigoCliente, Pais FROM Clientes;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET flag = TRUE;

    OPEN cCursor;
    FETCH cCursor INTO clienteID, paisActual; 
    WHILE NOT flag DO              
        IF paisActual = 'España' THEN
            UPDATE Clientes
            SET Pais = 'Spain'
            WHERE CodigoCliente = clienteID;
        END IF;
		FETCH cCursor INTO clienteID, paisActual; 
    END WHILE;   
    CLOSE cCursor;
END$$
DELIMITER ;

SELECT COUNT(*), pais FROM clientes GROUP BY pais;
call p_cambiaPaisCliente;
SELECT COUNT(*), pais FROM clientes GROUP BY pais;