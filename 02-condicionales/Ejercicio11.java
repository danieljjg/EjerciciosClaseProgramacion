import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        int dia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce en numero que dia de la semana es : 1 = lunes.... 7 = domingo");
        dia = sc.nextInt();

        switch (dia) {

            case 1 -> System.out.println("Es lunes");

            case 2 -> System.out.println("Es martes");

            case 3 -> System.out.println("Es miercoles");

            case 4 -> System.out.println("Es jueves");

            case 5 -> System.out.println("Es viernes");

            case 6 -> System.out.println("Es sabado");

            case 7 -> System.out.println("Es domingo");

        }

    }

}
