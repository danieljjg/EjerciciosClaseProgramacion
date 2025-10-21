import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        int alturaActual;
        int etiquetaActual = 1;
        int arbolMasAlto = 0;
        int etiquetaArbolMasAlto = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Introduce la altura del arbol  " + etiquetaActual + " : ");
            alturaActual = sc.nextInt();

            if(alturaActual > arbolMasAlto) {
                arbolMasAlto = alturaActual;
                etiquetaArbolMasAlto = etiquetaActual;
            }

            etiquetaActual++;

        } while (alturaActual != -1);

        System.out.println("El arbol más alto tiene la etiqueta " + etiquetaArbolMasAlto + " con una altura de " + arbolMasAlto);

    }

}
