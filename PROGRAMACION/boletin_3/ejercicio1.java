package PROGRAMACION.boletin_3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Creamos un número aleatorio entre 1 y 100 con el metodo Math.random()
         el cual debemos multiplicar por 100 para escalar el rango del número
         aleatorio de 0.0 a 100.0 y finalmente le sumamos 1 para que pase de un
         rango 0-99 a 1-100.
         (Con (int) convertimos el número aleatorio de double a int)

         INFO: El método Math.random() devuelve un valor decimal aleatorio 
         (tipo double) entre 0.0 y 1.0. Esto significa 
         que el valor generado puede ser cualquier número decimal desde 0.0 hasta 
         justo antes de 1.0.
        */
        int numAleatorio = (int) (Math.random() * 100) + 1;
    }
}
