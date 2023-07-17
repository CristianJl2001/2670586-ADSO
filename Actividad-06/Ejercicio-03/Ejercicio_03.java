// import java.util.Scanner;
// public class ejercicio_03{
//     public static void main (String [] args){
//         Scanner teclado = new Scanner (System.in);

//         System.out.println("Valor total a financiar: ");
//         double valor1 = teclado.nextDouble();

//         System.out.println("Ingrese cantidad de cuotas: ");
//         double cuotas = teclado.nextDouble();

//         System.out.println("Valor tasa de interes: ");
//         double Valor2 = teclado.nextDouble();

        
//         System.out.println("Detalle de cuotas:");
//         System.out.println("Cuota | Interés | Abono a Capital | Deuda Total");
//         System.out.println("---------------------------------------------");

       
//             double interes_m = valor1 * Valor2;
//             double cuota_m = valor1 / cuotas;
//             double Abono = cuota_m - interes_m;
//             double total = valor1 - Abono;

//             System.out.println("Valor de cuota: "+cuota_m+ " Valor de interes: "+interes_m+ " Valor de abono: "+Abono+ " Valor de deuda total: "+total);
        

//     }
// }

import java.util.Scanner;

public class ejercicio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion = 'S';

        while (opcion == 'S' || opcion == 's') {
            System.out.print("Ingrese el valor total a financiar: ");
            double valorTotalFinanciar = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés (en decimal, por ejemplo, 0.05 para 5%): ");
            double tasaInteres = scanner.nextDouble();

            System.out.print("Ingrese la cantidad de cuotas: ");
            int cantidadCuotas = scanner.nextInt();

            double saldoDeuda = valorTotalFinanciar;
            double totalIntereses = 0;

            System.out.println("Detalle de cuotas:");
            System.out.println("Cuota | Interés | Abono a Capital | Deuda Total");
            System.out.println("---------------------------------------------");

            int cuota = 1;
            while (cuota <= cantidadCuotas) {
                double interesMensual = saldoDeuda * tasaInteres;
                double cuotaMensual = saldoDeuda / cantidadCuotas;
                double abonoCapital = cuotaMensual - interesMensual;
                saldoDeuda -= abonoCapital;

                totalIntereses += interesMensual;

                System.out.printf("%5d | %7.2f | %15.2f | %11.2f%n", cuota, interesMensual, abonoCapital, saldoDeuda);

                cuota++;
            }

            System.out.println("Total de intereses pagados: " + totalIntereses);

            System.out.print("¿Desea realizar otro simulacro de crédito? (S/N): ");
            opcion = scanner.next().charAt(0);
        }

        scanner.close();
    }
}
