import java.util.Scanner;

public class ejercicio_12 {
    public static void main (String []Args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el ancho del resctangulo ");
        int ancho = teclado.nextInt();

        System.out.println("Ingrese la altura del resctangulo ");
        int altura = teclado.nextInt();

        int area = ancho * altura;

        System.out.println("El area de un rectangulo es: "+area);
        
        
    }
}
