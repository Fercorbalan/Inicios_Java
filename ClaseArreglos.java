public class ClaseArreglos {
    public static void main(String[] args) {
        int[] numeros = new int [3]; //Ingreso de datos 1 por 1

        numeros [0] = 7;
        numeros [1] = 10;
        numeros [2] = 13;
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("");
        int [] numero = {5,7,9,10}; // Ingreso de datos de una vez
        for (int i = 0; i < 4; i++) {
            System.out.println(numero[i]);
        }
    }
}
