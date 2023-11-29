import java.util.Scanner;
public class ejercicio_01{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola mundo");

        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("El ususario es mayor de edad debe pagar un impuesto de $200.000");
        }else{
            System.out.println("El usuario es menor de edad recibe un auxilio de $800.000");
        }

    }
}