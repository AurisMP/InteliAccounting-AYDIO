/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author matos
 */
public class ModificacionForm extends javax.swing.JFrame {

    private Set<String> registrosActualizados = new HashSet<>();

    public ModificacionForm(String nroDocu, String cuentaCont, String transaccion, String tipoDoc, String fecha) {
    initComponents();

    DocMod.setText(nroDocu);
    CuentaContMod.setText(cuentaCont);
    TransMod.setText(transaccion);
    TIpoDocMod.setText(tipoDoc);
    FECHAMod.setText(fecha);
    
    
}

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        TransMod = new javax.swing.JTextField();
        CuentaContMod = new javax.swing.JTextField();
        DocMod = new javax.swing.JTextField();
        FECHAMod = new javax.swing.JTextField();
        TIpoDocMod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ModiBTN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel3.setText("Numero de Documento");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel4.setText("Saldo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel5.setText("Documento");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel6.setText("Cuenta Contable");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabel7.setText("Fecha de Creacion");

        ModiBTN.setText("Modificar ");
        ModiBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModiBTNActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TransMod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DocMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CuentaContMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(ModiBTN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                        .addComponent(jLabel5)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TIpoDocMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FECHAMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(76, 76, 76))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocMod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuentaContMod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransMod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIpoDocMod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ModiBTN))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FECHAMod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModiBTNActionPerformed
        String nroDocu = DocMod.getText();
    String cuentaCont = CuentaContMod.getText();
    String transaccion = TransMod.getText();
    String tipoDoc = TIpoDocMod.getText();
    String fecha = FECHAMod.getText();

    if (nroDocu.isEmpty() || cuentaCont.isEmpty() || transaccion.isEmpty() || tipoDoc.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            if (registrosActualizados.contains(nroDocu)) {
                JOptionPane.showMessageDialog(this, "Transacción ya ha sido actualizada anteriormente.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String[] datosExistentes = cargarDatosDesdeArchivo(nroDocu);
                if (datosExistentes != null) {
                    datosExistentes[1] = cuentaCont;
                    datosExistentes[2] = transaccion;
                    datosExistentes[3] = tipoDoc;
                    datosExistentes[4] = fecha;
                    // ... Continuar con los demás campos si es necesario
                    
                    // Reescribir el archivo con los datos actualizados
                    reescribirArchivo(datosExistentes);
                    
                    JOptionPane.showMessageDialog(this, "Transacción modificada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    
                    registrosActualizados.add(nroDocu); // Agregar al conjunto de registros actualizados
                    
                    LimpiarCampos();
                    dispose(); // Cerrar la ventana de modificación después de guardar los cambios
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontraron datos para el número de documento.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al modificar la transacción.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    

    }//GEN-LAST:event_ModiBTNActionPerformed
private String[] cargarDatosDesdeArchivo(String numeroDocumento) throws IOException {
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

private void reescribirArchivo(String[] datosActualizados) throws IOException {
    String numeroDocumento = datosActualizados[0]; // Número de documento para identificar el registro

    File archivoOriginal = new File("Transaccion contable.txt");
    File archivoTemporal = new File("Temporal.txt");

    BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
    BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal));

    String linea;
    while ((linea = br.readLine()) != null) {
        String[] partes = linea.split(";");
        if (partes.length >= 1 && partes[0].equals(numeroDocumento)) {
            // Si encontramos el registro a actualizar, escribimos los datos actualizados
            bw.write(String.join(";", datosActualizados));
        } else {
            // Si no es el registro a actualizar, escribimos la línea original
            bw.write(linea);
        }
        bw.newLine();
    }

    br.close();
    bw.close();

    // Reemplazamos el archivo original con el archivo temporal
    archivoOriginal.delete();
    archivoTemporal.renameTo(archivoOriginal);
}
private void LimpiarCampos() {
        DocMod.setText("");
        CuentaContMod.setText("");
        TransMod.setText("");
        TIpoDocMod.setText("");
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CuentaContMod;
    private javax.swing.JTextField DocMod;
    private javax.swing.JTextField FECHAMod;
    private javax.swing.JButton ModiBTN;
    private javax.swing.JTextField TIpoDocMod;
    private javax.swing.JTextField TransMod;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
