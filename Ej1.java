import java.util.Scanner;

//Leer 5 numerso guardarlos en un arreglo y mostrarlos en el mismo orden introducido

public class Ej1 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float numeros[] = new float[5];
                System.out.println("Guardando los datos en el arreglo");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print((i + 1)+". Digite los numeros: ");
                    numeros[i] = entrada.nextFloat();
                }
                System.out.println("\n Imprimir los elementos del Arreglo");
                for (float i: numeros) {
                        System.out.println(i);
                    
                }
        }
    }
    
}
