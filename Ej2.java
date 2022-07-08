import java.util.Scanner;

//Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido
public class Ej2 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float[] numeros = new float[5];
                System.out.println("Ingresando los 5 numeros");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print((i+1)+". Digite los numeros: ");
                    numeros[i] = entrada.nextFloat();
                }
            System.out.println("Mostrando los elementos de la lista ingresada:");
            for (int i=4; i>=0; i--) {
                System.out.println(numeros[i]);
            }
        }
    }
}
