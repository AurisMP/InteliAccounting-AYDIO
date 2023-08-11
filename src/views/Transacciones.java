/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author amatos
 */
public class Transacciones extends javax.swing.JFrame {

    /**
     * Creates new form Transacciones
     */
    private String usuarioLoggedIn; // Variable para guardar el nombre de usuario

    public Transacciones() {
        initComponents();
                cargarUsername();

        setResizable(false);
        this.setLocationRelativeTo(null);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaActual = sdf.format(new Date());
        FECHA.setText(fechaActual);

        Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarDocumento();
            }
        });

        setResizable(false);
        this.setLocationRelativeTo(null);
        Doc.setText("");
        CuentaCont.setText("");
        Trans.setText("");
        TIpoDoc.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    private boolean validarAtributosObligatorios() {
        String nroDocu = Doc.getText();
        String tipoDoc = (String) TIpoDoc.getSelectedItem();

        if (nroDocu.isEmpty() || tipoDoc.isEmpty()) {
            return false;
        }

        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Doc = new javax.swing.JTextField();
        TIpoDoc = new javax.swing.JComboBox<>();
        AA = new javax.swing.JLabel();
        BTN = new javax.swing.JButton();
        CuentaCont = new javax.swing.JTextField();
        Trans = new javax.swing.JTextField();
        FECHA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 239, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha Documento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));
        jPanel1.add(Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 160, 30));

        TIpoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Factura", "Ajuste", "Documento Interno", " " }));
        jPanel1.add(TIpoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 244, 160, 30));

        AA.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jPanel1.add(AA, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 390, 60));

        BTN.setText("Guardar");
        BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNActionPerformed(evt);
            }
        });
        jPanel1.add(BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));
        jPanel1.add(CuentaCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 160, 30));
        jPanel1.add(Trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 160, 30));
        jPanel1.add(FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Numero de Documento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cuenta Contable");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Monto Transaccion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Monto Transaccion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void cargarUsername() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt"));
            String line = br.readLine();
            if (line != null) {
                String[] parts = line.split(";");
                if (parts.length >= 3) {
                    String username;
                    if (parts.length == 5) {
                        // Si es un arreglo, el nombre de usuario está en la segunda posición
                        username = parts[1];
                    } else {
                        // Si no es un arreglo, el nombre de usuario está en la tercera posición
                        username = parts[2];
                    }
                    setWelcomeMessage("Bienvenido, " + username + "!");
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setWelcomeMessage(String message) {
        AA.setText(message);
    }
    private void BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNActionPerformed
        if (validarAtributosObligatorios()) {
            // Aquí colocas el código que se ejecutará si los atributos son válidos
            AA.setText("Campos válidos. Acción realizada con éxito.");
            LimpiarCampos(); // Limpia los campos después de una acción exitosa

        } else {
            JOptionPane.showMessageDialog(this, "Hay campos vacíos. Complete los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
// Método para validar el documento

    private void validarDocumento() {
        String nroDocu = Doc.getText();
        if (nroDocu.isEmpty()) {
            return; // No hace nada si el campo está vacío
        }

        if (!validarNumeroEnCatalogo(nroDocu)) {
            JOptionPane.showMessageDialog(this, "El número de documento no existe en el catálogo.", "Error", JOptionPane.ERROR_MESSAGE);
            Doc.requestFocus(); // Coloca el foco nuevamente en el campo Doc
        }
    }

    private boolean validarNumeroEnCatalogo(String numero) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("catalogo.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 1 && parts[0].equals(numero)) {
                    br.close();
                    return true; // El número existe en el catálogo
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // El número no existe en el catálogo
    

  
     }//GEN-LAST:event_BTNActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        LimpiarCampos();

    }//GEN-LAST:event_LimpiarActionPerformed

    private void LimpiarCampos() {
        Doc.setText("");
        CuentaCont.setText("");
        Trans.setText("");
        TIpoDoc.setSelectedIndex(0);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AA;
    private javax.swing.JButton BTN;
    private javax.swing.JTextField CuentaCont;
    private javax.swing.JTextField Doc;
    private javax.swing.JTextField FECHA;
    private javax.swing.JButton Limpiar;
    private javax.swing.JComboBox<String> TIpoDoc;
    private javax.swing.JTextField Trans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
