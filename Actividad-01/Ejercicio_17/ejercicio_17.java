import java.util.Scanner;

public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en COP: ");
        double cantidadCOP = teclado.nextDouble();

        double tasaUSD = 0.00026;
        double tasaEUR = 0.00023;
        double tasaJPY = 0.028;
        double tasaGBP = 0.0002;

        double cantidadUSD = cantidadCOP * tasaUSD;
        double cantidadEUR = cantidadCOP * tasaEUR;
        double cantidadJPY = cantidadCOP * tasaJPY;
        double cantidadGBP = cantidadCOP * tasaGBP;

        System.out.println("Cantidad en USD: " + cantidadUSD);
        System.out.println("Cantidad en EUR: " + cantidadEUR);
        System.out.println("Cantidad en JPY: " + cantidadJPY);
        System.out.println("Cantidad en GBP: " + cantidadGBP);

        teclado.close();
    }
}
