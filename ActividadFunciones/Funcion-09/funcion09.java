public class funcion09{
    public static void main (String [] Args){

        int [] arreglo = {1,2,3,4,5,6,7,8,9,10};
        int minimo = numeroMinimo(arreglo);

        System.out.print("El numero minimo: "+minimo);


    }
    public static int numeroMinimo(int [] numeros){
        if(numeros.length == 0){
            System.out.println("Arreglo vacio");
        }
        int min = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < min){
                min = numeros[i];
            }
        }
        return min;
    }
}