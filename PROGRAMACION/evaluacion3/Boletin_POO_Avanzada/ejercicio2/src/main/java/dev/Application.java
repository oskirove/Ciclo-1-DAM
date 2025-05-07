
package dev;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import dev.Geometria.*;
import dev.exceptions.CollectionIsEmptyException;
import dev.interfaz.Libreria;

public class Application {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Figura> coleccion = new ArrayList<Figura>();

    Integer option = 0;

    do {
      System.out.println();
      System.out.println("------------------ MENÚ ------------------");
      System.out.println();
      System.out.println("1.- Insertar una línea, un triángulo un cuadrado o una circunferencia.");
      System.out.println("2.- Mostrar los elementos de la colección.");
      System.out.println("3.- Mostrar los datos de un elemento de la colección.");
      System.out.println("4.- Borrar elementos de un tipo.");
      System.out.println("5.- Salir");
      System.out.println();

      boolean firstMenuTrigger = false;
      try {

        while (!firstMenuTrigger) {

          System.out.print("Introduce una opción: ");
          option = sc.nextInt();

          firstMenuTrigger = true;
        }

      } catch (InputMismatchException e) {
        System.out.println();
        if (e.getMessage() == null) {
          System.out.println("Error: Introduce una valor correcto");
        }
        sc.nextLine();
      }

      switch (option) {
        case 1:
          int option2;
          do {
            System.out.println();
            System.out.println("---- SELECCIONA EL TIPO DE FIGURA ----");
            System.out.println();
            System.out.println("1.- Insertar Poligono.");
            System.out.println("2.- insertar linea.");
            System.out.println("3.- insertar circunferencia.");
            System.out.println("4.- Volver");

            System.out.println();
            System.out.print("Introduce una opción: ");
            option2 = sc.nextInt();

            switch (option2) {
              case 1:
                try {
                  Poligono poligono = new Poligono();
                  poligono.pedirDatos();
                  coleccion.add(poligono);
                } catch (Exception e) {
                  System.out.println(e.getMessage());
                }
                break;
              case 2:
                try {
                  Linea linea = new Linea();
                  linea.pedirDatos();
                  coleccion.add(linea);
                } catch (Exception e) {
                  System.out.println(e.getMessage());
                }
                break;
              case 3:
                try {
                  Circunferencia circunferencia = new Circunferencia();
                  circunferencia.pedirDatos();
                  coleccion.add(circunferencia);
                } catch (Exception e) {
                  System.out.println(e.getMessage());
                }
                break;
              case 4:
                System.out.println("Saliendo del programa");
                break;
              default:
                System.out.println();
                System.out.println("Opción no válida");
            }
          } while (option2 != 4);
          break;
        case 2:
          try {

            if (coleccion.size() == 0) {
              throw new CollectionIsEmptyException("La colección está vacía");
            }

            System.out.println();
            System.out.println("----- COLECCIÓN DE FIGURAS -----");
            System.out.println();
            for (Figura row : coleccion) {
              row.mostrarDatos();
              System.out.println("------------------");
            }

          } catch (Exception e) {
            System.out.println();
            System.out.println(e.getMessage());
          }
          break;
        case 3:
          boolean trigger = false;
          try {

            if (coleccion.size() == 0) {
              throw new CollectionIsEmptyException("La colección está vacía");
            }

            while (!trigger) {

              System.out.println();
              int index = Libreria.pedirEntero("Introduce el indice del objeto que quieres ver: ");
              System.out.println();

              if (index > coleccion.size() || index < 0) {
                throw new IndexOutOfBoundsException(
                    "El indice no puede ser mayor que " + coleccion.size() + " ni menor que 0");
              }

              coleccion.get(index).mostrarDatos();

              trigger = true;
            }

          } catch (Exception e) {
            System.out.println();
            System.out.println(e.getMessage());
          }

          break;
        case 4:
          break;
        case 5:
          System.out.println("Saliendo del programa");
          break;
        default:
          System.out.println();
          System.out.println("Opción no válida");
      }

    } while (option != 5);
  }
}
