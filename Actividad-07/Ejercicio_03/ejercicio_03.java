import java.util.Scanner;
public class ejercicio_03{
    public static void main (String[]args){
        Scanner  teclado = new Scanner (System.in);

        System.out.println("Ingrese el numero de datos");
        int numero = teclado.nextInt();

        int posicion = 0;

        int arreglo [] = new int [numero];
        
        System.out.println("Ingrese los valores al arreglo ");
        System.out.println(" ");
        for(int i = 0; i < numero; i++){
            System.out.println("Ingrese dato en posición ["+i+"]: ");
            arreglo [i] = teclado.nextInt();
        }
        System.out.println("Ingrese la posicion de antihorario");
        int inicioHorario = teclado.nextInt();

        if(inicioHorario >= 0 && inicioHorario > numero){
            System.out.println("Arreglo de defecto");
            for(int i = 0; i < numero; i++){
                System.out.print("[ "+arreglo[i]+ " ] ");
            }
            System.out.println("Psoicion anti horario desde la posicion "+inicioHorario+" :");
            for(int i = inicioHorario; inicioHorario >= 0; i--){
            System.out.println(arreglo[i]+ " ");
            }
            for(int i = numero -1; i > inicioHorario; i--){
            System.out.println(arreglo[i]+ " ");
            }
        }else{
            System.out.println("Ingrese un valor valido");
        }
        

    }
}