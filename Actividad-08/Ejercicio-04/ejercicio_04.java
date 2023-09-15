import java.util.Scanner;

public class ejercicio_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = teclado.nextInt();
        int[] arreglo = new int[N];

        for (int i = 0; i < N; i++) {
            arreglo[i] = (int) (Math.random() * 101);  // Números aleatorios entre 0 y 100
        }

        System.out.print("Arreglo generado: [");
        for (int i = 0; i < N; i++) {
            System.out.print(arreglo[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int minValor = arreglo[0];
        for (int i = 1; i < N; i++) {
            if (arreglo[i] < minValor) {
                minValor = arreglo[i];
            }
        }

        System.out.println("El valor mínimo del arreglo es: " + minValor);
    }
}
