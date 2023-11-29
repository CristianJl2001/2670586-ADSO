import java.util.Scanner;

public class ejercicio_03 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner (System.in);

        System.out.println("Ingrese coordenada en el plano cartesino");

        System.out.println("Ingresa valor de X: ");
        int valorX = teclado.nextInt();

        System.out.println("Ingresa valor en Y: ");
        int valorY = teclado.nextInt();

        if (valorX < 0 && valorY > 0) {
            System.out.println("La coordenada ingresada se encuentra en el segundo cuadrante");
        }else if(valorX > 0 && valorY < 0){
            System.out.println("La coordenada se encuetra en el cuarto cuadrante");
        }
        if(valorX > 0 && valorY >0){
            System.out.println("La coordenada se encuentra en la primer cuadrante");
        }else if(valorX < 0 && valorY < 0){
            System.out.println("La coordenada se encuentra en el tercer cuadrante");
        }
    }    
}
