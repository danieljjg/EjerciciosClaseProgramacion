import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        // DECLARO VARIABLES
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        // INICIALIZO VARIABLE CON VALOR INTRODUCIDO POR TECLADO
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        b = sc.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        c = sc.nextDouble();

        // CALCULO EL VALOR ANTES DE HACER LA RAIZ CUADRADA
        double antesDeRaiz = ((b * b) - (4 * a * c));

        // DECLARO LA VARIABLE QUE VA A GUARDAR EL VALOR UNA VEZ HECHA LA RAIZ CUADRADA
        double despuesDeRaiz;

        if(antesDeRaiz > 0){

             despuesDeRaiz = Math.sqrt(antesDeRaiz);

             if( a == 0 ) {
                 System.out.println("Es una ecuación de primer grado.");
             }

             double resultadoConPositivo = (-b + despuesDeRaiz) / (2 * a);
             double resultadoConNegativo = (-b - despuesDeRaiz) / (2 * a);

            System.out.println("El resultado con el signo positivo es : " +  resultadoConPositivo);
            System.out.println("El resultado con el signo negativo es : " +  resultadoConNegativo);


        } else {
            System.out.println("Que esta ecuación no tiene solución");
        }



    }

}
