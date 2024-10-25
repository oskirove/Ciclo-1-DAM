/*
Haz un programa que realice las siguientes tareas:
Pide un año al usuario y guarda en un archivo dicho año en la primera línea
indicando si es o no bisiesto y a continuación todos los bisiestos desde ese año
hasta el año actual (cada uno en una línea).
Un ejemplo de como puede quedar el archivo:
2015 No es bisiesto.
2016
2020
2024
A continuación lee el archivo y muestra en pantalla todos los años menos el
primero. Debe estar separados por comas en la misma linea y ocupando 6
caracteres.
Si este programa lo tienes en la misma carpeta que el de bisiesto no es necesario
que copies la función, puedes acceder a ella poniendo NombreClase.nombreFuncion.
Por ejemplo:
Bol3Ejer4.bisiesto(2024);
*/

package PROGRAMACION.boletin_3;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Introduce un año: ");
        int año = sc.nextInt();

        try {
            PrintWriter f = new PrintWriter("Años_Bisiestos.txt");
            for(int contadorAños = año; contadorAños <= 2024; contadorAños++){
                f.println((Ejercicio4.añoBisiesto(contadorAños) == true) ? contadorAños + " es bisiesto" : contadorAños + " no es bisiesto");
            };
            f.close();
        } catch (Exception e) {
            System.out.println("No se pudo crear el archivo.");
        }

        try {
            BufferedReader f = new BufferedReader(new FileReader("Años_Bisiestos.txt"));
            String linea = f.readLine();
            while (linea != null) {
                System.out.print(linea.substring(0, 6) + ", ");
                linea = f.readLine();
            }
            System.out.println();
            f.close();
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo.");
        }
    }   
}
