// Define el paquete principal
package com.mycompany.appcuentacorriente;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Clase principal de la aplicación
public class AppCuentaCorriente {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita la fecha de nacimiento del usuario y valida que sea mayor de 18 años
            LocalDate fechaNacimiento;
            do {
                fechaNacimiento = solicitarFechaNacimiento(scanner);
                if (!esMayorDeEdad(fechaNacimiento)) {
                    System.out.println("Debe ser mayor de 18 anios para continuar. Intente nuevamente.");
                }
            } while (!esMayorDeEdad(fechaNacimiento));

            // Solicita el nombre del usuario y asegura que solo contenga letras
            String nombreUsuario = solicitarSoloLetras(scanner, "Ingrese el nombre del usuario: ");

            // Solicita el apellido del usuario y asegura que solo contenga letras
            String apellidoUsuario = solicitarSoloLetras(scanner, "Ingrese el apellido del usuario: ");

            // Solicita el RUT del usuario como un número entero
            int rutUsuario = solicitarNumero(scanner, "Ingrese el RUT del usuario (solo numeros y sin guion): ");

            // Crea un objeto Usuario con los datos ingresados
            var usuario = new Usuario(nombreUsuario, apellidoUsuario, rutUsuario);

            // Solicita el saldo inicial de la cuenta, asegurándose de que no sea negativo
            int saldoInicial = solicitarNumero(scanner, "Ingrese el saldo inicial de la cuenta: ");
            saldoInicial = Math.max(0, saldoInicial); // Si el saldo es negativo, lo establece en 0

            // Crea un objeto CuentaCorriente con el titular y el saldo inicial
            String titular = usuario.getNombreUsuario() + " " + usuario.getApellidoUsuario();
            CuentaCorriente cuenta = new CuentaCorriente(titular, saldoInicial);

            // Bucle principal para mostrar el menú de opciones
            while (true) {
                System.out.println("Seleccione una operacion:");
                System.out.println("1. Abonar a la cuenta");
                System.out.println("2. Debitar de la cuenta");
                System.out.println("3. Mostrar saldo y movimientos");
                System.out.println("4. Mostrar datos del usuario");
                System.out.println("5. Salir");

                int opcion = solicitarNumeroRango(scanner, 1, 5);
                switch (opcion) {
                    case 1 -> {
                        int abono = solicitarNumero(scanner, "Ingrese la cantidad a abonar: ");
                        cuenta.abonar(abono);
                    }
                    case 2 -> {
                        int cargo = solicitarNumero(scanner, "Ingrese la cantidad a debitar: ");
                        if (cargo > cuenta.getSaldo()) {
                            System.out.println("No se puede debitar más del saldo actual.");
                        } else {
                            cuenta.cargar(cargo);
                        }
                    }
                    case 3 -> System.out.println(cuenta);
                    case 4 -> mostrarDatosUsuario(usuario);
                    case 5 -> {
                        System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    
   // Métodos utilitarios
    // Solicita la fecha de nacimiento al usuario y la convierte a un objeto LocalDate
    private static LocalDate solicitarFechaNacimiento(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Ingrese su fecha de nacimiento (DD/MM/YYYY): ");
                String input = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                // Convierte la cadena de texto a LocalDate utilizando el formato proporcionado
                LocalDate fecha = LocalDate.parse(input, formatter);
                return fecha;
            } catch (DateTimeParseException e) {
                // Si el formato es incorrecto, muestra un mensaje de error y repite la solicitud
                System.out.println("Formato de fecha invalido. Intente nuevamente.");
            }
        }
    }
     // Verifica si la persona es mayor de edad (18 años o masss) a partir de su fecha de nacimiento
    private static boolean esMayorDeEdad(LocalDate fechaNacimiento) {
     // Calcula la edad usando Period.between() y devuelve true si es mayor o igual a 18 años
        return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }
    // Solicita un número entero al usuario, repite la solicitud si la entrada no es válida
    private static int solicitarNumero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                // Lee el número entero desde la entrada del usuario
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar solo numeros.");
                scanner.nextLine();// Si el valor ingresado no es un número, muestra un error y limpia el buffer
            }
        }
    }
// Solicita un número dentro de un rango específico (min, max), repite la solicitud si no cumple con el rango
    private static int solicitarNumeroRango(Scanner scanner, int min, int max) {
        while (true) {
            // Llama a solicitarNumero() para pedir el número
            int numero = solicitarNumero(scanner, "");
            // Verifica si el número está dentro del rango
            if (numero >= min && numero <= max) {
                return numero;
            } else {
             // Si el número está fuera del rango, muestra un mensaje de error
                System.out.println("Error: ingrese un numero entre " + min + " y " + max + ".");
            }
        }
    }
 // Solicita una entrada de texto solo con letras, repite la solicitud si no es válida
    private static String solicitarSoloLetras(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
              // Verifica que la entrada contenga solo letras y espacios utilizando una expresión regular
            if (entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
                return entrada;
            } else {
                // Si la entrada no es válida, muestra un mensaje de error
                System.out.println("Error: solo se permiten letras. Intente de nuevo.");
            }
        }
    }
    
// Muestra los datos del usuario en consola (nombre, apellido, RUT)
    private static void mostrarDatosUsuario(Usuario usuario) {
        System.out.println("Datos del Usuario:");
     // Imprime los detalles del usuario utilizando los métodos get de la clase Usuario
        System.out.println("Nombre: " + usuario.getNombreUsuario());
        System.out.println("Apellido: " + usuario.getApellidoUsuario());
        System.out.println("RUT: " + usuario.getRutUsuario());
    }
}
