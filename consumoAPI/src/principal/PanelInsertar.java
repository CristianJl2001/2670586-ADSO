
package principal;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import principal.Utils.ConsumoAPI; 


public class PanelInsertar extends javax.swing.JPanel {

   ConsumoAPI consumo;
    public PanelInsertar() {
        consumo = new ConsumoAPI();
        initComponents();
        add(new JLabel("Insertar Panel"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Insertar_Personas = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        Campo_cedula = new javax.swing.JTextField();
        Campo_nombres = new javax.swing.JTextField();
        Campo_apellidos = new javax.swing.JTextField();
        Campo_telefono = new javax.swing.JTextField();
        Campo_direccion = new javax.swing.JTextField();
        Campo_email = new javax.swing.JTextField();
        btn_insertar = new javax.swing.JToggleButton();

        Insertar_Personas.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial Narrow", 2, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Insertar personas");

        Campo_cedula.setText("Cedula:");

        Campo_nombres.setText("Nombres:");

        Campo_apellidos.setText("Email:");

        Campo_telefono.setText("Apellidos:");

        Campo_direccion.setText("Telefono:");

        Campo_email.setText("Direccion:");

        btn_insertar.setText("Insertar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Insertar_PersonasLayout = new javax.swing.GroupLayout(Insertar_Personas);
        Insertar_Personas.setLayout(Insertar_PersonasLayout);
        Insertar_PersonasLayout.setHorizontalGroup(
            Insertar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Insertar_PersonasLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Insertar_PersonasLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(Insertar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Campo_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(Campo_cedula))
                .addGap(76, 76, 76)
                .addGroup(Insertar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Insertar_PersonasLayout.createSequentialGroup()
                        .addGroup(Insertar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(Insertar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        Insertar_PersonasLayout.setVerticalGroup(
            Insertar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Insertar_PersonasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(Insertar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(Insertar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btn_insertar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Insertar_Personas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Insertar_Personas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        String cedula = Campo_cedula.getText();
        String nombres = Campo_nombres.getText();
        String apellidos = Campo_apellidos.getText();
        String telefono = Campo_telefono.getText();
        String direccion = Campo_direccion.getText();
        String email = Campo_email.getText();
        
        if( cedula.equals("") || nombres.equals("") || apellidos.equals("") || telefono.equals("") || direccion.equals("")|| email.equals("")  ){
            System.out.println("Campos obligatorios");  
        }else{
        
            Map<String, String> datosInsertar = new HashMap<>();
                datosInsertar.put("cedula", cedula);
                datosInsertar.put("nombres", nombres);
                datosInsertar.put("apellidos", apellidos);
                datosInsertar.put("telefono", telefono);
                datosInsertar.put("direccion", direccion);
                datosInsertar.put("email", email);
        
            String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
        }
    
    
    }//GEN-LAST:event_btn_insertarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_apellidos;
    private javax.swing.JTextField Campo_cedula;
    private javax.swing.JTextField Campo_direccion;
    private javax.swing.JTextField Campo_email;
    private javax.swing.JTextField Campo_nombres;
    private javax.swing.JTextField Campo_telefono;
    private javax.swing.JPanel Insertar_Personas;
    private javax.swing.JToggleButton btn_insertar;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
