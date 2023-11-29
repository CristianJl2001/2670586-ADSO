import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        String[] asignaturas = {"Matemáticas", "Español", "Inglés", "Ciencias Naturales", "Deportes"};

        
        double mejorNota = -1;
        double peorNota = Double.MAX_VALUE;
        double sumaNotas = 0;
        int indexMejorNota = -1;
        int indexPeorNota = -1;

        
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print("Nota de " + asignaturas[i] + ": ");
            double nota = teclado.nextDouble();

           
            sumaNotas += nota;

            if (nota > mejorNota) {
                mejorNota = nota;
                indexMejorNota = i;
            }

            if (nota < peorNota) {
                peorNota = nota;
                indexPeorNota = i;
            }
        }

       
        double promedioNotas = sumaNotas / asignaturas.length;

        
        System.out.println("Informe:");
        System.out.println("-> Asignatura con mejor nota: " + asignaturas[indexMejorNota]);
        System.out.println("-> Asignatura con menor nota: " + asignaturas[indexPeorNota]);
        System.out.println("-> Promedio de notas: " + promedioNotas);

        
        if (promedioNotas < 3) {
            double notaNecesaria = (3 * asignaturas.length) - sumaNotas;
            System.out.println("-> Debió obtener una nota de " + notaNecesaria + " en " + asignaturas[indexPeorNota] + " para aprobar el periodo");
        }

        
    }
}
