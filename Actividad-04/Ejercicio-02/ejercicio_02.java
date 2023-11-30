import java.util.Scanner;
public class ejercicio_02{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese cantidad de materias: ");
        int cantidad_n =teclado.nextInt();
        
        double sumaC =0;
        int credito =0;
        double suma_no = 0; 
        int contador = 1;
        double sumaNotasCreditos =0;

        while(contador <= cantidad_n){
            System.out.println("--> Ingrese nota: "+contador);
            double notas = teclado.nextDouble();

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
}