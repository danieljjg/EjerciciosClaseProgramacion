import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        int horas, minutos, segundos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las horas");
        horas = sc.nextInt();
        System.out.println("Introduce las minutos");
        minutos = sc.nextInt();
        System.out.println("Introduce las segundos");
        segundos = sc.nextInt();

        segundos++;

        if(segundos == 60) {

            minutos++;
            segundos = 0;

            if(minutos == 60) {

                horas++;
                minutos = 0;

            }

            if(horas == 24) {

                horas = 0;

            }

        }

        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);


    }

}
