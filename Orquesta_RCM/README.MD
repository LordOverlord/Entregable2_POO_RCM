Orquesta_RCM
============

¿De qué trata?
--------------
Este programa fue hecho como parte de una actividad para la materia de Programación Orientada a Objetos.
Aquí se simula una orquesta que tiene tres tipos de instrumentos: viento, cuerda y percusión.
Cada instrumento tiene sus propios atributos y una forma distinta de “tocar”, todo usando herencia, polimorfismo y encapsulamiento.

¿Qué hace el programa?
----------------------
- Crea una clase base llamada Instrumento, que tiene:
  - nombre
  - tipo
  - material
  - barrio (sirve como país de origen o lugar de procedencia, le puse así para darle sabor 😄)
- Luego se crean tres clases hijas:
  - InstrumentoViento
  - InstrumentoCuerda
  - InstrumentoPercusion
- Cada clase implementa su propia versión del método `tocar()` (aquí entra el polimorfismo).
- Toda la información se muestra en una ventana emergente usando `JOptionPane`.

¿Qué conceptos de POO aplica?
-----------------------------
✅ Herencia → Las clases hijas heredan de Instrumento
✅ Polimorfismo → El método `tocar()` se comporta diferente según el tipo de instrumento
✅ Encapsulamiento → Los atributos están privados y se accede con getters

¿Cómo se compila y ejecuta?
---------------------------
1. Asegúrate de que tu archivo esté guardado con codificación UTF-8 (para que no falle por los emojis).
2. Abre la terminal en la carpeta del archivo y ejecuta:

   javac -encoding UTF-8 Orquesta_RCM.java

3. Esto creará los archivos `.class`. Luego, puedes generar un `.jar` si quieres ejecutarlo más fácil:

   jar cfm Orquesta_RCM.jar manifest.txt *.class

4. Para correrlo:

   java -jar Orquesta_RCM.jar

   (También puedes correrlo sin `.jar` con: `java Orquesta_RCM`)

¿Qué necesito?
--------------
- Java JDK 8 o superior
- Sistema operativo: Windows, Linux o macOS

Archivos incluidos
------------------
- Orquesta_RCM.java     → Código fuente del programa
- Orquesta_RCM.class    → Archivo compilado (opcional)
- Orquesta_RCM.jar      → Ejecutable del programa (opcional)
- manifest.txt          → Archivo que indica el punto de entrada del `.jar`
- README.txt            → Este archivo explicativo

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
