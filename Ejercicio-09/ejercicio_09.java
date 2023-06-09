import java.util.Scanner;
public class ejercicio_09{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese numero de horas trabajadas: ");
        int horas = teclado.nextInt();

        double hora = 4.833;
        double shoras = (hora * horas);


        if(horas> 40){
            double menos = horas -40;
            double extra = menos * hora;
            double definitiva = extra / 2;
            double total = definitiva + shoras;
            System.out.println("Por trabajar mas de 40 horas se le añadieron horas extra y su valor es de: "+total);

        }else{
            System.out.println("Salario de horas trabajadas: "+shoras);
        }


    }
}