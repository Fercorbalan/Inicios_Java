import java.util.Scanner;

//Crear un programa qeu lea por teclado una tabla de 10 numeros enteros y desplace N posiciones en el arreglo (N es digitado por el usuario)

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] tabla = new int[10];
      
            int pos;

            System.out.println("\n 'Digite los numeros de la tabla'");
            for (int i = 0; i < 10; i++) {
                System.out.print(((i+1)+"- Digite el numero: "));
                tabla[i] = entrada.nextInt();
            }
            
            System.out.print("Ingrese las posiciones a desplazar: ");
            pos = entrada.nextInt();

            int[] ultimos =new int[10];

            int j = 0;
            for (int i =(10-pos); i < 10; i++) {
                ultimos[j] = tabla[i];
                j++;
            }
            
            System.out.println("El nuevo arreglo es");

            for (int i = 8; i < (pos-1); i--) {
                tabla[i+1] =tabla[(i-pos)+1];
            }
     
            for (int i = 0; i < pos; i++) {//corregir esta parte del programa
                tabla[i] = ultimos[j];
                j++;
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(tabla[i]);
            }
        }
           
        } 

    }   

