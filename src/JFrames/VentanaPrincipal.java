package JFrames;

import Clases.Botella;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    Botella botella = new Botella();
 

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Botella");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBotella = new javax.swing.JLabel();
        btnLlenarBotella = new javax.swing.JButton();
        btnVaciarBotella = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMostrarLimite = new javax.swing.JLabel();
        lblMostrarActual = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuCambiar = new javax.swing.JMenu();
        ItemOllaDeCocina = new javax.swing.JMenuItem();
        itemCaneca = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ItemElCreador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBotella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotellaVacia.png"))); // NOI18N

        btnLlenarBotella.setBackground(java.awt.Color.darkGray);
        btnLlenarBotella.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLlenarBotella.setForeground(java.awt.Color.white);
        btnLlenarBotella.setText("Llenar Botella");
        btnLlenarBotella.setFocusable(false);
        btnLlenarBotella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarBotellaActionPerformed(evt);
            }
        });

        btnVaciarBotella.setBackground(java.awt.Color.darkGray);
        btnVaciarBotella.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVaciarBotella.setForeground(java.awt.Color.white);
        btnVaciarBotella.setText("Vaciar Botella");
        btnVaciarBotella.setFocusable(false);
        btnVaciarBotella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarBotellaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Actual:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Límite: ");

        lblMostrarLimite.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMostrarLimite.setText("1");

        lblMostrarActual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMostrarActual.setText("0");

        jMenu2.setText("Recipiente");

        menuCambiar.setText("Cambiar");

        ItemOllaDeCocina.setText("Olla de cocina");
        ItemOllaDeCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemOllaDeCocinaActionPerformed(evt);
            }
        });
        menuCambiar.add(ItemOllaDeCocina);

        itemCaneca.setText("Caneca");
        itemCaneca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCanecaActionPerformed(evt);
            }
        });
        menuCambiar.add(itemCaneca);

        jMenu2.add(menuCambiar);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Acerca de");

        ItemElCreador.setText("El creador");
        ItemElCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemElCreadorActionPerformed(evt);
            }
        });
        jMenu1.add(ItemElCreador);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(lblMostrarLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMostrarActual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLlenarBotella, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnVaciarBotella, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBotella, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMostrarLimite, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(lblMostrarActual, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(lblBotella, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLlenarBotella)
                    .addComponent(btnVaciarBotella))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVaciarBotellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarBotellaActionPerformed

        botella.vaciar(lblBotella, lblMostrarActual);
        
    }//GEN-LAST:event_btnVaciarBotellaActionPerformed

    private void btnLlenarBotellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarBotellaActionPerformed
      
        botella.llenar(lblBotella, lblMostrarActual);
        
    }//GEN-LAST:event_btnLlenarBotellaActionPerformed

    private void ItemOllaDeCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemOllaDeCocinaActionPerformed
        VentanaOlla vo = new VentanaOlla();
        vo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItemOllaDeCocinaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemElCreador;
    private javax.swing.JMenuItem ItemOllaDeCocina;
    private javax.swing.JButton btnLlenarBotella;
    private javax.swing.JButton btnVaciarBotella;
    private javax.swing.JMenuItem itemCaneca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBotella;
    private javax.swing.JLabel lblMostrarActual;
    private javax.swing.JLabel lblMostrarLimite;
    private javax.swing.JMenu menuCambiar;
    // End of variables declaration//GEN-END:variables
}
