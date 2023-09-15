import java.util.Scanner;
public class ejercicio_02{
    public static void main ( String [] args){


        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese el tamaño del arreglo: ");
        int numero = teclado.nextInt();

        String letras [] = new String [numero];

        int contador = 1;

        String nombre1 = "";

        String nombre2 = "";

        String acumulador = "";

        int i = 0;


        

        
        for( i = 0; i < letras.length; i++){
            System.out.println("Ingrese nombre "+contador++);
            nombre1 = teclado.next();

            

        }


         System.out.println("Ingrese otro nombre ");
            nombre2 = teclado.next();

        if(nombre2.equals(nombre1)){
            
            System.out.println("Los nombres son iguales ["+letras.length+"]");

        }else{

         System.out.println("Los nombres son diferentes");
        }
        
        if(nombre1.equals(nombre2)){

         System.out.println("Los nombre son iguales");

         System.out.println("POS ["+letras.length+"]");

        }
    }


    
}