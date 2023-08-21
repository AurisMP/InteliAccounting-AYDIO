/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controlador.CrudArchivos;
import static controlador.CrudArchivos.buscarUsuarios;
import static controlador.CrudArchivos.permisosUsuarios;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PantallaLogin extends javax.swing.JFrame {

    private InterfazP interfazP;

    /**
     * Creates new form NewJFrame
     */
    public PantallaLogin() {
        
        initComponents();
        this.interfazP = interfazP;
        
        setTitle("InteliAccounting");
        setResizable(false);

        final String textoPredeterminado = "Ingrese su nombre de usuario";
        textName.setText(textoPredeterminado);
        textName.setForeground(new Color(153, 153, 153));

        final String passTextoPredeterminado = "Ingrese su contraseña";
        textPass.setText(passTextoPredeterminado);
        textPass.setForeground(new Color(153, 153, 153));
        textPass.setEchoChar((char) 0);

        textName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (textName.getText().equals(textoPredeterminado)) {
                    textName.setText("");
                    textName.setForeground(new Color(0, 0, 0)); // Cambiar el color del texto a negro
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (textName.getText().isEmpty()) {
                    textName.setText(textoPredeterminado);
                    textName.setForeground(new Color(153, 153, 153)); // Restaurar el color del texto gris
                }
            }
        });
        textName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (textName.getText().equals("Ingrese su nombre de usuario")) {
                    textName.setText("");
                    textName.setForeground(Color.BLACK);
                }
            }

        });

        textPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (new String(textPass.getPassword()).equals(passTextoPredeterminado)) {
                    textPass.setText("");
                    textPass.setForeground(Color.BLACK);
                    textPass.setEchoChar('•'); // Carácter de contraseña
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (new String(textPass.getPassword()).isEmpty()) {
                    textPass.setText(passTextoPredeterminado);
                    textPass.setEchoChar((char) 0);
                    textPass.setForeground(new Color(153, 153, 153));
                }
            }
        }); // <--- Agrega esta línea

        setLocationRelativeTo(null);

        textName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                cambiarColorTexto();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                cambiarColorTexto();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                cambiarColorTexto();
            }
        });

    }

    // Método para cambiar el color del texto a negro mientras el usuario escribe
    private void cambiarColorTexto() {
        if (textName.getText().equals("Ingrese su nombre de usuario")) {
            textName.setForeground(new Color(204, 229, 255)); // Color azul claro
        } else {
            textName.setForeground(Color.BLACK); // Cambiar el color del texto a blanco
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        textPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        btIniSes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 310, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 310, 30));

        textPass.setFont(new java.awt.Font("Linux Libertine Display G", 2, 12)); // NOI18N
        textPass.setForeground(new java.awt.Color(204, 204, 204));
        textPass.setText("jPasswordField1");
        textPass.setBorder(null);
        textPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPassActionPerformed(evt);
            }
        });
        jPanel2.add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 290, 40));

        jLabel6.setFont(new java.awt.Font("Gentium Basic", 2, 16)); // NOI18N
        jLabel6.setText("Usuario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        textName.setFont(new java.awt.Font("Linux Libertine Display G", 2, 12)); // NOI18N
        textName.setForeground(new java.awt.Color(204, 204, 204));
        textName.setText("Ingrese su nombre de usuario");
        textName.setBorder(null);
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });
        jPanel2.add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 290, 40));

        btIniSes.setBackground(new java.awt.Color(204, 255, 255));
        btIniSes.setForeground(new java.awt.Color(94, 174, 253));
        btIniSes.setText("Iniciar sesión");
        btIniSes.setBorder(null);
        btIniSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniSesActionPerformed(evt);
            }
        });
        jPanel2.add(btIniSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 320, 40));

        jLabel7.setFont(new java.awt.Font("Gentium Basic", 2, 16)); // NOI18N
        jLabel7.setText("Contraseña");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/bloqueado.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/comentario-usuario.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 20, 20));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 20, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/LOGO_IA-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -20, 280, 160));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 410, 380));

        jPanel1.setBackground(new java.awt.Color(244, 243, 243));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/london-business-meeting-in-progress.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIniSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniSesActionPerformed
        boolean val = false;
        String usuario = textName.getText();
        char[] contrasena = textPass.getPassword();
        String contra = new String(contrasena);

        if (usuario.isBlank() || contra.isBlank() || textName.getText().equals("Ingrese su nombre de usuario") || contra.equals("Ingrese su contraseña")) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un usuario y contraseña.");
            val = false;
        } else {

            // Verificar si el usuario tiene permisos normales
            boolean permisosNormales = CrudArchivos.permisosUsuarios(usuario);

            
      if (CrudArchivos.buscarUsuarios(usuario, contra)) {
        InterfazP ip = new InterfazP();

        if (!permisosNormales) {
            ip.ocultarMenu();
        }

        String[] userDetails = CrudArchivos.obtenerDetallesUsuario(usuario); // Agrega este método
        if (userDetails != null && userDetails.length >= 4) {
            String nombre = userDetails[2];
            String apellido = userDetails[3];
            ip.setWelcomeMessage("Bienvenido, " + nombre + " " + apellido + "!"); // Establecer mensaje de bienvenida con nombre y apellido

        }

        dispose();
        ip.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(rootPane, "Nombre o Contraseña no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_btIniSesActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void textPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniSes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textPass;
    // End of variables declaration//GEN-END:variables
}
