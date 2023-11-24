import java.util.Scanner;

public class ejercicio_05 {
    public static void main (String [] Args){
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo: ");
        int base = teclado.nextInt();

        System.out.println("Ingrese la altura del triangulo: ");
        int altura = teclado.nextInt();

        double area = (base * altura) / 2;

        System.out.println("El area del triangulo es de: "+area);
    }
    
}
