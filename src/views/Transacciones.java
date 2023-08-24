/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import static controlador.CRUDcatalogo.buscarCatalogo;
import static controlador.CRUDcatalogo.buscarCuenta;
import static controlador.CRUDdocumento.buscarDoc;
import static controlador.CRUDdocumento.buscarDocumentos;
import controlador.DatosGlobales;
import static controlador.crudCabezeraTransaccionContable.guardarCabeTranCont;
import static controlador.crudTablaTrans.buscarDebCretrans;
import static controlador.crudTablaTrans.buscarTablaTrans;
import static controlador.crudTablaTrans.buscarTipoCat;
import static controlador.crudTablaTrans.buscartrans;
import static controlador.crudTablaTrans.cantidadRegistrosTT;
import static controlador.crudTablaTrans.guardarTablaTransacciones;
import static controlador.crudTransaccionContable.guardarTranCont;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Transacciones extends javax.swing.JFrame {

    private String loginUsr;
    private String dbDoc = "Mantenimiento de documento.txt";
    private String dbCuenta = "catalogo.txt";

    public Transacciones() {
        initComponents();

        setTitle("InteliAccounting Transacciones");
        this.setLocationRelativeTo(null);

        setResizable(false);

        cargarDatosDesdeArchivo();
        int debito = 0;
        int credito = 0;

    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TIpoDoc = new javax.swing.JComboBox<>();
        AA = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        credito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        Doc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Debito = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTrans = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Comentarios = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        desDoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cuenta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        desCuenta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Monto = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 239, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel1.setText("Tipo Documento :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        TIpoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Factura", "Ajuste", "Documento Interno", " " }));
        TIpoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIpoDocActionPerformed(evt);
            }
        });
        jPanel1.add(TIpoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, 30));

        AA.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jPanel1.add(AA, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 390, 60));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        credito.setText("0");
        credito.setToolTipText("");
        credito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                creditoFocusGained(evt);
            }
        });
        credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoActionPerformed(evt);
            }
        });
        credito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                creditoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                creditoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditoKeyTyped(evt);
            }
        });
        jPanel1.add(credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 100, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel3.setText("Numero de Documento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel5.setText("Comentarios");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DocKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DocKeyTyped(evt);
            }
        });
        jPanel1.add(Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 110, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel7.setText("Credito :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        Debito.setText("0");
        Debito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DebitoFocusGained(evt);
            }
        });
        Debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitoActionPerformed(evt);
            }
        });
        Debito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DebitoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DebitoKeyTyped(evt);
            }
        });
        jPanel1.add(Debito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel6.setText("Tipo Documento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel8.setText("Tipo Documento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel9.setText("Tipo Documento");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel10.setText("Tipo Documento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        tablaTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sec", "Cuenta", "Descripcion", "Debito", "Credito", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaTrans);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 770, 120));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        jLabel11.setText("Debito :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        Comentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentariosActionPerformed(evt);
            }
        });
        jPanel1.add(Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 260, 30));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        jLabel2.setText("Des. de Documento :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        desDoc.setEditable(false);
        desDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desDocActionPerformed(evt);
            }
        });
        jPanel1.add(desDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, -1));

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        jLabel4.setText("Cuenta :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Cuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CuentaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CuentaFocusLost(evt);
            }
        });
        Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaActionPerformed(evt);
            }
        });
        Cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CuentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CuentaKeyTyped(evt);
            }
        });
        jPanel1.add(Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 100, -1));

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        jLabel12.setText("Des. de Cuenta :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        desCuenta.setEditable(false);
        jPanel1.add(desCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 180, -1));

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        jLabel13.setText("Monto :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        Monto.setEditable(false);
        Monto.setText("0");
        jPanel1.add(Monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 100, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        jButton2.setText("Salir");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void cargarUsername() {

    }

    public void setWelcomeMessage(String message) {
        AA.setText(message);
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String doc = Doc.getText().trim();
        String cuenta = Cuenta.getText().trim();
        String debito = Debito.getText().trim();
        String Credito = credito.getText().trim();
        String comentario = "-----";
        String tipoDoc = TIpoDoc.getSelectedItem().toString();
        String descDoc = desDoc.getText();
        String monto = Monto.toString().trim();
        String descCuenta = desCuenta.getText().trim();

        if (doc.equals("") || cuenta.equals(" ") || (debito.equals("0") && Credito.equals("0") || debito.equals("") || Credito.equals(""))) {

            JOptionPane.showMessageDialog(rootPane, "Error se ha dejado algun campo vacio");
            limpiar();
        } else {

            if (buscarTipoCat(cuenta).equals("General")) {
                JOptionPane.showMessageDialog(rootPane, "No se pueden generar transacciones con cuentas tipo General");
            } else {
                if (buscartrans(cuenta)) {
                    JOptionPane.showMessageDialog(rootPane, "Ya hay una transaccion con esa cuenta");
                    limpiar();
                    cargarDatosDesdeArchivo();
                } else {
                    String[] crear = new String[9];
                    crear[0] = Cuenta.getText().trim();
                    crear[1] = desCuenta.getText();
                    crear[2] = Debito.getText();
                    crear[3] = credito.getText();
                    if (Comentarios.getText().equals("")) {
                        crear[4] = comentario;
                    } else {
                        crear[4] = Comentarios.getText().trim();
                    }
                    crear[5] = doc;
                    crear[6] = tipoDoc;

                    crear[7] = descDoc;
                    crear[8] = "0";

                    try {
                        guardarTablaTransacciones(crear);
                        cargarDatosDesdeArchivo();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Transacciones.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedEncodingException ex) {
                        Logger.getLogger(Transacciones.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }

        }
     }//GEN-LAST:event_btnAgregarActionPerformed

    private void cargarDatosDesdeArchivo() {

        DefaultTableModel modelo = (DefaultTableModel) tablaTrans.getModel();
        modelo.setRowCount(0);

        String[][] ListaTrans = buscarTablaTrans();

        for (int i = 0; i < cantidadRegistrosTT(); i++) {

            modelo.addRow(ListaTrans[i]);
        }
    }

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed


    }//GEN-LAST:event_LimpiarActionPerformed

    private void DocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DocFocusLost
        String codDoc = Doc.getText();
        String[] docEnc = new String[2];

        if (buscarDoc(codDoc) && !"".equals(codDoc)) {
            docEnc = buscarDocumentos(codDoc, dbDoc);

            desDoc.setText(docEnc[1]);

        } else {
            if (!"".equals(codDoc)) {
                JOptionPane.showMessageDialog(rootPane, "No se ha encontrado la Cuenta");
                Doc.setText("");
                desDoc.setText("");
            }

            Doc.setText("");
            desDoc.setText("");

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

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cuenta.requestFocus();
        }    }//GEN-LAST:event_DocKeyReleased

    private void creditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditoKeyTyped
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_creditoKeyTyped


    private void creditoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditoKeyReleased

    }//GEN-LAST:event_creditoKeyReleased

    private void TIpoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIpoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIpoDocActionPerformed

    private void creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditoActionPerformed

    private void DebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DebitoActionPerformed

    private void ComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComentariosActionPerformed

    private void DebitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DebitoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

            Comentarios.requestFocus();
        }
    }//GEN-LAST:event_DebitoKeyPressed

    private void DebitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DebitoKeyTyped
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_DebitoKeyTyped

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuentaActionPerformed

    private void DocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DocKeyPressed
        String[] docEnc = new String[2];
        String codDoc = Doc.getText().trim();

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            if (buscarDoc(codDoc)) {
                docEnc = buscarDocumentos(codDoc, dbDoc);

                desDoc.setText(docEnc[1]);

            } else {

                JOptionPane.showMessageDialog(rootPane, "No se ha encontrado la Cuenta");
                Doc.setText("");
                desDoc.setText("");
            }
        }
    }//GEN-LAST:event_DocKeyPressed

    private void CuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuentaKeyPressed
        String[] cuentaEnc = new String[11];
        String codCuenta = Cuenta.getText().trim();
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

            if (buscarCatalogo(codCuenta)) {

                cuentaEnc = buscarCuenta(codCuenta, dbCuenta);
                desCuenta.setText(cuentaEnc[1]);
                Debito.requestFocus();
            } else {

                JOptionPane.showMessageDialog(rootPane, "No se pudo encontrar el documento");
                Cuenta.setText("");
                desCuenta.setText("");
            }

        }
    }//GEN-LAST:event_CuentaKeyPressed

    private void CuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuentaKeyTyped
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_CuentaKeyTyped

    private void CuentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CuentaFocusGained


    }//GEN-LAST:event_CuentaFocusGained

    private void DebitoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DebitoFocusGained
        Debito.setText("");
        credito.setText("0");
    }//GEN-LAST:event_DebitoFocusGained

    private void creditoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditoFocusGained
        credito.setText("");
        Debito.setText("0");
    }//GEN-LAST:event_creditoFocusGained

    private void creditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

            Comentarios.requestFocus();
        }
    }//GEN-LAST:event_creditoKeyPressed

    private void CuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CuentaFocusLost
        String[] cuentaEnc = new String[11];
        String codCuenta = Cuenta.getText().trim();

        if (buscarCatalogo(codCuenta) && !codCuenta.equals("")) {

            cuentaEnc = buscarCuenta(codCuenta, dbCuenta);
            desCuenta.setText(cuentaEnc[1]);

        } else {
            if (!codCuenta.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "No se pudo encontrar el documento");
                Cuenta.setText("");
                desCuenta.setText("");
            }

            Cuenta.setText("");
            desCuenta.setText("");
        }
    }//GEN-LAST:event_CuentaFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String[] TranContable = new String[6];
        String[] CabeTranContable = new String[8];

        int cont = 0;
        if (buscarDebCretrans()[0].equals(buscarDebCretrans()[1])) {

            JOptionPane.showMessageDialog(rootPane, "Transaccion guardada exitosamente");

            String[][] registros = buscarTablaTrans();
            for (int i = 0; i < registros.length; i++) {
                for (int a = 0; a < registros[i].length; a++) {

                    if (a == 6) {
                        TranContable[0] = registros[i][a];
                        CabeTranContable[0] = registros[i][a];
                    }
                    if (a == 0) {
                        TranContable[1] = registros[i][a];

                    }
                    if (a == 1) {
                        TranContable[2] = registros[i][a];
                    }
                    if (a == 3) {
                        TranContable[3] = registros[i][a];
                    }
                    if (a == 4) {
                        TranContable[4] = registros[i][a];
                    }
                    if (a == 5) {
                        TranContable[5] = registros[i][a];
                    }
                    if (a == 7) {
                        CabeTranContable[2] = registros[i][a];
                    }
                    if (a == 8) {
                        CabeTranContable[3] = registros[i][a];
                    }
                    if (a == 9) {
                        CabeTranContable[5] = registros[i][a];
                    }

                }

                try {

                    guardarTranCont(TranContable);

                    CabeTranContable[6] = "0";
                    CabeTranContable[7] = "No Actualizado";
                    CabeTranContable[4] = DatosGlobales.getLoginUsr();
                    CabeTranContable[1] = LocalDate.now().toString();
                    for (int j = 0; j < CabeTranContable.length; j++) {
                        System.out.println(CabeTranContable[j]);

                    }
                    guardarCabeTranCont(CabeTranContable);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Transacciones.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(Transacciones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Credito y Debito con valores diferentes");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void desDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desDocActionPerformed

    public void limpiar() {

        Doc.setText("");
        desDoc.setText("");
        Cuenta.setText("");
        desCuenta.setText("");
        Debito.setText("0");
        credito.setText("0");
        Comentarios.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AA;
    private javax.swing.JTextField Comentarios;
    private javax.swing.JTextField Cuenta;
    private javax.swing.JTextField Debito;
    private javax.swing.JTextField Doc;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Monto;
    private javax.swing.JComboBox<String> TIpoDoc;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField credito;
    private javax.swing.JTextField desCuenta;
    private javax.swing.JTextField desDoc;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTrans;
    // End of variables declaration//GEN-END:variables

}
