/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd.presation;

import br.edu.ifnmg.projectEnd.Item;
import br.edu.ifnmg.projectEnd.ItemProvider;
import br.edu.ifnmg.projectEnd.Product;
import br.edu.ifnmg.projectEnd.Provider;
import br.edu.ifnmg.projectEnd.Purchase;
import br.edu.ifnmg.projectEnd.Stock;
import br.edu.ifnmg.projectEnd.UnitPurchase;
import br.edu.ifnmg.projectEnd.User;
import br.edu.ifnmg.projectEnd.percistence.RepositoryProduct;
import br.edu.ifnmg.projectEnd.percistence.RepositoryProvider;
import br.edu.ifnmg.projectEnd.percistence.RepositoryPurchase;
import br.edu.ifnmg.projectEnd.percistence.RepositoryStock;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class PurchaseProduct extends javax.swing.JInternalFrame {

    private Purchase purchase;
    private RepositoryPurchase repository;
    private RepositoryProduct repositoryProduct;
    private RepositoryProvider repositoryProvider;
    private User user;
    
    public PurchaseProduct(User user) {
        initComponents();
        this.user = user;
        this.purchase = new Purchase();
        this.repository = new RepositoryPurchase();
        this.repositoryProduct = new RepositoryProduct();
        this.repositoryProvider = new RepositoryProvider();
    }

    public void addTable(){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Product");
        model.addColumn("Amount");
        model.addColumn("Value");
        List<ItemProvider> it = this.purchase.getItens();
        for(ItemProvider item : it){
            Vector line = new Vector();
            line.add(item.getProduct().getName());
            line.add(item.getAmount());
            line.add(item.getValue());
            model.addRow(line);
        }
        
        tblProduct.setModel(model);
    }
    
    public void setNullTable(){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Product");
        model.addColumn("Amount");
        model.addColumn("Value");
        
        Vector line = new Vector();
        line.add("");
        line.add("");
        line.add("");
        model.addRow(line);
        
        tblProduct.setModel(model);
    }
    
    public void addProduct(Product product)throws Exception{
        ItemProvider item = new ItemProvider();
        
        item.setAmount(Integer.parseInt(txtAmount.getText()));
        item.setProduct(product);
        item.setValue(product.getPurchase_price());
        
        this.purchase.addItem(item);
    }
    
    public void setNull(){
        this.txtAmount.setText("");
        this.txtNameProduct.setText("");
        this.txtProductId.setText("");
    }
    
    //na caixa vem 10
    public void panelValueTotal(){
        float value = 0;
        for(ItemProvider a : purchase.getItens()){ 
            value += a.getAmount() * a.getProduct().getPurchase_price().setScale(2, RoundingMode.DOWN).floatValue();
        }
        panelValueTotal.setText(String.valueOf(value));
    }
    
    public void addStock(){
        RepositoryStock repository = new RepositoryStock();
        Stock stock = new Stock();
        for(ItemProvider item: purchase.getItens()){
            stock.setProduct(item.getProduct());
            if(item.getProduct().getPurchase_unit() == UnitPurchase.Caixa)
                stock.setAmount(item.getAmount()*10);
            if(item.getProduct().getPurchase_unit() == UnitPurchase.Cento)
                stock.setAmount(item.getAmount()*100);
            if(item.getProduct().getPurchase_unit() == UnitPurchase.Duzia)
                stock.setAmount(item.getAmount()*12);
            if(item.getProduct().getPurchase_unit() == UnitPurchase.Fardo)
                stock.setAmount(item.getAmount()*20);
            repository.Save(stock, 1);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        txtNameProduct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNameProvider = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelValueTotal = new javax.swing.JTextPane();
        btnRemove = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Enter provider id :");

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel2.setText("Product name:");

        jLabel3.setText("Amount:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Amount", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        jLabel4.setText("Product id:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Purchase");

        jLabel6.setText("Enter provider name:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Value total:");

        jScrollPane2.setViewportView(panelValueTotal);

        btnRemove.setText("Remove");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmount)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemove))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNameProvider))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNameProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave)
                        .addComponent(btnCancel)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        if(!txtId.getText().isEmpty() && !txtNameProvider.getText().isEmpty()){
            if(this.repositoryProvider.CheckProvider(txtNameProvider.getText(), Integer.parseInt(txtId.getText())) == false){//
                if(this.repositoryProvider.CheckStatus(Integer.parseInt(txtId.getText())) == true){
                    JOptionPane.showMessageDialog(null, "Provider valid! Id = "+ txtId.getText());
                }else{
                    JOptionPane.showMessageDialog(null, "Provider Desable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Provider does not exist ");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Missing components");
            txtNameProvider.setText("");
            txtId.setText("");
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Product product = new Product();
        if(!txtNameProduct.getText().isEmpty() && !txtAmount.getText().isEmpty() && !txtProductId.getText().isEmpty()){
            if(this.repositoryProduct.CheckProductIdName(Integer.parseInt(txtProductId.getText()),txtNameProduct.getText()) == false){
                if(this.repositoryProduct.CheckStatus(Integer.parseInt(txtProductId.getText())) == true){
                    try{
                        product = this.repositoryProduct.Open(Integer.parseInt(txtProductId.getText()));
                        addProduct(product);
                        setNullTable();
                        setNull();
                        addTable();
                        panelValueTotal();
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "O produto está desativado");
                    setNull();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                setNull();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Componentes Obrigatórios");
            setNull();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Provider provider = new Provider();
        if(!txtId.getText().isEmpty() && !txtNameProvider.getText().isEmpty()){
            if(this.repositoryProvider.CheckProvider(txtNameProvider.getText(), Integer.parseInt(txtId.getText())) == false){//
                if(this.repositoryProvider.CheckStatus(Integer.parseInt(txtId.getText())) == true){
                    provider = repositoryProvider.Open(Integer.parseInt(txtId.getText()));
                    if(purchase.getItens() != null){
                                try{
                                    RepositoryPurchase repository = new RepositoryPurchase();
                                    purchase.setUser(user);
                                    purchase.setProvider(provider);
                                    purchase.setValue_total(BigDecimal.valueOf(Double.valueOf(panelValueTotal.getText())));
                                    if(repository.SavePurchase(purchase) == true){
                                        repository.addItem(purchase);
                                        addStock();
                                        setNull();
                                        setNullTable();
                                        purchase = null;
                                        txtId.setText("");
                                        txtNameProvider.setText("");
                                        panelValueTotal.setText("");
                                        JOptionPane.showMessageDialog(null, "Purchase save");
                                    }
                                    purchase = new Purchase();
                                }catch(Exception ex){
                                    System.out.println(ex.getMessage());
                                }   
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Provider Desable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Provider does not exist ");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Missing components");
            txtNameProvider.setText("");
            txtId.setText("");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        int linha = tblProduct.getSelectedRow();
        
    }//GEN-LAST:event_tblProductMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane panelValueTotal;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNameProduct;
    private javax.swing.JTextField txtNameProvider;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables
}
