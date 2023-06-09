import java.util.Scanner;
public class ejercicio_02{
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = teclado.nextInt();

        System.out.println("Ingrese el cuarto número: ");
        int numero4 = teclado.nextInt();

        int max = numero1;

        if( numero1> max){
            max = numero1;
        }

        if( numero2> max){
            max = numero2;
        }

        if(numero3> max){
            max = numero3;
        }

        if(numero4> max){
            max = numero4;
        }

        System.out.println("El número mayor es: "+max);


 
    }
}