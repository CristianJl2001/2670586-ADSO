import java.util.Scanner;

public class ejercicio_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = scanner.nextInt();

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

        System.out.print("Ingrese el número a buscar (M): ");
        int M = scanner.nextInt();

        int posicion = -1;

    
        for (int i = 0; i < N; i++) {
            if (arreglo[i] == M) {
                posicion = i; 
                break;  
            }
        }

        
        if (posicion != -1) {
            System.out.println("El número " + M + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número " + M + " no se encuentra en el arreglo.");
        }
    }
}
