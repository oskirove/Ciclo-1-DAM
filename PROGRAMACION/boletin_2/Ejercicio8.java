/*
Realizar un programa que pida tres números al usuario en tres variables
distintas (no uses bucles) y muestre el mayor de los tres (si son iguales dos de
ellos, o los tres muestra cualquiera de los máximos). Trata de hacer lo la menor
cantidad posible de comparaciones.
*/

package PROGRAMACION.boletin_2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu primer número: ");
        float n1 = sc.nextInt();
        System.out.print("Introduce tu segundo número: ");
        float n2 = sc.nextInt();
        System.out.print("Introduce tu tercer número: ");
        float n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
            if (n1 == n2 || n1 == n3) {
                System.out.printf("El número %.2f es mayor que %.2f y que %.2f%n", n1, n2, n3);
            }
            System.out.printf("El número %.2f es mayor que %.2f y que %.2f%n", n1, n2, n3);
        } else if (n2 > n1 && n2 > n3) {
            System.out.printf("El número %.2f es mayor que %.2f y que %.2f%n", n2, n1, n3);
        } else if (n3 > n1 && n3 > n2) {
            System.out.printf("El número %.2f es mayor que %.2f y que %.2f%n", n3, n1, n2);
        } else {
            System.out.printf("Los 3 números son iguales: %.2f, %.2f, %.2f%n", n1, n2, n3);
        }
    }
}
