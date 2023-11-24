import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese la cantidad de segundos: ");
        int segundos = teclado.nextInt();

        int horas = segundos / 3600;

        int minutos = (segundos % 3600) / 60;

        segundos = minutos % 60;


        System.out.println(+horas+" hora "+minutos+" minutos "+segundos+" segundos");
        
        
        int resultado = 10 % 3;
        System.out.println(resultado);

    }
}
