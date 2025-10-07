import java.util.Scanner;

public class While {

    public static void main(String[] args) {

//        int opcion;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce una opcion");
//        opcion = sc.nextInt();
//
//        while(opcion != 0) {
//
//            System.out.println("Estoy dando una vuelta");
//            System.out.println("Introduce una opcion");
//            opcion = sc.nextInt();
//
//        }

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Estoy danto una vuelta");
            System.out.println("Introduce una opcion");
            opcion = sc.nextInt();

        } while(opcion != 0);


    }

}