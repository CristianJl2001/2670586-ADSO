import java.util.Scanner;
public class ejercicio_03{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese tamaño de arreglo");
        int arreglo = teclado.nextInt();

        System.out.println("Ingrese cantidad de bombas: ");
        int bombas = teclado.nextInt();

        int array [] = new int [arreglo];

        

        
        for(int i = 0; i < bombas; i++){
            int posicion;   
            do{
                System.out.print("Ingrese la posición de la bomba "+ (i+1) +" :");
                posicion = teclado.nextInt();
            }while(posicion < 0 || posicion >= arreglo || array [posicion] == 1);

            array[posicion] = 1;

            if (posicion > 0) array[posicion - 1] = 2;
            if (posicion < arreglo - 1) array[posicion + 1] = 2;
            array[posicion] = 2;

        }
        

        System.out.println("Arreglo con bombas y área afectada:");
        for (int i = 0; i < arreglo; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println();
    }
}
