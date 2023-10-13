import java.util.Random;

public class funcion07{
    public static void main (String [] Args){
        int [] numeros = new int [7];
        aleatorios(numeros);

        System.out.print("Arreglo con número aleatorios: " );
        for(int i = 0; i < numeros.length; i++){
            System.out.print("["+numeros[i]+"]");
        }
    }

    public static void aleatorios(int [] arreglo){
        Random random = new Random ();

        for(int i = 0; i < arreglo.length; i++){
            arreglo [i] = random.nextInt(100);
        }
    }
}