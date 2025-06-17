Motocicletas_RCM
================

¿De qué trata?
--------------
Este programa en Java fue hecho como parte de una actividad para la materia de Programación Orientada a Objetos.
Simula un sistema de cotización para una tienda de motocicletas que tiene promociones de fin de año.

El usuario puede elegir la marca de moto, ver el precio base, el descuento que aplica según la marca y el total a pagar.
Todo se maneja desde una interfaz sencilla usando ventanas emergentes (`JOptionPane`), sin consola ni complicaciones.

¿Qué hace?
----------
- Muestra un menú para elegir una marca:
  - Honda: 5% de descuento
  - Yamaha: 8%
  - Suzuki: 10%
  - Otras marcas: 2%
- Una vez elegida, muestra:
  - Precio original
  - Monto del descuento
  - Precio final a pagar
- El menú se repite hasta que el usuario cierre la ventana o cancele

¿Cómo se compila y ejecuta?
---------------------------
1. Asegúrate de tener instalado Java Development Kit (JDK).
2. Abre una terminal o consola en la carpeta donde tengas el archivo `.java`.
3. Para compilar el archivo:

   javac Motocicletas_RCM.java

   Esto generará el archivo `Motocicletas_RCM.class`.

4. Para crear un archivo `.jar` ejecutable:

   jar cfm Motocicletas_RCM.jar manifest.txt Motocicletas_RCM.class

   Asegúrate de que el archivo `manifest.txt` contenga:

   Main-Class: Motocicletas_RCM

   (Y que termine con una línea en blanco)

5. Para correr el programa:

   java -jar Motocicletas_RCM.jar

   También puedes hacer doble clic en el `.jar` si tu sistema lo permite.

¿Qué necesito?
--------------
- Java Runtime Environment (JRE) o Java Development Kit (JDK)
- Funciona en Windows, macOS o Linux sin problema

Archivos del proyecto
---------------------
- Motocicletas_RCM.java   → Código fuente
- Motocicletas_RCM.class  → Código compilado (opcional)
- Motocicletas_RCM.jar    → Ejecutable del programa
- manifest.txt            → Indica el archivo principal al generar el .jar
- README.txt              → Este archivo

Créditos
--------
Autor: Rafael Camacho Mendoza
Clase: Programación Orientada a Objetos
Institución: UNITEC
Año: 2025

Licencia
--------
Este proyecto se comparte bajo la licencia MIT.

MIT License © 2025 Rafael Camacho Mendoza

Puedes usarlo, copiarlo, modificarlo o compartirlo libremente.
Solo te pido que mantengas mi nombre como autor. 🙂
