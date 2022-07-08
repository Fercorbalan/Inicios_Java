import java.util.Scanner;

import javax.naming.ldap.SortControl;

// Crea un programa que lea por teclado una tabla de 10 numeros enteros y la desplace una posicion hacia abajo: 
//el primero pasa a ser el segundo, el segundo pasa a ser le tercero y asi sucesivamaente. El ultimo pasa a ser el primero

public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] tabla = new int[10]; //Creamos el arreglo de 10 eleentos
            int ultimo;

            System.out.println("Llenar el Arreglo");
            for (int i = 0; i < tabla.length; i++) {
                System.out.print((i+1)+". Digite el numero:  ");
                tabla[i] = entrada.nextInt();
            }
            ultimo = tabla[9]; // guardamos el ultimo elemento del arreglo

            for (int i = 8; i >=0; i--) {//avanzar una posicion abajo del arreglo
                tabla[i+1] = tabla[i]; //
            }

            tabla[0] = ultimo; // Ponemos el ultimo arreglo como el primero
            
            System.out.println("El nuevo arreglo es");

            for (int i = 0; i < tabla.length; i++) {
                System.out.println((i+1)+" numero: "+tabla[i]);
            }
        }

    }
}
