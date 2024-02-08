import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame {
    private JTextField campo_materia;
    private JTextField campo_creditos;
    private JTextField campo_notas;
    private JLabel[] listaJLabels;
    private JLabel etq_total;

    public Quiz() {
        listaJLabels = new JLabel[15];
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Promedio ponderado");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_promedio.png") ));
        setSize(600, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("CALCULAR PROMEDIO");
        etq_titulo.setFont (new Font ("Arial", Font.BOLD, 30));
        etq_titulo.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones. gridy = 0;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets (10,0,5,0);
        contenedor.add(etq_titulo, restricciones);


        // etq_materia 
        JLabel etq_materia = new JLabel();
        etq_materia.setText("Materia: ");
        etq_materia.setFont (new Font("Arial", Font.BOLD,20));
        etq_materia.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridy = 1;
        restricciones.gridx =0;
        restricciones.gridwidth= 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_materia, restricciones);

        // campo_materia
        JTextField campo_materia = new JTextField();
        campo_materia.setColumns(10);
        restricciones.gridy =1;
        restricciones.gridx = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets (3,5,0,0);
        contenedor.add(campo_materia, restricciones);

     
        // etq_creditos
        JLabel etq_creditos = new JLabel();
        etq_creditos.setText("Creditos: ");
        etq_creditos.setFont (new Font ("Arial", Font.BOLD, 20));
        etq_creditos.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridy = 1;
        restricciones.gridx = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_creditos, restricciones);

        // campo_creditos 
        JTextField campo_creditos = new JTextField();
        campo_creditos.setColumns(10);    
        restricciones.gridy =1;
        restricciones.gridx = 3;
        restricciones.gridwidth = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets (0,0,0,0);
        contenedor.add(campo_creditos, restricciones);

        // etq_notas
        JLabel etq_notas = new JLabel();
        etq_notas.setText("Notas: ");
        etq_notas.setFont (new Font("Arial", Font.BOLD, 20));
        etq_notas.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridy = 2;
        restricciones.gridx = 0;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_notas, restricciones);

        // campo_notas
        JTextField campo_notas = new JTextField();
        campo_notas.setColumns(10);
        restricciones.gridy = 2;
        restricciones.gridx = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets (3,5,0,0);
        contenedor.add(campo_notas, restricciones);

        // btn_registrar
        JButton btn_registrar = new JButton("REGISTRAR");
        btn_registrar.setBackground(new Color(50, 50, 255));
        btn_registrar.setForeground(Color.WHITE);
        restricciones.gridy = 2;
        restricciones.gridx = 2;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(10, 10, 0, 0);
        contenedor.add(btn_registrar, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        // Segundo titulo RESUMEN
        JLabel etq_titulo2 = new JLabel();
        etq_titulo2.setText("RESUMEN");
        etq_titulo2.setFont(new Font("Arial", Font.BOLD, 30));
        etq_titulo2.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridy = 3;
        restricciones.gridx = 0;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(20, 0, 0, 0);
        contenedor.add(etq_titulo2, restricciones);

        // Scroll
        JPanel contenedorItems = new JPanel();
        contenedorItems.setLayout(new GridBagLayout());
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);

        restricciones.gridy = 5;  // Ajustar la posición vertical según tus necesidades
        restricciones.gridx = 0;
        restricciones.gridheight = 5;  // Ajustar según el número de filas esperado
        restricciones.gridwidth = 4;
        restricciones.weighty = 89;
        restricciones.weightx = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 0, 10);
        contenedor.add(scrollPane, restricciones);

        GridBagConstraints constItems = new GridBagConstraints();

        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3, 10, 3, 20);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);

        // Tabla
       for (int i = 0; i < this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment(JLabel.RIGHT);
            etq_temporal.setFont(new Font("Arial", Font.PLAIN, 18));
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground(Color.white);
            etq_temporal.setBorder(borderGris);
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }

        JLabel etq_total = new JLabel("Total: $ 0");
        etq_total.setHorizontalAlignment(JLabel.RIGHT);
        etq_total.setFont(new Font("Arial", Font.BOLD, 20));
        etq_total.setOpaque(true);
        etq_total.setBackground(Color.WHITE);
        etq_total.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        restricciones.gridy = 10;  // Ajustar la posición vertical según tus necesidades
        restricciones.gridx = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 4;
        restricciones.weighty = 2;
        restricciones.weightx = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0, 0, 0, 10);
        contenedor.add(etq_total, restricciones);

        JButton btn_limpiar = new JButton();
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.setBackground(new Color(255, 0, 0));
        btn_limpiar.setForeground(Color.WHITE);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btn_limpiar, restricciones);


        ActionListener calcular = new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.out.println("calcular");

                double acumulador = 0;
                double creditos = Double.parseDouble(campo_creditos.getText());
                double notas = Double.parseDouble(campo_notas.getText());

                double valor_nota = (notas * creditos) / creditos;

                String texto = "<html>";
                String total = "<html>";

                

                // ActionListener para el botón REGISTRAR
                btn_registrar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Lógica para registrar los datos y actualizar la tabla
                        double creditos = Double.parseDouble(campo_creditos.getText());
                        double notas = Double.parseDouble(campo_notas.getText());

                        double valor_nota = (notas * creditos) / creditos;

                        String texto = "<html>";
                        String total = "<html>";

                        for (int i = 1; i <= creditos; i++) {
                            texto += campo_materia.getText() + " -> Creditos " + "Nota " + valor_nota;

                            for (int j = 1; j <= creditos; j++) {
                                acumulador = acumulador + valor_nota / j;

                                total += acumulador;
                            }
                            texto += "</html>";
                            total += "</html>";
                        }
                        listaJLabels[0].setText(texto);
                        etq_total.setText(total);
                    }    
                });

        

                // ActionListener para el botón LIMPIAR
        
                btn_limpiar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Lógica para limpiar los campos y la tabla
                        campo_materia.setText("");
                        campo_creditos.setText("");
                        campo_notas.setText("");

                        for (int i = 0; i < listaJLabels.length; i++) {
                            listaJLabels[i].setText("");
                        }
                        etq_total.setText("Total: $ 0");
                    }
                });
            });

            add(contenedor);
            setVisible(true);
            revalidate();
        }
    }
}

