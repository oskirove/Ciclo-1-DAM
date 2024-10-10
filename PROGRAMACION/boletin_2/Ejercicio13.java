/*
 Hacer con bucles for (en un único programa todos los apartados):
 a) Programa que dé el resultado de la suma de números pares entre 0 y N (N lo
 decide el usuario).
 b) Programa que dé el resultado de la suma de números impares entre 0 y N (N
 lo decide el usuario).
 c) Programa que dé el resultado de la suma de números pares por una parte e
 impares por otro entre 0 y N (N lo decide el usuario). Debe realizarse con
 un único bucle.
*/

package PROGRAMACION.boletin_2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Suma los números pares entre 0 y un número que elijas");
            System.out.println("2.- Suma los números impares entre 0 y un número que elijas");
            System.out.println("3.- Hacer ambas");
            System.out.println("0.- Salir del menú\n");

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un valor: ");
                    int n1 = sc.nextInt();

                    for (int i = 0; i < n1; i += 2) {
                        
                    }
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }
}
