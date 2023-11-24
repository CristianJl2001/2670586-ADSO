import java.util.Scanner;

public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la inversión inicial: ");
        double inversionInicial = teclado.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
        double tasaInteresAnual = teclado.nextDouble();

        System.out.print("Ingrese el número de períodos: ");
        int numPeriodos = teclado.nextInt();

        double tasaInteresDecimal = tasaInteresAnual / 100;

        double montoFinal = inversionInicial * Math.pow((1 + tasaInteresDecimal), numPeriodos);

        System.out.println("El monto final después de " + numPeriodos + " períodos es: " + montoFinal);

        
    }
}
