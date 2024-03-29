/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd.presation;

import br.edu.ifnmg.projectEnd.Product;
import br.edu.ifnmg.projectEnd.percistence.RepositoryProduct;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class SearchProduct extends javax.swing.JInternalFrame {

    private Product product;
    private RepositoryProduct repository;
    
    /**
     * Creates new form SeacherProduct
     */
    public SearchProduct() {
        initComponents();
        this.repository = new RepositoryProduct();
        
    }

    public void AddTable(List<Product> products){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Name");
        model.addColumn("Id");
        model.addColumn("Purchase price");
        model.addColumn("Sale price");
        model.addColumn("Unit purchase");
        model.addColumn("Unit sale");
        
        for(Product product : products){
            Vector line = new Vector();
            line.add(product.getName());
            line.add(product.getId());
            line.add(product.getPurchase_price());
            line.add(product.getSale_price());
            line.add(product.getPurchase_unit());
            line.add(product.getSale_unit());
            
            model.addRow(line);
        }
        
        tblProduct.setModel(model);
    }
    
    public void setNullTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Id");
        model.addColumn("Purchase price");
        model.addColumn("Sale price");
        model.addColumn("Unit purchase");
        model.addColumn("Unit sale");
        Vector line = new Vector();
        line.add("");
        line.add("");
        line.add("");
        line.add("");
        line.add("");
        line.add("");
        model.addRow(line);
        tblProduct.setModel(model);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnSearchAll = new javax.swing.JButton();
        btnSearchEnabled = new javax.swing.JButton();
        btnSearchDisabled = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnEnable = new javax.swing.JButton();
        btnDisable = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name ", "Id", "Purchase price", "Sale price", "Unit Purchase", "Unit Sale"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        btnSearchAll.setText("Search all");
        btnSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAllActionPerformed(evt);
            }
        });

        btnSearchEnabled.setText("Search enabled");
        btnSearchEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEnabledActionPerformed(evt);
            }
        });

        btnSearchDisabled.setText("Search disabled");
        btnSearchDisabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDisabledActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seache Product");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");

        btnEnable.setText("Enable");

        btnDisable.setText("Disable");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEdit)
                        .addGap(81, 81, 81)
                        .addComponent(btnEnable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDisable)
                        .addGap(63, 63, 63)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSearchDisabled)
                        .addGap(83, 83, 83)
                        .addComponent(btnSearchEnabled)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchAll)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchDisabled)
                    .addComponent(btnSearchEnabled)
                    .addComponent(btnSearchAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnEdit)
                    .addComponent(btnEnable)
                    .addComponent(btnDisable))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAllActionPerformed
        setNullTable();
        String consult = "select * from product";
        List<Product> products = repository.OpenList(consult);
        AddTable(products);
    }//GEN-LAST:event_btnSearchAllActionPerformed

    private void btnSearchEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEnabledActionPerformed
        setNullTable();
        String consult = "select * from product where status = 1";
        List<Product> products = repository.OpenList(consult);
        AddTable(products);
    }//GEN-LAST:event_btnSearchEnabledActionPerformed

    private void btnSearchDisabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDisabledActionPerformed
        setNullTable();
        String consult = "select * from product where status = 0";
        List<Product> products = repository.OpenList(consult);
        AddTable(products);
    }//GEN-LAST:event_btnSearchDisabledActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisable;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEnable;
    private javax.swing.JButton btnSearchAll;
    private javax.swing.JButton btnSearchDisabled;
    private javax.swing.JButton btnSearchEnabled;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduct;
    // End of variables declaration//GEN-END:variables
}
