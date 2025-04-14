-- FRAN SAN NICOLÁS

USE bdnba;

-- Ejercicio 1

DELIMITER $$

DROP PROCEDURE IF EXISTS informe $$
CREATE PROCEDURE informe()
BEGIN
    DECLARE done BOOLEAN DEFAULT FALSE;
    DECLARE v_division VARCHAR(20);
    DECLARE v_equipo VARCHAR(20);
    DECLARE v_ciudad VARCHAR(20);
    DECLARE v_num_jug INT;
    DECLARE v_max_jugador VARCHAR(30);
    DECLARE v_peso_max INT;
    DECLARE resultado LONGTEXT DEFAULT '';

    DECLARE cur_div CURSOR FOR
        SELECT DISTINCT Division FROM equipos;

    DECLARE cur_team CURSOR FOR
        SELECT e.Nombre, e.Ciudad, COUNT(j.codigo)
        FROM equipos e
        LEFT JOIN jugadores j ON e.Nombre = j.Nombre_equipo
        WHERE e.Division = v_division
        GROUP BY e.Nombre, e.Ciudad;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur_div;
    SET done = FALSE;
    FETCH cur_div INTO v_division;

    WHILE NOT done DO
        SET resultado = CONCAT(resultado, 'División: ', v_division, ' - Nº Equipos: ',
                      (SELECT COUNT(*) FROM equipos WHERE Division = v_division), '\n');

        OPEN cur_team;
        SET done = FALSE;
        FETCH cur_team INTO v_equipo, v_ciudad, v_num_jug;

        WHILE NOT done DO
            SELECT Nombre, Peso INTO v_max_jugador, v_peso_max
            FROM jugadores
            WHERE Nombre_equipo = v_equipo
            ORDER BY Peso DESC, Nombre ASC
            LIMIT 1;

            SET resultado = CONCAT(resultado, '\tEquipo: ', v_equipo,
                                   ', Ciudad: ', v_ciudad,
                                   ', Nº Jugadores: ', v_num_jug,
                                   ', Jugador más pesado: ', v_max_jugador,
                                   ' (', v_peso_max, ' kg)\n');

            FETCH cur_team INTO v_equipo, v_ciudad, v_num_jug;
        END WHILE;
        CLOSE cur_team;

        SET done = FALSE;
        FETCH cur_div INTO v_division;
    END WHILE;
    CLOSE cur_div;

    SELECT resultado;
END $$

DELIMITER ;

CALL informe();


-- Ejercicio 2

DROP TABLE IF EXISTS Variaciones;

CREATE TABLE Variaciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codJugador INT NOT NULL,
    nomJugador VARCHAR(30) NOT NULL,
    pesoAnterior INT NOT NULL,
    pesoNuevo INT NOT NULL,
    incrementoPorDia FLOAT,
    fechaCambio DATE NOT NULL
);

DROP TRIGGER IF EXISTS controlPeso;

DELIMITER $$
DROP TRIGGER IF EXISTS controlPeso;

DELIMITER $$

CREATE TRIGGER controlPeso
BEFORE UPDATE ON jugadores
FOR EACH ROW
BEGIN
    DECLARE v_fecha_ultima DATE;
    DECLARE v_dias INT;
    DECLARE v_incremento FLOAT;
    DECLARE v_tiene_anterior BOOLEAN;

    IF OLD.Peso <> NEW.Peso THEN
        SET v_fecha_ultima = (
            SELECT MAX(fechaCambio)
            FROM Variaciones
            WHERE codJugador = OLD.codigo
        );

        SET v_tiene_anterior = v_fecha_ultima IS NOT NULL;

        IF v_tiene_anterior THEN
            SET v_dias = DATEDIFF(CURDATE(), v_fecha_ultima);
            IF v_dias = 0 THEN
                SET v_incremento = NEW.Peso - OLD.Peso;
            ELSE
                SET v_incremento = (NEW.Peso - OLD.Peso) / v_dias;
            END IF;
        ELSE
            SET v_incremento = NULL;
        END IF;

        INSERT INTO Variaciones (codJugador, nomJugador, pesoAnterior, pesoNuevo, incrementoPorDia, fechaCambio)
        VALUES (OLD.codigo, OLD.Nombre, OLD.Peso, NEW.Peso, v_incremento, CURDATE());
    END IF;
END $$

DELIMITER ;
