package JFrames;
import Clases.Olla;
import javax.swing.JOptionPane;

public class VentanaOlla extends javax.swing.JFrame {

    Olla olla = new Olla();

    public VentanaOlla() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Olla de cocina");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOlla = new javax.swing.JLabel();
        btnLlenarOlla = new javax.swing.JButton();
        btnVaciarOlla = new javax.swing.JButton();
        lblActual = new javax.swing.JLabel();
        lblLimite = new javax.swing.JLabel();
        lblMostrarLimite = new javax.swing.JLabel();
        lblMostrarActual = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCaneca = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        ItemBotella = new javax.swing.JMenuItem();
        itemCaneca = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ItemElCreador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOlla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgOllas/OllaVacia.png"))); // NOI18N

        btnLlenarOlla.setBackground(java.awt.Color.darkGray);
        btnLlenarOlla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLlenarOlla.setForeground(java.awt.Color.white);
        btnLlenarOlla.setText("Llenar Olla ");
        btnLlenarOlla.setFocusable(false);
        btnLlenarOlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarOllaActionPerformed(evt);
            }
        });

        btnVaciarOlla.setBackground(java.awt.Color.darkGray);
        btnVaciarOlla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVaciarOlla.setForeground(java.awt.Color.white);
        btnVaciarOlla.setText("Vaciar Olla");
        btnVaciarOlla.setFocusable(false);
        btnVaciarOlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarOllaActionPerformed(evt);
            }
        });

        lblActual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblActual.setText("Actual:");

        lblLimite.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLimite.setText("Límite: ");

        lblMostrarLimite.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMostrarLimite.setText("10");

        lblMostrarActual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMostrarActual.setText("0");

        menuCaneca.setText("Recipiente");

        jMenu3.setText("Cambiar");

        ItemBotella.setText("Botella");
        ItemBotella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBotellaActionPerformed(evt);
            }
        });
        jMenu3.add(ItemBotella);

        itemCaneca.setText("Caneca");
        itemCaneca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCanecaActionPerformed(evt);
            }
        });
        jMenu3.add(itemCaneca);

        menuCaneca.add(jMenu3);

        jMenuBar1.add(menuCaneca);

        jMenu2.setText("Acerca de");

        ItemElCreador.setText("El creador");
        ItemElCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemElCreadorActionPerformed(evt);
            }
        });
        jMenu2.add(ItemElCreador);

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
                            .addComponent(btnLlenarOlla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnVaciarOlla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblOlla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(lblOlla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLlenarOlla)
                    .addComponent(btnVaciarOlla))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLlenarOllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarOllaActionPerformed
        olla.llenar(lblOlla, lblMostrarActual);
    }//GEN-LAST:event_btnLlenarOllaActionPerformed

    private void btnVaciarOllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarOllaActionPerformed
        olla.vaciar(lblOlla, lblMostrarActual);
    }//GEN-LAST:event_btnVaciarOllaActionPerformed

    private void ItemBotellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBotellaActionPerformed
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItemBotellaActionPerformed

    private void ItemElCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemElCreadorActionPerformed
        JOptionPane.showMessageDialog(this, "Juan Sebastián");
    }//GEN-LAST:event_ItemElCreadorActionPerformed

    private void itemCanecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCanecaActionPerformed
        VentanaCaneca vc = new VentanaCaneca();
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemCanecaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaOlla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOlla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOlla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOlla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOlla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemBotella;
    private javax.swing.JMenuItem ItemElCreador;
    private javax.swing.JButton btnLlenarOlla;
    private javax.swing.JButton btnVaciarOlla;
    private javax.swing.JMenuItem itemCaneca;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblActual;
    private javax.swing.JLabel lblLimite;
    private javax.swing.JLabel lblMostrarActual;
    private javax.swing.JLabel lblMostrarLimite;
    private javax.swing.JLabel lblOlla;
    private javax.swing.JMenu menuCaneca;
    // End of variables declaration//GEN-END:variables
}
