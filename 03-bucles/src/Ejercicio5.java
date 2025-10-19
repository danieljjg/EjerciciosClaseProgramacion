public class Ejercicio5 {


    public static void main(String[] args) {

        int contadorImpares = 0;
        int producto = 1;

        for (int i = 1; contadorImpares < 10; i++) {

            if(i % 2 != 0) {
                producto *= i;
                contadorImpares++;
            }

        }

        System.out.println("El producto de los 10 primeros números impares es : " + producto);

    }


}
