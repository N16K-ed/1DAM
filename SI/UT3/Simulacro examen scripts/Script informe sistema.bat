@echo off
echo ==== INFORME DEL SISTEMA ==== > informe_sistema.txt
echo Fecha: %date% %time% >> informe_sistema.txt
echo. >> informe_sistema.txt

echo Información del sistema: >> informe_sistema.txt
echo. >> informe_sistema.txt
systeminfo >> informe_sistema.txt
echo. >> informe_sistema.txt

echo Espera a que termine el proceso...
echo Programas instalados: >> informe_sistema.txt
wmic product get name >> informe_sistema.txt
echo. >> informe_sistema.txt


echo Espacio libre en disco (KB): >> informe_sistema.txt
wmic OS get FreePhysicalMemory >> informe_sistema.txt
echo. >> informe_sistema.txt
echo ==== FIN DEL INFORME ==== >> informe_sistema.txt
cls
echo Se ha generado un informe del sistema: informe_sistema.txt

pause