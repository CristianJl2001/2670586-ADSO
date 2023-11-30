import java.util.Scanner;

public class ejercicio_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamanoArreglo = scanner.nextInt();

        int[] arregloOriginal = new int[tamanoArreglo];

        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < tamanoArreglo; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arregloOriginal[i] = scanner.nextInt();
        }

        System.out.print("Arreglo Original: { ");
        for (int i = 0; i < tamanoArreglo; i++) {
            System.out.print(arregloOriginal[i]);
            if (i < tamanoArreglo - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        int[] arregloPrimos = new int[tamanoArreglo];
        int[] arregloNoPrimos = new int[tamanoArreglo];
        int countPrimos = 0;
        int countNoPrimos = 0;

        for (int i = 0; i < tamanoArreglo; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(arregloOriginal[i]); j++) {
                if (arregloOriginal[i] % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                arregloPrimos[countPrimos] = arregloOriginal[i];
                countPrimos++;
            } else {
                arregloNoPrimos[countNoPrimos] = arregloOriginal[i];
                countNoPrimos++;
            }
        }

        System.out.print("Arreglo Primos: { ");
        for (int i = 0; i < countPrimos; i++) {
            System.out.print(arregloPrimos[i]);
            if (i < countPrimos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Arreglo No Primos: { ");
        for (int i = 0; i < countNoPrimos; i++) {
            System.out.print(arregloNoPrimos[i]);
            if (i < countNoPrimos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.println("Longitud Arreglo Original: " + tamanoArreglo);
        System.out.println("Longitud Arreglo Primos: " + countPrimos);
        System.out.println("Longitud Arreglo No Primos: " + countNoPrimos);

    }
}
