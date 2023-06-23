import java.util.Scanner;
public class ejercicio_04{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("|------------- Bienvenido ------------|");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("| 1. Docente                          |");
        System.out.println("| 2. Estudiante                       |");
        System.out.println("| 3. Salir                            |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|-------------------------------------|");
        

        System.out.println("Ingrese una opcion: ");
        int numero = teclado.nextInt();

         double sumaC =0;
         int credito =0;
         double suma_no = 0; 
         int contador = 1;
         double sumaNotasCreditos =0;
         int cantidad_n = 0;
         double notas = 0;
         int cantidad_n2 = 0;
         double notas2 = 0;
         double resultado = 0;

        if(numero > 3){
            System.out.println("Ingrese una opcion correcta ");
        }

        if(numero ==2){

         System.out.println("Ingrese cantidad de notas: ");
          cantidad_n =teclado.nextInt();
          while(contador <= cantidad_n){
             System.out.println("--> Ingrese nota: "+contador);
             notas = teclado.nextDouble();
             System.out.println("--> Creditos Materia: ");
             int cantidad = teclado.nextInt();
             suma_no =suma_no + notas;
             contador = contador + 1;
             sumaC = sumaC + cantidad;
             sumaNotasCreditos = sumaNotasCreditos + ( notas * cantidad );
           }

         double resultado2 = sumaNotasCreditos/ sumaC;
         System.out.println("--> Total Creditos: "+sumaC);
         System.out.println("--> Promedio del semestre ="+ resultado2);
        }
        
        if(numero == 1){
            System.out.println("Ingrese cantidad de notas: ");
            cantidad_n2 =teclado.nextInt();
            while(contador <= cantidad_n2){
             System.out.println("--> Ingrese nota: "+contador);
             notas2 = teclado.nextDouble();
             contador = contador + 1;
             suma_no =suma_no + notas;
            } 
            resultado = suma_no / cantidad_n2;
            System.out.println("--> Promedio de notas obtenidas ="+ resultado);

        }

        if(numero ==3){
            System.out.println("Adios");
        }
  
        

        

    }
}