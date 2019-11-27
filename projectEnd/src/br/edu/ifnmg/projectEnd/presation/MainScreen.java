/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd.presation;

/**
 *
 * @author Diego
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSuper = new javax.swing.JLabel();
        btnPurchase = new javax.swing.JButton();
        btnSale = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mmnUser = new javax.swing.JMenu();
        abaRegisterUser = new javax.swing.JMenuItem();
        mmnClient = new javax.swing.JMenu();
        abaRegisterClient = new javax.swing.JMenuItem();
        abaSeacheClient = new javax.swing.JMenuItem();
        mmnProduct = new javax.swing.JMenu();
        mmnProvider = new javax.swing.JMenu();
        mmnStock = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSuper.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelSuper.setText("Super");

        btnPurchase.setText("Purchase");

        btnSale.setText("Sale");

        mmnUser.setText("User");

        abaRegisterUser.setText("Register User");
        abaRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaRegisterUserActionPerformed(evt);
            }
        });
        mmnUser.add(abaRegisterUser);

        jMenuBar1.add(mmnUser);

        mmnClient.setText("Client");

        abaRegisterClient.setText("Register Client");
        abaRegisterClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaRegisterClientActionPerformed(evt);
            }
        });
        mmnClient.add(abaRegisterClient);

        abaSeacheClient.setText("Seache Client");
        abaSeacheClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaSeacheClientActionPerformed(evt);
            }
        });
        mmnClient.add(abaSeacheClient);

        jMenuBar1.add(mmnClient);

        mmnProduct.setText("Product");
        jMenuBar1.add(mmnProduct);

        mmnProvider.setText("Provider");
        jMenuBar1.add(mmnProvider);

        mmnStock.setText("Stock");
        jMenuBar1.add(mmnStock);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnPurchase)
                        .addGap(87, 87, 87)
                        .addComponent(btnSale))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(labelSuper)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelSuper)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPurchase)
                    .addComponent(btnSale))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abaRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaRegisterUserActionPerformed
        RegisterUser screen = new RegisterUser();
        this.add(screen);
        screen.setVisible(true);
        
        
    }//GEN-LAST:event_abaRegisterUserActionPerformed

    private void abaRegisterClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaRegisterClientActionPerformed
        
        RegisterClient screen = new RegisterClient();
        this.add(screen);
        screen.setVisible(true);
        
    }//GEN-LAST:event_abaRegisterClientActionPerformed

    private void abaSeacheClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaSeacheClientActionPerformed
        
        SeacheMainClient screen = new SeacheMainClient();
        this.add(screen);
        screen.setVisible(true);
        
    }//GEN-LAST:event_abaSeacheClientActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abaRegisterClient;
    private javax.swing.JMenuItem abaRegisterUser;
    private javax.swing.JMenuItem abaSeacheClient;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnSale;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelSuper;
    private javax.swing.JMenu mmnClient;
    private javax.swing.JMenu mmnProduct;
    private javax.swing.JMenu mmnProvider;
    private javax.swing.JMenu mmnStock;
    private javax.swing.JMenu mmnUser;
    // End of variables declaration//GEN-END:variables
}
