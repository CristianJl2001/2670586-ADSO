import java.util.Scanner;

public class ejercicio_09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número que represente una fecha (ddmmaaaa): ");
        int numeroFecha = teclado.nextInt();

        if (numeroFecha < 10000000 || numeroFecha > 99999999) {
            System.out.println("El número ingresado no cumple con las condiciones especificadas.");
        
            return;
        }

        int dia = numeroFecha / 1000000;
        int mes = (numeroFecha / 10000) % 100;
        int anio = numeroFecha % 10000;

        String textoDia = "";
        if (dia == 1) {
            textoDia = "UNO";
        } else if (dia <= 15) {
            textoDia = obtenerTextoUnidades(dia);
        } else {
            textoDia = "QUINCE";
        }

        String textoAnio = "";
        if (anio >= 1000 && anio <= 9999) {
            int unidad = anio / 1000;
            textoAnio = (anio % 1000 == 0) ? obtenerTextoUnidades(unidad) : obtenerTextoUnidades(unidad) + " " + obtenerTextoUnidades(anio % 1000);
        }

        System.out.println("El texto del número es: " + textoDia + " DE " + obtenerTextoMes(mes) + " DEL " + textoAnio);

    
    }
}