package PROGRAMACION.evaluacion2.Boletin_POO.ProyectoEmpresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        IUEmpleado iuEmpleado = new IUEmpleado(empleado);

        Directivo directivo = new Directivo();
        IUDirectivo iuDirectivo = new IUDirectivo(directivo);
        System.out.println("Empresa");
        System.out.println("1.- Empleados");
        System.out.println("2.- Directivos");
        System.out.print("Introduce una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                iuEmpleado.pedir();
                System.out.println();
                iuEmpleado.mostrar();
                break;
            case 2:
                iuDirectivo.pedir();
                System.out.println();
                iuDirectivo.mostrar();
                break;
            default:
                break;
        }
        sc.close();
    }
}
