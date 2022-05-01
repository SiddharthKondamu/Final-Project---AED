/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Police;

import BusinessModel.Ecosystem;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Bills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Puja
 */
public class PersonInfo extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
        JPanel userProcessContainer;
    Patient patient;
    Ecosystem ecoSystem;
    UserAccount account;
    public PersonInfo(JPanel userProcessContainer, Ecosystem business, Patient p,UserAccount account) {
        initComponents();
        this.ecoSystem = business;
        this.userProcessContainer = userProcessContainer;
        this.patient = p;
        this.account = account;
        txtFirstName.setText(p.getPatientFirstName());
        txtLastName.setText(p.getPatientLastName());
        txtAddress.setText(p.getPatientaddress());
        try{
        SimpleDateFormat input =new SimpleDateFormat("yyyy-MM-dd");
        txtAge.setText((input.format(p.getDateofBirth())));
        }
        catch(Exception e){}
        txtGender.setText(p.getGender());
        txtHealthInsuranceID.setText(p.getHealthInsuranceID());
        txtPhoneNumber.setText(p.getPatientPhoneNumber());
        txtInsuranceStatus.setText(p.getAccidentLocation());
        txtPoliceVerification.setText(p.getPoliceStatus());
        
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
        jSeparator1 = new javax.swing.JSeparator();
        lblPatientPhone = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtHealthInsuranceID = new javax.swing.JTextField();
        lblPatientHealthInsuranceID = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblPatientFirstName = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtPoliceVerification = new javax.swing.JTextField();
        lblPatientPhone1 = new javax.swing.JLabel();
        lblPatientHealthInsuranceID1 = new javax.swing.JLabel();
        txtInsuranceStatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERSON INFROMATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1720, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 1732, -1));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, -1));

        txtAddress.setEditable(false);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 165, -1));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 165, -1));

        txtHealthInsuranceID.setEditable(false);
        txtHealthInsuranceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthInsuranceIDActionPerformed(evt);
            }
        });
        add(txtHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 165, -1));

        lblPatientHealthInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setText("InsuranceID");
        add(lblPatientHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, -1));

        txtGender.setEditable(false);
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 165, -1));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 170, -1));

        txtPhoneNumber.setEditable(false);
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 165, -1));

        txtFirstName.setEditable(false);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 165, -1));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 165, -1));

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 165, -1));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("DOB");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 165, -1));

        txtLastName.setEditable(false);
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 165, -1));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 165, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Approve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 196, 47));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 196, 47));

        txtPoliceVerification.setEditable(false);
        add(txtPoliceVerification, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 171, 41));

        lblPatientPhone1.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientPhone1.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone1.setText("Police Verification");
        add(lblPatientPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, 31));

        lblPatientHealthInsuranceID1.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID1.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID1.setText("Accident Location");
        add(lblPatientHealthInsuranceID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, -1));

        txtInsuranceStatus.setEditable(false);
        txtInsuranceStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuranceStatusActionPerformed(evt);
            }
        });
        add(txtInsuranceStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 165, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/police_1_200x200.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 210, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtHealthInsuranceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthInsuranceIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtInsuranceStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuranceStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsuranceStatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        patient.setPoliceStatus("Verified");
        PoliceWorkAreaJPanel bill = new PoliceWorkAreaJPanel(userProcessContainer,account,ecoSystem);
        userProcessContainer.add("Police Workarea", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        patient.setPoliceStatus("Rejected");
        PoliceWorkAreaJPanel bill = new PoliceWorkAreaJPanel(userProcessContainer,account,ecoSystem);
        userProcessContainer.add("Police Workarea", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHealthInsuranceID;
    private javax.swing.JLabel lblPatientHealthInsuranceID1;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientPhone1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHealthInsuranceID;
    private javax.swing.JTextField txtInsuranceStatus;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPoliceVerification;
    // End of variables declaration//GEN-END:variables
}
