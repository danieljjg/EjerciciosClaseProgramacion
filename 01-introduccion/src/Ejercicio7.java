import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {

        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;
        Scanner sc = new Scanner(System.in);
//        sc = sc.useLocale(Locale.US);

        double totalManzanasKilos = 0;
        double totalPerasKilos = 0;

        double totalManzanaEuros;
        double totalPerasEuros;

        int beneficioAnualPeras;
        int beneficioAnualManzanas;

        System.out.println("PRIMERO LAS MANZANAS");
        System.out.println("Introduce los kilos vendidos en el primer trimestre");
        // totalManzanas = totalManzanas + sc.nextInt(); // ESTA LINEA ES IGUAL A LA DE ABAJO
        totalManzanasKilos += sc.nextInt(); // ESTA LINEA ES IGUAL A LA DE ARRIBA
        System.out.println("Introduce los kilos vendidos en el segundo trimestre");
        totalManzanasKilos += sc.nextInt();
        System.out.println("Introduce los kilos vendidos en el tercero trimestre");
        totalManzanasKilos += sc.nextInt();
        System.out.println("Introduce los kilos vendidos en el cuarto trimestre");
        totalManzanasKilos += sc.nextInt();

        System.out.println("PRIMERO LAS PERAS");
        System.out.println("Introduce los kilos vendidos en el primer trimestre");
        // totalManzanas = totalManzanas + sc.nextInt(); // ESTA LINEA ES IGUAL A LA DE ABAJO
        totalPerasKilos += sc.nextInt(); // ESTA LINEA ES IGUAL A LA DE ARRIBA
        System.out.println("Introduce los kilos vendidos en el segundo trimestre");
        totalPerasKilos += sc.nextInt();
        System.out.println("Introduce los kilos vendidos en el tercero trimestre");
        totalPerasKilos += sc.nextInt();
        System.out.println("Introduce los kilos vendidos en el cuarto trimestre");
        totalPerasKilos += sc.nextInt();



        totalManzanaEuros = totalManzanasKilos * PRECIO_MANZANA;
        totalPerasEuros = totalPerasKilos * PRECIO_PERA;

        System.out.printf("El beneficio total de manzanas ha sido de : %.2f %n" ,  totalManzanaEuros);
        System.out.printf("El beneficio total de peras ha sido de : %.2f",  totalPerasEuros);



    }

}
