<!DOCTYPE html>
<html>
<head>
    <title>${titulo}</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        label { display: block; margin: 10px 0; }
    </style>
</head>
<body>
<h1>${titulo}</h1>
<form action="/submit" method="post">
    <!-- Campo de texto -->
    <label>
        Nombre:
        <input type="text" name="nombre" required>
    </label>

    <!-- Dropdown -->
    <label>
        Departamento:
        <select name="departamento">
            <option value="Ingenieria">Ingenieria</option>
            <option value="Administracion">Administracion</option>
            <option value="RecursosHumanos">Recursos Humanos</option>
            <option value="Finanzas">Finanzas</option>
        </select>
    </label>

    <label>
        Sueldo:
        <input type="text" name="sueldo" required>
    </label>

    <!-- Radiobuttons -->
    <label>Contrato</label>
    <div>
        <input type="radio" id="temporal" name="contrato" value="temporal" checked>
        <label for="temporal">Temporal</label>
    </div>
    <div>
        <input type="radio" id="fijo" name="contrato" value="fijo" checked>
        <label for="fijo">Fijo</label>
    </div>

    <!-- Botón de envío -->
    <button type="submit">Enviar</button>
</form>
</body>
</html>