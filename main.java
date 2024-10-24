import clases.Algoritmos;

public class main {
    public static void main(String[] args) {
        
        boolean ResultadoEsPar = Algoritmos.esPar(0);
        System.out.println(ResultadoEsPar);

        boolean ResultadoEsPrimo = Algoritmos.esPrimo(3);
        System.out.println(ResultadoEsPrimo);

        String pruebaReversa = Algoritmos.StringEnReversa("hola");
        System.out.println(pruebaReversa);

        Boolean resultadoPalindromo = Algoritmos.esPalindromo("anita Lava La tina");
        System.out.println(resultadoPalindromo);

        Algoritmos.FizzBuzz(10);
    }
}
