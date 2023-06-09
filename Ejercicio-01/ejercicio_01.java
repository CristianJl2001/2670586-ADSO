import java.util.Scanner;
public class ejercicio_01{
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese un número: ");
        int numero = teclado.nextInt();

        if (numero <0){
            System.out.println("El numero ingresado es negativo");
        }else{
            System.out.println("El numero ingresado es positivo ");
        }
    }
}