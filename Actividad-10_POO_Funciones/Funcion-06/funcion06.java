public class funcion06{
    public static void main (String [] args){

        int numeroMayor = mayor(5,7,9);
        System.out.println("El numero mayor es: "+numeroMayor);

    }
    
    public static int mayor (int a, int b, int c){
        int max  = a;

        if (b > max){
            max = b;
        }
        if ( c > max){
            max = c;
        }
        return max;
    }
}