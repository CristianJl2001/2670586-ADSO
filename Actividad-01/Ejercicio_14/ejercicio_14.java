import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] Args) {
        
        Scanner teclado = new Scanner(System.in);

       
        System.out.print("Ingrese la nota de la primera materia: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Ingrese los créditos de la primera materia: ");
        int creditos1 = teclado.nextInt();

        System.out.print("Ingrese la nota de la segunda materia: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Ingrese los créditos de la segunda materia: ");
        int creditos2 = teclado.nextInt();

        System.out.print("Ingrese la nota de la tercera materia: ");
        double nota3 = teclado.nextDouble();
        System.out.print("Ingrese los créditos de la tercera materia: ");
        int creditos3 = teclado.nextInt();

        
        double promedioPonderado = (nota1 * creditos1 + nota2 * creditos2 + nota3 * creditos3) / (creditos1 + creditos2 + creditos3);

        
        System.out.println("El promedio ponderado es: " + promedioPonderado);
    }
}
