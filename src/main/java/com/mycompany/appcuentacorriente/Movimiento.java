// Define el paquete principal
package com.mycompany.appcuentacorriente;

// Clase que representa un movimiento
import java.time.LocalDateTime;  // Importa la clase LocalDateTime para manejar la fecha y hora
import java.time.format.DateTimeFormatter;  // Importa la clase DateTimeFormatter para formatear la fecha y hora

// Clase que representa un movimiento (abono o carga) en la cuenta corriente
class Movimiento {
    private final String tipo;  // Tipo de movimiento (Abono o Cargo)
    private final int monto;  // Monto del movimiento (cantidad de dinero)
    private final LocalDateTime fecha;  // Fecha y hora en que se realizoo el movimiento

    // Constructor de la clase Movimiento
    public Movimiento(String tipo, int monto) {
        this.tipo = tipo;  // Inicializa el tipo de movimiento (abono o cargo)
        this.monto = monto;  // Inicializa el monto del movimiento
        this.fecha = LocalDateTime.now();  // Inicializa la fecha con la hora actual del sistema
    }

    // Método para obtener una representación en cadena del movimiento
    @Override
    public String toString() {
        // Crea un formateador para mostrar la fecha en el formato "dd/MM/yyyy HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Retorna una cadena que describe el movimiento, incluyendo el tipo, monto y fecha formateada
        return "Movimiento{" + "tipo='" + tipo + '\'' + ", monto=" + monto + ", fecha=" + fecha.format(formatter) + '}';
    }
}

