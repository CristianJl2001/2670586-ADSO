import java.util.Scanner;

public class ejercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = scanner.nextInt();

        System.out.print("Ingrese el número a buscar (M): ");
        int M = scanner.nextInt();

        int[] arreglo = new int[N];

        
        for (int i = 0; i < N; i++) {
            arreglo[i] = (int) (Math.random() * 101);
        }

        System.out.print("Arreglo generado: [");
        for (int i = 0; i < N; i++) {
            System.out.print(arreglo[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (arreglo[i] == M) {
                contador++;
            }
        }

        System.out.println("El número " + M + " aparece " + contador + " veces en el arreglo.");
    }
}
