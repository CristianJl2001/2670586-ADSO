import java.util.Scanner;

public class ejercicio_09 {
    public static void main (String [] Args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();

        if(numero % 2 == 0){
            System.out.println("El numero "+numero+" es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
