package clases;

public class Algoritmos {

    public static boolean esPar(int numeroPar) {
        if (numeroPar % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPrimo(int numeroPrimo) {
        if (numeroPrimo <= 1) {
            return false;
        }
        if (numeroPrimo == 2) {
            return true;
        }
        int divisor = 3;
        while (divisor < numeroPrimo) {
            if (numeroPrimo % divisor == 0) {
                return false;
            }
            divisor += 2;
        }
        return true;
    }

    public static String StringEnReversa(String palabra) {
        String reversa = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            reversa += palabra.charAt(i);
        }
        return reversa;
    }

    public static Boolean esPalindromo(String texto){
        String palindromo = texto.toLowerCase().replaceAll(" ","");
        for (int i = 0; i< palindromo.length(); i++) {
            if (palindromo.charAt(i) != palindromo.charAt(palindromo.length()-1 -i) ) {
                return false;
            }
        }
        return true;
    }

    public static void FizzBuzz(int numero){
            for( int i = 1; i<=numero; i++){
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
        }
