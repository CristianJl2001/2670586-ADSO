public class funcion16{
    public static void main (String []Args){
        int  numero = 12345;
        int resultado = contarDigitos(numero);
        System.out.print("El numero "+numero+" tiene " +resultado+" digitos");
    }

    public static int contarDigitos(int numeros){
        numeros = Math.abs(numeros);

        int contador = 0;

        while(numeros != 0){
            numeros /= 10;
            contador++;
        }
        return contador;
    }
}