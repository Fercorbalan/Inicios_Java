import java.util.Scanner;

import javax.swing.JOptionPane;

public class Clase2 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
        }
        int nElementos;


        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos: "));

        char [] letras = new char [nElementos];

        System.out.println("Digite los elementos del arreglo ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1)+". Digite un    caracter");
          
        }
        System.out.println("\n Los caracteres del arreglo son");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i]+ " ");
        }
    }
}
