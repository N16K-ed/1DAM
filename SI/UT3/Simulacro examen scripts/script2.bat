@echo off
echo === Listando procesos con más de 100MB de memoria... === > acciones_registro.txt
tasklist /FO CSV /NH | findstr /R /C:"[1-9][0-9][0-9][0-9]" >> acciones_registro.txt
echo. >> acciones_registro.txt
echo === Terminando el proceso notepad.exe ... === >> acciones_registro.txt
taskkill /IM notepad.exe /F >> acciones_registro.txt 2>&1
echo Se ha generado un informe: acciones_registro.txt
pause