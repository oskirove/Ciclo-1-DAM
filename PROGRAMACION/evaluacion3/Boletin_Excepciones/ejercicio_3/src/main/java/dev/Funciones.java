package dev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {
    public static int solicitarEntero() {
        Scanner sc = new Scanner(System.in);

        int entero = 0;
        boolean trigger = false;

        while (!trigger) {
            try {
                System.out.print("Introduce un número entero entre 1 y 10: ");
                entero = sc.nextInt();

                if (entero < 1 || entero > 10) {
                    throw new InputMismatchException("El número no se encuentra entre 1 y 10.");
                }
                
                trigger = true;

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

        return entero;
    }
}
