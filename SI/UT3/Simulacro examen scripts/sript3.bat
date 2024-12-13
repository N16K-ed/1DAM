@echo off
echo Crear proceso automatico?
echo (Si no quiere crear un proceso automatico cierre este script antes de ejecutarlo)
echo.
pause
cls 							  ::(Nombre del archivo)
schtasks /create /tn "BackupDiario" /tr "script3.bat" /sc daily /st 23:00 /f
echo ========================================== > backup_log.txt
echo Borrar archivos temporales?
echo.
pause
echo Inicio del script: %DATE% %TIME% >> backup_log.txt
echo. >> backup_log.txt
echo Limpiando archivos temporales... >> backup_log.txt
echo. >> backup_log.txt
del /f /q /s "%TEMP%" >> backup_log.txt 2>&1
cls
echo Crear backup de Documentos?
echo.
pause
echo. >> backup_log.txt
echo Archivos temporales eliminados. >> backup_log.txt
echo. >> backup_log.txt
echo Realizando backup del directorio "Documentos"... >> backup_log.txt
echo. >> backup_log.txt

setlocal enabledelayedexpansion

:: Obtener la fecha completa
set "fecha=%DATE%"

:: Reemplazar las barras (/) por guiones (-) para que sea válido como nombre de carpeta
set "fechaFormateada=%fecha:/=-%"

if not exist "BACKUPS" mkdir "BACKUPS"
xcopy "%USERPROFILE%\Documents\*" "BACKUPS\Documentos_BACKUP_%fechaFormateada%" /e /i /h /y >> backup_log.txt 2>&1
cls
echo Se ha creado el backup.
echo.
pause