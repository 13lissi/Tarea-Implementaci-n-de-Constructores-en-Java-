
package com.mycompany.mavenproject1;

/**
 *
 * @author corne
 */
import java.util.Scanner;

// Clase principal que simula la compra de entradas para conciertos
public class CompraEntradaConcierto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para entrada de datos electos por el usuario

        System.out.println("Bienvenido al sistema de compra de entradas para conciertos");
        System.out.println("Seleccione el concierto al que desea asistir:");
        System.out.println("1. Shakira - Quito (05 de agosto 2025)");
        System.out.println("2. Taylor Swift (informacion por confirmar)");
        System.out.println("3. Salir del sistema");

        System.out.print("Ingrese una opcion (1-3): ");
        int opcion = scanner.nextInt(); // Lee la opcion
        scanner.nextLine(); // Vaciamos el buffer para evitar que se lea una línea vacía

        EntradaConcierto entrada; // Declaración del objeto

        // Dependiendo de la opción se usa un constructor diferente
        switch (opcion) {
            case 1:
                // Constructor completo: artista, lugar, fecha y precio
                entrada = new EntradaConcierto(
                    "Shakira",
                    "Estadio Olimpico Atahualpa, Quito",
                    "05 de agosto de 2025",
                    120.00
                );
                entrada.mostrarDetalles();
                break;
            case 2:
                // Constructor sobrecargado: artista y precio
                entrada = new EntradaConcierto("Taylor Swift", 150.00);
                entrada.mostrarDetalles();
                break;
            case 3:
                // Salida del programa
                System.out.println("Gracias por visitar nuestra plataforma. ¡Hasta pronto!");
                scanner.close();
                return; // Termina el programa sin crear objeto
            default:
                System.out.println("Opcion no valida. Reinicie el programa.");
        }

        scanner.close(); // cerramos el escaner
    }
}

