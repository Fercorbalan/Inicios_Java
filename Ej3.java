import java.util.Scanner;

/*Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuación realizar la media de los numeros positivos, la media de los negativos y contar el numero de ceros. */

public class Ej3 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float[] numeros = new float[5];
            float positivo = 0, negativo = 0, medpos = 0, medneg = 0;
            int contneg=0, contpos=0, cero = 0;
            
            System.out.println("Ingresando los 5 numeros a calcular");
            
            for (int i = 0; i < 5; i++) {
                System.out.print(" Digite el numero "+(i+1)+" : ");
                numeros[i] = entrada.nextFloat();
                if (numeros[i] > 0) {
                    positivo += numeros[i];
                    contpos ++;
                }
                else if (numeros[i] < 0){
                    negativo += numeros[i];
                    contneg ++;
                }
                else{
                    cero ++;
                }
        }
        medpos = (float) positivo / contpos;
        medneg = (float) negativo / contneg;
        
        System.out.println("La media de los Negativos es: "+medneg);
        System.out.println("La media de los Positivos es: "+medpos);
        System.out.println("La cantidad de ceros es: "+cero);
        }

    }
        
}

