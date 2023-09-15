import java.util.Scanner;
public class ejercicio_01{
    public static void main (String []args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese tamaño del arreglo");
        int numero = teclado.nextInt();

        String nombres [] = new String [numero];

        int contador = 0; 

        String nombre = "";

        String acumulador = "";

        for(int i = 0; i < nombres.length; i++){
            contador = contador +1;
            System.out.println("El nombre ingresado en POS ["+contador+ "]" );
            nombre = teclado.next();
        }
        

    }
}