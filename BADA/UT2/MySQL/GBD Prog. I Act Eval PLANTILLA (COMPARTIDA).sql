/* Programación MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable
Contenidos: Programación I */
-- NOMBRE DEL ALUMNO: FRANCISCO JAVIER SAN NICOLÁS

SET GLOBAL log_bin_trust_function_creators = 1;
USE bdpedidos; -- Sustituir por la BD correspondiente a la actividad

-- Ejercicio 1 
DROP FUNCTION IF EXISTS contar_clientes;
DELIMITER $$
CREATE FUNCTION contar_clientes(num_empleado INT) RETURNS INT
BEGIN
    DECLARE num_clientes INT;
    SET num_clientes = (SELECT COUNT(*) FROM clientes WHERE representante = num_empleado); 
    RETURN num_clientes;
END $$
DELIMITER ;

SELECT num_empleado AS 'Nº Empleado', Nombre, contar_clientes(num_empleado) AS 'Clientes asignados' FROM empleados;
-- Ejercicio 2 
DROP FUNCTION IF EXISTS productos_vendidos;
DELIMITER $$
CREATE FUNCTION productos_vendidos(vendedor_numero_empleado INT) RETURNS INT
BEGIN
    DECLARE total INT;
    SET total = (SELECT IFNULL(SUM(cantidad), 0) FROM pedidos WHERE vendedor = vendedor_numero_empleado);
    RETURN total;
END $$
DELIMITER ;

SELECT num_empleado AS 'Número de empleado', Nombre, productos_vendidos(num_empleado) AS 'Cantidad de productos vendidos' FROM empleados;
-- Ejercicio 3
DROP FUNCTION IF EXISTS máximoNumeroDeProductosPorPedido
DELIMITER $$
CREATE FUNCTION máximoNumeroDeProductosPorPedido(numeroCliente INT)
RETURNS INT
BEGIN
    DECLARE max_cantidad INT;
    SET max_cantidad =(SELECT IFNULL(MAX(cantidad), 0) FROM pedidos WHERE cliente = numeroCliente);
    RETURN max_cantidad;
END $$
DELIMITER ;

SELECT num_cliente as 'Nº de Cliente', Nombre, máximoNumeroDeProductosPorPedido(num_cliente) as 'Cantidad máxima de productos por pedido' from clientes;





