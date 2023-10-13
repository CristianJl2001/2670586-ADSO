public class funcion02{
    public static void main (String [] args){

        resta(10,25);
        System.out.println("La resta es: "+resta(10,25));

    }
    
    public static int resta (int a, int b){
        int resultado = (a - b);
        return resultado;
    }
}