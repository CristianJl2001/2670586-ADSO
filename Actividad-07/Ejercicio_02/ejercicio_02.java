import java.util.Scanner;
public class ejercicio_02{
    public static void main (String[]args){
        Scanner  teclado = new Scanner (System.in);

        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();

        int impar [] = new int [numero];

        int primo = 2;

        for(int i = 0; i < numero;){
            if(esPrimo(primo)){
                impar[i] = primo;
                i++;
            }
            primo++;
        }
        System.out.println("Los número primos son: ");
        for (int i = 0; i < numero; i++){
            System.out.println(impar[i]+"");
        }
    }
    public static boolean esPrimo(int primo) {
        if (primo <= 1) {
            return false;
        }
        for (int i = 2; i * i <= primo; i++) {
            if (primo % i == 0) {
            return false;
            }
        }
        return true;
            
    }   
}
