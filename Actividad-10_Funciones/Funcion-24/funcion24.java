import java.util.Scanner;

public class funcion24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int[] resultado = contarParesImpares(arreglo);

        System.out.println("Cantidad de números pares: " + resultado[0]);
        System.out.println("Cantidad de números impares: " + resultado[1]);

        scanner.close();
    }

    private static int[] contarParesImpares(int[] arreglo) {
        int[] resultado = new int[2]; 

        for (int numero : arreglo) {
            if (numero % 2 == 0) {
                resultado[0]++; 
            } else {
                resultado[1]++; 
            }
        }

        return resultado;
    }
}
