public class funcion03{
    public static void main (String [] args){

        multiplicacion(5,9);
        System.out.println("La multiplicacion es: "+multiplicacion(5,9));

    }
    
    public static int multiplicacion (int a, int b){
        int resultado = (a * b);
        return resultado;
    }
}