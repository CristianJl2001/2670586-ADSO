import java.util.Scanner;
public class ejercicio_01{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese cantidad de notas: ");
        int cantidad_n =teclado.nextInt();
        
        
        double notas =0;
        double suma_no = 0; 
        int contador = 1;

        while(contador <= cantidad_n){
            System.out.println("--> Ingrese nota: "+contador);
            notas = teclado.nextDouble();
            contador = contador + 1;
            suma_no =suma_no + notas;
        }
        double resultado = suma_no / cantidad_n;
        System.out.println("--> Promedio de notas obtenidas ="+ resultado);
  
    }
}