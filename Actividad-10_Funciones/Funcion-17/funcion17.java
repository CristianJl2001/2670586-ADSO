public class funcion17{
    public static void main (String []Args){
        int  numero = 12;
        int resultado = contarDigitos(numero);
        System.out.print("La suma de "+numero+" es: " +resultado);
    }

    public static int contarDigitos(int numeros){
        numeros = Math.abs(numeros);

        int suma = 0;

        while(numeros > 0){
            int digitos % 10;
            contador++;
        }
        return contador;
    }
}