import java.util.Scanner;

/*Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden: el primero, el ultimo, el segundo, el penultimo, el tercero, et.*/

public class Ej4 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float[] numeros = new float[10];
            System.out.println("¡Ingresar los 10 numeros!");

            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el numero "+(i+1)+"º: ");
                numeros[i] = entrada.nextFloat();
            }
            System.out.println(numeros[0]);
            System.out.println(numeros[9]);
            System.out.println(numeros[1]);
            System.out.println(numeros[8]);
            System.out.println(numeros[2]);
            System.out.println(numeros[7]);
            System.out.println(numeros[3]);
            System.out.println(numeros[6]);
            System.out.println(numeros[4]);
            System.out.println(numeros[5]);
        }

       
    }
}
