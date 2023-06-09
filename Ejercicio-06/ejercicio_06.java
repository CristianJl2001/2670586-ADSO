import java.util.Scanner;
public class ejercicio_06{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();


        if(edad >= 18 ){
            System.out.println("Puede votar");
        }else{
            System.out.println("No puede votar");
        }
    }
}