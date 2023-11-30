import java.util.Scanner;

public class funcion23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés (porcentaje): ");
        double tasaInteres = scanner.nextDouble() / 100.0;

        System.out.print("Ingrese el período en años: ");
        int periodo = scanner.nextInt();

        double montoFinal = calcularMontoFinal(capitalInicial, tasaInteres, periodo);
        System.out.println("El monto final con interés compuesto es: " + montoFinal);

        scanner.close();
    }

    private static double calcularMontoFinal(double capitalInicial, double tasaInteres, int periodo) {
        return capitalInicial * Math.pow(1 + tasaInteres, periodo);
    }
}
