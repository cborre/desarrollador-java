package org.cmc.prueba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        // Variables
        int numero = 0;

        // Sacanner
        Scanner scanner = new Scanner(System.in);

        // Mensaje al usuario
        System.out.println("Ingrese un número para calcular el factorial: ");

        try {

            // Captura del valor a calcular factorial
            numero = scanner.nextInt();

            // Se muestra el resultado
            System.out.println("Resultado: " + factorial(numero));

        } catch (InputMismatchException e) {
           main(args);
        }
    }

    /**
     * Método para calcular factorial
     * @param numero
     * @return
     */
    private static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}