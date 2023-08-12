import java.util.Scanner;
public class ejercicio_04{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);

        
        int contador = 0;

        String [] ciudades = {"MUNICIPIO", "MISTRATO", "PUEBLO RICO", "QUINCHIA", "SANTA ROSA DE CABAL", "SANTUARIO"};
        
        double [] [] distancia_ciudad = {
            {5.0, 81.7, 53.6, 99.8, 70.4},
            {81.5, 5.0, 103.0, 103.0, 34.3},
            {57.9, 103.0, 5.0, 83.2, 109.0},
            {98.5, 102.0, 83.5, 5.0, 75.2},
            {70.5, 34.5, 109.0, 76.4, 5.0}                             
        };

        System.out.println("Ingrese ciudad de origen: ");
        String C_origen = teclado.nextLine();

        System.out.println("Ingrese cantidad de paradas: ");
        int C_paradas = teclado.nextInt();

        double total_gasolina = 0.0;
        String nueva_Ciudad = C_origen;

        for(int i = 0; i <= C_paradas; i++){
            System.out.printf("Parada "+contador++);
            teclado.nextLine();
            System.out.print(" Ingrese la ciudad de la parada: ");
            String Parada = teclado.nextLine();

            int I_Original = -1;
            int I_Paradas = -1;

             for (int j = 0; j < ciudades.length; j++) {
                if (ciudades[j].equalsIgnoreCase(nueva_Ciudad)) {
                    I_Original = j;
                }
                if (ciudades[j].equalsIgnoreCase(Parada)) {
                    I_Paradas = j;
                }
            }
            if (I_Original == -1 || I_Paradas == -1) {
                System.out.println("Ciudades no válidas, ingrese una valida.");
                i--;
            }
            double distancia = distancia_ciudad[I_Original][I_Paradas];
            double Consumo_aprox = distancia;
            total_gasolina += Consumo_aprox;


            System.out.printf("Consumo parcial para la parada %d: %.2f pesos%n", i + 1, Consumo_aprox);

            nueva_Ciudad = Parada;

        }
        
        System.out.printf("El consumo total de gasolina es: $"+total_gasolina+ " pesos");
    }
}