import java.util.Scanner;

public class ejercicio_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = scanner.nextInt();

        int[] arreglo = new int[N];
        int[] pares;
        int[] impares;


        for (int i = 0; i < N; i++) {
            arreglo[i] = (int) (Math.random() * 101); 
        }

        
        System.out.print("Arreglo original: [");
        for (int i = 0; i < N; i++) {
            System.out.print(arreglo[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int cantidadPares = 0;
        int cantidadImpares = 0;

        for (int i = 0; i < N; i++) {
            if (arreglo[i] % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }


        pares = new int[cantidadPares];
        impares = new int[cantidadImpares];

        int indicePares = 0;
        int indiceImpares = 0;


        for (int i = 0; i < N; i++) {
            if (arreglo[i] % 2 == 0) {
                pares[indicePares++] = arreglo[i];
            } else {
                impares[indiceImpares++] = arreglo[i];
            }
        }


        System.out.print("Arreglo de pares: [");
        for (int i = 0; i < cantidadPares; i++) {
            System.out.print(pares[i]);
            if (i < cantidadPares - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Arreglo de impares: [");
        for (int i = 0; i < cantidadImpares; i++) {
            System.out.print(impares[i]);
            if (i < cantidadImpares - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
