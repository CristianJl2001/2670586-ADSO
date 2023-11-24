import java.util.Scanner;

public class ejercicio_08 {
    public static void main(String [] Args){
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Ingresa la primera cadena de palabra: ");
        String cadena01 = teclado.nextLine();

        System.out.println("Ingresa la segunda cadena de palabra: ");
        String cadena02 =  teclado.nextLine();

        String cadena =  cadena01 + cadena02;

        System.out.println("La cadena de palabras completa es: "+cadena);
    
    }   
}
