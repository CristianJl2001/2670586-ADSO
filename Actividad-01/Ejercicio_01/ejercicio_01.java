import java.util.Scanner;


public class ejercicio_01{
    public static void main (String [] Args ){
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int n1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int n2 = teclado.nextInt();

        int suma =  n1 + n2;

        System.out.println("La suma de los dos numeros es: "+suma);
    }
}