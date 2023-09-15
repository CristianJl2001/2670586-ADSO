import java.util.Scanner;
public class Array{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        // Arreglos en java 
        // tipo_dato - nombreVariable - cantidad de dimensiones ([])
        // = new tipo_dato [tamano]
         System.out.println("Ingrese el tamaño");
         int numero = teclado.nextInt();
         
         
        int numero1 [] = new int [numero];
         
         for(int i = 0; i < numero; i++){
            numero1[i] = (i+1) * 2;
        }

        for(int i = 0; i < numero; i++){
            System.out.println("Los numeros pares: "+numero1[i]);
        }
        

    }
}
