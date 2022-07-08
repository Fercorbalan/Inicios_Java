/* Ejercicio11 Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
Estos los guardaremos en una tabla de tamaño 10. Leer un numero N, e insertarlo en el lugar
adecuado para que la tabla continue ordenada*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int arreglo[] =new int[10];
            boolean creciente = true;
            int numero, sitio=0,j=0;
                
            System.out.println("Llenar el Arreglo");
            do{
                for(int i=0; i<5;i++){
                    System.out.print((i+1)+". Digite un numero: ");
                    arreglo[i] = entrada.nextInt();
                }
                //comprobar si el arreglo esta ordenados en forma creciente
                for(int i=0; i<4;i++){
                    if (arreglo[i] < arreglo[i+1]) {
                        creciente = true;
                    }
                    if (arreglo[i] > arreglo[i+1]) {
                        creciente = false;
                        break;
                    }
                }
                if (creciente==false) {
                    System.out.println("\n El arreglo no esta ingresado de forma creciente. Digite nuevamente los numeros: \n");
                }

            }while(creciente == false);
             
            //INgreso de nuevo numero
            System.out.println("Digite un elemento a insertar: ");
            numero = entrada.nextInt();

            //Esto es para darnos cuenta en que posicion va el numero
            while (arreglo[j] < numero && j<5) {
                sitio++;
                j++;
            }
      
            //por ultimo trasladamos una posicion en el arreglo a los elementos que van detras
            for (int i = 4; i>= sitio; i--) {
                arreglo[i+1] = arreglo[i];
            }

            arreglo[sitio] = numero;

            System.out.println("\nEl arreglo queda: ");
            for (int i = 0; i < 6; i++) {
                System.out.print(arreglo[i]+" - ");
                       
            }
        }
    }
}
