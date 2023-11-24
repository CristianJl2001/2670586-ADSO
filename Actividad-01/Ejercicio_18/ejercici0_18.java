import java.util.Scanner;

public class ejercici0_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = teclado.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su Índice de Masa Corporal (IMC) es: " + imc);

    }
}
