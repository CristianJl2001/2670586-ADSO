import java.util.Scanner;

public class ejercicio_07 {
    public static void main (String[]Args){
        Scanner teclado =  new Scanner (System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        int precio = teclado.nextInt();

        System.out.println("Ingrese el porcentaje de descuento: ");
        int descuento = teclado.nextInt();

        int porcentaje = precio - (descuento * precio / 100);

        System.out.println("El descuento es de: "+porcentaje);

    }
}
