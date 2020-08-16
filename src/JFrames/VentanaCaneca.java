package JFrames;

import Clases.Caneca;
import javax.swing.JOptionPane;

public class VentanaCaneca extends javax.swing.JFrame {
    
    Caneca caneca = new Caneca();
    
    public VentanaCaneca() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Caneca");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLlenarCaneca = new javax.swing.JButton();
        lblMostrarActual = new javax.swing.JLabel();
        btnVaciarCaneca = new javax.swing.JButton();
        lblActual = new javax.swing.JLabel();
        lblLimite = new javax.swing.JLabel();
        lblCaneca = new javax.swing.JLabel();
        lblMostrarLimite = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        itemBotella = new javax.swing.JMenuItem();
        itemOlla = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemCreador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLlenarCaneca.setBackground(java.awt.Color.darkGray);
        btnLlenarCaneca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLlenarCaneca.setForeground(java.awt.Color.white);
        btnLlenarCaneca.setText("Llenar Caneca");
        btnLlenarCaneca.setFocusable(false);
        btnLlenarCaneca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarCanecaActionPerformed(evt);
            }
        });

        lblMostrarActual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMostrarActual.setText("0");

        btnVaciarCaneca.setBackground(java.awt.Color.darkGray);
        btnVaciarCaneca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVaciarCaneca.setForeground(java.awt.Color.white);
        btnVaciarCaneca.setText("Vaciar Caneca");
        btnVaciarCaneca.setFocusable(false);
        btnVaciarCaneca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarCanecaActionPerformed(evt);
            }
        });

        lblActual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblActual.setText("Actual:");

        lblLimite.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLimite.setText("Límite: ");

        lblCaneca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgCanecas/BaldeVacio.png"))); // NOI18N

        lblMostrarLimite.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMostrarLimite.setText("20");

        jMenu1.setText("Recipiente");

        jMenu3.setText("Cambiar");

        itemBotella.setText("Botella");
        itemBotella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBotellaActionPerformed(evt);
            }
        });
        jMenu3.add(itemBotella);

        itemOlla.setText("Olla de cocina");
        itemOlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOllaActionPerformed(evt);
            }
        });
        jMenu3.add(itemOlla);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");

        itemCreador.setText("El creador");
        itemCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCreadorActionPerformed(evt);
            }
        });
        jMenu2.add(itemCreador);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLimite)
                        .addGap(3, 3, 3)
                        .addComponent(lblMostrarLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(lblActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMostrarActual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLlenarCaneca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnVaciarCaneca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblCaneca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLimite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMostrarLimite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMostrarActual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lblCaneca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLlenarCaneca)
                    .addComponent(btnVaciarCaneca))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLlenarCanecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarCanecaActionPerformed
        caneca.llenar(lblCaneca, lblMostrarActual);
    }//GEN-LAST:event_btnLlenarCanecaActionPerformed

    private void btnVaciarCanecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarCanecaActionPerformed
       caneca.vaciar(lblCaneca, lblMostrarActual);
    }//GEN-LAST:event_btnVaciarCanecaActionPerformed

    private void itemCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCreadorActionPerformed
        JOptionPane.showMessageDialog(this, "Juan Sebastián");
    }//GEN-LAST:event_itemCreadorActionPerformed

    private void itemBotellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBotellaActionPerformed
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemBotellaActionPerformed

    private void itemOllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOllaActionPerformed
        VentanaOlla vo = new VentanaOlla();
        vo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemOllaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCaneca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCaneca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCaneca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCaneca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCaneca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLlenarCaneca;
    private javax.swing.JButton btnVaciarCaneca;
    private javax.swing.JMenuItem itemBotella;
    private javax.swing.JMenuItem itemCreador;
    private javax.swing.JMenuItem itemOlla;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblActual;
    private javax.swing.JLabel lblCaneca;
    private javax.swing.JLabel lblLimite;
    private javax.swing.JLabel lblMostrarActual;
    private javax.swing.JLabel lblMostrarLimite;
    // End of variables declaration//GEN-END:variables
}
