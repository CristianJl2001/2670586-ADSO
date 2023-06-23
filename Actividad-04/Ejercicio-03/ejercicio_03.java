import java.util.Scanner;

public class ejercicio_03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            int espacio = altura - i - 1;
            int X = 2 * i + 1;

            for (int raya = 0; raya < espacio; raya++) {
                System.out.print(" ");
            }

            for (int k = 0; k < X; k++) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}
