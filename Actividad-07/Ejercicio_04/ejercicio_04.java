import java.util.Scanner;
public class ejercicio_04{
    public static void main (String[]args){
        Scanner  teclado = new Scanner (System.in);

        System.out.println("Ingrese el numero de datos");
        int numero = teclado.nextInt();

        int posicion = 0;

        int arreglo [] = new int [numero];
        
        for(int i = 0; i < arreglo.length;){
            System.out.println("Ingrese dato en posición ["+i+"]: ");
            arreglo [i] = teclado.nextInt();
            i++;
        }
        System.out.println("Ingrese posición del dato");
        posicion = teclado.nextInt();

        System.out.println("["+arreglo[posicion]+"]");
            
        System.out.println("Arreglo anti horario: "+posicion);

        for(int j = posicion; j >= 0; j--){
            System.out.print(arreglo [j]+ " ");
        }
    
    }
}