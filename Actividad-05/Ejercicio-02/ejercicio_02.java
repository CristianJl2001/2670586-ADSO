import java.util.Random;
public class ejercicio_02 {
    public static void main(String[] args) {
        Random random = new Random();

        int dia = generarNumeroAleatorio(1, 31, random);
        int mes = generarNumeroAleatorio(1, 12, random);
        int anio = generarNumeroAleatorio(1, 9999, random);

        while (mes == 2) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                if (dia > 29) {
                    dia = generarNumeroAleatorio(1, 29, random);
                } else {
                    break;
                }
            } else {
                if (dia > 28) {
                    dia = generarNumeroAleatorio(1, 28, random);
                } else {
                    break;
                }
            }
        }

        while (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                dia = generarNumeroAleatorio(1, 30, random);
            } else {
                break;
            }
        }

        String fechaGenerada = String.format("%02d%02d%04d", dia, mes, anio);
        System.out.println("Fecha generada: " + fechaGenerada);
    }

    public static int generarNumeroAleatorio(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }
}
