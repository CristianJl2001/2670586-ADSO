import java.util.Scanner;
public class ejercicio_02{
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese número");
        int numero =teclado.nextInt();

        int aleatorio = 0;
        int contador = 1; 
        int aleatorio2 = 0;
        int resultado = 0;
        int acumulador = 1;

        int arreglo [] = new int [numero];
        for(int i = 0; i < arreglo.length; i++){

            aleatorio = (int)(Math.random()*10+1); 

            aleatorio2 = (int)(Math.random()*10+1);

            resultado = aleatorio * aleatorio2;

            System.out.println("El numero "+contador+ " es "+resultado);
            contador++;

             resultado = aleatorio * aleatorio2;

            acumulador = resultado * acumulador;
        }
        System.out.println("El producto es: "+acumulador);
    }
}