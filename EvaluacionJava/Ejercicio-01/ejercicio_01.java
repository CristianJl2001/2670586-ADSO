import java.util.Scanner;

public class ejercicio_01{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese numero maximo 6 digitos: ");
        int numero = teclado.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        if (invertido == original) {
            System.out.println("Respuesta: El numero SI es PALINDROMO");
        } else {
            System.out.println("Respuesta: El numero NO es PALINDROMO");
        }
    }
}