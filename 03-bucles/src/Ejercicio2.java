//
//1. Un centro educativo nos ha pedido que diseñemos una aplicación para calcular algunos datos estadísticos de las edades de los alumnos.
//
//Se introducirán datos hasta que uno de ellos sea negativo.
//
//La aplicación mostrará la suma de todas las edades, la media y cuantos alumnos son mayores de edad

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {

        int edad;
        int contadorEdadesIntroducidas = 0;
        int sumaEdades = 0;
        int contadorMayores = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();

            if(edad > 0) {

                contadorEdadesIntroducidas++;
                sumaEdades = sumaEdades + edad;

                if(edad >= 18 ) {
                    contadorMayores++;
                }

            } else {
                System.out.println("Vas a salir del programa");
            }


        } while(edad > 0);

        System.out.println("La suma de todas las edades es : " + sumaEdades);
        System.out.println("La media de todas las edades es : " + sumaEdades / contadorEdadesIntroducidas);
        System.out.println("Hay un total de " + contadorMayores + " personas mayores de edad");


    }

}
