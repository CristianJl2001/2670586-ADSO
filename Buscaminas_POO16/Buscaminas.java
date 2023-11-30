import java.util.Random;

public class Buscaminas {
    private static final int FILAS = 8;
    private static final int COLUMNAS = 8;
    private static final int MINAS = 10;

    private boolean[][] minas;

    public Buscaminas() {
        minas = new boolean[FILAS][COLUMNAS];
        colocarMinas();
    }

    private void colocarMinas() {
        Random random = new Random();
        int minasRestantes = MINAS;

        while (minasRestantes > 0) {
            int fila = random.nextInt(FILAS);
            int columna = random.nextInt(COLUMNAS);

            if (!minas[fila][columna]) {
                minas[fila][columna] = true;
                minasRestantes--;
            }
        }
    }

    public boolean hayMinaEn(int fila, int columna) {
        return minas[fila][columna];
    }

    public int contarMinasAlrededor(int fila, int columna) {
        int minasAlrededor = 0;

        for (int i = Math.max(0, fila - 1); i <= Math.min(FILAS - 1, fila + 1); i++) {
            for (int j = Math.max(0, columna - 1); j <= Math.min(COLUMNAS - 1, columna + 1); j++) {
                if (minas[i][j]) {
                    minasAlrededor++;
                }
            }
        }

        return minasAlrededor;
    }
}
