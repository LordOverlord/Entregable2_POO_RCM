ArregloBidi_RCM
===============

¿De qué trata esto?
-------------------
Este programa en Java muestra dos matrices usando ventanas emergentes con Swing (o sea, sin usar la consola).
La idea es practicar cómo manejar arreglos bidimensionales (de esos que tienen filas y columnas)
y usar métodos con ciclos para recorrerlos.

¿Qué hace el programa?
----------------------
- Crea dos matrices con números ya puestos por mí:
  1. Una matriz de 3 filas por 2 columnas (rectangular).
  2. Otra con 3 filas pero columnas desiguales (irregular), como:
     - Fila 1 → 3 números
     - Fila 2 → 2 números
     - Fila 3 → 3 números
- Hay un método que se encarga de mostrar las matrices, usando un `for`.
- Todo se muestra con `JOptionPane`, así que no necesitas ver nada por consola.
- Los nombres de las variables tienen un toque personal: matrizPulgoso, matrizSpice, matrizRafa 😼

Compilación y ejecución
-----------------------
Todo está probado y funcional. Usé los siguientes comandos en la terminal:

Para compilar:

    javac ArregloBidi_RCM.java

Para crear el `.jar` ejecutable:

    jar cfm ArregloBidi_RCM.jar manifest.txt ArregloBidi_RCM.class

Para correr el programa:

    java -jar ArregloBidi_RCM.jar

Archivos que incluye
---------------------
- ArregloBidi_RCM.java   → El código fuente
- ArregloBidi_RCM.class  → El archivo compilado (se genera con javac)
- ArregloBidi_RCM.jar    → El programa ejecutable en Java
- manifest.txt           → Para indicar el archivo principal
- README.txt             → Este archivo explicativo

Autor y contexto
----------------
Este programa forma parte de una actividad para la materia de Programación Orientada a Objetos.
Fue hecho con cariño, paciencia y café.

Autor: Rafael Camacho Mendoza
Clase: POO (Programación Orientada a Objetos)
Escuela: UNITEC
Año: 2025

Licencia
--------
Este programa se puede usar, copiar y modificar libremente.

MIT License © 2025 Rafael Camacho Mendoza

Solo recuerda dejar mi nombre si lo compartes o reutilizas. 😄
