import java.util.Scanner;

//Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma: 
//el 1ro de A,el 1ro de B y el 2do de A, el 2do de B, etc.-

public class Ej5 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] tabla1 = new int[10];
            int[] tabla2 = new int[10];
            int[] total = new int[20];

            System.out.println(" Ingresando los datos de las tablas");
                            
                for (int i = 0; i < 10; i++) {
                    System.out.print((i+1)+". Ingresando los datos de la tabla 1: ");
                    tabla1[i] = entrada.nextInt();
                    
                }

                for (int i = 0; i < 10; i++) {
                    System.out.print((i+1)+". Ingresando los datos de la tabla 2: ");
                    tabla2[i] = entrada.nextInt();
                }
                int j = 0;
                for (int i = 0; i < 10; i++) {
                    total[j] = tabla1[i];//1A, 2A....
                    j++;
                    total[j] = tabla2[i];//1B, 2B....
                    j++;
                }
                System.out.println("\n LA TERCERA TABLA CONCATENADA SERA: ");
                
                for (int i = 0; i < 20; i++) {
                    System.out.print(total[i]+" ");
                }
        }
        System.out.println();
    }
}
