import java.util.Scanner;
public class ejercicio_05{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese un año: ");
        int numero = teclado.nextInt();


        
        if(numero % 4 == 0){
            System.out.println("El año es biciesto");
        }else if(numero % 400 == 0){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
        if(numero %100 ==0){
            System.out.println("El año no es bisiesto");
            
        }else{
        }
    }
}