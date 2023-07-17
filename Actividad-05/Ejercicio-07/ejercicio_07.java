import java.util.Scanner;

public class ejercicio_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero impar (N): ");
        int n = scanner.nextInt();

        if (n % 2 != 0 && n > 0) {
            int altura = (n + 1) / 2;

            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= altura - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("x");
                }
                System.out.println();
            }

            for (int i = altura - 1; i >= 1; i--) {
                for (int j = 1; j <= altura - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("x");
                }
                System.out.println();
            }
        } else {
            System.out.println("El número ingresado no es impar.");
        }
    }
}
