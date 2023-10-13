public class funcion13{
    public static void main (String[] Args){

        int arreglo [] = new int [5];
        subir(arreglo);

        System.out.println("Arreglo ascendente: ");

        for(int i = 0; i < arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }

    }
    public static void subir(int [] numero){
        for(int i = 0; i < numero.length; i++){
            numero[i] = i + 1;
        }

    }
}