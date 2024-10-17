/*
 Realizar el juego Adivina un número entre 1 y 100 para dos personas. El
 Computador pide un número entre 1 y 100 al jugador 1, luego borra la pantalla
 y el jugador 2 debe adivinar el número en, como máximo, 5 intentos. Se debe
 indicar en cada intento si el número a acertar es mayor o menor que el indicado
 por el jugador 2. Además se informará de los intentos que quedan. Al terminar
 el juego se debe preguntar si se desea jugar otra partida o terminar el
 programa. Tanto en la petición al jugador 1 como al jugador 2 si el numero no
 está en el rango 1 a 100 debe volver a pedirlo y no contar intento.
*/

package PROGRAMACION.boletin_2;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println();
            System.out.println("Bienvenido a adivina el número");
            System.out.println("------------------------------");
            System.out.println("1.- Jugar");
            System.out.println("0.- Salir\n");

            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:

                    System.out.print("Jugador 1, intoduce un numero entre 0 y 100: ");
                    int numAleatorio = sc.nextInt();

                    boolean activador = false;
                    int contador = 5;
                    
                    for (int i = 0; i < 40; i++) {
                        System.out.println();
                    }

                    System.out.println("Jugador 2, debes adivinar el número en 5 intentos.");
                    while (activador == false) {
                        System.out.print("Introduce un valor: ");
                        int numUsuario = sc.nextInt();
                        contador--;

                        if (contador == 1){
                            System.out.println("Te queda " + contador + " intento");
                        } else {
                            System.out.println("Te quedan " + contador + " intentos");
                        }

                        if (numUsuario > numAleatorio) {
                            System.out.println("El número objetivo es menor");
                            System.out.println();
                        } else {
                            System.out.println("El número objetivo es mayor");
                            System.out.println();
                        }

                        if (contador == 0){
                            System.out.println("Has perdido :(");
                            activador = true;
                        } else if (numAleatorio == numUsuario) {
                            System.out.println("**************************");
                            System.out.println("Enorabuena has acertado!!!");
                            System.out.println("**************************");
                            activador = true;
                        }
                    }


                    break;

                case 0:
                    System.out.println("Saliendo del juego");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;

            }
        } while (opcion != 0);

    }
}
