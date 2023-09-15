import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = scanner.nextInt();

        int[] arreglo = new int[N];


        for (int i = 0; i < N; i++) {
            arreglo[i] = (int) (Math.random() * 101); 
        }

        
        int cantidadPrimos = 0;

        for (int num : arreglo) {
            if (esPrimo(num)) {
                cantidadPrimos++;
            }
        }

        
        System.out.println("Cantidad de números primos en el arreglo: " + cantidadPrimos);
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
