import java.util.Scanner;

public class ejercicio_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero de 3 digitos");
        int numero =  teclado.nextInt();

        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
