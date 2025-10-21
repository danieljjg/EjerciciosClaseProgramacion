import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        int horas, minutos, segundos;
        int segundosAaumentar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las horas");
        horas = sc.nextInt();

        System.out.println("Introduce los minutos");
        minutos = sc.nextInt();

        System.out.println("Introduce los segundos");
        segundos = sc.nextInt();

        System.out.printf("La hora a aumentar es : %02d:%02d:%02d \n", horas, minutos, segundos);

        System.out.println("Cuantos segundos quieres aumentarla ? ");
        segundosAaumentar = sc.nextInt();

        for(int i = 0; i < segundosAaumentar; i++) {

            segundos++;

            if(segundos >= 60) {

                minutos++;
                segundos = 0;

            }

            if(minutos >= 60) {
                minutos = 0;
                horas++;
            }

            if(horas >= 24) {
                horas = 0;
            }



        }

        System.out.printf("La hora despues de aumento es : %02d:%02d:%02d", horas, minutos, segundos);

    }

}
