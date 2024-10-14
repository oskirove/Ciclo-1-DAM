/*
 Contar la cantidad de números negativos introducidos por el usuario. Se termina
 cuando el usuario introduce el cero. Se debe informar también del total de
 números introducidos (no se cuenta el cero).
 Ejemplo de salida:
 Introduce número: -10
 Introduce número: -2
 Introduce número: 3
 Introduce número: 0
 Se introdujeron 2 números negativos de un total de 3. 
*/

package PROGRAMACION.boletin_2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int contador = 0;

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
