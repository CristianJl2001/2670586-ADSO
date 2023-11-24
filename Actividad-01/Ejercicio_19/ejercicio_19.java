import java.util.Scanner;

public class ejercicio_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        int edad = teclado.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = teclado.nextDouble();
        
        teclado.nextLine();

        System.out.println("\nInformación del empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Salario: $" + salario);

        
    }
}
