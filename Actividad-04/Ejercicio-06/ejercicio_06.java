import java.util.Scanner;

public class ejercicio_06 {
    private static int fibonacciResult;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del n-ésimo término de Fibonacci: ");
        int n = scanner.nextInt();

        fibonacci(n);
        System.out.println("El n-ésimo número Fibonacci es: " + fibonacciResult);
    }

    public static void fibonacci(int n) {
        if (n <= 0) {
            fibonacciResult = 0;
        } else if (n == 1) {
            fibonacciResult = 1;
        } else {
            int a = 0;
            int b = 1;
            int i = 2;

            while (i <= n) {
                int temp = a + b;
                a = b;
                b = temp;
                i++;
            }

            fibonacciResult = b;
        }
    }
}
