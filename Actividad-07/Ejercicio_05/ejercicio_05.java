import java.util.Scanner;
public class ejercicio_05{
    public static void main(String []Args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese un número: ");
        int numero = teclado.nextInt();

        int tamano[] = new int [numero];

        for(int i =0; i < numero; i++){
            System.out.print("Ingrese dato en posición: [ "+i+ "]");
            tamano [i] = teclado.nextInt();
        }
        
        System.out.println("Ingres el numero de movimientos: ");
        int movimiento = teclado.nextInt();

        for(int i = 0; i < movimiento; i++){
            int algo = tamano [0];
            for(int j = 0; j < numero -1; i++){
                tamano [j] = tamano[j + 1];
            }
            tamano[numero -1] = algo; 

        }
        System.out.println("Arreglo después de los movimientos:");
        for (int i = 0; i < numero; i++) {
            System.out.print(tamano[i] + " ");
        }
    }   
}