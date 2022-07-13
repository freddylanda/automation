# automation
Se crean pruebas automátizadas para el Login/LogOut del Product Store

# Antes de compilar
* Asegurate de que tienes la última versión Chrome, validar que se acompatible con la versión chromedriver que se encuentra dentro de directorio Driver (src\test\resources\Driver) del proyecto. Si es necesario, actualizar ambos.
* Asegurate de tener la configuración e instalación maven (3.8.6)
* Asegurate de tener instalado el JDK 1.8

# Compilación
* En el directorio raíz del proyecto ejecutar:
* mvn test -Dtest="Runner"

# Reportes
* En el directorio raíz del proyecto ejecutar:
* mvn verify -DskipTests
* El reporte de las pruebas se encuentra en el directorio Automation\target\cucumber-report-html\cucumber-html-reports\feature-overview.html
