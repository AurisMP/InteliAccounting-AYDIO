/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controlador.CrudArchivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author matos
 */
public class Usuarios extends javax.swing.JFrame {

    public Usuarios() {
        initComponents();
        setTitle("InteliAccounting   Usuarios");
        setResizable(false);

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
        buscarButton2 = new javax.swing.JButton();
        buscarButton4 = new javax.swing.JButton();
        textPass = new javax.swing.JPasswordField();
        opcNormal = new javax.swing.JRadioButton();
        opcAdmin = new javax.swing.JRadioButton();
        textPass2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textApellidos = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(203, 229, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/LOGO IA.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 40, 398, 172));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 16)); // NOI18N
        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 80, 70));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 16)); // NOI18N
        jLabel4.setText("Nombre Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 130, 50));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 16)); // NOI18N
        jLabel5.setText("Nombre ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 130, 70));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 16)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 160, 70));

        txtNom.setText("jTextField2");
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 220, 30));

        textEmail.setText("jTextField2");
        jPanel1.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 220, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 16)); // NOI18N
        jLabel8.setText("Confirmar Contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 200, 70));

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, 30));

        textLoginUsr.setText("jTextField2");
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
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 970, 270));

        btAnadir.setText("Añadir");
        btAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 30));

        buscarButton2.setText("Eliminar");
        buscarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(buscarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, 30));

        buscarButton4.setText("Modificar");
        buscarButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(buscarButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 80, 30));

        textPass.setText("jPasswordField1");
        jPanel1.add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 220, 30));

        buttonGroup1.add(opcNormal);
        opcNormal.setText("Normal");
        jPanel1.add(opcNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, -1));

        buttonGroup1.add(opcAdmin);
        opcAdmin.setText("Admin");
        jPanel1.add(opcAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, -1));
        jPanel1.add(textPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 220, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 16)); // NOI18N
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 90, 70));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 16)); // NOI18N
        jLabel10.setText("Tipo de Usuario");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 130, 70));

        textApellidos.setText("jTextField2");
        jPanel1.add(textApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed


    }//GEN-LAST:event_buscarButtonActionPerformed

    private void btAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnadirActionPerformed
                String opcRadio1="";
        
        //Funciones del nivel de acceso
        if(opcNormal.isSelected()){
            opcRadio1=opcNormal.getText();
        }
        else if (opcAdmin.isSelected()){
            opcRadio1=opcAdmin.getText();
        }
        
        
        if(textLoginUsr.getText().isBlank() || txtNom.getText().isBlank() || textEmail.getText().isBlank() || textPass.getPassword().length == 0 || textPass2.getPassword().length == 0 || opcRadio1.isBlank() ){
            JOptionPane.showMessageDialog(null,"Has dejado un campo vacio :o");
            
        }
        String loginUsr = textLoginUsr.getText().trim();
        
        String nombreUsr = txtNom.getText().trim();
        String apellidos = textApellidos.getText().trim();
        String email ="";
        
        if(textEmail.getText().isBlank()){
            email="Desconocido";
        }
        else {
             email = textEmail.getText();
        }
        
       
        
        
        
               
        char[] Password1 =textPass.getPassword();
        String Password="a" ;
        char[] Password2=textPass2.getPassword();
        boolean tieneMayus=false;
        boolean tieneDig=false;
        
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
        }
        
        //Confirmar contrasena NOTA: Las contrasena son arreglos de caracteres no pueden ser string por tema de seguridad
        
        if (Arrays.equals(Password1, Password2)) {
            Password = new String(Password2);
           
            
            
            }
        else{
            JOptionPane.showMessageDialog(null ,"Contrasena invalida");
        }
        
        modelo.Usuarios usuario = new modelo.Usuarios();
        usuario.setLoginUsr(loginUsr);
        usuario.setNombreUs(nombreUsr);
        usuario.setApellidosUsr(apellidos);
        usuario.setNivelAccs(opcRadio1);
        usuario.setEmailUsr(email);
        usuario.setPassUsr(Password);

    // Guardar el usuario en el archivo de texto
    CrudArchivos.guardarUsuarioEnArchivo(usuario);
        
    }                                        

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
    dispose(); // Cierra la ventana secundaria sin afectar la ventana principal
                                      


    }//GEN-LAST:event_btAnadirActionPerformed

    private void buscarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarButton2ActionPerformed

    private void buscarButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnadir;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton buscarButton2;
    private javax.swing.JButton buscarButton4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
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
