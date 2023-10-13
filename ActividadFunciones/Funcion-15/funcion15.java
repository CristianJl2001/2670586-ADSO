public class funcion15 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; 
        int resultado = fibonacci(n);
        System.out.println("El " + n + "-ésimo término de la secuencia de Fibonacci es: " + resultado);
    }
}
