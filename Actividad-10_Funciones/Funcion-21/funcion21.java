public class funcion21 {
    public static void main(String[] args) {
    
        double celsius = 5.0;
        double f = 0;
        double resultad = operacion(celsius, f);
        System.out.println("La conversion de grados culsius a fehrenheit es: "+operacion(celsius, f));

    }  


    public static double operacion(double celsius, double f){
        
        double operacion = f = (celsius * 1.8) + 32;

        return operacion;

    }
}
