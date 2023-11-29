import java.util.Scanner;

public class ejercicio_05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int n1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int n2 = teclado.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int n3 =  teclado.nextInt();

        if(n1 < n2 && n2 <n3 ){
            System.out.println("Los numeros estan ordenados de manera ascendentes");

        }System.out.println("Los  numeros estan ordenados de manera");

    }
    
}