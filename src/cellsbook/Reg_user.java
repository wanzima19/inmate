
package cellsbook;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRINCE
 */
public class Reg_user extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    
    
     public Reg_user() {
        initComponents();
           }
    /**
     * Creates new form Reg_user
     */
    

    private void Reset()
{
    id.setText("");
    us.setText("");
    ps.setText("");
    em.setText("");
    
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        ps = new javax.swing.JTextField();
        us = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INMATE SYSTEM ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USER REGISTRATION");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 51, 59, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 84, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 59, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 59, -1));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 48, 82, -1));
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 175, -1));
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 175, -1));
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 175, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 26, -1, 296));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellsbook/pic/admin pic.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 210, 210));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellsbook/admin pic.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 210, 200));

        update.setBackground(new java.awt.Color(204, 255, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 97, -1));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("NEW");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 97, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 97, -1));

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("SAVE ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 97, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(728, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
// type codes here for saving a new user
        try {
            if (id.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter ID ","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            if (us.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter User Name ","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
             if (ps.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter Password","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
          if (em.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter E_mail","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            con= Connection1.ConnectDB();
            String sql = "UPDATE  login SET usern=?, passw=?, email=? WHERE id =?";
                  
            PreparedStatement pstm = con.prepareStatement(sql);
           
            pstm.setString(1,us.getText());
            pstm.setString(2,ps.getText());
            pstm.setString(3,em.getText());
            pstm.setString(4,id.getText());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(this, "YOUR DATA UPDATED SUCCESSFULLY");
            
                  
        }
        catch(Exception ex)
        {
        JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
         Reset(); 
         
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// reset for new entry
        Reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         dispose();
        mainC m = new mainC();
        m.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            if (id.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter ID ","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            if (us.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter User Name ","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
             if (ps.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter Password","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
          if (em.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter E_mail","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            con= Connection1.ConnectDB();
            String sql = "INSERT into login "
                    +"(idd, usern, passw, email)"
                    +"value(?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,id.getText());
            pstm.setString(2,us.getText());
            pstm.setString(3,ps.getText());
            pstm.setString(4,em.getText());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(this, "YOUR DATA INSERTED SUCCESSFULLY");
            
                  
        }
        catch(Exception ex)
        {
        JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
         Reset(); 
         
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Reg_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg_user().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField em;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ps;
    private javax.swing.JButton update;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}