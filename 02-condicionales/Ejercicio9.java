import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota");
        nota =  sc.nextInt();

        switch (nota){

            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Tienes un insuficiente");
                break;
            case 5:
                System.out.println("Tienes un suficiente");
                break;
            case 6:
                System.out.println("Tienes un bien");
                break;
            case 7:
            case 8:
                System.out.println("Tienes un notable");
                break;
            case 9:
            case 10:
                System.out.println("Tienes un sobresaliente");
                break;
            default:
                    System.out.println("El valor introducido no esta permitido");

        }

    }

}
