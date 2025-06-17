Excepcion_RCM
=============

¿De qué trata?
--------------
Este programa fue desarrollado como parte de una actividad para la materia de Programación Orientada a Objetos.
Aquí se pone en práctica el manejo de **excepciones en Java** usando `try`, `catch` y `throws`, todo desde una interfaz gráfica con `JOptionPane`.

El usuario debe ingresar un número del 1 al 10. El programa valida si el dato es correcto y lanza mensajes personalizados si hay errores o si se cancela la operación.

¿Qué hace el programa?
----------------------
- Muestra una ventana para que el usuario ingrese un número entre 1 y 10.
- Si se introduce una letra o algo que no es número, se lanza un `NumberFormatException`.
- Si el número está fuera del rango permitido, se lanza una excepción personalizada con mensaje.
- Si el usuario presiona "Cancelar", se lanza una excepción hecha por nosotros (`CancelarOperacionException`) y se informa que se canceló la operación.
- Si todo está bien, muestra un mensaje de éxito con el número ingresado.

¿Qué conceptos de Java aplica?
------------------------------
✅ try–catch para capturar errores sin interrumpir la ejecución del programa
✅ throws para propagar una excepción desde un método
✅ Clase personalizada de excepción (`CancelarOperacionException`)
✅ Swing (`JOptionPane`) para mostrar todo con interfaz gráfica

¿Cómo se compila y ejecuta?
---------------------------
1. Asegúrate de que el archivo `.java` esté guardado en codificación UTF-8.
2. Abre una terminal en la carpeta del proyecto y ejecuta:

   javac -encoding UTF-8 Excepcion_RCM.java

3. Esto generará dos archivos `.class`:
   - Excepcion_RCM.class
   - CancelarOperacionException.class

4. Para empaquetarlo como `.jar`, asegúrate de tener un archivo `manifest.txt` así:

   Main-Class: Excepcion_RCM

   (Nota: debe terminar con una línea en blanco)

5. Empaqueta el `.jar` con:

   jar cfm Excepcion_RCM.jar manifest.txt *.class

6. Y para ejecutarlo:

   java -jar Excepcion_RCM.jar

¿Qué necesito?
--------------
- Java JDK 8 o superior
- Sistema operativo: Windows, Linux o macOS

Archivos incluidos
------------------
- Excepcion_RCM.java              → Código fuente principal
- CancelarOperacionException.java → Clase de excepción personalizada
- Excepcion_RCM.class             → Archivo compilado
- CancelarOperacionException.class → Archivo compilado
- Excepcion_RCM.jar               → Ejecutable (opcional)
- manifest.txt                    → Punto de entrada del `.jar`
- README.txt                      → Este archivo explicativo

Créditos
--------
Autor: Rafael Camacho Mendoza
Clase: Programación Orientada a Objetos
Institución: UNITEC
Año: 2025

Licencia
--------
MIT License © 2025 Rafael Camacho Mendoza

Este programa se puede usar, modificar y compartir libremente, con o sin fines comerciales.
Solo mantén mi nombre por respeto académico y profesional 😎
