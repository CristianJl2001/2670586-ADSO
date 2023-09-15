import java.util.Scanner;

public class ejercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = scanner.nextInt();

        int[] arregloOriginal = new int[N];
        int[] arregloInverso = new int[N];

        for (int i = 0; i < N; i++) {
            arregloOriginal[i] = (int) (Math.random() * 101);  
        }

        
        System.out.print("Arreglo original: [");
        for (int i = 0; i < N; i++) {
            System.out.print(arregloOriginal[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        
        for (int i = 0; i < N; i++) {
            arregloInverso[i] = arregloOriginal[N - i - 1];
        }

        
        System.out.print("Arreglo en orden inverso: [");
        for (int i = 0; i < N; i++) {
            System.out.print(arregloInverso[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
