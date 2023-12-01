package co.com.ps.b6;

import java.util.Random;
import java.util.Scanner;

public class actividad4 {

    public static void main(String[] args) {
        // Generar un número aleatorio del 1 al 100
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;

        // Inicializar variables
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int intentosMaximos = 10;
        int intentoUsuario;

        System.out.println("¡Adivina el número entre 1 y 100!");

        while (intentos < intentosMaximos) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            intentoUsuario = scanner.nextInt();

            if (intentoUsuario == numeroAdivinar) {
                System.out.println("¡Correcto! ¡Has adivinado el número!");
                break;
            } else {
                mostrarPista(intentoUsuario, numeroAdivinar);
            }

            intentos++;
        }

        if (intentos == intentosMaximos) {
            System.out.println("Lo siento, has agotado tus 10 intentos. El número era: " + numeroAdivinar);
        }
    }

    // Método para mostrar pistas al usuario, para decir si es frio o caliente.
    private static void mostrarPista(int intentoUsuario, int numeroAdivinar) {
        int diferencia = Math.abs(numeroAdivinar - intentoUsuario);

        if (diferencia <= 10) {
            System.out.println("Caliente!");
        } else {
            System.out.println("Frio...Frio!");
        }
    }
}