package PROGRAMACION.evaluacion2.Boletin_POO.ProyectoEmpresa;

public class Principal {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        IUEmpleado iuEmpleado = new IUEmpleado(empleado);

        iuEmpleado.pedir();
        System.out.println();
        iuEmpleado.mostrar();
    }
}
