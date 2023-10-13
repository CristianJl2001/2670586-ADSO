public class funcion14{
    public static void main(String[]Args){
        
        int[] arreglo = {1, 2, 3, 4, 5};
        boolean ordenado = OrdenadoAscendente(arreglo);
        
        if (ordenado) {
            System.out.println("El arreglo está ordenado de forma ascendente.");
        } else {
            System.out.println("El arreglo no está ordenado de forma ascendente.");
        }
    }

    public static boolean OrdenadoAscendente(int[] arreglo) {
        int longitud = arreglo.length;
        
        for (int i = 1; i < longitud; i++) {
            
            if (arreglo[i] < arreglo[i - 1]) {
                return false; 
            }
        }
        
        return true; 
    }

}