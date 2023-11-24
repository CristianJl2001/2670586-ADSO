import java.util.Scanner;

public class ejercicio_03 {
    public static void main (String []Args){
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Ingrese primer numero: ");
        int n1 = teclado.nextInt();

        System.out.println("Ingrese segundo numero: ");
        int n2 = teclado.nextInt();

        System.out.println("Los numeros ingresadis intercambiados son: "+n2+" y "+n1);
    }
}
