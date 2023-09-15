import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño de los arreglos: ");
        int N = scanner.nextInt();

        int[] arreglo1 = new int[N];
        int[] arreglo2 = new int[N];
        int[] arregloSuma = new int[N];

        
        for (int i = 0; i < N; i++) {
            arreglo1[i] = (int) (Math.random() * 101);  
            arreglo2[i] = (int) (Math.random() * 101);  
        }

        
        for (int i = 0; i < N; i++) {
            arregloSuma[i] = arreglo1[i] + arreglo2[i];
        }

        
        System.out.println("Arreglo 1: " + java.util.Arrays.toString(arreglo1));
        System.out.println("Arreglo 2: " + java.util.Arrays.toString(arreglo2));
        System.out.println("Arreglo de la suma: " + java.util.Arrays.toString(arregloSuma));
    }
}
