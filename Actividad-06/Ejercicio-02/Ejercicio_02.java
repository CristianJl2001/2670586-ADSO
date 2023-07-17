import java.util.Scanner;
public class ejercicio_02{
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese cantidad financiada: ");
        int finanza = teclado.nextInt();

        System.out.println("Ingrese cantidad de cuotas pagadas: ");
        int cuotas = teclado.nextInt();

        int contador = 0;
        int c_valor = 0;
        double valor_in = 0;
        double porc_in = 0;
        while(cuotas > contador){
            contador = contador + 1;
            System.out.println("Ingrese el valor de cada cuota: "+contador);
             c_valor = teclado.nextInt();

            double total_fi = cuotas * c_valor;
            valor_in = total_fi - finanza;
            porc_in = (valor_in/ finanza) * 100;
        }
        
        System.out.println("El total de interes pagados es: "+valor_in);
        System.out.println("El porcentaje de interes pagados es: "+porc_in+ "%");

    } 
}