import java.util.Scanner;
public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        String numeros = teclado.nextLine();

        int numero = Integer.parseInt(numeros);

        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }
}
