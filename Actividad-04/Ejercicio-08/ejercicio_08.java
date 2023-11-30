import java.util.Scanner;

public class ejercicio_08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese un número de hasta 6 dígitos: ");
        int numero = teclado.nextInt();

    
        if (numero >= 0 && numero <= 999999) {
            System.out.println("------------------------------------");

            String numeroStr = String.format("%06d", numero); 

            for (int i = 0; i < numeroStr.length(); i++) {
                int digito = Character.getNumericValue(numeroStr.charAt(i));
                System.out.printf("-> El dígito %02d es: %d%n", i + 1, digito);
            }
        } else {
            System.out.println("Número inválido. Por favor, ingrese un número de hasta 6 dígitos.");
        }

        
    }
}
