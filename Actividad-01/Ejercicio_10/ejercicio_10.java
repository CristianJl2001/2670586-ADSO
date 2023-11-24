import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        double n1 = teclado.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double n2 = teclado.nextDouble();
        
        if (n2 !=0) {
            double division = n1 / n2;

            double resultado = n1 % n2;

            System.out.println("El resultado entre "+n1+" y "+n2+" es: "+division);

            System.out.println("El resto es de: "+resultado);

        }else{
            System.out.println("No se puede dividir entre 0 ");
        }
    }    

}
