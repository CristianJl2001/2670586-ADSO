public class funcion04{
    public static void main (String [] args){

        dividir(15,6);
        System.out.println("La dividicion es: "+dividir(15,6));

    }
    
    public static float dividir (int a, int b){
        float resultado = ((float)a / (float) b);
        return resultado;
    }
}