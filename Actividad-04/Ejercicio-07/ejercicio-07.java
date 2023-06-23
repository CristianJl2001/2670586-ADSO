import java.util.Scanner;

public class ejercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        int mcm = calcularMCM(numero1, numero2, numero3);
        System.out.println("El MCM es: " + mcm);
    }

    public static int calcularMCM(int a, int b, int c) {
        int mcm = 1;
        int divisor = 2;

        while (a > 1 || b > 1 || c > 1) {
            if (a % divisor == 0 || b % divisor == 0 || c % divisor == 0) {
                mcm *= divisor;

                if (a % divisor == 0) {
                    a /= divisor;
                }

                if (b % divisor == 0) {
                    b /= divisor;
                }

                if (c % divisor == 0) {
                    c /= divisor;
                }
            } else {
                divisor++; 
            }
        }

        return mcm;
    }
}
