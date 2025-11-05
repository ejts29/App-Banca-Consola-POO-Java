// Define el paquete principal
package com.mycompany.appcuentacorriente;

// Importa la clase ArrayList para manejar una lista de movimientos
import java.util.ArrayList;

// Clase que representa una cuenta corriente
class CuentaCorriente {
    private final String titular;  // Nombre del titular de la cuenta
    private int saldo;  // Saldo disponible en la cuenta corriente
    private final ArrayList<Movimiento> movimientos;  // Lista que guarda los movimientos realizados en la cuenta

    // Constructor de la clase CuentaCorriente
    public CuentaCorriente(String titular, int saldo) {
        this.titular = titular;  // Inicializa el titular de la cuenta
        this.saldo = saldo;  // Inicializa el saldo de la cuenta
        this.movimientos = new ArrayList<>();  // Inicializa la lista de movimientos como una nueva ArrayList
    }

    // Método para obtener el saldo actual de la cuenta
    public int getSaldo() {
        return saldo;  // Retorna el saldo disponible en la cuenta
    }

    // Método para abonar una cantidad positiva a la cuenta
    public void abonar(int cantidad) {
        if (cantidad > 0) {  // Verifica que la cantidad sea positiva
            saldo += cantidad;  // Incrementa el saldo de la cuenta
            registrarMovimiento("Abono", cantidad);  // Registra el movimiento de abono
        } else {
            System.out.println("Error: No se puede abonar una cantidad negativa o cero.");  // Error si la cantidad es cero o negativa
        }
    }

    // Método para cargar una cantidad (realizar un deebito) de la cuenta
    public void cargar(int cantidad) {
        if (cantidad > 0) {  // Verifica que la cantidad sea positiva
            if (cantidad <= saldo) {  // Verifica que la cantidad no supere el saldo disponible
                saldo -= cantidad;  // Decrementa el saldo de la cuenta
                registrarMovimiento("Cargo", cantidad);  // Registra el movimiento de carga
            } else {
                System.out.println("Error: No se puede debitar mas del saldo disponible.");  // Error si se intenta cargar más del saldo disponible
            }
        } else {
            System.out.println("Error: No se puede debitar una cantidad negativa o cero.");  // Error si la cantidad es cero o negativa
        }
    }

    // Método privado para registrar un movimiento (abono o carga) en la lista de movimientos
    private void registrarMovimiento(String tipo, int cantidad) {
        if (movimientos.size() == 10) {  // Si hay más de 10 movimientos registrados
            movimientos.remove(0);  // Elimina el movimiento más antiguo para mantener el tamaño de la lista en 10
        }
        movimientos.add(new Movimiento(tipo, cantidad));  // Agrega el nuevo movimiento a la lista
    }

    // Método para obtener una representación en cadena de la cuenta corriente
    @Override
    public String toString() {
        StringBuilder infoMovimientos = new StringBuilder();  // Crea un StringBuilder para construir la información de los movimientos
        for (Movimiento movimiento : movimientos) {
            infoMovimientos.append(movimiento).append("\n");  // Agrega cada movimiento al StringBuilder
        }
        // Devuelve una cadena que representa la cuenta corriente con su titular, saldo y movimientos
        return "CuentaCorriente{titular='" + titular + '\'' + ", saldo=" + saldo + ", movimientos=\n" + infoMovimientos + '}';
    }
}