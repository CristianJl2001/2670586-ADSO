import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] Args) {
        
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese la longitud en metros: ");
        double longitudMetros = teclado.nextDouble();

        
        double longitudCentimetros = longitudMetros * 100;
        double longitudPulgadas = longitudMetros * 39.37;
        double longitudPies = longitudMetros * 3.281;

        
        System.out.println("Longitud en centímetros: " + longitudCentimetros + " cm");
        System.out.println("Longitud en pulgadas: " + longitudPulgadas + " in");
        System.out.println("Longitud en pies: " + longitudPies + " ft");

        
    }
}
