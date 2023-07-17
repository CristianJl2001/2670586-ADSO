import java.util.Scanner;

public class ejercicio_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero (máximo 6 dígitos): ");
        int numero = scanner.nextInt();

        int numeroReverso = 0;
        int original = numero;

        while (numero > 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        if (original == numeroReverso) {
            System.out.println("El numero SI es palindromo");
        } else {
            System.out.println("El numero NO es palindromo");
        }
    }
}
