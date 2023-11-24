import java.util.Scanner;

public class ejercicio_02 {
    public static void main(String [] Args){
        Scanner teclado =  new Scanner (System.in);

        System.out.println("Ingrese los grados C a convertir: ");
        int C = teclado.nextInt();

        double F = (C * 9/5) + 32;

        System.out.println("La conversion de C a F es de: "+F);
    }
}
