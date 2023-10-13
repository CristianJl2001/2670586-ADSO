public class funcion11{
    public static void main(String [] Args){
        long factor = (numero(4));

        System.out.print("El numero factorial es: "+factor);
    }

    public static long numero(int a){
        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
} 