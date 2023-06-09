import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su año de nacimiento:");
        int anioNa = teclado.nextInt();

        if (anioNa <= obtenerAnioActual() - 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    public static int obtenerAnioActual() {
        return java.time.Year.now().getValue();
    }
}
