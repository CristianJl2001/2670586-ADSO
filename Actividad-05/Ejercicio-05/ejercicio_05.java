import java.util.Scanner;

public class ejercicio_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int factorial = 1;

        System.out.print("Factorial:\n1");
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
            System.out.print(" x " + i);
        }

        System.out.println(" = " + factorial);
    }
}
