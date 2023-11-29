import java.text.NumberFormat;
import java.util.Scanner;

public class ejercicio_07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar un número (Máximo 10 dígitos e inferior a los dos mil millones): ");
        long numero = teclado.nextLong();

        if (numero < 0 || numero >= 2000000000) {
            System.out.println("El número ingresado no cumple con las condiciones especificadas.");
            
            return;
        }

        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
        System.out.println("// ---------- FORMATO DE MONEDA ----------- //");
        System.out.println("Moneda: " + formatoMoneda.format(numero));

        
    }
}
