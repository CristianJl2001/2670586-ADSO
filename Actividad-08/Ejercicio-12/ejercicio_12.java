import java.util.Random;
import java.util.Scanner;

public class ejercicio_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int n = scanner.nextInt();

        if (n > 0) {

            int[] arreglo = new int[n];

            Random random = new Random();
            for (int i = 0; i < n; i++) {
                arreglo[i] = random.nextInt(100) + 1; // Números aleatorios entre 1 y 100
            }

            System.out.print("Arreglo: { ");
            for (int i = 0; i < n; i++) {
                System.out.print(arreglo[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" }");

            int countPrimos = 0;
            for (int i = 0; i < n; i++) {
                int numero = arreglo[i];
                boolean esPrimo = true;

                if (numero < 2) {
                    esPrimo = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(numero); j++) {
                        if (numero % j == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }

                if (esPrimo) {
                    countPrimos++;
                }
            }

            System.out.println("Cantidad de números primos en el arreglo: " + countPrimos);
        } else {
            System.out.println("Número ingresado no válido. Por favor, ingrese un número positivo.");
        }

        
    }
}
