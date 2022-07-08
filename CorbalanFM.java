import java.util.Scanner;

/*Introducir una lista de cadenas que contengan los siguientes datos: Nombre completo de una persona, la antigüedad en años y sueldo basico.
Cada componente esta separado por una coma. Crear tres vectores paralelos que contengan nombre completo como cadena, antigüedad  como valor
entero y sueldo como un valor real. Mostrar el nombre de la persona con menos antigüedad y nombre de la persona con mayor sueldos básico*/

public class TrabajofinalFRT {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de empleados: ");
        int cantEmp = 0;
        cantEmp = entrada.nextInt();
        int menAnt=100;
        float maySueldo=0;
        String nombreMaySueldo=null;
        String nombreMenAntiguedad=null;

        String[] nombresComp = new String[cantEmp]; //Creamos la cadena de Nombres
        int[] antiguedad = new int[cantEmp]; //Creamos la cadena de Antigüedad
        float [] Sueldos = new float[cantEmp]; //Creamos la cadena de Sueldos
        
        int f=0;
        int g=0;
        System.out.println("-Por favor ingrese los valores de cada empleado-");
        for (int i = 0; i <cantEmp; i++) {
            System.out.print((i+1) + "- Ingrese el Nombre del Empleado: ");
            nombresComp[i] = entrada.next();
            System.out.print((f+1)+"- Ingrese la Antigüedad del Empleado: ");
            antiguedad[f] = entrada.nextInt();
                if (antiguedad[f] < menAnt) {
                    menAnt = antiguedad[f];
                    nombreMenAntiguedad = nombresComp[i];
            }
            System.out.print((g+1)+"- Ingrese el Sueldo del Empleado: $ ");
            Sueldos[g] = entrada.nextFloat();
                if (Sueldos[g] >= maySueldo) {
                    maySueldo = Sueldos[g];
                    nombreMaySueldo = nombresComp[i];
                }
            f++;
            g++;
        }
        System.out.println("");
        System.out.println("El mayor sueldo es de: $ "+maySueldo+" y corresponde a "+ nombreMaySueldo);
        System.out.println("EL empleado con menor antiguedad tiene "+menAnt+" Años y corresponde a "+ nombreMenAntiguedad);
        System.out.println("");

        System.out.println("La nomina del personal es el siguiente: ");
        for (int i = 0; i < cantEmp; i++) {
            System.out.print("Nombre: " + nombresComp[i]+" ");
            System.out.print(", Antigüedad: " + antiguedad[i]+" ");
            System.out.print(", Sueldo: " + Sueldos[i]);
            System.out.println("");
        }
    }
}
