public class funcion08{
    public static void main (String [] Args){

        int [] arreglo = {1,2,3,4,5,6,7,8,9,10};
        imprimir(arreglo);


    }
    public static void imprimir(int [] numeros){
        System.out.print("El arreglo: ");

        for(int i = 0; i < numeros.length; i++){
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(+numeros[i]);
        }
        
    }
}