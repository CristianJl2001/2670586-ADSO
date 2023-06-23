import java.util.Scanner;

public class ejercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.print("La sucesión Fibonacci es: ");
        int a = 0, b = 1;
        System.out.print(a + ", " + b);

        for (int i = 2; i <= numero; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}

