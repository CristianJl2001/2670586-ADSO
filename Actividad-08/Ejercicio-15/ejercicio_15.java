import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = scanner.nextInt();

        int[] arreglo = new int[N];

        
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        
        boolean esPalindromo = true;
        for (int i = 0; i < N / 2; i++) {
            if (arreglo[i] != arreglo[N - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }

        System.out.println("El arreglo " + (esPalindromo ? "es" : "no es") + " un palíndromo.");
    }
}
