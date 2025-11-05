# 🏦 App Banca de Consola (POO en Java)

Proyecto de aplicación de consola desarrollado en **Java (Maven)** para simular las operaciones básicas de una cuenta corriente.

Este sistema demuestra la aplicación de **Programación Orientada a Objetos (POO)**, manejo de estructuras de datos y lógica de negocio centrada en la seguridad y gestión financiera.

---

## Enfoque en Programación Orientada a Objetos (POO)

El sistema modela las entidades financieras y de usuario con clases claras, aplicando Abstracción, Encapsulamiento y Control de Errores (Excepciones):

* **Clases y Abstracción:** El código utiliza clases claramente definidas:
* `Usuario`: Modela los datos personales (nombre, apellido, RUT).
* `CuentaCorriente`: Gestiona el saldo, las operaciones (`abonar`, `cargar`) y la lista de movimientos.
* `Movimiento`: Registra los detalles de cada transacción (tipo, monto, fecha y hora).
* **Encapsulamiento:** Atributos como el saldo y los datos del usuario son privados, controlando las modificaciones a través de métodos.
* **Manejo de Excepciones:** Se emplea `try-catch` para capturar errores de formato (como ingresar letras donde se esperan números) para evitar la finalización abrupta de la aplicación.

---

## Características Clave del Back-End

* **Validaciones de Negocio Estrictas:**
* **Mayor de Edad:** Valida la fecha de nacimiento para asegurar que el usuario sea **mayor de 18 años**.
* **Validación de Sobregiro:** Impide la operación de débito si el monto a cargar es mayor que el saldo disponible.
* **Validación de Formato:** Asegura que los campos de nombre y apellido contengan **solo letras** y que las entradas numéricas sean válidas.
* **Validación de Fechas:** Valida el formato de fecha **DD/MM/YYYY**.
* **Registro de Movimientos:** Utiliza un `ArrayList` para registrar todas las transacciones y limita el historial a los **últimos 10 movimientos** registrados.
* **Manejo de Fechas:** Utiliza la **Java Date/Time API** para registrar la hora exacta de cada movimiento y calcular la edad.

---

<!-- ##  Ejecución Rápida en Línea (Replit)

Este proyecto puede ejecutarse instantáneamente en tu navegador gracias a **Replit**, que prepara el entorno de desarrollo con Java y Maven automáticamente.

[![Run on Replit](https://replit.com/badge/github/ejts29/App-Banca-Consola-POO-Java)](https://replit.com/@ejts29/REPLACE-WITH-YOUR-REPL-LINK) -->

### Ejecución Local

Para ejecutarlo localmente, asegúrate de tener **Java 21** (o compatible) y **Maven** instalados. Puedes utilizar un IDE como **Apache NetBeans** o seguir los pasos de la terminal:

1. Clonar el repositorio.
2. Navegar a la carpeta raíz del proyecto (`Sistema-Gestion-Colaboradores-Java`).
3. Ejecutar el siguiente comando en la terminal:
    ```bash
    mvn clean install exec:java
    ```

---

## 🏷️ Estructura del Proyecto

El proyecto sigue la estructura estándar de **Maven**:
