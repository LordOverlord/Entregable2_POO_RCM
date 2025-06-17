# Entregable 2 – Programación Orientada a Objetos (POO)
**Autor:** Rafael Camacho Mendoza
**Clase:** Programación Orientada a Objetos – UNITEC
**Año:** 2025

---

## 📦 Descripción general

Este repositorio contiene los ejercicios del segundo entregable de la materia **Programación Orientada a Objetos**, desarrollados en Java y usando Swing para la interfaz gráfica.
Cada carpeta representa un programa que pone en práctica conceptos fundamentales de POO como **herencia**, **encapsulamiento**, **polimorfismo**, **excepciones** y el uso de **arreglos bidimensionales**.

Además, cada programa puede ser compilado y empaquetado como `.jar`, con acciones automatizadas mediante **GitHub Actions**.

---

## 📁 Estructura del repositorio

Entregable2/
├── ArregloBidi_RCM/ # Uso de matrices y métodos con Swing
├── Motocicletas_RCM/ # Cotizador de motocicletas con descuentos
├── Orquesta_RCM/ # Herencia, polimorfismo y encapsulamiento con instrumentos musicales
├── Excepcion_RCM/ # Manejo de excepciones personalizadas
└── .github/workflows/ # GitHub Actions: compilación y releases automáticos


Cada carpeta incluye:

- Código fuente `.java`
- Archivos `.class` compilados
- `manifest.txt` para empaquetar el `.jar`
- `README.txt` y `README.md` por compatibilidad
- `.jar` ejecutable

---

## 🛠️ Compilación

Desde la terminal, navega a cada subcarpeta y ejecuta:

```bash
javac -encoding UTF-8 NombreDelArchivo.java
```

Por ejemplo:

```bash
cd ArregloBidi_RCM
javac -encoding UTF-8 ArregloBidi_RCM.java
```


## 📦 Empaquetado .jar

Asegúrate de tener un archivo manifest.txt con el contenido:

```text
Main-Class: NombrePrincipal
```

Ejemplo para ArregloBidi_RCM:

```bash
jar cfm ArregloBidi_RCM.jar manifest.txt *.class
```

## 🚀 Ejecución

Una vez generado el .jar, ejecuta el programa con:

```bash
java -jar ArregloBidi_RCM.jar
```

## 🔁 Automatización con GitHub Actions

Este repositorio incluye workflows que:

[x] Compilan automáticamente el código al hacer push
[x] Generan el .jar
[x] Publican un release con el binario en la sección de Releases de GitHub

Puedes ejecutar el workflow manualmente desde la pestaña Actions seleccionando una versión (0.1, 0.2, etc.).

## ✅ Temas aplicados

Ejercicio	Temas abordados
ArregloBidi_RCM	Arreglos bidimensionales, métodos, repetición, Swing
Motocicletas_RCM	Menús con JOptionPane, condicionales, descuentos, bucles
Orquesta_RCM	Herencia, polimorfismo, encapsulamiento, uso de clases abstractas, Swing
Excepcion_RCM	Manejo de errores, try/catch, throws, excepciones personalizadas, Swing


## 📜 Licencia

MIT License © 2025 Rafael Camacho Mendoza
Este código puede ser utilizado y modificado libremente para fines educativos o personales.
Por respeto académico, no borres los créditos si reutilizas los ejercicios.