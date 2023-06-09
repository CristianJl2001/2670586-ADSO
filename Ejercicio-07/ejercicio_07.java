import java.util.Scanner;
public class ejercicio_07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int numero = teclado.nextInt();

        if (palindromo(numero)) {
            System.out.println("El número ingresado es un palindromo.");
        } else {
            System.out.println("El número ingresado no es un palindromo.");
        }
    }

    public static boolean palindromo(int numero) {
        int numeroReverso = invertirNumero(numero);
        return numero == numeroReverso;
    }

    public static int invertirNumero(int numero) {
        int numeroReverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        return numeroReverso;
    }
}
