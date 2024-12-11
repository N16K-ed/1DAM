@echo off
echo ========================================== > backup_log.txt

echo Inicio del script: %DATE% %TIME% >> backup_log.txt
echo. >> backup_log.txt
echo Limpiando archivos temporales... >> backup_log.txt
echo. >> backup_log.txt
del /f /q /s "%TEMP%" >> backup_log.txt 2>&1
echo Archivos temporales eliminados. >> backup_log.txt
echo. >> backup_log.txt
echo Realizando backup del directorio "Documentos"... >> backup_log.txt
mkdir BACKUPS
xcopy "%USERPROFILE%\Documents\*" "BACKUPS\Documentos_BACKUP_%DATE%" /e /i /h /y >> backup_log.txt 2>&1
REM(por terminar)