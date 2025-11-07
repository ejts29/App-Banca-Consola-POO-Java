# 🏦 App Banca de Consola (POO en Java)

> Proyecto de aplicación de **consola** desarrollado en **Java (Maven)** para simular las operaciones básicas de una cuenta corriente. ficticia.
>
> Desarrollado en ** un Examen de Programación Orientada a Objetos (POO)**, este sistema demuestra la aplicación rigurosa de principios POO, lógica de negocio compleja y manejo de estructuras de datos, lógica de negocio centrada en la seguridad y gestión en un entorno *backend* puro.

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
##  Ejecución

### Ejecución Rápida en Línea (Replit)

Este proyecto puede ejecutarse instantáneamente en tu navegador gracias a **Replit**, que prepara el entorno de desarrollo con Java y Maven automáticamente, sin necesidad de instalaciones locales.
## Pasos para la Ejecución

1.  **Pincha el enlace:** El enlace te redireccionará a **Replit**.
2.  **Inicia sesión o regístrate:** Inicia sesión en Replit o regístrate si no tienes una cuenta.
3.  **Remix this app:** Una vez que ya tengas tu cuenta, dale al botón **"Remix this app"**. Esto replicará el código en tu cuenta (no te preocupes, luego lo puedes borrar). Sigue las instrucciones.
4.  **Ejecutar:** Te aparecerá un botón **"Project"** en verde. Pínchalo.
5.  **¡Bienvenido!** Ya estás ejecutando el programa y lo puedes usar.
 
[![Run on Replit](https://replit.com/badge/github/ejts29/App-Banca-Consola-POO-Java)](https://replit.com/@ejts29/App-Banca-Consola-POO-Java)

[![Run on Replit](https://replit.com/badge/github/ejts29/Sistema-Gestion-Colaboradores-Java)](https://replit.com/@ejts29/Sistema-Gestion-Colaboradores-Java)
                                                                                    
# Pasos para Eliminar un Repositorio (App) en Replit

A continuación, se detalla cómo borrar una aplicación o repositorio de tu cuenta:

1.  **Ir al menú "Apps":** En la parte extrema izquierda, en el menú principal, busca y haz clic en la opción **"Apps"**.
2.  **Ver tus repositorios:** Allí te aparecerán todos los repositorios (Apps) que tienes creados en Replit.
3.  **Seleccionar el Repositorio:** Identifica y selecciona el repositorio que deseas eliminar de tu cuenta.
4.  **Abrir Opciones y "Delete":** En la parte extrema derecha del repositorio seleccionado, aparecerá un menú con distintas opciones. Selecciona la opción **"Delete"** (Eliminar).
5.  **Confirmar la Eliminación:** Te aparecerá un mensaje de confirmación preguntando si realmente deseas borrarlo. Confirma haciendo clic en **"Deseo borrar la APP"** (o el texto de confirmación equivalente).
6.  **¡Listo!** La App ha sido borrada de tu cuenta.

### Ejecución Local

Para ejecutarlo localmente, asegúrate de tener **Java 21** (o compatible) y **Maven** instalados. Puedes utilizar un IDE como **Apache NetBeans** o seguir los pasos de la terminal:

1. Clonar el repositorio.
2. Navegar a la carpeta raíz del proyecto (`App-Banca-Consola-POO-Java`).
3. Ejecutar el siguiente comando en la terminal:
    ```bash
    mvn clean install exec:java
    ```
    v3

---

## Estructura del Proyecto

El proyecto sigue la estructura estándar de **Maven**:
