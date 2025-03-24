
-- FRAN SAN NICOLÁS DAM1B Act1 Eval3 (Pedidos III)

use bdpedidos;

-- EJERCICIO 1

SELECT 
    c.num_cliente, 
    c.nombre, 
    c.representante AS representante_pk
FROM 
    clientes c
WHERE 
    c.limite_credito > (
        SELECT limite_credito
        FROM clientes
        WHERE nombre = 'Antonio Canales'
    )
ORDER BY 
    c.nombre;
    
-- EJERCICIO 2

SELECT 
    e.nombre AS 'Nombre del Empleado', 
    e.oficina AS 'Oficina', 
    e.fecha_contrato AS 'Fecha de Contrato'
FROM 
    empleados e
WHERE 
    e.oficina IN (
        SELECT o.num_oficina
        FROM oficinas o
        WHERE NOT EXISTS (
            SELECT 1 
            FROM oficinas o2
            WHERE o2.objetivo < o.objetivo
        )
    );
    
-- EJERCICIO 3

SELECT 
    p.num_pedido AS 'Número de Pedido', 
    p.fecha_pedido AS 'Fecha de Pedido', 
    p.cantidad AS 'Cantidad'
FROM 
    pedidos p
WHERE 
    p.cantidad > (
        SELECT AVG(cantidad)
        FROM pedidos
    );

-- EJERCICIO 4

SELECT 
    c.num_cliente AS 'Número de Cliente', 
    c.nombre AS 'Nombre del Cliente', 
    c.limite_credito AS 'Límite de Crédito'
FROM 
    clientes c
WHERE 
    c.limite_credito IN (
        SELECT MAX(limite_credito)
        FROM clientes
    );

-- EJERCICIO 5

SELECT 
    c.num_cliente AS 'Número de Cliente', 
    c.nombre AS 'Nombre del Cliente', 
    c.limite_credito AS 'Límite de Crédito'
FROM 
    clientes c
WHERE 
    c.limite_credito > (
        SELECT limite_credito
        FROM clientes
        WHERE nombre = 'Antonio Canales'
    )
    AND c.limite_credito < (
        SELECT limite_credito
        FROM clientes
        WHERE nombre = 'Luis Garcia Anton'
    );

-- EJERCICIO 6

SELECT 
    p.id_fabrica AS 'ID de Fábrica', 
    p.id_modelo AS 'ID de Modelo', 
    p.precio AS 'Precio Máximo'
FROM 
    productos p
WHERE 
    p.precio IN (
        SELECT MAX(precio)
        FROM productos
    );

-- EJERCICIO 7

SELECT 
    e.num_empleado AS 'Número de Empleado', 
    e.nombre AS 'Nombre del Empleado', 
    e.oficina AS 'Oficina'
FROM 
    empleados e
WHERE 
    e.oficina IN (
        SELECT o.num_oficina
        FROM oficinas o
        WHERE o.objetivo > (
            SELECT AVG(objetivo)
            FROM oficinas
        )
    );

-- EJERCICIO 8 (No me sale bien)
SELECT 
    COUNT(e.num_empleado) AS 'Número de Empleados'
FROM 
    empleados e
WHERE 
    e.oficina IN (
        SELECT o.num_oficina
        FROM oficinas o
        WHERE (
            SELECT SUM(o2.objetivo)
            FROM oficinas o2
            WHERE o2.num_oficina = o.num_oficina
        ) IN (
            SELECT MIN(suma_objetivos)
            FROM (
                SELECT SUM(o3.objetivo) AS suma_objetivos
                FROM oficinas o3
                GROUP BY o3.num_oficina
            ) subquery
        )
    );


-- EJERCICIO 9

SELECT 
    o.ciudad AS 'Ciudad de la Oficina',
    (
        SELECT AVG(p.cantidad)
        FROM pedidos p
        WHERE p.fk_vendedor IN (
            SELECT e.num_empleado
            FROM empleados e
            WHERE e.oficina = o.num_oficina
        )
    ) AS 'Media de Cantidad Pedida'
FROM 
    oficinas o
WHERE 
    (
        SELECT AVG(p.cantidad)
        FROM pedidos p
        WHERE p.fk_vendedor IN (
            SELECT e.num_empleado
            FROM empleados e
            WHERE e.oficina = o.num_oficina
        )
    ) > (
        SELECT AVG(p.cantidad)
        FROM pedidos p
    );
