import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int N = scanner.nextInt();

        int[] arregloOriginal = new int[N];

        
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

        
        int[] arregloSinRepetidos = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean isUnique = true;

           
            for (int j = 0; j < i; j++) {
                if (arregloOriginal[i] == arregloOriginal[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                arregloSinRepetidos[count] = arregloOriginal[i];
                count++;
            }
        }

        
        int[] resultArray = new int[count];
        for (int i = 0; i < count; i++) {
            resultArray[i] = arregloSinRepetidos[i];
        }

      
        System.out.print("Arreglo sin elementos repetidos: [");
        for (int i = 0; i < count; i++) {
            System.out.print(resultArray[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
