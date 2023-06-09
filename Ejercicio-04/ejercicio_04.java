import java.util.Scanner;
public class ejercicio_04{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese primera nota");
        double nota1 = teclado.nextDouble();

        System.out.println("Ingrese segunda nota");
        double nota2 = teclado.nextDouble();

        System.out.println("Ingrese tercera nota");
        double nota3 = teclado.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if(promedio >= 7){
            System.out.println("Aprobo. El promedio es: "+promedio);
        }else{
            System.out.println("Reprobo. El promedio es: "+promedio);
        }



    }
}