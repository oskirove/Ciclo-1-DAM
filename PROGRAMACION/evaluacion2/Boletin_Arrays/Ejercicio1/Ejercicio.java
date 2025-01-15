package PROGRAMACION.evaluacion2.Boletin_Arrays.Ejercicio1;

public class Ejercicio {

    /**
     * Función que crea un vector cuyo contenido son números aleatorios entre 1000 y 5000.
     * @param n capacidad máxima del vector
     * @return vector con números aleatorios
     */

    public static int[] createRandomVector(int n) {

        int[] vector = new int[n];

        for(int i = 0; i < n; i++){
            vector[i] = (int)(Math.random() * 4000 + 1000);
        }

        return vector;
    }

    /**
     * Función que muestra por pantalla el contenido de un vector de enteros.
     * @param vector vector a mostrar
     */

    public static void showRandomVector(int[] vector) {

        int rowIndex = -1;
        for(int row : vector){
            rowIndex++;
            System.out.printf("Índice %s: %s%n", rowIndex, row);
        }
    }

    public static int maxValue(int[] vector){
        
        return 0;
    }

    public static void main(String[] args) {
        showRandomVector(createRandomVector(8));
    }
}
