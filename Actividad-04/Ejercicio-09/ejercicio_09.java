import java.util.Scanner;

public class ejercicio_09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        System.out.println("------------------------------------");
        if (esPrimo) {
            System.out.println("--> Numero ingresado Es Primo.");
        } else {
            System.out.println("--> Numero ingresado NO Es Primo.");
        }

        
    }
}
