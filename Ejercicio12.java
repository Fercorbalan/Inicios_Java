import java.util.Scanner;

/*Ejercicio 12: Leer por teclado una tabla de 10 elementos numericos enteros y una posicion (entre0 y 9). Eliminar el elemento situado en la posicion dada sin dejar huevos */

public class Ejercicio12 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int arreglo [] = new int[10];
            int arreglo2 [] = new int[9];
            int posicion;

            System.out.println(""); 
            System.out.println("***Ingreso de elementos del arreglo***");
            System.out.println("");

            for (int i = 0; i < arreglo.length; i++) {
                System.out.print("- Digite el numero "+(i+1)+": ");
                arreglo[i] = entrada.nextInt();
            }
            System.out.println("*Arreglo ingresado*");
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                System.out.print(arreglo[i]+" - ");
            }
            System.out.println("");
            System.out.print("Indicar la posicion a Eliminar: ");
            posicion = entrada.nextInt();
            System.out.println("");

            for (int i = posicion; i < 9; i++) {
                arreglo[i] = arreglo[i+1];
            }
            System.arraycopy(arreglo, 0, arreglo2, 0, 9);

            System.out.println("");
            System.out.println("*Arreglo finalizado*");
            for (int i = 0; i < 9; i++) {
                System.out.print(arreglo2[i]+" - ");
            }
        }
        
    }
}
