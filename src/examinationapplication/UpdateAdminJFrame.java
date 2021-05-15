/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationapplication;



import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Sayyed Abrar Akhtar
 */
public class UpdateAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateAdminJFrame
     */
    private static int adminId=5;
    javax.swing.ButtonGroup buttonGroup;
    MySQLConnect MySqlConn;
    public UpdateAdminJFrame() {
        initComponents();
        setLocationRelativeTo(null);  // *** center appearance of the app ***
        buttonGroup = new javax.swing.ButtonGroup();
        buttonGroup.add(jRadioButtonMale);
        buttonGroup.add(jRadioButtonFemale);
        buttonGroup.add(jRadioButtonOther);
        jRadioButtonFemale.setSelected(true);
        MySqlConn =  new MySQLConnect();
        loadData("test", "a");
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
        nameTxtField = new javax.swing.JTextField();
        emailTxtField = new javax.swing.JTextField();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonOther = new javax.swing.JRadioButton();
        contactTxtField = new javax.swing.JTextField();
        pswdPasswordField = new javax.swing.JPasswordField();
        cnfmpswdPasswordField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnUpdateAdmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButtonNavigator = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));
        jPanel1.setAutoscrolls(true);

        nameTxtField.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        nameTxtField.setName("nameTxtField"); // NOI18N

        emailTxtField.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        emailTxtField.setName("emailTxtField"); // NOI18N

        jRadioButtonFemale.setBackground(new java.awt.Color(41, 128, 185));
        jRadioButtonFemale.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.setName("jRadioButtonFemale"); // NOI18N

        jRadioButtonMale.setBackground(new java.awt.Color(41, 128, 185));
        jRadioButtonMale.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setName("jRadioButtonMale"); // NOI18N

        jRadioButtonOther.setBackground(new java.awt.Color(41, 128, 185));
        jRadioButtonOther.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jRadioButtonOther.setText("Other");
        jRadioButtonOther.setName("jRadioButtonOther"); // NOI18N

        contactTxtField.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        contactTxtField.setName("contactTxtField"); // NOI18N

        pswdPasswordField.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        pswdPasswordField.setName("pswdPasswordField"); // NOI18N

        cnfmpswdPasswordField.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        cnfmpswdPasswordField.setName("cnfmpswdPasswordField"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel9.setText("Confirm Password:");

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel8.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel6.setText("Contact:");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel4.setText("Email Id:");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("Full Name:");

        btnUpdateAdmin.setBackground(new java.awt.Color(41, 128, 185));
        btnUpdateAdmin.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnUpdateAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateAdmin.setText("Update");
        btnUpdateAdmin.setName("btnUpdateAdmin"); // NOI18N
        btnUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAdminActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("UPDATE ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonNavigator.setBackground(new java.awt.Color(44, 62, 80));
        jButtonNavigator.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNavigator.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNavigator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/undo2.png"))); // NOI18N
        jButtonNavigator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavigatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonFemale)
                                .addGap(45, 45, 45)
                                .addComponent(jRadioButtonMale)
                                .addGap(44, 44, 44)
                                .addComponent(jRadioButtonOther))
                            .addComponent(cnfmpswdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pswdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                    .addComponent(nameTxtField))))))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButtonNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnfmpswdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFemale)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonOther)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addComponent(btnUpdateAdmin)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNavigatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavigatorActionPerformed

        AdminLoginJFrame login = new AdminLoginJFrame();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNavigatorActionPerformed

    
    
    
    public Boolean updateAdmin(String Jframename, String Jframepassword, String JframeconfirmPassword, String Jframeemail, String Jframecontact) {
        String name = Jframename;
        String contact = Jframecontact;
        String email = Jframeemail;
        String password = Jframepassword;
        String confirmPassword = JframeconfirmPassword;
        String gender;
        
        if (jRadioButtonMale.isShowing()) {
            gender = "Male";
        } else if (jRadioButtonFemale.isShowing()) {
            gender = "Female";
        } else {
            gender = "Other";
        }
        if (pswdPasswordField.getText().equals(cnfmpswdPasswordField.getText())) {
            password = pswdPasswordField.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Password did not matched!!");
            pswdPasswordField.setText("");
            cnfmpswdPasswordField.setText("");
            pswdPasswordField.grabFocus();
            return false;
        } 
        Boolean isEmpty = isFieldEmpty(name, password, confirmPassword, email, contact);
 
        
        if (!isEmpty){
            
            	String query = "update admin set name = '" + name + "', email = '" + email + "', password = '" + password + "', gender = '" + gender + "', contact = '" + contact + "' where id =" +adminId;
                MySqlConn.executeSQLQuery(query, "Admin data updated ");
                System.out.println(query);
   
                return true;
            
        } 
        return false;
    }
 
    public Boolean isFieldEmpty(String name, String password, String confirmPassword, String email, String contact){
        
        if(name.trim().equals("") ||
           email.trim().equals("")||
           contact.trim().equals("")||
           password.trim().equals("")||
           confirmPassword.trim().equals("")
            )
        {
            JOptionPane.showMessageDialog(null, "All fields must be filled!!");
            return true;
        }
        return false;
    }   
    
    private void btnUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAdminActionPerformed
    	
    	
    	String name = nameTxtField.getText();
        String contact = contactTxtField.getText();
        String email = emailTxtField.getText();
        String password = pswdPasswordField.getText();
        String confirmPassword = cnfmpswdPasswordField.getText();
    	Boolean admin = updateAdmin(name, password, confirmPassword, email, contact);
        if (admin){
            clearControls();
            AdminLoginJFrame login = new AdminLoginJFrame();
            login.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_btnUpdateAdminActionPerformed


    
        
    private void clearControls(){
        nameTxtField.setText("");
        emailTxtField.setText("");
        contactTxtField.setText("");
        pswdPasswordField.setText("");
        cnfmpswdPasswordField.setText("");
        buttonGroup.clearSelection();
    }
        
    public void loadData(String username, String password) {
        
        
       String query = "select * from admin where username = '" + username + "' and password = '" + password + "'";
       ResultSet resultset;
       
       try {
            resultset = MySqlConn.retrieveData(query);
            if (resultset.next()) {
            adminId = resultset.getInt("id");
            String name = resultset.getString("name");
            String email = resultset.getString("email");
            String contact = resultset.getString("contact");
            nameTxtField.setText(name);
            emailTxtField.setText(email);
            contactTxtField.setText(contact);
            pswdPasswordField.setText("");
            cnfmpswdPasswordField.setText("");
            jRadioButtonMale.setSelected(true);
           }   
       } catch (SQLException e) {
           System.out.println("Admin details not retrieved: " + e);
       }
    }
    
     

     
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateAdmin;
    private javax.swing.JPasswordField cnfmpswdPasswordField;
    private javax.swing.JTextField contactTxtField;
    private javax.swing.JTextField emailTxtField;
    private javax.swing.JButton jButtonNavigator;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOther;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JPasswordField pswdPasswordField;
    // End of variables declaration//GEN-END:variables

    
    
   
}