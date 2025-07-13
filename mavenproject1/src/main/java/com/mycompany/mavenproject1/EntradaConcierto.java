
package com.mycompany.mavenproject1;

/**
 *
 * @author corne
 */
// Clase que representa una entrada para un concierto
public class EntradaConcierto {
    // Atributos encapsulados
    private String artista;
    private String lugar;
    private String fecha;
    private double precio;

    // Constructor por defecto
    // Se usa cuando no se tiene información al momento de crear el objeto
    public EntradaConcierto() {
        this.artista = "Artista no especificado";
        this.lugar = "Lugar por definir";
        this.fecha = "Fecha por confirmar";
        this.precio = 0.0;
    }

    // Constructor completo (parametrizado)
    // Se usa cuando se conocen todos los datos del concierto
    public EntradaConcierto(String artista, String lugar, String fecha, double precio) {
        this.artista = artista;
        this.lugar = lugar;
        this.fecha = fecha;
        this.precio = precio;
    }

    // Constructor sobrecargado
    // Se usa cuando solo se conoce el artista y el precio
    public EntradaConcierto(String artista, double precio) {
        this.artista = artista;
        this.lugar = "Lugar no especificado";
        this.fecha = "Proximamente";
        this.precio = precio;
    }

    // Metodo que muestra la informacion de la entrada
    public void mostrarDetalles() {
        System.out.println("\nInformación de tu entrada:");
        System.out.println("Artista: " + this.artista);
        System.out.println("Lugar: " + this.lugar);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Precio: $" + this.precio);
    }
}
