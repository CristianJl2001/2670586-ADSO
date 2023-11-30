import java.util.Random;
import java.util.Scanner;

public class ejercicio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese número N: ");
        int n = scanner.nextInt();

        System.out.println("Primos Aleatorios:");

        int contador = 0;
        Random random = new Random();


        if(n == 0 || n == 1 || n ==4){
            
           while (contador < n) {
            int numero = random.nextInt(Integer.MAX_VALUE) + 1;
           }
        }
    }
}