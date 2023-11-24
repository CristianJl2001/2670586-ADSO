import java.util.Scanner;

public class ejercicio_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero de hasta 5 dígitos: ");
        int numero = teclado.nextInt();
        
        int sumaDigitos = 0;

        String numeroComoCadena = Integer.toString(numero);

        for (int i = 0; i < numeroComoCadena.length(); i++) {
            int digito = Character.getNumericValue(numeroComoCadena.charAt(i));
            sumaDigitos += digito;
        }

        System.out.println("La suma de los dígitos es: " + sumaDigitos);

        
    }
}
