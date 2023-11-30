import java.util.Random;

public class ejercicio_02 {

    public static void main(String[] args) {
        Random random = new Random();

        int dia = random.nextInt(31) + 1;       
        int mes = random.nextInt(12) + 1;       
        int anio = random.nextInt(10000) + 1;   

        int fechaAleatoria = dia * 1000000 + mes * 10000 + anio;

        System.out.println("Fecha generada: " + String.format("%08d", fechaAleatoria));
    }
}
