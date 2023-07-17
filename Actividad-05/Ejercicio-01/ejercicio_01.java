import java.util.Scanner;
public class ejercicio_01{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero (Entre 1-6): ");
        int numero = teclado.nextInt();

        if(numero >=1 && numero <= 6){
            int variable =0;
            for(int i = 0; i < numero; i++){
                int digito = (int) (Math.random() * 10);
                variable = variable *10 + digito;
            }
            System.out.println("El numero contruido es: "+variable);
            System.out.println("Resultado producto: "+(variable * 2));
        }else{
            System.out.println("El numero no se encuentra dentro el rango");
        }
    }

}