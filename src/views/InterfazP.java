/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author amatos
 */
public class InterfazP extends javax.swing.JFrame {

    /**
     * Creates new form InterfazP
     */
    public InterfazP() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("InteliAccounting");
        cargarUsername();

        manteniminetoCatalogo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                manteniminetoCatalogoActionPerformed(evt);
            }
        });
   addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
        int confirm = JOptionPane.showOptionDialog(
            InterfazP.this,
            "¿Está seguro que desea salir?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{"Cerrar", "Cancelar"},
            "Cerrar"
        );

        if (confirm == JOptionPane.YES_OPTION) {
            dispose();
        }else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        }
    }
});
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
        AA = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AgregarUsBTN = new javax.swing.JMenuItem();
        manteniminetoCatalogo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AgregarUsBTN1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/LOGO IA.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 741, 410));

        AA.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jPanel1.add(AA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 40));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/reporte.png"))); // NOI18N
        jMenu1.setText("Mantenimientos    ");
        jMenu1.setContentAreaFilled(false);
        jMenu1.setFont(new java.awt.Font("Gentium Basic", 3, 14)); // NOI18N

        AgregarUsBTN.setFont(new java.awt.Font("Gentium Basic", 2, 12)); // NOI18N
        AgregarUsBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/usuario2.png"))); // NOI18N
        AgregarUsBTN.setText("Usuarios");
        AgregarUsBTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AgregarUsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsBTNActionPerformed(evt);
            }
        });
        jMenu1.add(AgregarUsBTN);

        manteniminetoCatalogo.setFont(new java.awt.Font("Gentium Basic", 2, 12)); // NOI18N
        manteniminetoCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/desarrollo-de-producto.png"))); // NOI18N
        manteniminetoCatalogo.setText("Catalogo de Cuentas");
        manteniminetoCatalogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.add(manteniminetoCatalogo);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/extracto-bancario.png"))); // NOI18N
        jMenuItem1.setText("Documentos");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/transaccion (1).png"))); // NOI18N
        jMenu3.setText("Movimientos        ");
        jMenu3.setToolTipText("");
        jMenu3.setFont(new java.awt.Font("Gentium Basic", 3, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Gentium Basic", 3, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/cobro.png"))); // NOI18N
        jMenuItem2.setText("Transacciones");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/chat-flecha-crecer.png"))); // NOI18N
        jMenu2.setText("Procesos              ");
        jMenu2.setFont(new java.awt.Font("Gentium Basic", 3, 14)); // NOI18N

        AgregarUsBTN1.setFont(new java.awt.Font("Gentium Basic", 2, 12)); // NOI18N
        AgregarUsBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/reporte.png"))); // NOI18N
        AgregarUsBTN1.setText("Ciuerre Diario");
        AgregarUsBTN1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AgregarUsBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsBTN1ActionPerformed(evt);
            }
        });
        jMenu2.add(AgregarUsBTN1);

        jMenuBar1.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/archivo-medico-alt.png"))); // NOI18N
        jMenu6.setText("Consultas");
        jMenu6.setToolTipText("");
        jMenu6.setFont(new java.awt.Font("Gentium Basic", 3, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarUsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsBTNActionPerformed
        Usuarios user = new Usuarios();
        user.setVisible(true);
    }//GEN-LAST:event_AgregarUsBTNActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked


    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MantenimientoDoc a = new MantenimientoDoc();
    a.setVisible(true);    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Transacciones Tra = new Transacciones ();
        Tra.setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void AgregarUsBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsBTN1ActionPerformed
        Cierre c = new Cierre();
        c.setVisible(true);

    }//GEN-LAST:event_AgregarUsBTN1ActionPerformed
    private void manteniminetoCatalogoActionPerformed(java.awt.event.ActionEvent evt) {
        Catalogo_cuenta catalogo = new Catalogo_cuenta();
        catalogo.setVisible(true);
    }

    public void ocultarMenu() {
        jMenu1.setVisible(false);
        jMenu3.setVisible(false);
    }
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
                    setWelcomeMessage("Usuario, " + username + "!");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AA;
    private javax.swing.JMenuItem AgregarUsBTN;
    private javax.swing.JMenuItem AgregarUsBTN1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem manteniminetoCatalogo;
    // End of variables declaration//GEN-END:variables
}
