import java.util.Scanner;

public class ejercicio_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (N): ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el segundo número (M): ");
        int m = scanner.nextInt();

        for (int i = n; i <= m; i++) {
            int factorial = 1;

            System.out.print("Factorial de " + i + " (" + i + "!): ");
            for (int j = 1; j <= i; j++) {
                factorial *= j;
                if (j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(j + " x ");
                }
            }
            System.out.println(" = " + factorial);
        }
    }
}
