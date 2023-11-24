import java.util.Scanner;

public class ejercicio_06 {
    public static void main (String[]Args){
       Scanner teclado =  new Scanner(System.in);
        
        int suma = 0;

        System.out.println("Ingrese cantidad de numeros: ");
        int cantidad = teclado.nextInt();

        for (int i = 1; i < cantidad; i++) {
        System.out.println("Ingrese numero "+i+ " : ");
        int numero = teclado.nextInt();
        suma += numero;
        }

        double resultado =  (double) suma / cantidad;

        System.out.print("El resultado del promedio es: "+resultado);
    }
}
