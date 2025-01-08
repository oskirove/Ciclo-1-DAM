package PROGRAMACION.evaluacion2.Boletin_POO.ProyectoEmpresa;

import java.util.Scanner;

public class IUDirectivo {
    public Directivo directivo;

    public IUDirectivo(Directivo datosDirectivo) {
        this.directivo = datosDirectivo;
    }

    public void pedir() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del directivo: ");
        String nombre = sc.nextLine();
        directivo.setNombre(nombre);

        System.out.print("Introduce los apellidos del directivo: ");
        String apellidos = sc.nextLine();
        directivo.setApellidos(apellidos);

        System.out.print("Introduce el DNI del directivo: ");
        String dni = sc.nextLine();
        directivo.setDni(dni);

        System.out.print("Introduce el departamento del directivo: ");
        String departamento = sc.nextLine();
        directivo.setDepartamento(departamento);

        System.out.print("Introduce la edad del directivo: ");
        int edad = sc.nextInt();
        directivo.setEdad(edad);

        System.out.print("Introduce el % de beneficio del directivo: ");
        double beneficio = sc.nextDouble();
        directivo.setBeneficio(beneficio);
    }

    public void mostrar() {

        String simboloEuro = "€";
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Mostrar datos del directivo:");
            System.out.println("1.- Nombre");
            System.out.println("2.- Apellidos");
            System.out.println("3.- Edad");
            System.out.println("4.- DNI");
            System.out.println("5.- Departamento");
            System.out.println("6.- Gananacias");
            System.out.println("0.- Salir");
            System.out.print("Introduce la opción que deseas ver: ");
            opcion = sc.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("Nombre: " + directivo.getNombre());
                break;
            case 2:
                System.out.println("Apellidos: " + directivo.getApellidos());
                break;
            case 3:
                System.out.println("Edad: " + directivo.getEdad());
                break;
            case 4:
                System.out.println("DNI: " + directivo.getDni());
                break;
            case 5:
                System.out.println("Departamento: " + directivo.getDepartamento());
                break;
            case 6:
                System.out.printf("Ganancia: %.2f%s%n", directivo.gananciaDirectivo(directivo.getBeneficio()), simboloEuro);
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
