<!DOCTYPE html>
<html>
<head>
    <title>Resultados</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        ul { list-style-type: none; }
    </style>
</head>
<body>
    <h1>Resultados del Formulario</h1>
    <p><strong>Nombre:</strong> ${trabajador.getNombre()}</p>
    <p><strong>Departamento:</strong> ${trabajador.getDepartamento()}</p>
    <p><strong>Sueldo:</strong> ${trabajador.getSueldo()}</p>
    <p><strong>Contrato:</strong> ${trabajador.getContrato()}</p>

    <a href="/">Volver al formulario</a>
</body>
</html>