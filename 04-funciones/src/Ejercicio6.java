public class Ejercicio6 {

    public static void main(String[] args) {



    }

    public static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;

        if(num < 2) {
            primo = false;
        }

        while( i < num && primo == true) {
            if(num % i == 0) {
                primo = false;
            }
            i++;
        }

        return primo;

    }


    public static boolean divisoresPrimos(int num) {

        System.out.println("Dividores primos de " + num);

        for(int i = 1; i < num; i++) {

            if(esPrimo(i) && num % 1 == 0 ) {
                return true;
            }

        }

        return false;

    }

}
