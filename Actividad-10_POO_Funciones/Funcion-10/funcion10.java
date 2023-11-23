public class function10{

    public static void main (String [] Args){

        int [] array = {1,5};
        double promedios = arregloPromedio(array);

        System.out.print("El promedio es: "+promedios);
    }

    public static double arregloPromedio(int [] arreglo){
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++){
             suma += arreglo[i];   
        }
        double promedio = (double) suma / arreglo.length;

        return promedio;
    }


}