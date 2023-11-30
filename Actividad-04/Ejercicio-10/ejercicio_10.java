import java.util.Scanner;

public class ejercicio_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero (máximo 11): ");
        int n = teclado.nextInt();

        if (n > 0 && n <= 11) {
            System.out.println("-----------------------------------------------");
            System.out.println("--> Los numeros primos encontrados son:");

            int count = 0;
            int numero = 2;

            while (count < n * n) {
                boolean esPrimo = true;
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    System.out.printf("[%03d] ", numero);
                    count++;
                    if (count % n == 0) {
                        System.out.println();
                    }
                }
                numero++;
            }

            System.out.println("|-----------------------------------------------");
        } else {
            System.out.println("Número ingresado no válido. Por favor, ingrese un número entre 1 y 11.");
        }

    }
}
