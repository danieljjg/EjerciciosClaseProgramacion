import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numeroUsuario, numeroSecreto;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        numeroSecreto = rand.nextInt(101);

        System.out.println("VAMOS A VER SI LO ADIVINAS!!!");
        System.out.println("INTRODUCE -1 PARA RENDIRTE");
        System.out.println("Introduce un número");
        numeroUsuario = sc.nextInt();

        while(numeroUsuario != numeroSecreto && numeroUsuario != -1){

                if(numeroUsuario < numeroSecreto){

                    System.out.println("El número secreto es mayor");

                } else {

                    System.out.println("El úmero secreto es menor");

                }

                System.out.println("Prueba de nuevo");
                numeroUsuario = sc.nextInt();


            if(numeroUsuario == -1) {

                System.out.println("Te has rendido demasiado facil");

            } else if(numeroUsuario == numeroSecreto) {

                System.out.println("Enhorabuena has ganado!!");
                System.out.println("El número secreto era : " + numeroSecreto);

            }

        }

    }

}
