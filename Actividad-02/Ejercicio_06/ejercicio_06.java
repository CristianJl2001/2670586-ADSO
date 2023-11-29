import java.util.Scanner;

public class ejercicio_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar un número de 6 dígitos: ");
        int numero = teclado.nextInt();

        if (numero < 100000 || numero > 999999) {
            System.out.println("El número ingresado no tiene 6 dígitos.");
            return;
        }

        System.out.println("// ----------------------------------------------- //");
        System.out.println("Menú:");
        System.out.println("1. Primer Digito. 2. Segundo Digito. 3. Tercer Digito.");
        System.out.println("4. Cuarto Digito. 5. Quinto Digito. 6. Sexto Digito.");
        System.out.println("// ----------------------------------------------- //");

        System.out.print("Ingrese una opción: ");
        int opcion = teclado.nextInt();

        int digito = 0;

        if (opcion == 1) {
            digito = numero / 100000;
        } else if (opcion == 2) {
            digito = (numero / 10000) % 10;
        } else if (opcion == 3) {
            digito = (numero / 1000) % 10;
        } else if (opcion == 4) {
            digito = (numero / 100) % 10;
        } else if (opcion == 5) {
            digito = (numero / 10) % 10;
        } else if (opcion == 6) {
            digito = numero % 10;
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        System.out.println("El Dígito seleccionado es: " + digito);

        
    }
}
