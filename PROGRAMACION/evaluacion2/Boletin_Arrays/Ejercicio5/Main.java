package PROGRAMACION.evaluacion2.Boletin_Arrays.Ejercicio5;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ventas ventas;
        String fileName = "Ventas.txt";
        File file = new File(fileName);

        // Scanner f = new Scanner(new File("prueba.txt"));
        if (file.exists()){


            ventas = new Ventas(0, null);
            
        } else {}
    }
}
