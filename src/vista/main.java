/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import config.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abner
 */
public class main extends javax.swing.JFrame {
    conexion con = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id = 0;
    public main() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textReference = new javax.swing.JTextField();
        textPrdName = new javax.swing.JTextField();
        textPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textWeight = new javax.swing.JTextField();
        textCategory = new javax.swing.JTextField();
        textStock = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        btnClearForm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cafeteria-almacen");

        jPanel1.setToolTipText("Datos");

        jLabel2.setText("PRODUCT NAME:");

        jLabel3.setText("REFERENCE:");

        jLabel4.setText("PRICE:");

        textReference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textReferenceActionPerformed(evt);
            }
        });

        textPrdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrdNameActionPerformed(evt);
            }
        });

        textPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPriceActionPerformed(evt);
            }
        });

        jLabel5.setText(" WEIGHT");

        jLabel6.setText("CATEGORY");

        jLabel7.setText("STOCK");

        textWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textWeightActionPerformed(evt);
            }
        });

        textCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCategoryActionPerformed(evt);
            }
        });

        textStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStockActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDelete.setBackground(java.awt.Color.red);
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        BtnUpdate.setText("UPDATE");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        btnClearForm.setText("VENDER");
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        jButton2.setText("MAS STOCK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MAS VENDIDO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreate)
                .addGap(7, 7, 7)
                .addComponent(btnDelete)
                .addGap(14, 14, 14)
                .addComponent(BtnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClearForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnDelete)
                    .addComponent(BtnUpdate)
                    .addComponent(btnClearForm)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textReference, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPrdName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel6)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textStock, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textReference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(textWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(textStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Product Name", "Reference", "Price", " weighl", " category", "stock", "Date"
            }
        ));
        tableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableList);
        if (tableList.getColumnModel().getColumnCount() > 0) {
            tableList.getColumnModel().getColumn(0).setMinWidth(30);
            tableList.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableList.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textReferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textReferenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textReferenceActionPerformed

    private void textPrdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrdNameActionPerformed

    private void textPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPriceActionPerformed

    private void textWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textWeightActionPerformed

    private void textCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCategoryActionPerformed

    private void textStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStockActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        create();
        listar();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        update();
        listar();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        sell();
    }//GEN-LAST:event_btnClearFormActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        moreStock();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        moreSell();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseClicked
        int fila=tableList.getSelectedRow();
        if(fila==-1){
            JOptionPane.showConfirmDialog(null, "usuario no seleccionado");
        }else{
            id = Integer.parseInt((String)tableList.getValueAt(fila,0).toString());
            String name=(String)tableList.getValueAt(fila,1);
            int ref= Integer.parseInt((String)tableList.getValueAt(fila,2).toString());
            int price= Integer.parseInt((String)tableList.getValueAt(fila,3).toString());
            int wei= Integer.parseInt((String)tableList.getValueAt(fila,4).toString());
            int cat= Integer.parseInt((String)tableList.getValueAt(fila,5).toString());
            int stock= Integer.parseInt((String)tableList.getValueAt(fila,6).toString());
            
            textPrdName.setText(name);
            textReference.setText(""+ref);
            textPrice.setText(""+price);
            textWeight.setText(""+wei);
            textCategory.setText(""+cat);
            textStock.setText(""+stock);
        }
    }//GEN-LAST:event_tableListMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
        listar();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    
    void listar(){
        String sql = "select * from producto";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]producto = new Object[8];
            modelo = (DefaultTableModel)tableList.getModel();
            while (rs.next()) {
                producto[0] = rs.getInt("Id");
                producto[1] = rs.getString("productName");
                producto[2] = rs.getInt("reference");
                producto[3] = rs.getInt("price");
                producto[4] = rs.getInt("weight");
                producto[5] = rs.getInt("category");
                producto[6] = rs.getInt("stock");
                producto[7] = rs.getDate("Fecha");
                modelo.addRow(producto);
            }
            tableList.setModel(modelo);
        } catch (Exception e) {
        }
    }
    
    void create(){
        String name = textPrdName.getText();
        String ref = textReference.getText();
        String price = textPrice.getText();
        String wei = textWeight.getText();
        String cat = textCategory.getText();
        String stock = textStock.getText();
        
        if (name.equals("") || ref.equals("") || price.equals("") || wei.equals("") || cat.equals("") || stock.equals("")){
            JOptionPane.showMessageDialog(null, "Verifica que todos los datos esten diligenciados");
        }else{
            String sql = "insert into producto (productName,reference,price,weight,category,stock) values ('"+name+"','"+ref+"',"
                    + "'"+price+"','"+wei+"','"+cat+"','"+stock+"')";
            
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpiarTabla();
            } catch (Exception e) {
                System.err.println("Error:"+e);
            }
        }
    }
    
    void delete(){
        String sql = "delete from producto where id ="+id;
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            limpiarTabla();

        } catch (Exception e) {
            System.err.println("Error:"+e);
        }
    }
    
    void limpiarTabla(){
        for(int i = 0;i<=tableList.getRowCount();i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    void update(){
        String name = textPrdName.getText();
        String ref = textReference.getText();
        String price = textPrice.getText();
        String wei = textWeight.getText();
        String cat = textCategory.getText();
        String stock = textStock.getText();
        
        if (name.equals("") || ref.equals("") || price.equals("") || wei.equals("") || cat.equals("") || stock.equals("")){
            JOptionPane.showMessageDialog(null, "Verifica que todos los datos esten diligenciados");
        }else{
            String sql = "update producto set productName = '"+name+"', reference = '"+ref+"', price = '"+price+"', weight = '"+wei+"', category = '"+cat+"', stock = '"+stock+"' where id ="+id;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpiarTabla();

            } catch (Exception e) {
                System.err.println("Error:"+e);
            }
        }   
    }
    
    void sell(){
        String can = JOptionPane.showInputDialog("Ingrese la cantidad de el producto");
        String sql = "select stock, productName from producto where id = "+ id;
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]producto = new Object[2];
            while (rs.next()) {
                producto[0] = rs.getInt("stock");
                producto[1] = rs.getString("productName");
            }
            int stock = Integer.parseInt((String)producto[0].toString());
            int cant = Integer.parseInt((String)can.toString());
            if(stock >= cant){
                vender(stock, cant);
                listar();
            }else{
                JOptionPane.showMessageDialog(null, "Ya no hay productos disponible de la referencia "+ producto[1]);
            }

        } catch (Exception e) {
            
        }
    }
    
    void vender(int stock, int cant){                        
        String sql = "insert into ventas (idProducto,cantidad) values ('"+id+"','"+cant+"')";

        try {
            cn = con.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            removeStock(stock, cant);
        } catch (Exception e){
             System.err.println("Error:"+e);
        }
    }
    
    void removeStock(int stock, int cant){
        int reduce = stock - cant;
        String sql = "update producto set stock = '"+reduce+"' where id ="+id;
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            limpiarTabla();

        } catch (Exception e) {
            System.err.println("Error:"+e);
        }
    }
    
    void moreStock(){
        String sql = "select stock, productName from producto group by stock having max(stock)";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]producto = new Object[2];
            while (rs.next()) {
                producto[0] = rs.getInt("stock");
                producto[1] = rs.getString("productName");
            }
            JOptionPane.showMessageDialog(null, "El producto con mas stock es "+producto[1]+" con "+producto[0]+" en bodega");
        } catch (Exception e) {
        }
    }
    
    void moreSell(){
        String sql = "select sum(v.cantidad) as cantidad, p.productName from ventas as v inner join producto as p on v.idProducto = p.id group by p.id having max(cantidad) order by cantidad desc limit 1";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]producto = new Object[2];
            while (rs.next()) {
                producto[0] = rs.getInt("cantidad");
                producto[1] = rs.getString("productName");
            }
            JOptionPane.showMessageDialog(null, "El producto mas vendido es "+producto[1]+" con "+producto[0]+"");
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableList;
    private javax.swing.JTextField textCategory;
    private javax.swing.JTextField textPrdName;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textReference;
    private javax.swing.JTextField textStock;
    private javax.swing.JTextField textWeight;
    // End of variables declaration//GEN-END:variables
}
