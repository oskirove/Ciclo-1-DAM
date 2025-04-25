package dev.Geometria;

import java.util.Scanner;

import dev.interfaz.InterfazUsuario;
import dev.interfaz.Libreria;

public class Figura implements InterfazUsuario {
    private Punto origen;
    private String nombre;

    public void setOrigen(Punto origen) {
        if (origen == null) {
            throw new IllegalArgumentException("Error: Debes introducir un origen ");
        }
        if (origen.x < 0 || origen.y < 0) {
            throw new IllegalArgumentException("Error: El origen no puede ser negativo");
        }

        this.origen = origen;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("Error: La figura debe tener un nombre");
        }

        if (nombre == "") {
            throw new IllegalArgumentException("Error: La figura no puede tener un nombre vacio");
        }

        this.nombre = nombre.trim().toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public Figura() {
        origen = new Punto();
        nombre = "";
    }

    public Figura(Punto origen, String nombre) {
        this.origen = origen;
        this.nombre = nombre.trim().toUpperCase();
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);

        boolean triggerOrigen = false;
        boolean triggerName = false;

        while (!triggerName) {
            try {

                System.out.print("Introduce el nombre de la figura: ");
                String nombre = sc.nextLine();
                setNombre(nombre);

                triggerName = true;

            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println();
            }
        }

        System.out.println("Introduce el origen de la figura");

        while (!triggerOrigen) {
            try {
                double x = Libreria.pedirReal("Introduce la coordenada x: ");

                double y = Libreria.pedirReal("Introduce la coordenada y: ");

                Punto origen = new Punto(x, y);
                setOrigen(origen);

                triggerOrigen = true;

            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El nombre de la figura es: " + getNombre());
        System.out.println("El origen de la figura es: " + getOrigen());
    }
}
