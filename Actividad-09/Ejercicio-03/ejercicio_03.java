import java.util.Scanner;
public class ejercicio_03{
    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);

        String clientes[] = new String[];

        int clientes = 0;        

        String registrar = "";


        System.out.println("|--------------------------------|");
        System.out.println("|                                |");
        System.out.println("|  1. Registrar clientes         |");
        System.out.println("|  2. Ver lista de cliente       |");
        System.out.println("|  3. Editar cliente             |");
        System.out.println("|  4. Eliminar cliente           |");
        System.out.println("|  5. Salir                      |");
        System.out.println("|                                |");
        System.out.println("|--------------------------------|");
        System.out.println(" Ingrese una opcion");
        int opcion = teclado.nextInt();

        if(opcion == 1){
            System.out.println("Cuantos clientes desea registrar?");
            cliente = teclado.nextInt();
            
        }
        for(it i == 0; i < clientes.length; i++ )
    } 
}