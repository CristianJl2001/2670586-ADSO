import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscaminasUI extends JFrame {
    private JButton[][] botones;
    private Buscaminas juego;
    private static final int FILAS = 8;
    private static final int COLUMNAS = 8;

    public BuscaminasUI() {
        

        juego = new Buscaminas();

        setTitle("Buscaminas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        botones = new JButton[FILAS][COLUMNAS];
        setLayout(new GridLayout(FILAS, COLUMNAS));

        inicializarBotones();

        setVisible(true);
    }

    private void inicializarBotones() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setPreferredSize(new Dimension(50, 50));
                botones[i][j].addActionListener(new BotonClickListener(i, j));
                add(botones[i][j]);
            }
        }
    }

    private class BotonClickListener implements ActionListener {
        private final int fila;
        private final int columna;

        public BotonClickListener(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (juego.hayMinaEn(fila, columna)) {
                JOptionPane.showMessageDialog(BuscaminasUI.this, "¡Boom! Has perdido.");
                reiniciarJuego();
            } else {
                int minasAlrededor = juego.contarMinasAlrededor(fila, columna);
                botones[fila][columna].setText(minasAlrededor > 0 ? String.valueOf(minasAlrededor) : "");
                botones[fila][columna].setEnabled(false);
            }
        }
    }

    private void reiniciarJuego() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                botones[i][j].setText("");
                botones[i][j].setEnabled(true);
            }
        }
        juego = new Buscaminas();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BuscaminasUI();
        });
    }
}
