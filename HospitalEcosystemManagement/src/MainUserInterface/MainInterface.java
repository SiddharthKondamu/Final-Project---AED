package MainUserInterface;

import BusinessModel.Ecosystem;
import BusinessModel.DB4OUtil.DB4OUtil;
import BusinessModel.Pharmacy.Pharmacy;
import BusinessModel.Roles.RoleOfAmbulanceDriver;
import BusinessModel.Roles.RoleOfBloodBank;
import BusinessModel.Roles.RoleOfDoctorsAdministration;
import BusinessModel.Roles.RoleOfInsuranceAuthority;
import BusinessModel.Roles.RoleOfLab;
import BusinessModel.Roles.RoleOfPatient;
import BusinessModel.Roles.PharmacistRole;
import BusinessModel.Roles.PoliceRole;
import BusinessModel.Roles.RoleOfReception;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainInterface extends javax.swing.JFrame {
    private final Ecosystem system;
    private final DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainInterface() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
        system.getUserAccountDirectory().createUser("blood", "blood", null, new RoleOfBloodBank());
        system.getUserAccountDirectory().createUser("pharmacy", "pharmacy", null, new PharmacistRole());
        system.getUserAccountDirectory().createUser("insurance", "insurance", null, new RoleOfInsuranceAuthority());
        system.getUserAccountDirectory().createUser("ambulance", "ambulance", null, new RoleOfAmbulanceDriver());
        system.getUserAccountDirectory().createUser("lab", "lab", null, new RoleOfLab());
        system.getUserAccountDirectory().createUser("reception", "reception", null, new RoleOfReception());
        system.getUserAccountDirectory().createUser("police", "police", null, new PoliceRole());
        system.getUserAccountDirectory().createUser("doctor", "doctor", null, new RoleOfDoctorsAdministration());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 85, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginJButton.setBackground(new java.awt.Color(255, 255, 255));
        loginJButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 456, 118, 35));

        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 276, 118, 35));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 368, 118, 35));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 237, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 329, 108, -1));
        jPanel1.add(loginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 231, -1, -1));

        logoutJButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutJButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 533, 118, 35));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/Photos/login.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 130));

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/navyblue hospital.gif"))); // NOI18N
        container.add(jLabel4, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        try{
        User ua = system.getUserAccountDirectory().authenticateUser(userNameJTextField.getText(), passwordField.getText());
        CardLayout layout = (CardLayout) container.getLayout();
        container.add(ua.getRole().createWorkArea(container, ua, system));
        layout.next(container);
        logoutJButton.setEnabled(true);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"Username or Password is Incorrect!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        userNameJTextField.setText("");
        passwordField.setText("");
        
        Logout ua = new Logout(container);
        container.add("logout", ua);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        dB4OUtil.storeSystem(system);
        
        
        //container.removeAll();
        //JPanel blankJP = new JPanel();
        //container.add("blank", blankJP);
        //CardLayout crdLyt = (CardLayout) container.getLayout();
        //crdLyt.next(container);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
