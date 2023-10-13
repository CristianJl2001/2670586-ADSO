public class funcion01{
    public static void main (String [] args){

        sumar(5,5);
        System.out.println("La suma es: "+sumar(5,5));

    }
    
    public static int sumar (int a, int b){
        int resultado = (a + b);
        return resultado;
    }
}