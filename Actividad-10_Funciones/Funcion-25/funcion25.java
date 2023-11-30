import java.util.Scanner;
import java.util.Random;

public class funcion25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el límite inferior: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Ingrese el límite superior: ");
        int limiteSuperior = scanner.nextInt();

        int numeroAleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);
        System.out.println("Número aleatorio en el rango: " + numeroAleatorio);

        scanner.close();
    }

    private static int generarNumeroAleatorio(int limiteInferior, int limiteSuperior) {
        Random rand = new Random();
        return rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }
}
