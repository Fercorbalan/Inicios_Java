import java.util.Scanner;

//Leer por teclado una seria de 10 numero enteros. La aplicacion debe indicarnos si los numeros estan ordenados de forma decreciente , o si estan desordenados.

public class ejercicio7 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] tabla = new int[10];
            boolean creciente = false, decreciente = false;

            System.out.println("Ingresa los 10 numeros a Comparar");
            
            for (int i = 0; i < tabla.length; i++) {
                System.out.print((i+1)+". Digite el nuermo: ");   
                tabla[i] = entrada.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if (tabla[i] < tabla[i+1]) {
                    creciente = true;
                }
                if (tabla[i] > tabla[i+1]) {
                    decreciente = true; 
                }
            }
            if (creciente==true && decreciente==false){
                System.out.println("\n'La tabla esta en forma Creciente'");
            }
            else if(creciente==false && decreciente==true){
                System.out.println("\n'La tabla esta en forma Decreciente'");
            }
            else if(creciente==true && decreciente==true){
                System.out.println("\n'La tabla esta desordenada'");
            }
            else if(creciente==false && decreciente==false){
                System.out.println("\n'Todos los numeros del arreglo son iguales'");
            }
            System.out.println("Gracias por utilizar este programa");
            System.out.println("");
        }
    }    
}
