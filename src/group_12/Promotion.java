/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_12;

/**
 *
 * @author GENIUS
 */
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static group_12.DormitoryRentingSystem.my;
import javax.swing.JOptionPane;
public class Promotion extends javax.swing.JFrame {

  

    /**
     * Creates new form Promotion
     */
    public Promotion() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        promotion_id_TextField = new javax.swing.JTextField();
        start_date_TextField = new javax.swing.JTextField();
        exp_date_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menu_Button = new javax.swing.JButton();
        delete_Button = new javax.swing.JButton();
        find_Button = new javax.swing.JButton();
        insert_Button = new javax.swing.JButton();
        show_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        promotion_Table = new javax.swing.JTable();
        update_Button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        detail_TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        price_TextField = new javax.swing.JTextField();
        clear_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Promotion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("promotion_id");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("start_date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("exp_date");

        menu_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        menu_Button.setText("menu");
        menu_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_ButtonMouseClicked(evt);
            }
        });

        delete_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        delete_Button.setText("delete");
        delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ButtonActionPerformed(evt);
            }
        });

        find_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        find_Button.setText("find");
        find_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_ButtonActionPerformed(evt);
            }
        });

        insert_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        insert_Button.setText("insert");
        insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_ButtonActionPerformed(evt);
            }
        });

        show_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        show_Button.setText("show");
        show_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_ButtonActionPerformed(evt);
            }
        });

        promotion_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "promotion_id", "start_date", "exp_date", "price", "detail"
            }
        ));
        jScrollPane1.setViewportView(promotion_Table);

        update_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        update_Button.setText("update");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("detail");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("price");

        clear_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        clear_Button.setText("clear");
        clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu_Button)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exp_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(start_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(promotion_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(detail_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clear_Button)
                                .addGap(18, 18, 18)
                                .addComponent(show_Button)
                                .addGap(18, 18, 18)
                                .addComponent(insert_Button)
                                .addGap(18, 18, 18)
                                .addComponent(update_Button)
                                .addGap(18, 18, 18)
                                .addComponent(delete_Button)
                                .addGap(18, 18, 18)
                                .addComponent(find_Button))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menu_Button)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(promotion_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(start_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exp_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(detail_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(find_Button)
                    .addComponent(delete_Button)
                    .addComponent(update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ButtonMouseClicked
        menu m = new menu();
        m.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_menu_ButtonMouseClicked

    private void clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_ButtonActionPerformed
        promotion_id_TextField.setText("");
        start_date_TextField.setText("");
        exp_date_TextField.setText("");
        price_TextField.setText("");
        detail_TextField.setText("");
    }//GEN-LAST:event_clear_ButtonActionPerformed

    private void show_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_ButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) promotion_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("promotion");
            while (rs.next()) {
                String promotion_id = rs.getString("pro_id");
                String start_date = rs.getString("start_date");
                String exp_date = rs.getString("exp_date");
                String price = rs.getString("price");
                String detail = rs.getString("detail");
                model.addRow(new String[]{promotion_id, start_date, exp_date, price, detail});
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }

    }//GEN-LAST:event_show_ButtonActionPerformed

    private void insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_ButtonActionPerformed
        String promotion_id = promotion_id_TextField.getText();
        String start_date = start_date_TextField.getText();
        String exp_date = exp_date_TextField.getText();
        String price = price_TextField.getText();
        String detail = detail_TextField.getText();
        try {if(my.insertPromotionData(promotion_id, start_date,exp_date,price,detail)) {
            DefaultTableModel model = (DefaultTableModel) promotion_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("promotion");
            while (rs.next()) {
                String ppromotion_id = rs.getString("pro_id");
                String sstart_date = rs.getString("start_date");
                String eexp_date = rs.getString("exp_date");
                String pprice = rs.getString("price");
                String ddetail = rs.getString("detail");
                model.addRow(new String[]{ppromotion_id, sstart_date, eexp_date, pprice, ddetail});}
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_insert_ButtonActionPerformed

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
        String promotion_id = promotion_id_TextField.getText();
        try {if(my.deletePromotionData(promotion_id)) {
            DefaultTableModel model = (DefaultTableModel) promotion_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("promotion");
            while (rs.next()) {
                String ppromotion_id = rs.getString("pro_id");
                String sstart_date = rs.getString("start_date");
                String eexp_date = rs.getString("exp_date");
                String pprice = rs.getString("price");
                String ddetail = rs.getString("detail");
                model.addRow(new String[]{ppromotion_id, sstart_date, eexp_date, pprice, ddetail});}
            }JOptionPane.showMessageDialog(null,"DELETE" );
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_delete_ButtonActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        String promotion_id = promotion_id_TextField.getText();
        String start_date = start_date_TextField.getText();
        String exp_date = exp_date_TextField.getText();
        String price = price_TextField.getText();
        String detail = detail_TextField.getText();
        try {if(my.updatePromotionData(promotion_id, start_date,exp_date,price,detail)) {
            DefaultTableModel model = (DefaultTableModel) promotion_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("promotion");
            while (rs.next()) {
                String ppromotion_id = rs.getString("pro_id");
                String sstart_date = rs.getString("start_date");
                String eexp_date = rs.getString("exp_date");
                String pprice = rs.getString("price");
                String ddetail = rs.getString("detail");
                model.addRow(new String[]{ppromotion_id, sstart_date, eexp_date, pprice, ddetail});}
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_update_ButtonActionPerformed

    private void find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_ButtonActionPerformed
         String promotion_id = promotion_id_TextField.getText();

        try {
            DefaultTableModel model = (DefaultTableModel) promotion_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("promotion where pro_id = '"+promotion_id+"'");
            while (rs.next()) {
                String ppromotion_id = rs.getString("pro_id");
                String start_date = rs.getString("start_date");
                String exp_date = rs.getString("exp_date");
                String price = rs.getString("price");
                String detail = rs.getString("detail");
                model.addRow(new String[]{ppromotion_id, start_date, exp_date, price, detail});
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_find_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Promotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promotion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_Button;
    private javax.swing.JButton delete_Button;
    private javax.swing.JTextField detail_TextField;
    private javax.swing.JTextField exp_date_TextField;
    private javax.swing.JButton find_Button;
    private javax.swing.JButton insert_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu_Button;
    private javax.swing.JTextField price_TextField;
    private javax.swing.JTable promotion_Table;
    private javax.swing.JTextField promotion_id_TextField;
    private javax.swing.JButton show_Button;
    private javax.swing.JTextField start_date_TextField;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
