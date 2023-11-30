import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el orden del cuadrado latino (N): ");
        int n = scanner.nextInt();

        int[][] cuadrado = new int[n][n];

        for (int i = 0; i < n; i++) {
            cuadrado[0][i] = i + 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado[i][j] = cuadrado[i-1][(j + 1) % n];
            }
        }

        System.out.println("Cuadrado latino:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
