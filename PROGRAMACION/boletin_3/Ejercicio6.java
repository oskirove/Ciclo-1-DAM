/*
 a) Realizar una función que halle y devuelva la potencia de un número ( No se
 permite usar funciones de Math ). La base puede ser real y el exponente entero
 puede ser negativo (recuerda que a - b = (1/a)b ).
 Parámetros del método: la base y el exponente. Valor devuelto: la potencia

 b) Realiza un nuevo método (en la misma clase) que muestre en pantalla las n
 primeras potencias de un número a (n y a serán parámetros del método).
 Por ejemplo, si los parámetros son a=2 y n=4 mostrará: 1, 2, 4, 8.
 Para hacerlo deberás llamar al creado en el apartado anterior para calcular las
 potencias, no las puedes calcular de nuevo en este método.

 c) Escribe un método que sume la progresión geométrica ( x puede ser real) y
 devuelva el resultado.
 1+x+x2 + x3 + x4 +... xn
 Se debe utilizar la función potencia (sin modificarla, sólo llamándola) programada
 anteriormente.
 Por ejemplo si x=2 y n=4 mostrará 15 por ser el resultado de 1+2+4+8.
 Parámetros del método: x y n. Valor devuelto: resultado de la progresión
*/

package PROGRAMACION.boletin_3;

import java.util.Scanner;

public class Ejercicio6 {

    public static double potencia(double baseFuncion, int exponente) {

        double resultado = 1;
        
        if (exponente < 0) {
            baseFuncion = 1 / baseFuncion;
            exponente = -exponente;
        }

        for (int i = 0; i < exponente; i++) {
            resultado *= baseFuncion;
        }

        return resultado;
    }

    public static int contPotencia(double base, int exponente) {
        for (int i = 0; i < exponente; i++){
            System.out.printf("%.6f, ", potencia(base, i));
        };

        return 0;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();

        System.out.print("Introduce el exponente: ");
        int exponente = sc.nextInt();
        System.out.println();

        System.out.printf("%.6f%n",potencia(base, exponente));
        contPotencia(base, exponente);
        System.out.println();
    }
}
