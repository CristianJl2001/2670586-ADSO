import java.util.Scanner;

public class ejercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = scanner.nextInt();
        double[] arreglo = new double[N];

        
        for (int i = 0; i < N; i++) {
            arreglo[i] = Math.random() * 100; 
        }

       
        System.out.print("Arreglo generado: [");
        for (int i = 0; i < N; i++) {
            System.out.print(arreglo[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        
        double suma = 0;
        for (int i = 0; i < N; i++) {
            suma += arreglo[i];
        }
        double promedio = suma / N;

       
        System.out.println("El promedio del arreglo es: " + promedio);
    }
}
