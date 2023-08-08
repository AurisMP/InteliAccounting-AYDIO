/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import static controlador.CrudArchivos.actualizarUsuario;
import static controlador.CrudArchivos.eliminarUsuario;
import static controlador.CrudArchivos.guardarUsuarios;
import static controlador.CrudArchivos.buscarUsuarios;
import static controlador.CrudArchivos.cantidadRegistros;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author matos
 */
public class Usuarios extends javax.swing.JFrame {

    public Usuarios() {
        initComponents();
        setTitle("InteliAccounting   Usuarios");
        setResizable(false);
        jLabel4.setVisible(false);
        this.setLocationRelativeTo(null);
        cargarDatosDesdeArchivo(); // Llama al método para cargar datos al iniciar la ventana
        jLabel12.setVisible(false);
        
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });

    }

    //Validar si el usuario ya existe
   /* private boolean validarUsuarioExistentePorNombreUsuario(String nuevoUsuario) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String usuarioExistente = (String) model.getValueAt(i, 0); // Columna de Nombre de Usuario
            if (nuevoUsuario.equalsIgnoreCase(usuarioExistente)) {
                return true; // El usuario ya existe
            }
        }
        return false; // El usuario no existe
    }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        tipoAcc = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        textLoginUsr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btAnadir = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        modifybtn = new javax.swing.JButton();
        textPass = new javax.swing.JPasswordField();
        opcNormal = new javax.swing.JRadioButton();
        opcAdmin = new javax.swing.JRadioButton();
        textPass2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textApellidos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(203, 229, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/LOGO_IA-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 240, 180));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel3.setText("Apellidos :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 80, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel4.setText("Buscar por");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel5.setText("Nombre :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 70, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel7.setText("Opcional -------------------------------------------------------------------");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 400, 30));

        txtNom.setBorder(null);
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomKeyReleased(evt);
            }
        });
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 220, 30));

        textEmail.setBorder(null);
        jPanel1.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 220, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel8.setText("Confirmar Contraseña :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 160, 30));

        buscarButton.setFont(new java.awt.Font("Dubai Medium", 2, 12)); // NOI18N
        buscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/comentario-usuario.png"))); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.setBorder(null);
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 110, 30));

        textLoginUsr.setBorder(null);
        textLoginUsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textLoginUsrKeyReleased(evt);
            }
        });
        jPanel1.add(textLoginUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 220, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Contraseña", "Nombre", "Apellidos", "Tipo de Usuario", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 970, 270));

        btAnadir.setFont(new java.awt.Font("Dubai Medium", 2, 12)); // NOI18N
        btAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/agregar-usuario.png"))); // NOI18N
        btAnadir.setText("Añadir");
        btAnadir.setBorder(null);
        btAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 100, 30));

        eliminarBtn.setFont(new java.awt.Font("Dubai Medium", 2, 12)); // NOI18N
        eliminarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/borrar-usuario.png"))); // NOI18N
        eliminarBtn.setText("Eliminar");
        eliminarBtn.setBorder(null);
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 100, 30));

        modifybtn.setFont(new java.awt.Font("Dubai Medium", 2, 12)); // NOI18N
        modifybtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/lapiz-de-usuario.png"))); // NOI18N
        modifybtn.setText("Modificar");
        modifybtn.setBorder(null);
        modifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifybtnActionPerformed(evt);
            }
        });
        jPanel1.add(modifybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 110, 30));

        textPass.setBorder(null);
        jPanel1.add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 220, 30));

        tipoAcc.add(opcNormal);
        opcNormal.setFont(new java.awt.Font("Yu Gothic", 3, 12)); // NOI18N
        opcNormal.setText("Normal");
        opcNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcNormalActionPerformed(evt);
            }
        });
        jPanel1.add(opcNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, 30));

        tipoAcc.add(opcAdmin);
        opcAdmin.setFont(new java.awt.Font("Yu Gothic", 3, 12)); // NOI18N
        opcAdmin.setText("Admin");
        opcAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAdminActionPerformed(evt);
            }
        });
        jPanel1.add(opcAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 70, 30));

        textPass2.setBorder(null);
        jPanel1.add(textPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 220, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel9.setText("Contraseña :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 90, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel10.setText("Tipo de Acceso :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 110, 30));

        textApellidos.setBorder(null);
        jPanel1.add(textApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 220, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel11.setText(" Email :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 60, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel6.setText("Nombre Usuario :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 120, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel12.setText("Buscar por");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 220, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 220, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 220, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 220, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 220, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 220, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   private boolean camposBloqueados = false;

    private void bloquearCampos(boolean val) {
        opcNormal.setEnabled(val);
    opcAdmin.setEnabled(val);
    textApellidos.setEnabled(val);
    textPass.setEnabled(val);
    textPass2.setEnabled(val);
    textEmail.setEnabled(val);
    jLabel4.setVisible(!val);
    jLabel12.setVisible(val);
    
    
    

        
}
    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
           String filtroUsuario = textLoginUsr.getText().trim();
    String filtroNombre = txtNom.getText().trim();
    String filtroTipoAcceso = (opcNormal.isSelected()) ? opcNormal.getText() : (opcAdmin.isSelected()) ? opcAdmin.getText() : "";

    filtrarDatos(filtroUsuario, filtroNombre, filtroTipoAcceso);

    // Solo bloquear los campos si no se está realizando una búsqueda
    if (!filtroUsuario.isEmpty() || !filtroNombre.isEmpty() || !filtroTipoAcceso.isEmpty()) {
        bloquearCampos(false);
    } else {
        bloquearCampos(true);
    }
    }//GEN-LAST:event_buscarButtonActionPerformed
    public void limpiar() {

        /*
            Borra todos los campos y radios atraves de set
         */
        textLoginUsr.setText(null);
        txtNom.setText(null);
        textApellidos.setText(null);
        textPass.setText(null);
        textPass2.setText(null);
        textEmail.setText(null);
        tipoAcc.clearSelection();
    }

    private void btAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnadirActionPerformed
        jLabel4.setVisible(false);
        jLabel12.setVisible(false);
        String contra="";

        String nuevoUsuario = textLoginUsr.getText().trim();

       /* if (validarUsuarioExistentePorNombreUsuario(nuevoUsuario)) {
            // Usuario ya existe, mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "El nombre de usuario '" + nuevoUsuario + "' ya ha sido registrado anteriormente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        */
        String email = "";
        boolean val = false;
        /*
            Las contrasena se guardan en un arreglo de caracteres char[]
            asi que convertimos los valores de todo el arreglo a String de esta forma 
         */

        String pass1 = new String(textPass.getPassword());
        String pass2 = new String(textPass2.getPassword());

        /*
            De esta forma guardamo el tipo de acceso en una variable dependiendo de que se elija 
         */
        String tipoAcc = "";
        if (opcNormal.isSelected()) {

            tipoAcc = opcNormal.getText();
        } else if (opcAdmin.isSelected()) {

            tipoAcc = opcAdmin.getText();
        }

        /*
            Aqui guardamos los valores en un arreglo
         */
        String[] listaUsr = new String[6];
        listaUsr[0] = textLoginUsr.getText().trim();
        listaUsr[1] = pass1;
        listaUsr[2] = pass2;
        listaUsr[3] = txtNom.getText().trim();
        listaUsr[4] = textApellidos.getText().trim();
        listaUsr[5] = tipoAcc;

        /*
            Aqui confirmamos si un campo esta vacio si lo esta lanzara un jopcionpane 
            y la variable val sera false
         */
        for (int i = 0; i < listaUsr.length; i++) {

            if (listaUsr[i].isBlank()) {
                
                val = false;
                limpiar();
                break;
                }
            else{
                val=true;
                }
            }
           
        
    
        if(val==false){
            JOptionPane.showMessageDialog(null, "Dejo un campo vacio :c");
                }
        else {
            
            if (!pass1.equals(pass2) ) {

            JOptionPane.showMessageDialog(null, "Contrasena no coinciden >:v");
            
            }
            else{
                
                contra = pass1;
                boolean tieneM = false;
                boolean tieneD = false;
                
                for (int i = 0; i < contra.length(); i++) {

                    if (Character.isUpperCase(contra.charAt(i))) {

                        tieneM = true;
                        val = true;
                        break;
                        }

                    }
                
                for (int i = 0; i < contra.length(); i++) {

                    if (Character.isDigit(contra.charAt(i))) {

                        tieneD = true;
                        val = true;
                        break;
                        }

                    }
                    
                if ((contra.length() < 8 || tieneM == false || tieneD == false)) {

                    JOptionPane.showMessageDialog(null, "La contrasena debe tener como minimo 8 caracteres , una mayuscula y un numero como minimo :c");
                    limpiar();
                    

                    }
                
                else{
                    
                    if(textEmail.getText().isBlank()) {
                        email = "Desconocido";
                        } 
                    else{
                        email = textEmail.getText();
                        }
                    if(buscarUsuarios(listaUsr[0])){
                        val=false;
                        JOptionPane.showMessageDialog(rootPane, "El Nombre "+listaUsr[0]+" ya esta siendo usado");
                        }
                    else{
                        val=true;
                        }
                    }
                }
        } 
        
        if (val){

            String[] crudUsr = new String[6];
            crudUsr[0] = textLoginUsr.getText();
            crudUsr[1] = contra;
            crudUsr[2] = txtNom.getText();
            crudUsr[3] = textApellidos.getText();
            crudUsr[4] = tipoAcc;
            crudUsr[5] = email;

            for (int i = 0; i < crudUsr.length; i++) {
                System.out.println(crudUsr[i]);

                }

            JOptionPane.showMessageDialog(null, "El usuario ha sido creado exitosamente :D ");
            limpiar();

            try {
                guardarUsuarios(crudUsr);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cargarDatosDesdeArchivo(); // Llama al método para cargar datos después de agregar un usuario
        filtrarDatos("", "", "");

             
    }//GEN-LAST:event_btAnadirActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        jLabel4.setVisible(false);
        jLabel12.setVisible(false);
    
    // Mostrar cuadro de diálogo para confirmar la eliminación
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este usuario?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
    
    if (confirmacion == JOptionPane.YES_OPTION) {
        eliminarUsuario(textLoginUsr.getText());
        cargarDatosDesdeArchivo();
        limpiar();
    }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void modifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifybtnActionPerformed
        jLabel4.setVisible(false);
        jLabel12.setVisible(false);

    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas modificar los datos de este usuario?", "Confirmar Modificación", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
            // Guardar el valor actual de Loginusr
            String loginUsuarioOriginal = textLoginUsr.getText();

        // Permitir la edición de todos los campos
        textLoginUsr.setEnabled(true);
        textPass.setEnabled(true);
        textPass2.setEnabled(true);
        txtNom.setEnabled(true);
        textApellidos.setEnabled(true);
        opcNormal.setEnabled(true);
        opcAdmin.setEnabled(true);
       
    
    // Obtén los nuevos datos del usuario (por ejemplo, de los campos de entrada)
    String[] nuevoUsuarioData = new String[6];
    nuevoUsuarioData[0] = textLoginUsr.getText().trim();
    nuevoUsuarioData[1] = new String(textPass.getPassword());
    nuevoUsuarioData[2] = txtNom.getText().trim();
    nuevoUsuarioData[3] = textApellidos.getText().trim();
    nuevoUsuarioData[4] = (opcNormal.isSelected()) ? opcNormal.getText() : opcAdmin.getText();
    nuevoUsuarioData[5] = textEmail.getText().isEmpty() ? "Desconocido" : textEmail.getText();
    
    // Llama al método de actualización
    actualizarUsuario(loginUsuarioOriginal, nuevoUsuarioData);
    
    JOptionPane.showMessageDialog(null, "El usuario ha sido actualizado exitosamente");
    limpiar();
    cargarDatosDesdeArchivo();    
        
    }
    }//GEN-LAST:event_modifybtnActionPerformed

    private void opcAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAdminActionPerformed

    }//GEN-LAST:event_opcAdminActionPerformed

    private void opcNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcNormalActionPerformed
        String filtroUsuario = textLoginUsr.getText().trim();
        String filtroNombre = txtNom.getText().trim();
        String filtroTipoAcceso = opcAdmin.isSelected() ? opcAdmin.getText() : "";

        if (!filtroTipoAcceso.isEmpty()) {
            textLoginUsr.setText("");
            txtNom.setText("");
        }

        filtrarDatos(filtroUsuario, filtroNombre, filtroTipoAcceso);    }//GEN-LAST:event_opcNormalActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void textLoginUsrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLoginUsrKeyReleased
        
        
        String filtroUsuario = textLoginUsr.getText().trim();
        String filtroNombre = txtNom.getText().trim();
        String filtroTipoAcceso = (opcNormal.isSelected()) ? opcNormal.getText() : (opcAdmin.isSelected()) ? opcAdmin.getText() : "";

        filtrarDatos(filtroUsuario, filtroNombre, filtroTipoAcceso);    }//GEN-LAST:event_textLoginUsrKeyReleased

    private void txtNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyReleased
      
        String filtroUsuario = textLoginUsr.getText().trim();
        String filtroNombre = txtNom.getText().trim();
        String filtroTipoAcceso = (opcNormal.isSelected()) ? opcNormal.getText() : (opcAdmin.isSelected()) ? opcAdmin.getText() : "";

        filtrarDatos(filtroUsuario, filtroNombre, filtroTipoAcceso);    }//GEN-LAST:event_txtNomKeyReleased

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered
    
    private void cargarDatosDesdeArchivo() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel(); // Obtén el modelo de la tabla
        modelo.setRowCount(0); // Limpia los datos existentes en la tabla
        
        
        
        String[][] ListaUsr = buscarUsuarios();
        
        for (int i = 0; i < cantidadRegistros(); i++) {
            
            modelo.addRow(ListaUsr[i]);
        }
    }

//-------------------------------------------------------------------------------- Filtro de datos

    private void filtrarDatos(String filtroUsuario, String filtroNombre, String filtroTipoAcceso) {
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    jTable1.setRowSorter(sorter);

    List<RowFilter<Object, Object>> filters = new ArrayList<>();

    if (!filtroUsuario.isEmpty()) {
        filters.add(RowFilter.regexFilter("(?i)" + filtroUsuario, 0)); // Filtrar por columna de Usuario
    }

    if (!filtroNombre.isEmpty()) {
        filters.add(RowFilter.regexFilter("(?i)" + filtroNombre, 2)); // Filtrar por columna de Nombre
    }

    if (!filtroTipoAcceso.isEmpty()) {
        filters.add(RowFilter.regexFilter("(?i)" + filtroTipoAcceso, 5)); // Filtrar por columna de Tipo de Acceso
    }

    sorter.setRowFilter(RowFilter.andFilter(filters));

    cargarDatosDesdeArchivo();
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                    
          int selectedRow = jTable1.getSelectedRow();

    if (selectedRow >= 0) {
        if (camposBloqueados) {
            bloquearCampos(false);
        }

        // Obtener los valores de la fila seleccionada
        String loginUsuario = jTable1.getValueAt(selectedRow, 0).toString();
        String contrasena = jTable1.getValueAt(selectedRow, 1).toString();
        String nombre = jTable1.getValueAt(selectedRow, 2).toString();
        String apellidos = jTable1.getValueAt(selectedRow, 3).toString();
        String tipoAcceso = jTable1.getValueAt(selectedRow, 4).toString();
        String email = jTable1.getValueAt(selectedRow, 5).toString();

        // Mostrar los valores en los campos correspondientes
        textLoginUsr.setText(loginUsuario);
        txtNom.setText(nombre);
        textApellidos.setText(apellidos);
        textPass.setText(contrasena);
        textPass2.setText(contrasena);
        textEmail.setText(email);

        if (tipoAcceso.equals("Normal")) {
            opcNormal.setSelected(true);
            opcAdmin.setSelected(false);
        } else if (tipoAcceso.equals("Admin")) {
            opcNormal.setSelected(false);
            opcAdmin.setSelected(true);
        }
    }
        }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnadir;
    private javax.swing.JButton buscarButton;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton modifybtn;
    private javax.swing.JRadioButton opcAdmin;
    private javax.swing.JRadioButton opcNormal;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLoginUsr;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JPasswordField textPass2;
    private javax.swing.ButtonGroup tipoAcc;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables

}
