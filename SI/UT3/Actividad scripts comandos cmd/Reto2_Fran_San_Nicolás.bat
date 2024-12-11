@echo off
echo ==== PORCENTAJE DE CPU USADO ====
echo.
wmic cpu get loadpercentage
echo.
echo ==== CANTIDAD DE MEMORIA LIBRE ====
echo.
wmic OS get FreePhysicalMemory
echo.
echo ==== LISTA DE PROCESOS ====
echo. 
tasklist /FI "USERNAME eq %username%"
echo.
pause