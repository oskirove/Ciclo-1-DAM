/*
 Amplia el programa anterior (directamente el main) para que guarde en un
 archivo los siguientes datos: el nombre en una línea, el número en la siguiente y si
 es par/impar y positivo/negativo.
 El archivo queda algo así:
 Minerva McGonagall
 -5
 El n.º es impar in negativo.
*/

package PROGRAMACION.boletin_3;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class ejercicio2 {

    public static void funcionLineas(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    public static boolean par(int numPar) {
        if (numPar % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static char FuncionPoN(int num) {
        char resultado = (num < 0) ? 'N' : 'P';
        return resultado;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        
        funcionLineas(20);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println();

    try (PrintWriter f = new PrintWriter("Datos.txt")) {
        f.println(nombre);
        f.println(num);
        f.println("El n.º es " + (par(num) ? "par" : "impar") + " y " + (FuncionPoN(num) == 'P' ? "positivo" : "negativo") + ".");
        
        System.out.println("Hola " + nombre + ", tu número es " + (FuncionPoN(num) == 'P' ? "positivo" : "negativo") + " y además es un número " + (par(num) ? "par." : "impar."));
        System.out.println("Esta información se guardará en el Datos.txt.");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
