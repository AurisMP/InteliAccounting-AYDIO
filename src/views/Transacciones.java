/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author amatos
 */
public class Transacciones extends javax.swing.JFrame {

    private Set<String> registrosActualizados = new HashSet<>();

    
    private String usuarioLoggedIn; // Variable para guardar el nombre de usuario

    public Transacciones() {
        initComponents();
        cargarUsername();

        setResizable(false);
        this.setLocationRelativeTo(null);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaActual = sdf.format(new Date());
        FECHA.setText(fechaActual);
        FECHA.setVisible(false);
        setResizable(false);
        this.setLocationRelativeTo(null);
        Doc.setText("");
        labelFec.setVisible(false);
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
        labelFec = new javax.swing.JLabel();
        TIpoDoc = new javax.swing.JComboBox<>();
        AA = new javax.swing.JLabel();
        BTN = new javax.swing.JButton();
        CuentaCont = new javax.swing.JTextField();
        Trans = new javax.swing.JTextField();
        FECHA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        Doc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Debito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 239, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel1.setText("Tipo Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        labelFec.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        labelFec.setText("Fecha Documento");
        jPanel1.add(labelFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

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

        CuentaCont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CuentaContKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CuentaContKeyTyped(evt);
            }
        });
        jPanel1.add(CuentaCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 160, 30));

        Trans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TransKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TransKeyTyped(evt);
            }
        });
        jPanel1.add(Trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 160, 30));

        FECHA.setEditable(false);
        FECHA.setEnabled(false);
        jPanel1.add(FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel3.setText("Numero de Documento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel4.setText("Cuenta Contable");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel5.setText("Debito");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        Doc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DocFocusLost(evt);
            }
        });
        Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocActionPerformed(evt);
            }
        });
        Doc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DocKeyTyped(evt);
            }
        });
        jPanel1.add(Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 160, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel7.setText("Credito");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));
        jPanel1.add(Debito, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 160, 30));

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
           String nroDocu = Doc.getText();
    String cuentaCont = CuentaCont.getText();
    String transaccion = Trans.getText();
    String tipoDoc = (String) TIpoDoc.getSelectedItem();
    String fecha = FECHA.getText();
    String usuario = usuarioLoggedIn; // Obtener el nombre de usuario

    if (nroDocu.isEmpty() || cuentaCont.isEmpty() || transaccion.isEmpty() || tipoDoc.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            if (registrosActualizados.contains(nroDocu)) {
                JOptionPane.showMessageDialog(this, "Transacción ya ha sido actualizada.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedWriter writer = new BufferedWriter(new FileWriter("Transaccion contable.txt", true));
                String nuevoRegistro = nroDocu + ";" + cuentaCont + ";" + transaccion + ";" + tipoDoc + ";" + fecha + ";" + usuario + "\n";
                writer.write(nuevoRegistro);
                writer.close();
                
                JOptionPane.showMessageDialog(this, "Transacción guardada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                // Si no ha sido actualizada previamente, permite modificarla
                registrosActualizados.add(nroDocu); // Agregar al conjunto de registros actualizados
                
                // Realizar acciones adicionales si es necesario
                
                LimpiarCampos();
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar la transacción.", "Error", JOptionPane.ERROR_MESSAGE);
        }
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

    private void DocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DocFocusLost
         String nroDocu = Doc.getText();

    if (!nroDocu.isEmpty()) {
        if (validarNumeroEnCatalogo(nroDocu)) {
            try {
                String[] datos = cargarDatosDesdeArchivo(nroDocu);
                if (datos != null) {
                    CuentaCont.setText(datos[1]);
                    Trans.setText(datos[2]);
                    TIpoDoc.setSelectedItem(datos[3]);
                    FECHA.setText(datos[4]);
                    // ... Continuar con los demás campos
                    
                    Object[] options = {"Crear nuevo", "Modificar"};
                    int option = JOptionPane.showOptionDialog(this, "La transferencia existe. ¿Qué desea hacer?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    if (option == 1) {
                        
                        ModificacionForm modForm = new ModificacionForm(nroDocu, datos[1], datos[2], datos[3], datos[4]);
                    modForm.setVisible(true);
                    } else if (option == 0) {
                        LimpiarCampos(); // Limpia los campos si se selecciona "Crear nuevo"
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // El número de documento no existe en el catálogo
            AA.setText("Documento no encontrado en el catálogo. Puede crearlo.");
        }
    }
    }//GEN-LAST:event_DocFocusLost

    private void DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocActionPerformed

    private void DocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DocKeyTyped
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_DocKeyTyped

    private void DocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DocKeyReleased
// TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Doc.requestFocus();
        }    }//GEN-LAST:event_DocKeyReleased

    private void TransKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TransKeyTyped
        //No permite que se introduzcan letras
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

    }//GEN-LAST:event_TransKeyTyped

    private boolean validarNumeroEnTransacciones(String numero) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Transaccion contable.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 1 && parts[0].equals(numero)) {
                    br.close();
                    return true; // El número existe en el archivo
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // El número no existe en el archivo
    }    private String[] cargarDatosDesdeArchivo(String numeroDocumento) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Transaccion contable.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            if (parts.length >= 5 && parts[0].equals(numeroDocumento)) {
                br.close();
                return parts; // Retorna los datos encontrados en el archivo
            }
        }

        br.close();
        return null; // No se encontraron datos para el número de documento dado
    }
    private void TransKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TransKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Trans.requestFocus();
        }

    }//GEN-LAST:event_TransKeyReleased

    private void CuentaContKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuentaContKeyTyped
        //No permite que se introduzca Letras

        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
            && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_CuentaContKeyTyped

    private void CuentaContKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuentaContKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            CuentaCont.requestFocus();
        }
    }//GEN-LAST:event_CuentaContKeyReleased

    private void LimpiarCampos() {
        Doc.setText("");
        CuentaCont.setText("");
        Trans.setText("");
        TIpoDoc.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AA;
    private javax.swing.JButton BTN;
    private javax.swing.JTextField CuentaCont;
    private javax.swing.JTextField Debito;
    private javax.swing.JTextField Doc;
    private javax.swing.JTextField FECHA;
    private javax.swing.JButton Limpiar;
    private javax.swing.JComboBox<String> TIpoDoc;
    private javax.swing.JTextField Trans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFec;
    // End of variables declaration//GEN-END:variables

}
