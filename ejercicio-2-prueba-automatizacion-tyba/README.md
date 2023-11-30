# Ejercicio 2 Prueba Automatizacion TYBA

Este repositorio cuenta con un set de pruebas automatizadas para el proyecto de automatizacion de Tyba asociada a la plataforma web Saucedemo, construido con Serenity BDD, Gradle, Cucumber, Gherkin, Java, entre otras.

## Pre-requisitos 📋

Necesitas tener previamente instalado en tu maquina:

* [Git](https://git-scm.com/downloads) - El manejador de versiones
* [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) - El IDe De preferencia
* [Chrome Driver](https://chromedriver.chromium.org/downloads) - driver para manipular el navegador chrome, descarga la version que tengas en tu PC
* [Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) - El JDK para correr el robot
* [Gradle](https://gradle.org/install/) - El Gestor de dependencias


## Comenzando 🚀

Para obtener una copia del programa, basta con abrir una consola CMD o Power Shell para Windows, o para Linux y Mac OS utilizar la consola de comandos en una carpeta o en el lugar en el cual desea guardar el proyecto y a continuacion ejecutar el siguente comando git:

git clone https://gitlab.com/ejercicios-tyba/ejercicio-2-prueba-automatizacion.git

### Configuración 🔧

* El proyecto viene configurado para descargar el driver del navegador de tu preferencia (Google Chrome, Mozilla Firefox o Microsoft Edge) de forma automatica mediante el comando "automatic.driver.download" en el archivo **serenity.conf**  en las configuraciones **webdriver**, en el caso de no querer descargar el driver de forma automatica poner el parametro en false, como se ve a continuacion:

```
webdriver {
  driver=chrome
  automatic.driver.download = true
  wait.for.timeout=50000
  timeouts.implicitlywait=50000
}
```


* En el caso que se deshabilite la descarga automatica con "automatic.driver.download, descargar y descomprimir el driver del navegador de tu preferencia (Google Chrome, Mozilla Firefox o Microsoft Edge) en la siguiente ruta "src/main/resources/drivers" dentro del proyecto para el sistema operativo de tu preferencia (Windows o Mac), se puede guaradar en cualquier otra ruta pero en caso de hacerlo debe poner la ruta completa, una vez hecho esto indicar esta ruta en el
  el archivo **serenity.conf**  en las propiedades **webdriver.chrome.driver**, como se explica en el siguiente ejemplo:
```
drivers {
  windows {
    webdriver.chrome.driver="src/main/resources/drivers/windows/chromedriver.exe"
    webdriver.firefox.driver="src/main/resources/drivers/windows/geckodriver.exe"
    webdriver.edge.driver="src/main/resources/drivers/windows/msedgedriver.exe"
    }
  mac {
    webdriver.chrome.driver="src/main/resources/drivers/mac/chromedriver"
    webdriver.firefox.driver="src/main/resources/drivers/mac/geckodriver"
    webdriver.edge.driver="src/main/resources/drivers/mac/msedgedriver"
     }
}
```

* En **IntelliJ** se deben instalar los plugins para que pueda leer y ejecutar las pruebas; Vamos al apartado de plugins de IntelliJ y buscamos e instalamos desde el marketplace de intelliJ los siguientes plugins:

  _- Gradle (Normalmente viene instalado por defecto, pero algunas veces no es asi, por ende hay que revisar.)_

  _- Gherkin_

  _- Cucumber For Java_

  Una ves instalados, reiniciar el Intellij para tener listo el ambiente.

### Ejecutando las pruebas ⚙️

#### Desde el entorno de desarrollo Intellij

* Si deseas ejecutar una prueba en especial _Selecciona el runner que quieres ejecutar y preciona el boton que aparece al lado de los numeros de las lineas._

#### Desde una terminal

* Si deseas ejecutar todas las pruebas y tienes instalado Gradle puedes usar caulquiera de los siguientes comandos:
```
gradle clean test aggregate
```
o
```
gradle clean test --tests *Runner
```
* En caso de necesitar correr las pruebas con otro navegador (Mozilla Firefox o Microsoft Edge) diferente a "Google Chrome" que es el predeterminado lo puede hacer con alguno de estos comandos:
```
gradle clean test aggregate -D"webdriver.driver"=chrome
```
```
gradle clean test aggregate -D"webdriver.driver"=firefox
```
```
gradle clean test aggregate -D"webdriver.driver"=edge
```
* En caso de necesitar correr un grupo de pruebas en especifico se debe ejecutar el siguiente comando:
```
gradle clean test -Dcucumber.filter.tags="@Prueba"
```
donde **@Prueba** corresponde al nombre del tag designado para el escenario que deseo ejecutar del archivo **.feature**.



**NOTA:** En caso tal de que no hayas instalado y configurado Gradle en tu maquina, debes ejecutar las lineas anteriores con el comando `gradlew` en lugar de `gradle`.

## Construido con 🛠️

* [Git](https://git-scm.com/downloads) - El manejador de versiones
* [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) - El IDe De preferencia
* [Chrome Driver](https://chromedriver.chromium.org/downloads) - Chrome driver para manipular el navegador
* [Java 11](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html) - El JDK para correr el robot.
* [Gradle](https://gradle.org/install/) - El Gestor de dependencias
* [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html) - El framework utilizado
* [Cucumber](https://cucumber.io/) - Herramienta que se encarga de transformar los scenarios a lenguaje maquina
* [Gherkin](https://cucumber.io/docs/gherkin/) - El lenguaje que en el que estan escritas las pruebas
* [Junit](https://junit.org/junit4/) - Herramienta que permite ejcución de clases en java

## Ubicación reporte de pruebas generado 📋
Se genera en:  `target/site/serenity/index.html`