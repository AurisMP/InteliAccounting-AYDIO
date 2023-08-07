/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import static controlador.CrudArchivos.guardarUsuarios;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
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
        cargarDatosEnJTable();
        jLabel4.setVisible(false);
        this.setLocationRelativeTo(null);
       jLabel1.setText("<html><u>Usuario</u></html>");

    }
    
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
        jPanel1.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 220, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel8.setText("Confirmar Contraseña :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 160, 30));

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

        tipoAcc.add(opcNormal);
        opcNormal.setText("Normal");
        opcNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcNormalActionPerformed(evt);
            }
        });
        jPanel1.add(opcNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, 30));

        tipoAcc.add(opcAdmin);
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
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 60, 30));

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
    public void limpiar(){
        
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
        String email="";
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
        
        String tipoAcc="";        
        if(opcNormal.isSelected()){
            
            tipoAcc = opcNormal.getText();
        }
        else if(opcAdmin.isSelected()){
        
            tipoAcc=opcAdmin.getText();
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
            
            if(listaUsr[i].isBlank()){
                
                JOptionPane.showMessageDialog(null, "Dejo un campo vacio :c");
                
                val=false;
                limpiar();
                break;
            }
            else{
                val=true;
            }
            
            
        }
        String contra="";
        if(!pass1.equals(pass2 )&& val){
            
            JOptionPane.showMessageDialog(null, "Contrasena no coinciden >:v");
            val=false;
        }
        else{
           
            
            contra=pass1;
            boolean tieneM=false;
            boolean tieneD=false;
           
            for (int i = 0; i < contra.length(); i++) {
                
                if(Character.isUpperCase(contra.charAt(i))){
                    
                    tieneM=true;
                    val=true;
                    break;
                }
                
            }
            
            for (int i = 0; i < contra.length(); i++) {
                
                if(Character.isDigit(contra.charAt(i))){
                    
                    tieneD=true;
                    val=true;
                    break;
                }
                
            }
            
            
            
            
            
            if((contra.length()< 8 || tieneM == false || tieneD == false) && val==true){
                
                JOptionPane.showMessageDialog(null,"La contrasena debe tener como minimo 8 caracteres , una mayuscula y un numero como minimo :c");
                limpiar();
                val=false;
                
            }
            
            if(textEmail.getText().isBlank()){
                email="Desconocido";
            }
            else{
                email=textEmail.getText();
            }
          
    }   
        if(val){
           
            String[] crudUsr = new String[6];
            crudUsr[0]=textLoginUsr.getText();
            crudUsr[1]=contra;
            crudUsr[2]=txtNom.getText();
            crudUsr[3]=textApellidos.getText();
            crudUsr[4]=tipoAcc;
            crudUsr[5]=email;
            
            for (int i = 0; i < crudUsr.length; i++) {
                System.out.println(crudUsr[i]);
                
            }
            
            JOptionPane.showMessageDialog(null,"El usuario ha sido creado exitosamente :D ");
            limpiar();
            
            try {
                guardarUsuarios(crudUsr);
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
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
    private javax.swing.ButtonGroup tipoAcc;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables

}
