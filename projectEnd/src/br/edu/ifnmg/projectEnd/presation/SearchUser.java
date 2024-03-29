/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd.presation;

import br.edu.ifnmg.projectEnd.User;
import br.edu.ifnmg.projectEnd.percistence.RepositoryUser;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class SearchUser extends javax.swing.JInternalFrame {

    private RepositoryUser repository;
    private User user;
    /**
     * Creates new form SearchUser
     */
    public SearchUser() {
        initComponents();
        this.user = new User();
        this.repository = new RepositoryUser();
    }

    public void AddTable(List<User> users){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Name");
        model.addColumn("Id");
        model.addColumn("Cpf");
        model.addColumn("Sex");
        model.addColumn("User");
        
        for(User user : users){
            Vector line = new Vector();
            line.add(user.getName());
            line.add(user.getId());
            line.add(user.getCpf());
            line.add(user.getSex());
            line.add(user.getUser());
            model.addRow(line);
        }
        
        tblUser.setModel(model);
    }
    
    public void setNullTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Id");
        model.addColumn("Cpf");
        model.addColumn("Sex");
        model.addColumn("User");
        Vector line = new Vector();
        line.add("");
        line.add("");
        line.add("");
        line.add("");
        line.add("");
        model.addRow(line);
        tblUser.setModel(model);
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
        tblUser = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnSearchEnable = new javax.swing.JButton();
        btnSearchDisable = new javax.swing.JButton();
        btnSearchAll = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Id", "Cpf", "Sex", "User"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUser);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seache User");

        btnSearchEnable.setText("Search enable");
        btnSearchEnable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEnableActionPerformed(evt);
            }
        });

        btnSearchDisable.setText("Search disable");
        btnSearchDisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDisableActionPerformed(evt);
            }
        });

        btnSearchAll.setText("Search all");
        btnSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAllActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearchEnable)
                        .addGap(47, 47, 47)
                        .addComponent(btnSearchDisable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchAll))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchEnable)
                    .addComponent(btnSearchDisable)
                    .addComponent(btnSearchAll))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAllActionPerformed
        setNullTable();
        String consult = "select * from user";
        List<User> users = repository.OpenList(consult);
        AddTable(users);
    }//GEN-LAST:event_btnSearchAllActionPerformed

    private void btnSearchDisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDisableActionPerformed
        setNullTable();
        String consult = "select * from user where status = 0";
        List<User> users = repository.OpenList(consult);
        AddTable(users);

    }//GEN-LAST:event_btnSearchDisableActionPerformed

    private void btnSearchEnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEnableActionPerformed
        setNullTable();
        String consult = "select * from user where status = 1";
        List<User> users = repository.OpenList(consult);
        AddTable(users);

    }//GEN-LAST:event_btnSearchEnableActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchAll;
    private javax.swing.JButton btnSearchDisable;
    private javax.swing.JButton btnSearchEnable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}
