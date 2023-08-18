/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import static controlador.CRUDcatalogo.buscarCatalogo;
import static controlador.CRUDcatalogo.buscarCuenta;
import static controlador.CRUDdocumento.buscarDoc;
import static controlador.CRUDdocumento.buscarDocumentos;
import static controlador.CrudArchivos.buscarUsuarios;
import static controlador.crudTablaTrans.guardarTablaTransacciones;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transacciones extends javax.swing.JFrame {

    

    private String loginUsr; 
    private String dbDoc="Documentos.txt";
    private String dbCuenta="catalogo.txt";
    public Transacciones() {
        initComponents();
        

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
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

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
        jPanel1.add(Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 260, 30));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        jLabel2.setText("Des. de Documento :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        desDoc.setEditable(false);
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
        String doc=Doc.getText().trim();
        String cuenta = Cuenta.getText().trim();
        String debito = Debito.getText().trim();
        String Credito= credito.getText().trim();
        String comentario = "Vacio";
        if(doc.equals("")|| cuenta.equals(" ")||(debito.equals("0") && Credito.equals("0")|| debito.equals("")||Credito.equals(""))){
        
            JOptionPane.showMessageDialog(rootPane, "Error se ha dejado algun campo vacio");
            limpiar();
        }
        else{
            String[] crear = new String[5];
            crear[0]=Cuenta.getText().trim();
            crear[1]=desCuenta.getText();
            crear[2]=Debito.getText();
            crear[3]= credito.getText();
            if(Comentarios.getText().equals("")){
               crear[4]=comentario; 
            }else{
                crear[4]=Comentarios.getText().trim();
            }
            
            try {
                guardarTablaTransacciones(crear);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Transacciones.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Transacciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void llenarTabla(){
    
    DefaultTableModel modelo = (DefaultTableModel) tablaTrans.getModel();
    
    
    
    
    }
    
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        

    }//GEN-LAST:event_LimpiarActionPerformed

    private void DocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DocFocusLost
        String codDoc= Doc.getText();
        String[] docEnc= new String[2];
        
        
        
        
        
        if(buscarDoc(codDoc) && !"".equals(codDoc)){
            docEnc=buscarDocumentos(codDoc,dbDoc);
        
            desDoc.setText(docEnc[1]);
            
            }
        else{
            if(!"".equals(codDoc)){
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
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
        
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
        String[] docEnc=new String[2];
        String codDoc= Doc.getText().trim();
        
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            if(buscarDoc(codDoc)){
                docEnc=buscarDocumentos(codDoc,dbDoc);
        
                desDoc.setText(docEnc[1]);
            
            }
            else{
                
                JOptionPane.showMessageDialog(rootPane, "No se ha encontrado la Cuenta");
                Doc.setText("");
                desDoc.setText("");
            }
        }
    }//GEN-LAST:event_DocKeyPressed

    private void CuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuentaKeyPressed
       String[] cuentaEnc=new String[11];
       String codCuenta= Cuenta.getText().trim();
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
          
            if(buscarCatalogo(codCuenta)){
            
                cuentaEnc=buscarCuenta(codCuenta,dbCuenta);
                desCuenta.setText(cuentaEnc[1]);
                Debito.requestFocus();
            }
            else{
            
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
        Comentarios.requestFocus();
    }//GEN-LAST:event_creditoKeyPressed

    private void CuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CuentaFocusLost
       String[] cuentaEnc=new String[11];
       String codCuenta= Cuenta.getText().trim();
       
       if(buscarCatalogo(codCuenta) && !codCuenta.equals("")){
            
            cuentaEnc=buscarCuenta(codCuenta,dbCuenta);
            desCuenta.setText(cuentaEnc[1]);
                
        }
        else{
            if(!codCuenta.equals("")){
                JOptionPane.showMessageDialog(rootPane, "No se pudo encontrar el documento");
                Cuenta.setText("");
                desCuenta.setText("");
            }
            
            Cuenta.setText("");
            desCuenta.setText("");
        }
    }//GEN-LAST:event_CuentaFocusLost

    
    public void limpiar(){
    
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
