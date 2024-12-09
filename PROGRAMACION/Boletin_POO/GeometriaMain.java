package PROGRAMACION.Boletin_POO;

import java.util.Scanner;

public class GeometriaMain {
    public static void main(String[] args) {

        Geometria rectangulo = new Geometria(5, 10);

        Geometria triangulo = new Geometria();

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();

        triangulo.setBase(base);
        triangulo.setAltura(altura);

        System.out.println("Rectángulo:");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());

        System.out.println("Triángulo:");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());

        sc.close();
    }

}
