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

    public static double potencia(double baseFuncion, int exponente){
    
        for (int i = 1; i <= exponente; i++) {
            System.err.println(i);
            baseFuncion *= baseFuncion;
        }

        return baseFuncion;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();

        System.out.print("Introduce el exponente: ");
        int exponente = sc.nextInt();
        System.out.println();

        System.out.println(potencia(base, exponente));
    }
}
