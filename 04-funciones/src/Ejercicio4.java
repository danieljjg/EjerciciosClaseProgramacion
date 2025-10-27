import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tienes que introducir una letra, en el caso de que introduzcas más de una letra, solo tendra en cuenta la primera");
        char a =  sc.next().charAt(0);

        boolean resultado = isVocal(a);

        if(resultado){
            System.out.println("No es una letra");
        } else {
            System.out.println("Es una letra");
        }


    }

    public static boolean isVocal(char a) {

        a = Character.toLowerCase(a);

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        } else {
            return false;
        }

    }

}
