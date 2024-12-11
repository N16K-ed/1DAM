@echo off
echo ==== VERIFICANDO CONEXION A INTERNET... ====
ping 8.8.8.8
echo.
echo.
echo ==== MOSTRANDO CONEXIONES ACTIVAS... ====
netstat -ano
echo.
echo ==== MOSTRANDO CONFIGURACION IP... ====
echo.
ipconfig
echo.
pause