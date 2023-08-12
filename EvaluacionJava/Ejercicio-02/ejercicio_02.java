import java.util.Scanner;

public class ejercicio_02{
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese tamaño del arreglo: ");
        int tamano = teclado.nextInt();

        int [][] cuadro = new int [tamano][tamano];

        int suma = 1;

        for(int i = 0; i < tamano; i++){
            if(i % 2 ==0)
            for(int j = 0; j < tamano; j++){
                cuadro [i] [j] = suma++;
            }else{
                for(int j = tamano - 1; j >= 0; j--){
                    cuadro[i][j] = suma++;
                }
            }
        }
        for(int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                System.out.printf("[%02d]", cuadro[i][j]);
            }
            System.out.println();
        }
    }
}