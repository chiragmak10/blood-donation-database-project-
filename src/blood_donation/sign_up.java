/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood_donation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 
 */
public class sign_up extends javax.swing.JFrame {
Connection con=null;
        Statement s=null;
        ResultSet rs=null;
    /**
     * Creates new form sign_up
     */
    public sign_up() {
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
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        jsignup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setAlignmentX(100.0F);
        jPanel1.setAlignmentY(100.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(35000, 21000));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        username.setText("Username :");
        jPanel1.add(username);
        username.setBounds(510, 190, 100, 30);

        password.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        password.setText("Password :");
        jPanel1.add(password);
        password.setBounds(510, 260, 90, 22);
        jPanel1.add(jusername);
        jusername.setBounds(647, 190, 190, 30);
        jPanel1.add(jpassword);
        jpassword.setBounds(647, 260, 190, 30);

        jsignup.setText("Sign Up");
        jsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsignupActionPerformed(evt);
            }
        });
        jPanel1.add(jsignup);
        jsignup.setBounds(620, 360, 90, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aishwarya\\Downloads\\geeks-2894621.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1460, 750);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 0, 2800, 2500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsignupActionPerformed
        con=Blood_donation.Connerdb();
        try
        {
            String query="insert into sign_up(username,password) values('"+jusername.getText()+"','"+jpassword.getText()+"')";
            s=con.createStatement();
            rs=s.executeQuery(query);
            
        }
        catch(Exception e)
        {
            
        }
        MainPage m=new MainPage();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jsignupActionPerformed

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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JButton jsignup;
    private javax.swing.JTextField jusername;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
