import java.util.Scanner;
public class ejercicio_01{
    public static void main(String [] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("=> Ingrese un sueldo total: ");
        int sueldo1 = teclado.nextInt();
        System.out.print("=> Ingrese cantidad de pagos: ");
        int pagos = teclado.nextInt();

        System.out.print("-------------- FORMAS DE PAGO -----------------");
        System.out.print(" ");
        System.out.println(" ");
        System.out.println("     1. Pagos de igual valor. ");
        System.out.println("     2. Primer pago diferente.");
        System.out.println("     3. Ultimo pago diferente.");
        System.out.println("     4. Primer y Ultimo pago diferente.");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("  => Ingrese forma de Pago:");
        int forma = teclado.nextInt();

        int contador = 0;
        int igual_v = 0;
        int sueldo2 = sueldo1; 
        int segundo = 0;

        
        if(forma ==1){
            System.out.println("------------- SUS PAGOS SERAN ------------------");
            while(contador < pagos){
                contador = contador + 1;
                igual_v= sueldo1 / pagos;
                System.out.println("Mes "+contador+ ": $"+igual_v);                
            }
        }

        if(forma ==2){
            System.out.println("------------- SUS PAGOS SERAN ------------------");
             int primero = sueldo2 / 2;
             contador = contador +1;
                System.out.println("Mes "+contador+": $"+primero);
            while(contador < pagos){
                int cosa = pagos -1;
                igual_v= primero / cosa;
                contador = contador + 1;
                System.out.println("Mes "+contador+": $"+igual_v);
            }
        }

        if(forma ==3 && contador < pagos){
            System.out.println("------------- SUS PAGOS SERAN ------------------");
            int primero = sueldo2 / 2;
            while(contador < pagos){
                contador = contador + 1;
                int cosa = pagos -1;
                igual_v= primero / cosa;
                System.out.println("Mes "+contador+": $"+igual_v);
            }
            System.out.println("Mes "+contador+ ": $"+primero);
        }
        
        
    }
}