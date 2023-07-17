import java.util.Scanner;

class ejercicio_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();

        int sumaDigitos = 0;

        while (n != 0) {
            sumaDigitos += n % 10;
            n /= 10;

            if (n == 0 && sumaDigitos >= 10) {
                n = sumaDigitos;
                sumaDigitos = 0;
            }
        }

        System.out.println("Raiz Digital:");
        System.out.println("La Raiz Digital es: " + sumaDigitos);
    }
}
