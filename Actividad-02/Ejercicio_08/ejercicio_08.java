import java.util.Scanner;

public class ejercicio_08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número (máximo 9 dígitos): ");
        int numero = teclado.nextInt();

        if (numero < 0 || numero > 999999999) {
            System.out.println("El número ingresado no cumple con las condiciones especificadas.");
            return;
        }

        String[] unidades = {"", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE"};
        String[] especialesDiezAQuince = {"DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE"};
        String[] decenas = {"", "", "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"};
        String[] centenas = {"", "CIENTO", "DOSCIENTOS", "TRESCIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"};

        StringBuilder resultado = new StringBuilder();

        
        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;

        
        if (centena > 0) {
            resultado.append(centenas[centena]).append(" ");
        }

        
        if (decena == 1) {
            if (unidad > 0) {
                resultado.append(especialesDiezAQuince[unidad]).append(" ");
            } else {
                resultado.append(decenas[decena]).append(" ");
            }
        } else {
            if (decena > 1) {
                resultado.append(decenas[decena]).append(" ");
            }
            if (unidad > 0) {
                resultado.append(unidades[unidad]).append(" ");
            }
        }

        System.out.println("El texto del número es: " + resultado.toString().trim());
    }
}
