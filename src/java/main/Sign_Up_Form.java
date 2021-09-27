package main;

import java.sql.*;
import java.util.regex.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Sign_Up_Form extends javax.swing.JFrame {
    public static boolean valid = false;

    /**
     * Creates new form Login_form
     */
    public void validate_email(String email)
    {
        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);

        if (m.find())
            valid= true;
    }
    
    public Sign_Up_Form() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        Uname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        show_password = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        conform_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN-UP PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 87, 500, 61));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 306, 56));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("EMAIL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 357, 78));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 357, 68));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CONFORM PASSWORD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 491, 350, 70));

        submit.setBackground(new java.awt.Color(255, 204, 0));
        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 172, 57));
        getContentPane().add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 280, 64));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 278, 280, 70));

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("BACK TO HOME PAGE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 230, 50));

        show_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show_password.setText("show password");
        show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(show_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 180, 30));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 270, 60));
        getContentPane().add(conform_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 270, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String name1=Uname.getText();
        String email1=email.getText();
        validate_email(email1);
        String pass1= password.getText();
        String cpass1=conform_password.getText();
        System.out.print(pass1+""+cpass1);
        if(!valid)
        {
            JOptionPane.showMessageDialog(null,"<html><h1><span style=\"color:red font:-size:10px\">TYPE CORRECT EMAIL ADDRESS<span></h1><html>","ALERT",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            

            if(pass1.equals(cpass1))
        {
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
            Statement st = conn.createStatement();
            //st.executeUpdate("create table login_record (u_name varchar(20),password varchar(20),email varchar(20))");
            //System.out.println("TAble is created");
            //st.executeUpdate("insert into std values(name1,pass1,email)");
            
            //insert user record into database
            PreparedStatement ps=conn.prepareStatement("insert into login_record1 (u_name,password,email)values(?,?,?)");
            ps.setString(1,name1);
            ps.setString(2,pass1);
            ps.setString(3,email1);
            ps.executeUpdate();
            


            }catch(Exception e){
                System.out.print(e);
            }
            System.out.print("");
            int i = JOptionPane.showConfirmDialog(null,"<html><h1><span style=\"font:-size:10px\"><B>Account created Successful<br>USERNAME:</B>"+name1+"<br><B>PASSWORD:</B>"+pass1+"<span></h1><html>","AUTHETICATION",JOptionPane.OK_OPTION);
            if(i==0)
            {
                setVisible(false);
                new Login_form().setVisible(true);    //directing to the Login_form
            }
            else
            {
                submit.setEnabled(false);
            }
        }
        else
        {
            //check if  password and conform password are same or not
            JOptionPane.showMessageDialog(null,"<html><h1><span style=\"color:red font:-size:10px\">Password and conform password must be match<span></h1><html>","ALERT",JOptionPane.ERROR_MESSAGE);
            
        }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login_form().setVisible(true);   //directing to the Login_form
    }//GEN-LAST:event_backActionPerformed

    private void show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passwordActionPerformed
        // TODO add your handling code here:
        if(show_password.isSelected())
        {
            password.setEchoChar((char)0);
        }
        else
        {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_show_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_Up_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Uname;
    private javax.swing.JButton back;
    private javax.swing.JPasswordField conform_password;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show_password;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}