import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = teclado.nextDouble();

        
        if (radio <= 0) {
            System.out.println("Error: El radio debe ser un número positivo.");
        } else {
            
            double perimetro = 2 * Math.PI * radio;

            
            double area = Math.PI * Math.pow(radio, 2);

            
            System.out.println("El perímetro del círculo es: " + perimetro);
            System.out.println("El área del círculo es: " + area);
        }
    }
    
}
