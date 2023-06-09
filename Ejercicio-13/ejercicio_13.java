import java.util.Scanner;
public class ejercicio_13{
    public static void main (String[]args){
        Scanner teclado =new Scanner (System.in);

        System.out.println("Ingrese un numero: ");
        int numero1 = teclado.nextInt();

        if((numero1 %2 == 0) && (numero1 %3 ==0) && (numero1 %5 ==0)){
            System.out.println("El numero es divisible por 2, 3, 5");
        } else{
            System.out.println("El numero no cumple con las condiciones");
        }
    }
}