package views;

import static controlador.CRUDcatalogo.Buscar;
import static controlador.CRUDcatalogo.Crear;
import static controlador.CRUDcatalogo.Modificar;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuarios;

/**
 *
 * @author Ezequiel
 */
public class Catalogo_cuenta extends javax.swing.JFrame {

    Boolean modi = false;
    String tabla = "catalogo.txt";
    int campos = 11;

    public Catalogo_cuenta() {
        initComponents();
        tffecha.setVisible(false);
        lblfecha.setVisible(false);
        lblhora.setVisible(false);
        jSeparator10.setVisible(false);
        jSeparator8.setVisible(false);
        tfhora.setVisible(false);
        lblnoedit.setVisible(false);
        this.setLocationRelativeTo(null);
        setTitle("InteliAccounting Catalogo de Cuentas");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfnumeroc = new javax.swing.JTextField();
        tfdescrip = new javax.swing.JTextField();
        tfcuentapadre = new javax.swing.JTextField();
        tffecha = new javax.swing.JTextField();
        tfhora = new javax.swing.JTextField();
        tfdebito = new javax.swing.JTextField();
        tfcredito = new javax.swing.JTextField();
        tfbalance = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        tfnivel = new javax.swing.JComboBox<>();
        tfgrupo = new javax.swing.JComboBox<>();
        tftipo = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblnoedit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 232, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("Numero de cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Descripcion de la cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Tipo de cuenta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Cuenta Padre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Nivel de cuenta");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 120, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Grupo de cuenta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        lblfecha.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblfecha.setText("Fecha de creacion");
        jPanel1.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 140, -1));

        lblhora.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblhora.setText("Hora de creacion");
        jPanel1.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 130, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setText("Debito acomulado de cuenta");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setText("Credito acomulado de cuenta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel11.setText("Balance de cuenta");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 140, -1));

        tfnumeroc.setToolTipText("");
        tfnumeroc.setBorder(null);
        tfnumeroc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfnumerocFocusLost(evt);
            }
        });
        tfnumeroc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnumerocActionPerformed(evt);
            }
        });
        tfnumeroc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfnumerocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfnumerocKeyTyped(evt);
            }
        });
        jPanel1.add(tfnumeroc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 180, 30));

        tfdescrip.setBorder(null);
        tfdescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfdescripKeyReleased(evt);
            }
        });
        jPanel1.add(tfdescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 180, 30));

        tfcuentapadre.setBorder(null);
        tfcuentapadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcuentapadreActionPerformed(evt);
            }
        });
        tfcuentapadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfcuentapadreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcuentapadreKeyTyped(evt);
            }
        });
        jPanel1.add(tfcuentapadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 180, 30));

        tffecha.setEditable(false);
        tffecha.setBorder(null);
        tffecha.setOpaque(false);
        tffecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffechaActionPerformed(evt);
            }
        });
        jPanel1.add(tffecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 150, 30));

        tfhora.setEditable(false);
        tfhora.setBorder(null);
        tfhora.setOpaque(false);
        tfhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhoraActionPerformed(evt);
            }
        });
        jPanel1.add(tfhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 150, 30));

        tfdebito.setEditable(false);
        tfdebito.setText("0");
        tfdebito.setToolTipText("");
        tfdebito.setBorder(null);
        tfdebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdebitoActionPerformed(evt);
            }
        });
        tfdebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdebitoKeyTyped(evt);
            }
        });
        jPanel1.add(tfdebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 180, 30));

        tfcredito.setEditable(false);
        tfcredito.setText("0");
        tfcredito.setBorder(null);
        tfcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcreditoKeyTyped(evt);
            }
        });
        jPanel1.add(tfcredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 180, 30));

        tfbalance.setEditable(false);
        tfbalance.setText("0");
        tfbalance.setBorder(null);
        tfbalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfbalanceKeyTyped(evt);
            }
        });
        jPanel1.add(tfbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 180, 30));

        titulo.setFont(new java.awt.Font("Yu Gothic", 2, 16)); // NOI18N
        titulo.setText("Creando");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        tfnivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        tfnivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnivelActionPerformed(evt);
            }
        });
        tfnivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfnivelKeyPressed(evt);
            }
        });
        jPanel1.add(tfnivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 180, 30));

        tfgrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital", "Ingresos", "Costos", "Gastos" }));
        jPanel1.add(tfgrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 180, 30));

        tftipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Detalles" }));
        jPanel1.add(tftipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 180, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 180, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 180, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 180, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 180, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 150, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/impuesto (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 150));

        jLabel8.setFont(new java.awt.Font("Gentium Basic", 2, 30)); // NOI18N
        jLabel8.setText("Catalogo de Cuentas");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 240, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/acerca-de.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 40, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/cobro.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, 50, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/expediente.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 40, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/extracto-bancario.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 40, 40));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 180, 20));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 150, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/extracto-de-cuenta (1).png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 50, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/banca-de-dinero.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 50, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/impuesto (2).png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 50, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/ahorro-de-dinero.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 50, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/examen.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 50, 40));

        jButton3.setFont(new java.awt.Font("Dubai Medium", 3, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/salida.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 100, 40));

        jButton2.setFont(new java.awt.Font("Yu Gothic", 2, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/barriendo.png"))); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Yu Gothic", 2, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/examen.png"))); // NOI18N
        jButton1.setText("Crear       ");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblnoedit.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblnoedit.setText("Esta cuenta tiene balance no puede ser editada");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(lblnoedit)
                .addGap(56, 56, 56)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnoedit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1040, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnumerocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnumerocActionPerformed


    }//GEN-LAST:event_tfnumerocActionPerformed

    private void tfnumerocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfnumerocFocusLost
        // TODO add your handling code here:
        String[] datos = new String[campos + 1];
        if ("".equals(tfnumeroc.getText())) {
            tffecha.setVisible(false);
            lblfecha.setVisible(false);
            lblhora.setVisible(false);
            tfhora.setVisible(false);
            jSeparator10.setVisible(false);
            jSeparator8.setVisible(false);
            tfdescrip.setText("");
            tftipo.setSelectedItem(ABORT);
            tfnivel.setSelectedItem(ABORT);
            tfcuentapadre.setText("");
            tfgrupo.setSelectedItem(ABORT);
            tffecha.setText("");
            tfhora.setText("");
            tfdebito.setText("0");
            tfcredito.setText("0");
            tfbalance.setText("0");
            modi = false;
            tfdescrip.enable(true);
            tftipo.enable(true);
            tfnivel.enable(true);
            tfcuentapadre.enable(true);
            tfgrupo.enable(true);
            tfdebito.enable(true);
            tfcredito.enable(true);
            tfbalance.enable(true);
        } else {
            try {
                datos = Buscar(tfnumeroc.getText(), tabla, campos);
            } catch (IOException ex) {
                System.err.println("Error al buscar en el archivo: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        if ("1".equals(datos[11])) {
            tffecha.setVisible(true);
            lblfecha.setVisible(true);
            lblhora.setVisible(true);
            tfhora.setVisible(true);
            jSeparator10.setVisible(true);
            jSeparator8.setVisible(true);
            tfdescrip.setText(datos[1]);
            tftipo.setSelectedItem(datos[2]);
            tfnivel.setSelectedItem(datos[3]);
            tfcuentapadre.setText(datos[4]);
            tfgrupo.setSelectedItem(datos[5]);
            tffecha.setText(datos[6]);
            tfhora.setText(datos[7]);
            tfdebito.setText(datos[8]);
            tfcredito.setText(datos[9]);
            tfbalance.setText(datos[10]);
            float nf = Float.parseFloat(datos[10]);
            if (nf > 0) {
                tfdescrip.enable(false);
                tftipo.enable(false);
                tfnivel.enable(false);
                tfcuentapadre.enable(false);
                tfgrupo.enable(false);
                tfdebito.enable(false);
                tfcredito.enable(false);
                tfbalance.enable(false);
                lblnoedit.setVisible(true);
            }

            titulo.setText("Modificando");
            modi = true;
        } else {
            jSeparator10.setVisible(false);
            jSeparator8.setVisible(false);
            tffecha.setVisible(false);
            lblfecha.setVisible(false);
            lblhora.setVisible(false);
            tfhora.setVisible(false);
            tfdescrip.setText("");
            tftipo.setSelectedItem(ABORT);
            tfnivel.setSelectedItem(ABORT);
            tfcuentapadre.setText("");
            tfgrupo.setSelectedItem(ABORT);
            tffecha.setText("");
            tfhora.setText("");
            tfdebito.setText("0");
            tfcredito.setText("0");
            tfbalance.setText("0");
            tfdescrip.enable(true);
            tftipo.enable(true);
            tfnivel.enable(true);
            tfcuentapadre.enable(true);
            tfgrupo.enable(true);
            tfdebito.enable(true);
            tfcredito.enable(true);
            tfbalance.enable(true);
            titulo.setText("Creando");
        }
    }//GEN-LAST:event_tfnumerocFocusLost

    private void tfnumerocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfnumerocKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfnumeroc.requestFocus();
        }
    }//GEN-LAST:event_tfnumerocKeyReleased

    private void tfdescripKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdescripKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfdescrip.requestFocus();
        }
    }//GEN-LAST:event_tfdescripKeyReleased

    private void tfnivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnivelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfnivelActionPerformed

    private void tfnivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfnivelKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfnivel.requestFocus();
        }
    }//GEN-LAST:event_tfnivelKeyPressed

    private void tfcuentapadreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcuentapadreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfcuentapadre.requestFocus();
        }
    }//GEN-LAST:event_tfcuentapadreKeyPressed

    private void tfnumerocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfnumerocKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfnumerocKeyTyped

    private void tfcuentapadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcuentapadreKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfcuentapadreKeyTyped

    private void tfdebitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdebitoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || tfdebito.getText().contains("."))) {

            evt.consume();

        }
    }//GEN-LAST:event_tfdebitoKeyTyped

    private void tfcreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcreditoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || tfcredito.getText().contains("."))) {

            evt.consume();

        }
    }//GEN-LAST:event_tfcreditoKeyTyped

    private void tfbalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfbalanceKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || tfbalance.getText().contains("."))) {

            evt.consume();

        }
    }//GEN-LAST:event_tfbalanceKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tffecha.setVisible(false);
        lblfecha.setVisible(false);
        lblhora.setVisible(false);
        tfhora. setVisible(false);
        jSeparator10.setVisible(false);
        jSeparator8.setVisible(false);
        tfnumeroc.setText("");
        tfdescrip.setText("");
        tftipo.setSelectedItem(ABORT);
        tfnivel.setSelectedItem(ABORT);
        tfcuentapadre.setText("");
        tfgrupo.setSelectedItem(ABORT);
        tffecha.setText("");
        tfhora.setText("");
        tfdebito.setText("0");
        tfcredito.setText("0");
        tfbalance.setText("0");
        tfdescrip.enable(true);
        tftipo.enable(true);
        tfnivel.enable(true);
        tfcuentapadre.enable(true);
        tfgrupo.enable(true);
        tfdebito.enable(true);
        tfcredito.enable(true);
        tfbalance.enable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfdebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdebitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdebitoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        LocalDate fechaActual = LocalDate.now();
        String fechaActualStr = fechaActual.toString();
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss"); // Define el formato deseado
        String horaActualStr = horaActual.format(formato);
        String[] crear = new String[campos];
        crear[0] = tfnumeroc.getText();
        crear[1] = tfdescrip.getText();
        crear[2] = (String) tftipo.getSelectedItem();
        crear[3] = (String) tfnivel.getSelectedItem();
        crear[4] = tfcuentapadre.getText();
        crear[5] = (String) tfgrupo.getSelectedItem();
        crear[6] = fechaActualStr;
        crear[7] = horaActualStr;
        crear[8] = tfdebito.getText();
        crear[9] = tfcredito.getText();
        crear[10] = tfbalance.getText();

        if ("".equals(crear[0])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[1])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[2])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[3])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[4])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[5])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[6])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[7])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[8])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[9])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[10])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else {
            if (modi == false) {
                try {
                    Crear(crear, tabla);
                    tffecha.setVisible(false);
                    lblfecha.setVisible(false);
                    lblhora.setVisible(false);
                    tfhora.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "DATOS GUARDADOS");
                    tfnumeroc.setText("");
                    tfdescrip.setText("");
                    tftipo.setSelectedItem(ABORT);
                    tfnivel.setSelectedItem(ABORT);
                    tfcuentapadre.setText("");
                    tfgrupo.setSelectedItem(ABORT);
                    tffecha.setText("");
                    tfhora.setText("");
                    tfdebito.setText("");
                    tfcredito.setText("");
                    tfbalance.setText("");
                    tfdescrip.enable(true);
                    tftipo.enable(true);
                    tfnivel.enable(true);
                    tfcuentapadre.enable(true);
                    tfgrupo.enable(true);
                    tfdebito.enable(true);
                    tfcredito.enable(true);
                    tfbalance.enable(true);
                } catch (FileNotFoundException | UnsupportedEncodingException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                Modificar(crear, tabla);
                tffecha.setVisible(false);
                lblfecha.setVisible(false);
                lblhora.setVisible(false);
                tfhora.setVisible(false);
                jSeparator10.setVisible(false);
                jSeparator8.setVisible(false);

                JOptionPane.showMessageDialog(rootPane, "DATOS GUARDADOS");
                tfnumeroc.setText("");
                tfdescrip.setText("");
                tftipo.setSelectedItem(ABORT);
                tfnivel.setSelectedItem(ABORT);
                tfcuentapadre.setText("");
                tfgrupo.setSelectedItem(ABORT);
                tffecha.setText("");
                tfhora.setText("");
                tfdebito.setText("");
                tfcredito.setText("");
                tfbalance.setText("");
                tfdescrip.enable(true);
                tftipo.enable(true);
                tfnivel.enable(true);
                tfcuentapadre.enable(true);
                tfgrupo.enable(true);
                tfdebito.enable(true);
                tfcredito.enable(true);
                tfbalance.enable(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfcuentapadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcuentapadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcuentapadreActionPerformed

    private void tffechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffechaActionPerformed

    private void tfhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfhoraActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblnoedit;
    private javax.swing.JTextField tfbalance;
    private javax.swing.JTextField tfcredito;
    private javax.swing.JTextField tfcuentapadre;
    private javax.swing.JTextField tfdebito;
    private javax.swing.JTextField tfdescrip;
    private javax.swing.JTextField tffecha;
    private javax.swing.JComboBox<String> tfgrupo;
    private javax.swing.JTextField tfhora;
    private javax.swing.JComboBox<String> tfnivel;
    private javax.swing.JTextField tfnumeroc;
    private javax.swing.JComboBox<String> tftipo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
