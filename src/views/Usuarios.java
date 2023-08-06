/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import controlador.CrudArchivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
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
        cargarDatosEnJTable();
        jLabel4.setVisible(false);
        this.setLocationRelativeTo(null);
       jLabel1.setText("<html><u>Usuario</u></html>");

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
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

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(203, 229, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/LOGO IA.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 50, 390, 172));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel3.setText("Apellidos :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 80, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel4.setText("Buscar por");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel5.setText("Nombre :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 70, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel7.setText("Opcional -------------------------------------------------------------------");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 400, 30));
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 220, 30));
        jPanel1.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 220, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel8.setText("Confirmar Contraseña :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 160, 30));

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 100, 30));
        jPanel1.add(textLoginUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 220, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Usuario", "Contraseña", "Email", "Tipo de Usuario"
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

        btAnadir.setText("Añadir");
        btAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 90, 30));

        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 90, 30));

        modifybtn.setText("Modificar");
        modifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifybtnActionPerformed(evt);
            }
        });
        jPanel1.add(modifybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 100, 30));
        jPanel1.add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 220, 30));

        buttonGroup1.add(opcNormal);
        opcNormal.setText("Normal");
        opcNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcNormalActionPerformed(evt);
            }
        });
        jPanel1.add(opcNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, 30));

        buttonGroup1.add(opcAdmin);
        opcAdmin.setText("Admin");
        opcAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAdminActionPerformed(evt);
            }
        });
        jPanel1.add(opcAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 70, 30));
        jPanel1.add(textPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 220, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel9.setText("Contraseña :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 90, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel10.setText("Tipo de Acceso :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 110, 30));
        jPanel1.add(textApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 220, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel11.setText(" Email :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 60, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel6.setText("Nombre Usuario :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 120, 30));

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

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
    
    txtNom.setEnabled(false);
    textApellidos.setEnabled(false);
    textPass.setEnabled(false);
    textPass2.setEnabled(false);
    opcNormal.setEnabled(false);
    opcAdmin.setEnabled(false);
    textEmail.setEnabled(false);
    btAnadir.setEnabled(false);
    jLabel4.setVisible(true);
    final String textoPredeterminado = "Buscar por Usuario";
    String searchTerm = textLoginUsr.getText().trim();
    
    if (searchTerm.isEmpty() || searchTerm.equals(textoPredeterminado)) {
        cargarDatosEnJTable(); // Mostrar todos los datos si el campo de búsqueda está vacío o contiene el texto predeterminado
    } else {
        filtrarTablaPorUsuario(searchTerm);
    }
}

private void filtrarTablaPorUsuario(String searchTerm) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    jTable1.setRowSorter(sorter);

    RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchTerm, 2); // Filtrar por columna de nombre de usuario (índice 2)
    sorter.setRowFilter(rowFilter);



    }//GEN-LAST:event_buscarButtonActionPerformed

    private void btAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnadirActionPerformed
        String opcRadio1="";
        boolean val=false;
        
        
        //Funciones del nivel de acceso
        if(opcNormal.isSelected()){
            opcRadio1=opcNormal.getText();
            val=true;
        }
        else if (opcAdmin.isSelected()){
            opcRadio1=opcAdmin.getText();
            val=true;
        }
        
        String loginUsr = textLoginUsr.getText().trim();
        String nombreUsr = txtNom.getText().trim();
        String apellidos = textApellidos.getText().trim();
        String email ="";
        
        String Password="a" ;  
        
        char[] Password1 =textPass.getPassword();
        char[] Password2=textPass2.getPassword();
        
        boolean tieneMayus=false;
        boolean tieneDig=false;
        
        if(textEmail.getText().isBlank()){
            email="Desconocido";
        }
        else {
             email = textEmail.getText();
        }
        
        if(textLoginUsr.getText().isBlank() || txtNom.getText().isBlank() || textPass.getPassword().length == 0 || textPass2.getPassword().length == 0 || opcRadio1.isBlank() ){
            JOptionPane.showMessageDialog(null,"Has dejado un campo vacio :o");
            val=false;
        }
        
      
        if(val==true){
            
            /*Con este for recorremos Password para saber si tiene alguna mayuscula ,
            si tiene la variable tieneMayus sera verdadera o true*/
            for(int a=0; a<Password1.length;a++){
                char letra=Password1[a];
                if(Character.isUpperCase(letra)){
                    tieneMayus=true;
                    break;
                }
            }
        
            /*Con este for recorremos Password para saber si tiene algun Digito ,
            si tiene, la variable tieneDig sera verdadera o true*/
            for(int a=0; a<Password1.length;a++){
                char letra=Password1[a];
                if(Character.isDigit(letra)){
                    tieneDig=true;
                    break;
                }
            }
        
        
            if(Password1.length < 8 || tieneMayus == false || tieneDig == false){
                JOptionPane.showMessageDialog(null,"La constrasena debe tener al menos 8 caracteeres, una mayuscula y un numero");
                val=false;
            }
         }
        
        
        
        //Confirmar contrasena NOTA: Las contrasena son arreglos de caracteres no pueden ser string por tema de seguridad
        
        if (Arrays.equals(Password1, Password2)) {
            Password = new String(Password2);
           
            
            
            }
        else{
            JOptionPane.showMessageDialog(null ,"Contrasena invalida");
            val=false;
        }
        
         modelo.Usuarios usuario = new modelo.Usuarios();
         
        if(val==true){
            usuario.setLoginUsr(loginUsr);
            usuario.setNombreUs(nombreUsr);
            usuario.setApellidosUsr(apellidos);
            usuario.setNivelAccs(opcRadio1);
            usuario.setEmailUsr(email);
            usuario.setPassUsr(Password);
            
            // Guardar el usuario en el archivo de texto
            
        }
        cargarDatosEnJTable();

        
                                           

                                      


    }//GEN-LAST:event_btAnadirActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
       
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void modifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifybtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifybtnActionPerformed

    private void opcAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcAdminActionPerformed

    private void opcNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcNormalActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing


private void cargarDatosEnJTable() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Limpiar filas existentes

    try {
        BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(line);

            String login = (String) jsonObject.get("loginUsr");
            String contraseña = (String) jsonObject.get("passUsr");
            String nivelAcceso = (String) jsonObject.get("nivelAccs");
            String nombre = (String) jsonObject.get("nombreUs");
            String email = (String) jsonObject.get("emailUsr");
            String apellidos = (String) jsonObject.get("apellidosUsr");

            model.addRow(new Object[]{nombre, apellidos, login, contraseña, email, nivelAcceso});
        }

        br.close();

        model.fireTableDataChanged(); // Notificar a la tabla que los datos han cambiado
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnadir;
    private javax.swing.JButton buscarButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables

}
