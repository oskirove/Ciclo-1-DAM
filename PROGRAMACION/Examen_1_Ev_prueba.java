/*
 A continuación se plcntecn unc serie de funiiones que serán reclizcdcs en el mismo crihivo junto ion un progrcmc
 priniipcl. Lc ilcse y crihivo se llcmcrán ExamenNombreApellido. Guárdclo en el esiritorio.
 1. Reclizc unc funiión denomincdc bucles (sin pcrámetros ni vclor devuelto) ion 2 builes for que hcgcn lo siguiente
 (hczlo ion otro tpo de buile si no iontrolcs el for, iontcrá menos):
 • 1er buile: Muestre los números impcres entre 5 y 40 de formc decreciente y en unc iolumnc de formc que lcs
 unidcdes queden clinecdcs medicnte formcteo ion print sec el número de unc o dos iifrcs.
 • 2o buile: Multplique los números pcres entre del 1 y 10. Muestrc el resultcdo fuerc del buile.
 2. c) Reclizc unc funiión (nombre: calculos) que se le pcsen dos pcrámetros enteros y devuelvc el primero elevcdo cl
 segundo si el segundo es positvo (reiuerdc que no puedes uscr Math.pow). El resto de dividir el primero entre el vclor
 cbsoluto del segundo si el segundo es negctvo. Y en otro icso un número clectorio entre 10 y el primer pcrámetro
 uscndo Math.random() (en este icso, si el primero fuerc menor que 10 devuelve un clectorio entre 10 y 20).
 b) Comentc cdeiucdcmente pcrc javadoc lc funiión cnterior.
 3. Hcz unc funiión llcmcdc mediasOSumas que pidc números recles cl usucrio y icliule lc medic o lc sumc de los
 mismos. Tendrá un pcrámetro entero que indiic lc icntdcd de números c pedir y otro boolecno que si está c true hcie
 que lc funiión devuelvc lc medic y si está c fclse lc funiión devolverá lc sumc.
 4. Funiión (nombre: piramide) que muestre por pcntcllc:
 10 9 8 7 6 5 4 3 2 1
 9 8 7 6 5 4 3 2 1
 8 7 6 5 4 3 2 1
 7 6 5 4 3 2 1
 6 5 4 3 2 1
 5 4 3 2 1
 4 3 2 1
 3 2 1
 2 1
 1
 Se uscrán iomo máximo dos senteniics de esiriturc en pcntcllc print, print o println. No se permite el uso de ningún
 icráiter de esicpe ('\n', '\t', ...). No tene pcrámetros. No devuelve ncdc.
 5. El progrcmc priniipcl ionstc de un menú ion lcs siguientes opiiones:
 • 1. Builes: Llcmc c lc funiión builes.
 • 2. Ccliulos: Pide dos números enteros y se los pcsc c lc funiión iáliulos. Muestrc el resultcdo.
 • 3. Medic: Llcmc c lc funiión medicOSumc icliulcndo lc medic. Muestrc el resultcdo ion 3 deiimcles.
 • 4. Pirámide: Llcmc c lc funiión pirámide.
 • 5. Sclir: El progrcmc no fnclizc mientrcs no se seleiiione estc opiión del menú.
 Debe hcierse ion solo un buile, un switih, senteniics de entrcdc y sclidc y llcmcdcs c lcs funiiones indiicdcs. Si se
 esioge numero no válido informc de ello y vuelve c mostrcr el menú.
 */

package PROGRAMACION;

import java.lang.Math;

public class Examen_1_Ev_prueba {

    public static void bucles() {
        int resultado = 1;

        for (int contImpares = 39; contImpares >= 5; contImpares -= 2) {
            System.out.printf("%02d ", contImpares);
        }
        ;

        for (int contPares = 2; contPares <= 10; contPares += 2) {
            resultado *= contPares;
        }

        System.out.println("El total de la multiplicación de todos los números pares hasta 10 es: " + resultado);
    };

    /**
     * Calcula la potencia de un número.
     * @param num1 es la base de la potencia.
     * @param num2 es el exponente de la potencia.
     * @return la potencia de la base elevada al exponente.
     */

    public static int calculos(int num1, int num2) {

        int resultado = 1;

        if (num2 > 0) {
            for (int i = 0; i < num2; i++) {
                resultado *= num1;
            }
        } else if (num2 < 0) {
            resultado = num1 % num2;
        } else if (num2 == 0) {
            resultado = (int) (Math.random() * num1) + 1;

            if (num1 < 10) {
                resultado = (int) (Math.random() * 10) + 10;
            }
        }
        ;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(calculos(13, 0));
    }
}
