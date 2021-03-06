/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.DoctorAdministration;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.Doctor.Doctor;
import BusinessModel.Ecosystem;
import BusinessModel.Roles.Doctor_role;
import BusinessModel.Roles.Patient_role;
import BusinessModel.UserAccount.User;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siddh
 */
public class UpdateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAdministratorWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    Doctor d;
    public UpdateDoctorJPanel(JPanel userProcessContainer,User user, Ecosystem system, Doctor d) {
        initComponents();
        this.userAccount = user;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.d=d;
        txtAddress.setText(d.getdAddress());
        txtAge.setText(Integer.toHexString(d.getdAge()));
        //txtDateOfBirth.setText(d.getDateofBirth());
        txtDoctorID.setText(d.getdWorkID());
        txtEmail.setText(d.getdEmail());
        txtExperience.setText(d.getdExperience());
        txtFirstName.setText(d.getdFirstName());
        txtLastName.setText(d.getdLastName());
        txtGender.setText(d.getdGender());
        txtPhoneNumber.setText(d.getdPhoneNumber());
        txtSpecialist.setText(d.getdSpecialization());
        txtUsername.setText(d.getdUserName());
        
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
        lblRestaurantName = new javax.swing.JLabel();
        lblRestaurantInfo = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblRestaurantName1 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblPhoneNumber1 = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        lblAddress1 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblRestaurantName2 = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblPhoneNumber2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress2 = new javax.swing.JLabel();
        txtSpecialist = new javax.swing.JTextField();
        lblAddress3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        txtExperience = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        doctorImageLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRestaurantName.setBackground(new java.awt.Color(0, 0, 0));
        lblRestaurantName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblRestaurantName.setForeground(new java.awt.Color(255, 255, 255));
        lblRestaurantName.setText("First Name");
        jPanel1.add(lblRestaurantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 113, -1));

        lblRestaurantInfo.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantInfo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblRestaurantInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblRestaurantInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestaurantInfo.setText("Update Doctor");
        jPanel1.add(lblRestaurantInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 22, 1154, -1));
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 170, 33));

        lblPhoneNumber.setBackground(new java.awt.Color(0, 0, 0));
        lblPhoneNumber.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("Last Name");
        jPanel1.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 101, -1));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 185, 30));

        lblAddress.setBackground(new java.awt.Color(0, 0, 0));
        lblAddress.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Age");
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 40, -1));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 170, 40));

        lblRestaurantName1.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantName1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblRestaurantName1.setForeground(new java.awt.Color(255, 255, 255));
        lblRestaurantName1.setText("Gender");
        jPanel1.add(lblRestaurantName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, 80, -1));

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        jPanel1.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 180, 30));

        lblPhoneNumber1.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber1.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber1.setText("Doctor Work ID");
        jPanel1.add(lblPhoneNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, -1, -1));

        txtDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 185, 33));

        lblAddress1.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress1.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress1.setText("Phone Number");
        jPanel1.add(lblAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 147, 30));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 170, 30));

        lblRestaurantName2.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantName2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblRestaurantName2.setForeground(new java.awt.Color(255, 255, 255));
        lblRestaurantName2.setText("Date of Birth");
        jPanel1.add(lblRestaurantName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, -1));

        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        jPanel1.add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 180, 30));

        lblPhoneNumber2.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber2.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber2.setText("Email");
        jPanel1.add(lblPhoneNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 170, 30));

        lblAddress2.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress2.setText("Specialist");
        jPanel1.add(lblAddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 640, -1, 30));

        txtSpecialist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialistActionPerformed(evt);
            }
        });
        jPanel1.add(txtSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 180, 30));

        lblAddress3.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress3.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress3.setText("Address");
        jPanel1.add(lblAddress3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 80, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 180, 30));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Experience");
        jPanel1.add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 110, 30));

        txtExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExperienceActionPerformed(evt);
            }
        });
        jPanel1.add(txtExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 650, 170, 30));

        txtUsername.setEditable(false);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 174, 33));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 115, 33));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 153, 204));
        btnSubmit.setText("Update");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 760, 140, 40));

        doctorImageLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        doctorImageLbl.setForeground(new java.awt.Color(255, 255, 255));
        doctorImageLbl.setText("doctor image");
        jPanel1.add(doctorImageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 160, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2897, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIDActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSpecialistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialistActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperienceActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
       d.setdFirstName(txtFirstName.getText());
        d.setdLastName(txtLastName.getText());
       d.setdAge(Integer.parseInt( txtAge.getText()));
        d.setdGender(txtGender.getText());
        d.setdWorkID(txtDoctorID.getText());
        d.setdAddress(txtAddress.getText());
        d.setdPhoneNumber(txtPhoneNumber.getText());
        //doctor.setDateofBirth(txtDateOfBirth.getText());
        d.setdEmail(txtEmail.getText());
        d.setdSpecialization(txtSpecialist.getText());
        d.setdExperience(txtExperience.getText());
        //d.setUserName(txtUsername.getText());
        JOptionPane.showMessageDialog(null, "Update Complete.");
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel doctorImageLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblAddress3;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPhoneNumber2;
    private javax.swing.JLabel lblRestaurantInfo;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblRestaurantName1;
    private javax.swing.JLabel lblRestaurantName2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtDoctorID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSpecialist;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
