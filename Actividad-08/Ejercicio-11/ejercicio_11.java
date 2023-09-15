import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del primer arreglo (N): ");
        int N = scanner.nextInt();

        System.out.print("Ingrese tamaño del segundo arreglo (M): ");
        int M = scanner.nextInt();

        int[] arreglo1 = new int[N];
        int[] arreglo2 = new int[M];

        
        for (int i = 0; i < N; i++) {
            arreglo1[i] = (int) (Math.random() * 101);  
        }

        for (int i = 0; i < M; i++) {
            arreglo2[i] = (int) (Math.random() * 101); 
        }

        // Ordenar los arreglos
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        
        int[] arregloCombinado = new int[N + M];

        
        for (int i = 0; i < N; i++) {
            arregloCombinado[i] = arreglo1[i];
        }

        
        for (int i = 0; i < M; i++) {
            arregloCombinado[N + i] = arreglo2[i];
        }

        
        Arrays.sort(arregloCombinado);

        // Mostrar el arreglo combinado
        System.out.print("Arreglo combinado ordenado: [");
        for (int i = 0; i < arregloCombinado.length; i++) {
            System.out.print(arregloCombinado[i]);
            if (i < arregloCombinado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
