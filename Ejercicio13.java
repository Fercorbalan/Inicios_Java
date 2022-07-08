/*Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares */
import java.util.Scanner;

import javax.lang.model.type.ArrayType;
public class Ejercicio13 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)) {
            int arreglo [] = new int[10];   
            int Impar = 0, Par = 0;

            System.out.println("-Ingrese los Datos del Arreglo-");
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite el Nº: "+(i+1));
                arreglo[i] = entrada.nextInt();
                if (arreglo[i]%2 == 0) {
                    Par ++;
                }
                else {
                    Impar ++;
                }
            }
            
            

            Impar = 0;
            Par = 0;

            for (int i = 0; i < 10; i++) {
                if (arreglo[i] %2 == 0) {
                    aPar[Par] = arreglo [i];
                    Par++;
                }
                else{
                    aImpar[Impar] = arreglo[i];
                    Impar++;
                }
            }


            System.arraycopy(arregloPar, 0, arregloImpar, 0, 9);



            for (int i =0; i < 10; i++) {
                System.out.println("-Arreglo Impar-");
                System.out.print(arregloImpar[i]+" - ");
            }
            for (int i =0; i < 10; i++) {
                System.out.println("-Arreglo Par-");
                System.out.print(arregloPar[i]+" - ");
            }
          
        }
         
    }        
}    
