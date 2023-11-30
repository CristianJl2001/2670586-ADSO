public class funcion20 {
    public static void main(String[] args) {
        double base = 10.5;
        double altura = 15.9;

        double triangulo = areTriangulo(base, altura);
        System.out.println("El area de un triangulo es: "+triangulo);
    
    }
    public static double areTriangulo(double base, double altura){
        
        double triangulo = (base * altura) / 2;
        
        return triangulo;
    } 
}
