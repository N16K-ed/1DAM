@echo off

echo ======== INICIO DE PROCESO ======== > informe_resultados.txt
echo Fecha y hora de inicio: %date% %time% >> informe_resultados.txt
echo. >> informe_resultados.txt
echo Limpieza de archivos temporales en progreso... >> informe_resultados.txt



echo ==== BORRANDO ARCHIVOS TEMPORALES... ====
echo.
del /q /s %temp%\*
echo. >> informe_resultados.txt
del /q /s %temp%\* >nul 2>&1
if %errorlevel%==0 (
    echo Limpieza de archivos temporales: EXITOSA >> informe_resultados.txt
) else (
    echo Limpieza de archivos temporales: FALLIDA >> informe_resultados.txt
)
echo Limpieza de archivos temporales completada. >> informe_resultados.txt
echo. >> informe_resultados.txt
echo.



echo ==== VERIFICANDO LA INTEGRIDAD DEL SISTEMA... ====
echo (Necesita ejecutar este script como administrador)
echo.
echo Verificando la integridad del sistema... >> informe_resultados.txt
sfc /scannow >> informe_resultados.txt
if %errorlevel%==0 (
    echo Verificacion de integridad del sistema: EXITOSA >> informe_resultados.txt
) else (
    echo Verificacion de integridad del sistema: ERRORES ENCONTRADOS >> informe_resultados.txt
)
echo Verificacion de integridad completada. >> informe_resultados.txt
echo.



echo ==== GENERANDO INFORME DE LOS RESULTADOS... ====
echo.
echo Fecha y hora de finalizacion: %date% %time% >> informe_resultados.txt
echo ======== FIN DE PROCESO ======== >> informe_resultados.txt



echo ======== FIN DE PROCESO ========
echo (Informe guardado como informe_resultados.txt)
echo.



pause