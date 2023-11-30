public class funcion18 {
    
    public static void main(String[] args) {
        int orden = 123;
        int ordenados = organizar(orden);
    }

    public static int organizar (int orden){
        int ordenados = 0;

        while(orden !=0){
            ordenados = orden %10;
            ordenados /= 10;
        }
        return ordenados;
    }
    
}
