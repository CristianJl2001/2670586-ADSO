package principal;


import javax.swing.table.DefaultTableModel;

public class TablaBasica extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    Persona listaPersonas[];


    public TablaBasica() {
        
        listaPersonas = new Persona[100];
        listaPersonas[0] = new Persona("1004994952", "Cristian", "Jimenez", "3003806529","cristianjimenezl2001@gmail.com");
        listaPersonas[1] = new Persona("1004995933", "Alfonso", "Gomez", "3122334570", "alfonzogomez@gmailcom");
        listaPersonas[2] = new Persona("99495233", "Gabriela", "Sepulveda", "3104552112", "gabrielaS310@gmail.com");
        listaPersonas[3] = new Persona("109545514", "Laura", "Valencia", "3214553608", "valencialaura@gmail.com");
        listaPersonas[4] = new Persona("4856385", "Jose", "Lopez", "3164557718", "joselopez33@gmail.com");
        
        initComponents();
        initAlternComponents();
        imprimirPersonas();
    }
    
    public void initAlternComponents(){
        setTitle("Tabla Basica");
        setVisible(true);
        setLocationRelativeTo(null);
        
        modelo = (DefaultTableModel) tablaDatos.getModel();
    }
    
    public void imprimirPersonas(){
        modelo.setRowCount(0); //Limpia la tabla evitando duplicados
        for (int i=0; listaPersonas[i]!=null; i++) {
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String correo = listaPersonas[i].getCorreo();
            
            Object data[] = new Object[]{ documento, nombres, apellidos, telefono, correo };
            modelo.addRow(data);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        contenedorTitulo = new javax.swing.JPanel();
        etq_Titulo = new javax.swing.JLabel();
        contenedorformulario = new javax.swing.JPanel();
        etq_documento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        etq_nombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etq_correo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        contenedorDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorTitulo.setBackground(new java.awt.Color(0, 0, 153));

        etq_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        etq_Titulo.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        etq_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_Titulo.setText("Tabla Basica");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(etq_Titulo)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorTituloLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(etq_Titulo)
                .addGap(39, 39, 39))
        );

        contenedorformulario.setBackground(new java.awt.Color(0, 153, 204));

        etq_documento.setBackground(new java.awt.Color(0, 0, 0));
        etq_documento.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        etq_documento.setForeground(new java.awt.Color(0, 0, 0));
        etq_documento.setText("Documento:");

        campoDocumento.setBackground(new java.awt.Color(255, 255, 255));
        campoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDocumentoActionPerformed(evt);
            }
        });

        etq_nombres.setBackground(new java.awt.Color(255, 255, 255));
        etq_nombres.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        etq_nombres.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombres.setText("Nombres:");

        campoNombres.setBackground(new java.awt.Color(255, 255, 255));

        etq_apellidos.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        etq_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellidos.setText("Apellidos");

        campoApellidos.setBackground(new java.awt.Color(255, 255, 255));

        etq_telefono.setBackground(new java.awt.Color(255, 255, 255));
        etq_telefono.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(0, 0, 0));
        etq_telefono.setText("Telefono");

        campoTelefono.setBackground(new java.awt.Color(255, 255, 255));

        etq_correo.setBackground(new java.awt.Color(255, 255, 255));
        etq_correo.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(0, 0, 0));
        etq_correo.setText("CorreoElect...:");

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregar.setBackground(new java.awt.Color(0, 153, 51));
        btn_agregar.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorformularioLayout = new javax.swing.GroupLayout(contenedorformulario);
        contenedorformulario.setLayout(contenedorformularioLayout);
        contenedorformularioLayout.setHorizontalGroup(
            contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorformularioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(campoDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etq_documento, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(etq_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_correo)
                    .addGroup(contenedorformularioLayout.createSequentialGroup()
                        .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(campoNombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_nombres, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(148, 148, 148)
                        .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoApellidos)
                            .addComponent(etq_apellidos)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        contenedorformularioLayout.setVerticalGroup(
            contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorformularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_documento)
                    .addComponent(etq_nombres)
                    .addComponent(etq_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(etq_correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorformularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        contenedorDatos.setBackground(new java.awt.Color(0, 204, 204));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo Electronico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorformulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorformulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDocumentoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
                                           
       String documento = campoDocumento.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        
        if( documento.equals("") || nombres.equals("") || apellidos.equals("") || telefono.equals("") || correo.equals("") ){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");  
        }else{
            
            // Buscar posicon vacia
            int posicion = -1;
            for (int i=0;i<listaPersonas.length;i++) {
                if (listaPersonas[i]==null) {
                    posicion = i;
                    break;
                }
            }
            
            // Crear objeto en posicion vacia
            if (posicion!=-1) {
                listaPersonas[posicion] = new Persona(documento, nombres, apellidos, telefono, correo);
                
                Object data[] = new Object[]{ documento, nombres, apellidos, telefono, correo };
                modelo.addRow(data);

                campoDocumento.setText("");
                campoNombres.setText("");
                campoApellidos.setText("");
                campoTelefono.setText("");
                campoCorreo.setText("");
                campoDocumento.requestFocus();
            }
        }

        // Verificar si el documento o correo ya existen
        
    


            
        
    }//GEN-LAST:event_btn_agregarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JPanel contenedorformulario;
    private javax.swing.JLabel etq_Titulo;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_documento;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
