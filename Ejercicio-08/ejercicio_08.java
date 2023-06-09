import java.util.Scanner;
public class ejercicio_08{
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo: ");
        double base = teclado.nextDouble();

        System.out.println("Ingrese altura del triangulo: ");
        double altura = teclado.nextDouble();

        double area = (base * altura) / 2;

        if(base < 0){
            System.out.println("Ingrese valor en positivo");
         }else{
            System.out.print("El area del triangulo es: "+area);
         }
            
    }
     
}
