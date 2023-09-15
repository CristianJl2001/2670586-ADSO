import java.util.Scanner;
public class ejercicio_01{
    public static void main (String[]args){
        Scanner  teclado = new Scanner (System.in);

        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();


        int impar [] = new int [numero];
        
        for(int i = 0; i < numero; i++){
            impar[i] = (i + 1) * 2 -1;


        }
        for(int i = 0; i < numero; i++){
            System.out.println("Los numeros impares son: "+impar[i]);
        }
    }
}