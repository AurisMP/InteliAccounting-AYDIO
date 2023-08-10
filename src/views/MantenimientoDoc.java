/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static jdk.internal.org.jline.utils.Colors.s;

/**
 *
 * @author matos
 */
public class MantenimientoDoc extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MantenimientoDoc() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("InteliAccounting Documentos");
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Des = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(165, 250, 250));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 123, 32));

        Cod.setBorder(null);
        Cod.setOpaque(false);
        jPanel1.add(Cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 240, 32));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 20, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 26, 108, 31));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/enviar.png"))); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, 36));

        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/borrar.png"))); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, 36));

        Des.setBorder(null);
        Des.setOpaque(false);
        jPanel1.add(Des, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 235, 32));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 240, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 240, 20));

        jButton3.setFont(new java.awt.Font("Dubai Medium", 3, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/salida.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 80, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/examen.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 60, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/impuesto (2).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = Cod.getText();
        String desc = Des.getText();
        boolean Modificar;
        if (!codigo.isEmpty() && !desc.isEmpty()) {
            try {
                String filePath = "Mantenimiento de documento.txt";
                File archivo = new File(filePath);

                boolean encontrado = false;
                String contenidoArchivo = "";
                if (archivo.exists()) {
                    contenidoArchivo = new String(Files.readAllBytes(archivo.toPath()));
                    encontrado = contenidoArchivo.contains("Código: " + codigo);
                }

                FileWriter f = new FileWriter(filePath, true); // Usamos "true" para que agregue al final del archivo
                BufferedWriter bw = new BufferedWriter(f);

                if (encontrado) {
                    // Modificar registro existente
                    contenidoArchivo = contenidoArchivo.replaceAll("Código: " + codigo + ".*", "Modificando Código: " + codigo + ", Descripción: " + desc);
                    bw.write(contenidoArchivo);
                    jLabel4.setText("Modificando");
                } else {
                    // Crear nuevo registro
                    bw.write("Creando Código: " + codigo + ", Descripción: " + desc);
                    jLabel4.setText("Creando");
                }

                bw.newLine();
                bw.close();

                JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Guardar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el código y la descripción.", "Guardar", JOptionPane.WARNING_MESSAGE);
        }

        // Restaurar el estado a "Creando" para el próximo registro
        Modificar = false;


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cod.setText("");
        Des.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cod;
    private javax.swing.JTextField Des;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
