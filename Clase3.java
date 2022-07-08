public class Clase3 {
    public static void main(String[] args) {
        String[] nombrecitos = {"Alejandro", "Maria", "Luis", "Juan", "Narcisa", "Luis","Fernando", "Cintia", "Lucas"};

        for (int i = 0; i < nombrecitos.length; i++) {
            System.out.println("nombres: "+ nombrecitos [i]);
        }
        System.out.println("");
        for (String i: nombrecitos) {
            System.out.println("nombres: "+i);
        }
    }
}
