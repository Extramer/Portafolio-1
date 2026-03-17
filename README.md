# Portafolio-1
# Portafolio : Sistema de Apartados - Videojuego Exclusivo


* **Universidad:** Universidad CENFOTEC
* **Curso:** PROGRAMACIÓN ORIENTADA A OBJETOS (SOFT-04/ BISOFT-07)
* **Sección:** SCV2
* **Periodo:** 2026-C1
* **Docente:** Víctor Corrales Thames
* **Estudiante:** [Tu Nombre Completo]


Este repositorio contiene la primera parte del Portafolio de Evidencias. El proyecto modela un sistema de apartados presencial para una tienda de videojuegos física, la cual cuenta con un inventario estrictamente limitado a 50 copias de un juego de edición exclusiva. El sistema garantiza que el límite no sea superado y exige validaciones de presencia física, aplicando los principios fundamentales de la Programación Orientada a Objetos (POO).


* **Abstracción:** Se modelaron entidades del mundo real como `Tienda`, `Cliente` y `Apartado`, extrayendo únicamente los atributos esenciales para el contexto del problema (ej. la presencia física del cliente).
* **Encapsulamiento:** Se protegió la variable del límite de apartados (50) haciéndola privada, previniendo alteraciones externas. Su modificación solo ocurre a través de métodos de validación estrictos.
* **Modularidad:** El código está dividido lógicamente en clases especializadas, separando la información del usuario de la lógica de negocio de la tienda.
* **Relaciones:** Se implementaron relaciones de Asociación (Cliente-Tienda), Agregación (Apartado-Cliente) y Composición (Tienda-Inventario) para conectar los objetos del sistema.


El repositorio está organizado de la siguiente manera para facilitar su revisión:
* `/src`: Contiene los archivos fuente en Java (`Tienda.java`, `Cliente.java`, `Apartado.java`, `Main.java`).
* `/docs`: Contiene el documento Word de entrega principal y los archivos fuente de los diagramas UML.
* `/complemento_digital`: Contiene el enlace e imágenes exportadas del complemento digital (Canva/Miró/Figma).


1. Clonar este repositorio en tu máquina local.
2. Abrir el proyecto en un IDE compatible con Java (como IntelliJ IDEA, Eclipse o NetBeans).
3. Ejecutar el archivo `Main.java` para ver la simulación por consola de los apartados, validaciones de límite y rechazos.
