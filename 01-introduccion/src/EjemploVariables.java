import java.util.Scanner;

public class EjemploVariables {

    public static void main(String[] args) {

        System.out.println("Hablando desde consola");


        int edad = 26;
        byte anios = 26;
        short minutos = 60;
        long cantidad = 3;
        float altura = 1.72F; // La F o f solo hay que ponerla cuando declaramos un Float
        double peso = 75.5;
        boolean isTrue = true;
        char letra = 'a';


        // AQUI VAMOS A UTILIZAR A LOS OPERADORES BINARIOS

        //1. Esto es una suma de valores literales
        int suma = 1 + 2;

        //2. Esto es una resta de valores de variables
        int operando1 = 20;
        int operando2 = 30;

        int resta = operando1 - operando2;

        //3. Esto es una multiplicación de valores literales
        int multiplicacion = 6 * 6;

        //4. Esto es una división de valores de variables
        int divisor1, divisor2;  // Estoy declarando dos variables en la misma línea
        divisor1 = 10; // Inicializando Variables
        divisor2 = 20;

        int division = divisor2 / divisor1;

        //5. Esto es una operación de módulo de valores de variables
        int modulo1 = 14, modulo2 = 4;
        int operacionModulo = 14 % 4; // El resto de 14 / 4 que es igual 2.



        // PEDIR INFORMACIÓN POR TECLADO
        int a;
        System.out.println("Introduce el valor de a");
        Scanner sc = new Scanner(System.in); // Objeto que sirve para pedir por teclado
        a = sc.nextInt(); // Doy el valor introducido a la variable a.
        System.out.println("El valor de a es : " + a); // Muestro por consola el valor de a




    }

}
