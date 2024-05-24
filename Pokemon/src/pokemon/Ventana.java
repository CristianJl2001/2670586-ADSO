package pokemon;

import java.awt.Image;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.swing.DefaultListModel;
import pokemon.Utils.ConsumoAPI;

public class Ventana extends javax.swing.JFrame {
    DefaultTableModel model;
    ConsumoAPI consumo;

    public Ventana() {
        initComponents();
        InitAlternComponents();
        consumo = new ConsumoAPI(); 
        imprimir_Lista();
    }

    public void InitAlternComponents() {
        setVisible(true);
        model = (DefaultTableModel) Lista.getModel();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        String imagePath = "/Imagenes/siguiente.png";
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(imagePath));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(btn_siguiente.getWidth(), btn_siguiente.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        btn_siguiente.setIcon(resizedIcon);

        String imagenAtras = "/Imagenes/atras.png";
        ImageIcon originalAtrasIcon = new ImageIcon(getClass().getResource(imagenAtras));
        Image originalAtrasImage = originalAtrasIcon.getImage();
        Image resizedAtrasImage = originalAtrasImage.getScaledInstance(btn_atras.getWidth(), btn_atras.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedAtrasIcon = new ImageIcon(resizedAtrasImage);
        btn_atras.setIcon(resizedAtrasIcon);
        
        Lista.getColumnModel().getColumn(0).setPreferredWidth(50);
        Lista.getColumnModel().getColumn(1).setPreferredWidth(200);
        Lista.getColumnModel().getColumn(2).setPreferredWidth(200);
    }
   
    //Imprimir Lista
   public void imprimir_Lista() {
        String respuesta = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon?limit=20");  // Actualiza la URL si es necesario
        JsonObject jsonObject = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray registros = jsonObject.getAsJsonArray("results");
    
        DefaultListModel<String> listModel = new DefaultListModel<>();
    
        for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            String nombre = temp.get("name").getAsString();
            String url = temp.get("url").getAsString();
            listModel.addElement(nombre);

            // Obtener detalles del Pokémon
            String[] detalles = obtenerDetallesPokemon(url);
            String habilidades = detalles[0];
            String imagenUrl = detalles[1];
            
            // Agrega el Pokémon a la tabla
            model.addRow(new Object[]{nombre, habilidades, url});
        }
    
        List.setModel(listModel);
    }
    
    private String[] obtenerDetallesPokemon(String url) {
        String habilidades = "";
        
        try {
            String detallePokemon = consumo.consumoGET(url);
            JsonObject detalleJson = JsonParser.parseString(detallePokemon).getAsJsonObject();
            JsonArray habilidadesArray = detalleJson.getAsJsonArray("abilities");
            JsonObject sprites = detalleJson.getAsJsonObject("sprites");
            

            StringBuilder habilidadesBuilder = new StringBuilder();
            for (int j = 0; j < habilidadesArray.size(); j++) {
                JsonObject habilidadObj = habilidadesArray.get(j).getAsJsonObject();
                JsonObject habilidad = habilidadObj.getAsJsonObject("ability");
                String nombreHabilidad = habilidad.get("name").getAsString();
                habilidadesBuilder.append(nombreHabilidad);
                if (j < habilidadesArray.size() - 1) {
                    habilidadesBuilder.append(", ");
                }
            }
            habilidades = habilidadesBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
   
    //Imagen
    private void mostrarImagen(String pokemon) {
        ImageIcon icono = new ImageIcon("ruta/de/la/imagen/" + pokemon + ".png");
        Image imagen = icono.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon iconoEscalado = new ImageIcon(imagen); // Convierte la imagen escalada en un ImageIcon
        etq_pokemon.setIcon(iconoEscalado);
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Contenedor = new javax.swing.JPanel();
        etq_text = new javax.swing.JLabel();
        List_Pokemones = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        Tabla_Pokemon = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        etq_pokemon = new javax.swing.JLabel();
        btn_siguiente = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etq_text.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 24)); // NOI18N
        etq_text.setForeground(new java.awt.Color(255, 0, 0));
        etq_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_text.setText("POKEDEX");

        List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List_Pokemones.setViewportView(List);

        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N", "HABILIDAD", "URL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Pokemon.setViewportView(Lista);

        etq_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_pokemon.setText("etq_imagen");

        btn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguiente.png"))); // NOI18N
        btn_siguiente.setText("jButton2");
        btn_siguiente.setMaximumSize(new java.awt.Dimension(200, 500));
        btn_siguiente.setMinimumSize(new java.awt.Dimension(200, 500));
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        btn_atras.setText("jButton2");
        btn_atras.setMaximumSize(new java.awt.Dimension(200, 500));
        btn_atras.setMinimumSize(new java.awt.Dimension(200, 500));

        javax.swing.GroupLayout Panel_ContenedorLayout = new javax.swing.GroupLayout(Panel_Contenedor);
        Panel_Contenedor.setLayout(Panel_ContenedorLayout);
        Panel_ContenedorLayout.setHorizontalGroup(
            Panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContenedorLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(Panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ContenedorLayout.createSequentialGroup()
                        .addComponent(List_Pokemones, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_ContenedorLayout.createSequentialGroup()
                                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(etq_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Tabla_Pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ContenedorLayout.createSequentialGroup()
                        .addComponent(etq_text, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))))
        );
        Panel_ContenedorLayout.setVerticalGroup(
            Panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContenedorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etq_text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ContenedorLayout.createSequentialGroup()
                        .addGroup(Panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Tabla_Pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(List_Pokemones, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        
    }//GEN-LAST:event_btn_siguienteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List;
    private javax.swing.JScrollPane List_Pokemones;
    private javax.swing.JTable Lista;
    private javax.swing.JPanel Panel_Contenedor;
    private javax.swing.JScrollPane Tabla_Pokemon;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JLabel etq_pokemon;
    private javax.swing.JLabel etq_text;
    // End of variables declaration//GEN-END:variables
}
