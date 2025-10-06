import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        int dni;
        Scanner sc = new Scanner(System.in);

        dni = sc.nextInt();

        if(dni < 99999999) {

            int resto = dni % 23;

            switch (resto) {

                case 0 -> System.out.println("La letra correspondiente es la T");

                case 1 -> System.out.println("La letra correspondiente es la R");

                case 2 -> System.out.println("La letra correspondiente es la W");

                case 3 -> System.out.println("La letra correspondiente es la A");

                case 4 -> System.out.println("La letra correspondiente es la G");

                case 5 -> System.out.println("La letra correspondiente es la M");

                case 6 -> System.out.println("La letra correspondiente es la Y");

                case 7 -> System.out.println("La letra correspondiente es la F");

                case 8 -> System.out.println("La letra correspondiente es la P");

                case 9 -> System.out.println("La letra correspondiente es la D");

                case 10 -> System.out.println("La letra correspondiente es la X");

                case 11 -> System.out.println("La letra correspondiente es la B");

                case 12 -> System.out.println("La letra correspondiente es la N");

                case 13 -> System.out.println("La letra correspondiente es la J");

                case 14 -> System.out.println("La letra correspondiente es la Z");

                case 15 -> System.out.println("La letra correspondiente es la S");

                case 16 -> System.out.println("La letra correspondiente es la Q");

                case 17 -> System.out.println("La letra correspondiente es la V");

                case 18 -> System.out.println("La letra correspondiente es la H");

                case 19 -> System.out.println("La letra correspondiente es la L");

                case 20 -> System.out.println("La letra correspondiente es la C");

                case 21 -> System.out.println("La letra correspondiente es la k");

                case 22 -> System.out.println("La letra correspondiente es la E");

            }

//            // FORMA 2
//
//            String letra = switch (resto) {
//
//                case 0 -> "t";
//
//                case 1 -> "r";
//
//                case 2 -> "w";
//
//                case 3 -> "a";
//
//                case 4 -> "g";
//
//                case 5 -> "m";
//
//                case 6 -> "y";
//
//                case 7 -> "f";
//
//                case 8 -> "p";
//
//                case 9 -> "d";
//
//                case 10 -> "x";
//
//                case 11 -> "b";
//
//                case 12 -> "n";
//
//                case 13 -> "j";
//
//                case 14 -> "z";
//
//                case 15 -> "s";
//
//                case 16 -> "q";
//
//                case 17 -> "v";
//
//                case 18 -> "h";
//
//                case 19 -> "l";
//
//                case 20 -> "c";
//
//                case 21 -> "k";
//
//                case 22 -> "e";
//
//                default -> "No es valido el modulo";
//
//            };

        }

    }

}
