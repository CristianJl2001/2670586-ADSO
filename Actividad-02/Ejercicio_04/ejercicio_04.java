import java.util.Scanner;

public class ejercicio_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int n1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int n2 = teclado.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int n3 =  teclado.nextInt();

        int mayor = n1;
        int menor = n1 ;

        if(n2 > mayor){
            mayor = n2;
        }
        if(n3 > mayor){
            mayor = n3;
        }

        System.out.println("El numero mayor es: "+mayor);


        if(n2 < menor){
            menor = n2;
        
        }
        if(n3 < menor){
            menor = n3;
        }

        System.out.println("El numero menor es: "+menor);
    }
    
}
