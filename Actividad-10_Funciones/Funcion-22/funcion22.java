import java.util.Scanner;

public class funcion22 {

    public static void main(String[] args) {
        
        int n = 10;

        
        int[] numerosPrimos = generarNumerosPrimos(n);

        
        System.out.println("Arreglo de números primos:");
        for (int i = 0; i < n; i++) {
            System.out.print(numerosPrimos[i] + " ");
        }

        
    }

    // Función para generar un arreglo de números primos
    private static int[] generarNumerosPrimos(int n) {
        int[] numerosPrimos = new int[n];
        int count = 0;
        int numero = 2;

        while (count < n) {
            if (esPrimo(numero)) {
                numerosPrimos[count] = numero;
                count++;
            }
            numero++;
        }

        return numerosPrimos;
    }

    // Función para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}


