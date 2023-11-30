public class funcion19 {
    public static void main(String[] args) {
        double base = 9.0 ;
        double altura = 4.0;
        double circulo = areaCirculo(base, altura);
        System.out.println("El area del ciruclo es: "+circulo);
    }    

    public static double areaCirculo(double base, double altura){
        double circulo = 0.5 * base * altura;
        
        return circulo;
       
    }
}
