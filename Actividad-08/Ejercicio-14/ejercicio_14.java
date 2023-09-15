import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        float N = scanner.nextFloat();

        System.out.print("Ingrese tamaño del arreglo: ");
        int size = scanner.nextInt();

        float[] arreglo = new float[size];

        
        for (int i = 0; i < size; i++) {
            arreglo[i] = (float) (Math.random() * 100);  
        }

        
        float valorMasCercano = arreglo[0];
        float minDiferencia = Math.abs(arreglo[0] - N);

        
        for (float num : arreglo) {
            float diferencia = Math.abs(num - N);
            if (diferencia < minDiferencia) {
                minDiferencia = diferencia;
                valorMasCercano = num;
            }
        }

    
        System.out.println("El valor más cercano a " + N + " en el arreglo es: " + valorMasCercano);
    }
}
