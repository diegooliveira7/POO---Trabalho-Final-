/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd.presation;

import br.edu.ifnmg.projectEnd.User;

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
        btnSearchUser = new javax.swing.JMenuItem();
        abaDisable = new javax.swing.JMenuItem();
        abaEnableUser = new javax.swing.JMenuItem();
        abaEditUser = new javax.swing.JMenuItem();
        mmnClient = new javax.swing.JMenu();
        abaRegisterClient = new javax.swing.JMenuItem();
        abaSeacheClient = new javax.swing.JMenuItem();
        abaDisableClient = new javax.swing.JMenuItem();
        abaEnableClient = new javax.swing.JMenuItem();
        abaEditeClient = new javax.swing.JMenuItem();
        mmnProduct = new javax.swing.JMenu();
        abaRegisterProduct = new javax.swing.JMenuItem();
        abaSearchProduct = new javax.swing.JMenuItem();
        abaDisableProduct = new javax.swing.JMenuItem();
        abaEnableProduct = new javax.swing.JMenuItem();
        abaEditProduct = new javax.swing.JMenuItem();
        mmnProvider = new javax.swing.JMenu();
        abaRegisterProvider = new javax.swing.JMenuItem();
        abaDisableProvider = new javax.swing.JMenuItem();
        btnSearchProvider = new javax.swing.JMenuItem();
        abaEnableProvider = new javax.swing.JMenuItem();
        mmnStock = new javax.swing.JMenu();
        abaStock = new javax.swing.JMenuItem();
        mnuReports = new javax.swing.JMenu();
        abaReports = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSuper.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelSuper.setText("Super");

        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        btnSale.setText("Sale");
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        mmnUser.setText("User");

        abaRegisterUser.setText("Register User");
        abaRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaRegisterUserActionPerformed(evt);
            }
        });
        mmnUser.add(abaRegisterUser);

        btnSearchUser.setText("Search User");
        btnSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUserActionPerformed(evt);
            }
        });
        mmnUser.add(btnSearchUser);

        abaDisable.setText("Disable User");
        abaDisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaDisableActionPerformed(evt);
            }
        });
        mmnUser.add(abaDisable);

        abaEnableUser.setText("Enable User");
        abaEnableUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaEnableUserActionPerformed(evt);
            }
        });
        mmnUser.add(abaEnableUser);

        abaEditUser.setText("Edit User");
        abaEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaEditUserActionPerformed(evt);
            }
        });
        mmnUser.add(abaEditUser);

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

        abaDisableClient.setText("Disable Client");
        abaDisableClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaDisableClientActionPerformed(evt);
            }
        });
        mmnClient.add(abaDisableClient);

        abaEnableClient.setText("Enable Client");
        abaEnableClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaEnableClientActionPerformed(evt);
            }
        });
        mmnClient.add(abaEnableClient);

        abaEditeClient.setText("Edit Client");
        abaEditeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaEditeClientActionPerformed(evt);
            }
        });
        mmnClient.add(abaEditeClient);

        jMenuBar1.add(mmnClient);

        mmnProduct.setText("Product");

        abaRegisterProduct.setText("Register Product");
        abaRegisterProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaRegisterProductActionPerformed(evt);
            }
        });
        mmnProduct.add(abaRegisterProduct);

        abaSearchProduct.setText("Search Product");
        abaSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaSearchProductActionPerformed(evt);
            }
        });
        mmnProduct.add(abaSearchProduct);

        abaDisableProduct.setText("Disable Product");
        abaDisableProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaDisableProductActionPerformed(evt);
            }
        });
        mmnProduct.add(abaDisableProduct);

        abaEnableProduct.setText("Enable Product");
        abaEnableProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaEnableProductActionPerformed(evt);
            }
        });
        mmnProduct.add(abaEnableProduct);

        abaEditProduct.setText("Edit Product");
        abaEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaEditProductActionPerformed(evt);
            }
        });
        mmnProduct.add(abaEditProduct);

        jMenuBar1.add(mmnProduct);

        mmnProvider.setText("Provider");

        abaRegisterProvider.setText("Register Provider");
        abaRegisterProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaRegisterProviderActionPerformed(evt);
            }
        });
        mmnProvider.add(abaRegisterProvider);

        abaDisableProvider.setText("Disable Provider");
        abaDisableProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaDisableProviderActionPerformed(evt);
            }
        });
        mmnProvider.add(abaDisableProvider);

        btnSearchProvider.setText("Search Provider");
        btnSearchProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProviderActionPerformed(evt);
            }
        });
        mmnProvider.add(btnSearchProvider);

        abaEnableProvider.setText("Enable Provider");
        abaEnableProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaEnableProviderActionPerformed(evt);
            }
        });
        mmnProvider.add(abaEnableProvider);

        jMenuBar1.add(mmnProvider);

        mmnStock.setText("Stock");

        abaStock.setText("Stock");
        abaStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaStockActionPerformed(evt);
            }
        });
        mmnStock.add(abaStock);

        jMenuBar1.add(mmnStock);

        mnuReports.setText("Reports");

        abaReports.setText("Reports");
        abaReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaReportsActionPerformed(evt);
            }
        });
        mnuReports.add(abaReports);

        jMenuBar1.add(mnuReports);

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
        
        SearchMainClient screen = new SearchMainClient();
        this.add(screen);
        screen.setVisible(true);
        
    }//GEN-LAST:event_abaSeacheClientActionPerformed

    private void abaRegisterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaRegisterProductActionPerformed
        RegisterProduct screen = new RegisterProduct();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaRegisterProductActionPerformed

    private void abaDisableProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaDisableProductActionPerformed
        DisableProduct screen = new DisableProduct();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaDisableProductActionPerformed

    private void abaSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaSearchProductActionPerformed
        SearchProduct screen = new SearchProduct();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaSearchProductActionPerformed

    private void abaRegisterProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaRegisterProviderActionPerformed
        RegisterProvider screen = new RegisterProvider();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaRegisterProviderActionPerformed

    private void abaDisableProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaDisableProviderActionPerformed
        DisableProvider screen = new DisableProvider();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaDisableProviderActionPerformed

    private void abaEnableProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaEnableProductActionPerformed
        EnableProduct screen = new EnableProduct();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaEnableProductActionPerformed

    private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUserActionPerformed
        SearchUser screen = new SearchUser();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_btnSearchUserActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        AuthenticateUserPurchase screen = new AuthenticateUserPurchase();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        AuthenticateUserSale screen = new AuthenticateUserSale();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_btnSaleActionPerformed

    private void abaDisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaDisableActionPerformed
        DisableUser screen = new DisableUser();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaDisableActionPerformed

    private void abaEnableUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaEnableUserActionPerformed
        EnableUser screen = new EnableUser();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaEnableUserActionPerformed

    private void abaEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaEditUserActionPerformed
        EditUser screen = new EditUser();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaEditUserActionPerformed

    private void abaEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaEditProductActionPerformed
        EditProduct screen = new EditProduct();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaEditProductActionPerformed

    private void abaDisableClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaDisableClientActionPerformed
        DisableClient screen = new DisableClient();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaDisableClientActionPerformed

    private void abaStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaStockActionPerformed
        StockProduct screen = new StockProduct();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaStockActionPerformed

    private void abaReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaReportsActionPerformed
        Reports screen = new Reports();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaReportsActionPerformed

    private void abaEnableClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaEnableClientActionPerformed
        EnableClient screen = new EnableClient();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaEnableClientActionPerformed

    private void btnSearchProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProviderActionPerformed
        SearchProvider screen = new SearchProvider();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_btnSearchProviderActionPerformed

    private void abaEnableProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaEnableProviderActionPerformed
        EnableProvider screen = new EnableProvider();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaEnableProviderActionPerformed

    private void abaEditeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaEditeClientActionPerformed
        EditClient screen = new EditClient();
        this.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_abaEditeClientActionPerformed

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
    private javax.swing.JMenuItem abaDisable;
    private javax.swing.JMenuItem abaDisableClient;
    private javax.swing.JMenuItem abaDisableProduct;
    private javax.swing.JMenuItem abaDisableProvider;
    private javax.swing.JMenuItem abaEditProduct;
    private javax.swing.JMenuItem abaEditUser;
    private javax.swing.JMenuItem abaEditeClient;
    private javax.swing.JMenuItem abaEnableClient;
    private javax.swing.JMenuItem abaEnableProduct;
    private javax.swing.JMenuItem abaEnableProvider;
    private javax.swing.JMenuItem abaEnableUser;
    private javax.swing.JMenuItem abaRegisterClient;
    private javax.swing.JMenuItem abaRegisterProduct;
    private javax.swing.JMenuItem abaRegisterProvider;
    private javax.swing.JMenuItem abaRegisterUser;
    private javax.swing.JMenuItem abaReports;
    private javax.swing.JMenuItem abaSeacheClient;
    private javax.swing.JMenuItem abaSearchProduct;
    private javax.swing.JMenuItem abaStock;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnSale;
    private javax.swing.JMenuItem btnSearchProvider;
    private javax.swing.JMenuItem btnSearchUser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelSuper;
    private javax.swing.JMenu mmnClient;
    private javax.swing.JMenu mmnProduct;
    private javax.swing.JMenu mmnProvider;
    private javax.swing.JMenu mmnStock;
    private javax.swing.JMenu mmnUser;
    private javax.swing.JMenu mnuReports;
    // End of variables declaration//GEN-END:variables
}
