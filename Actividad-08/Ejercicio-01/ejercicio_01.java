import java.util.Scanner;
public class ejercicio_01{
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese número");
        int numero = teclado.nextInt();

        int aleatorio = 0;
        int contador = 1;
        int acumulador = 0;

        int arreglo [] = new int [numero];
        for ( int i = 0; i < arreglo.length; i++){
            aleatorio = (int)(Math.random()*10 + 1);

            System.out.println("El numero "+contador+ " es "+aleatorio);
            contador++;

            acumulador = acumulador + aleatorio; i++;
        }

        System.out.println("La suma de todos los datos son :"+acumulador);
    }
}