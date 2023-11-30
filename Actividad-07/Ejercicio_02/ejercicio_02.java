import java.util.Scanner;

public class ejercicio_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para el tamaño del arreglo: ");
        int tamanoArreglo = scanner.nextInt();

        if (tamanoArreglo > 0) {

            int[] arregloPrimos = new int[tamanoArreglo];

            int numero = 2;
            int count = 0;

            while (count < tamanoArreglo) {
                boolean esPrimo = true;
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    arregloPrimos[count] = numero;
                    count++;
                }
                numero++;
            }

            System.out.println("---------------------------------------------");
            System.out.println("Arreglo de números primos:");

            for (int i = 0; i < tamanoArreglo; i++) {
                System.out.printf("[%03d] ", arregloPrimos[i]);
            }

            System.out.println("\n---------------------------------------------");
        } else {
            System.out.println("Tamaño del arreglo no válido. Por favor, ingrese un número positivo.");
        }

        
    }
}
