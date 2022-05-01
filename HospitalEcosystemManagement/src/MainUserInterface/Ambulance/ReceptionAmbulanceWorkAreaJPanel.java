/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.Ambulance;

import BusinessModel.Ambulance.Ambulance;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.Roles.Patient_role;
import BusinessModel.UserAccount.User;
import BusinessUtil.GoogleMaps.GoogleMapsAmbulanceJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import MainUserInterface.ReceptionRole.ReceptionWorkAreaJPanel;

/**
 *
 * @author ronitchougule
 */
public class ReceptionAmbulanceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionAmbulanceWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    Ambulance ambulance;

    public ReceptionAmbulanceWorkAreaJPanel(JPanel userProcessContainer, Ecosystem ecoSystem, User userAccount, Ambulance ambulance) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.ambulance = ambulance;
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
        lblPatientFirstName = new javax.swing.JLabel();
        txtPatientFirstName = new javax.swing.JTextField();
        lblPatientLocation = new javax.swing.JLabel();
        txtPatientLocation = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblPatientLastName = new javax.swing.JLabel();
        txtPatientLastName = new javax.swing.JTextField();
        lblPatientUserName = new javax.swing.JLabel();
        lblPatientPassword = new javax.swing.JLabel();
        txtPatientPassword = new javax.swing.JTextField();
        txtPatientUserName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Route_JButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER AN EMERGENCY");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1432, 80));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("Patient First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));
        add(txtPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 250, 30));

        lblPatientLocation.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLocation.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLocation.setText("Patient Location");
        add(lblPatientLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 174, -1));

        txtPatientLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientLocationActionPerformed(evt);
            }
        });
        add(txtPatientLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 250, 30));

        btnSubmit.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 153, 204));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 698, 154, 40));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Patient Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));
        add(txtPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 250, 30));

        lblPatientUserName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientUserName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientUserName.setText("Patient User Name");
        add(lblPatientUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, 20));

        lblPatientPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPassword.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPassword.setText("Patient Password");
        add(lblPatientPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, -1, -1));
        add(txtPatientPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 250, 30));
        add(txtPatientUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 250, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1432, 10));

        Route_JButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        Route_JButton.setForeground(new java.awt.Color(0, 153, 204));
        Route_JButton.setText("VIEW ROUTE");
        Route_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Route_JButtonActionPerformed(evt);
            }
        });
        add(Route_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 530, 180, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/emergency.gif"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 540, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientLocationActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (ecoSystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtPatientUserName.getText())) {
            
            Patient patient = new Patient(txtPatientUserName.getText());
            patient.setpFirstName(txtPatientFirstName.getText());
            patient.setpLastName(txtPatientLastName.getText());
            patient.setpAccidentLocation(txtPatientLocation.getText());
            patient.setpStatus("NewPatient");
            patient.setpBloodBankStatus("NewPatient");
            patient.setpPharmaStatus("NewPatient");
            patient.setpLabStatus("NewPatient");
            patient.setpDateOfAdmit(java.util.Calendar.getInstance().getTime());
            ambulance.setStatus("Busy");
            ambulance.setAccidentLocation(txtPatientLocation.getText());
            ambulance.getAmbulancePatientsList().add(patient);

            ecoSystem.getUserAccountDirectory().createUser(txtPatientUserName.getText(), txtPatientPassword.getText(), null, new Patient_role());
            ecoSystem.getPatientDirectory().createPatient(patient);
            for (Patient p : ecoSystem.getPatientDirectory().getPatientList()) {
                if (p.getpUserName().equals(txtPatientUserName.getText())) {
                    ecoSystem.getPatientDirectory().AddBill(p, "Bed Charge", "Hospital", "Ammount");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username is not Unique.");
        }
        
        JOptionPane.showMessageDialog(null, "Help Is On The Way");
        
        ReceptionWorkAreaJPanel receptionWorkAreaJPanel = new ReceptionWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Reception Work Area", receptionWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void Route_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Route_JButtonActionPerformed
        // TODO add your handling code here:
       /*ReceptionWorkAreaJPanel receptionWorkAreaJPanel = new ReceptionWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Reception Work Area", receptionWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        */
       GoogleMapsAmbulanceJPanel GoogleMapsWorkAreaJPanel = new GoogleMapsAmbulanceJPanel(userProcessContainer, ecoSystem, userAccount, ambulance, txtPatientLocation.getText());
        userProcessContainer.add("Google Maps Work Area", GoogleMapsWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_Route_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Route_JButton;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientLocation;
    private javax.swing.JLabel lblPatientPassword;
    private javax.swing.JLabel lblPatientUserName;
    private javax.swing.JTextField txtPatientFirstName;
    private javax.swing.JTextField txtPatientLastName;
    private javax.swing.JTextField txtPatientLocation;
    private javax.swing.JTextField txtPatientPassword;
    private javax.swing.JTextField txtPatientUserName;
    // End of variables declaration//GEN-END:variables
}
