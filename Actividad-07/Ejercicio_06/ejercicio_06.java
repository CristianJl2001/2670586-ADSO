import java.util.Scanner;

public class ejercicio_06 {
    public static void main(String[] Args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo ");
        int tamano = teclado.nextInt();

        int arreglo[] = new int[tamano];

        if (tamano > 0) {
            for (int i = 0; i < tamano; i++) {
                System.out.println("Ingrese dato en posición: [" + i + "]");
                arreglo[i] = teclado.nextInt();
            }

            System.out.println("Arreglo llenado por el usuario: ");
            for (int i = 0; i < tamano; i++) {
                System.out.println(arreglo[i]);
            }

            System.out.println("Los números primos son: ");
            for (int i = 0; i < tamano; i++) {
                if (esPrimo(arreglo[i])) {
                    System.out.print(arreglo[i] + " ");
                }
            }

            System.out.println("\nLos números no primos son: ");
            for (int i = 0; i < tamano; i++) {
                if (!esPrimo(arreglo[i])) {
                    System.out.print(arreglo[i] + " ");
                }
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
