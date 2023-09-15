import java.util.Scanner;
public class ejercicio_03{
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese número");
        int numero =teclado.nextInt();

        int aleatorio = 0;
        int acumulador = 0;
        int contador = 1;
        

        int tanjiro [] = new int [numero];
    

       for(int i = 0; i < tanjiro.length; i++){

        aleatorio = (int)(Math.random()*100+1);
        
        System.out.println("El número "+contador+ " es ["+aleatorio+"]");
        contador++;

        }
        if(aleatorio > tanjiro.length ){
            System.out.println("El número mayor es: "+aleatorio);
        }
    }
}