public class funcion05{
    public static void main (String [] args){

        potencia(3,7);
        System.out.println("La potencia es: "+potencia(3,7));

    }
    
    public static int potencia (int a, int b){
        int resultado = (a ^ b);
        return resultado;
    }
}