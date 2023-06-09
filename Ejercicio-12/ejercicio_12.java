import java.util.Scanner;
public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el precio original:");
        double precio1 = teclado.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento:");
        int porcentaje = teclado.nextInt();

        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = (precio1 * porcentaje) / 100;
            double precioFinal = precio1 - descuento;
            System.out.println("El descuento aplicado es: " + descuento);
            System.out.println("El precio final con descuento es: " + precioFinal);
        } else {
            System.out.println("El porcentaje de descuento ingresado no es válido.");
        }
    }
}
