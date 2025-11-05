// Define el paquete principal
package com.mycompany.appcuentacorriente;

// Clase que representa a un usuario
class Usuario {
    private final String nombreUsuario;  // Nombre del usuario
    private final String apellidoUsuario;  // Apellido del usuario
    private final int rutUsuario;  // RUT del usuario (identificación única)

    // Constructor de la clase Usuario
    public Usuario(String nombreUsuario, String apellidoUsuario, int rutUsuario) {
        this.nombreUsuario = nombreUsuario;  // Inicializa el nombre del usuario
        this.apellidoUsuario = apellidoUsuario;  // Inicializa el apellido del usuario
        this.rutUsuario = rutUsuario;  // Inicializa el RUT del usuario
    }

    // Método para obtener el nombre del usuario
    public String getNombreUsuario() {
        return nombreUsuario;  // Retorna el nombre del usuario
    }

    // Método para obtener el apellido del usuario
    public String getApellidoUsuario() {
        return apellidoUsuario;  // Retorna el apellido del usuario
    }

    // Método para obtener el RUT del usuario
    public int getRutUsuario() {
        return rutUsuario;  // Retorna el RUT del usuario
    }
}
