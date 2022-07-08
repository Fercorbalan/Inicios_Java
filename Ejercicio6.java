import java.util.Scanner;

/*Leer los datos correspondientes a dos tablas de 12 elementos numericos, y mezclarlos en una tercera de forma: 3 de la tabla A, 3 de la B, otros 3 de la A, otros 3 de la B, Etc.*/

public class Ejercicio6 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] numeros1 = new int[12];
            int[] numeros2 = new int[12];
            int[] final1 = new int[24];

            System.out.println("Ingresando los datos de las 2 tablas");
            for (int i = 0; i < numeros1.length; i++) {
                System.out.print((i+1)+". Digite el numero: ");
                numeros1[i] = entrada.nextInt();
            }
            for (int i = 0; i < numeros2.length; i++) {
                System.out.print((i+1)+ ". Digite el numero: ");
                numeros2[i] = entrada.nextInt();
            }
            
            int a = 0,b = 0, c = 0;
            for (int i = 0; i < final1.length; i++) {
                
                for (int k = 0; k < 3; k++) {
                  
                    final1[b] = numeros1[a];    
                    a++;
                    b++;
                }
                for (int k = 0; k < 3; k++) {
                    
                    final1[b] = numeros2[c];    
                    b++;
                    c++;
                    
                }
            }
            System.out.println("la matriz queda asi :"); 
	        for(int i = 0 ;i < 24 ; i++) {
		    System.out.println(final1[i]);
        }
        }
    }
}


