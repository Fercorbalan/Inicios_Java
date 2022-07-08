import java.util.Scanner;

/*Diseñar una aplicacion que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 numeros. 
Despues se debe pedir un numero y una posicion, insertarlo en la posicion indicada,
desplazando los que esten detras*/

public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] tabla = new int [10];
            int pos, num;

            System.out.println("Ingresando 8 digitos de los 10 de la tabla");

            for (int i = 0; i < 8; i++) {
                System.out.print((i+1)+". Ingrese el numero: ");
                tabla[i] = entrada.nextInt();
            }
            do{
                System.out.println("Ingrese los 2 valores restantes");
                num = entrada.nextInt();
                System.out.print("\n Ingrese la posicion: ");
                pos = entrada.nextInt();
            while(pos > 10|| pos < 1);
            if (pos>=9)
                pos--; {
                tabla[pos] = num;
                for (int i = 0; i < 9; i++) {
                    
                }
            }
                                
            
            System.out.println("\nResultado de la tabla");
            for (int i : tabla) {
                System.out.print(i);
            }
        }
    }
}
