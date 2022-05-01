/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.DoctorAdministration;

import BusinessModel.Doctor.Doctor;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Ambulance.DisplayAmbulancePatientJPanel;

/**
 *
 * @author siddh
 */
public class DisplayPatientInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayPatientInfoJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    private final Patient patient;
    User userAccount;

    public DisplayPatientInfoJPanel(JPanel userProcessContainer, User account, Ecosystem system, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        this.patient = patient;
        populateNetworkTable();
        populatePatientInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPhoneNumber = new javax.swing.JTextField();
        txtInjuryType = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        lblPhoneNumber5 = new javax.swing.JLabel();
        lblPatientFirstName = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        txtDateOfAdmit = new javax.swing.JTextField();
        txtPatientStatus = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        lblPatientPhone = new javax.swing.JLabel();
        lblDisplayPatient = new javax.swing.JLabel();
        lblAddress4 = new javax.swing.JLabel();
        btnAssignDoctor = new javax.swing.JButton();
        lblPatientStatus = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        lblPhotoImage = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 150, 30));

        txtInjuryType.setEditable(false);
        txtInjuryType.setBackground(new java.awt.Color(255, 255, 255));
        txtInjuryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInjuryTypeActionPerformed(evt);
            }
        });
        add(txtInjuryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 150, 30));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("Age");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        lblPhoneNumber5.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber5.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setText("Date of Admit ");
        add(lblPhoneNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, 20));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        txtDateOfBirth.setEditable(false);
        txtDateOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 140, 30));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        txtFirstName.setEditable(false);
        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 160, 30));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Date of Birth");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, 20));

        txtAddress.setEditable(false);
        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 160, 70));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 150, 30));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        txtBloodGroup.setEditable(false);
        txtBloodGroup.setBackground(new java.awt.Color(255, 255, 255));
        txtBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupActionPerformed(evt);
            }
        });
        add(txtBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 150, 30));

        txtDateOfAdmit.setEditable(false);
        txtDateOfAdmit.setBackground(new java.awt.Color(255, 255, 255));
        txtDateOfAdmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfAdmitActionPerformed(evt);
            }
        });
        add(txtDateOfAdmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 160, 30));

        txtPatientStatus.setEditable(false);
        txtPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientStatusActionPerformed(evt);
            }
        });
        add(txtPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 150, 30));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        lblDisplayPatient.setBackground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblDisplayPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayPatient.setText("Patient Details");
        add(lblDisplayPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 900, 82));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Blood Group");
        add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, 20));

        btnAssignDoctor.setBackground(new java.awt.Color(255, 255, 255));
        btnAssignDoctor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAssignDoctor.setForeground(new java.awt.Color(0, 153, 204));
        btnAssignDoctor.setText("Assign Doctor");
        btnAssignDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDoctorActionPerformed(evt);
            }
        });
        add(btnAssignDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 810, -1, 48));

        lblPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setText("Patient Status");
        add(lblPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, 20));

        txtGender.setEditable(false);
        txtGender.setBackground(new java.awt.Color(255, 255, 255));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 140, 30));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber4.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setText("Injury Type");
        add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, 20));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 130, 30));

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 170, 30));

        DoctorTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        DoctorTable.getTableHeader().setFont(new java.awt.Font("Trebuchet", 1, 16));
        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Health ID", "Experience", "Age", "Gender", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 1400, 170));

        lblPhotoImage.setText("Patient Image");
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 160, 200, 200));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 120, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Available doctors");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 360, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtInjuryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInjuryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInjuryTypeActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodGroupActionPerformed

    private void txtDateOfAdmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfAdmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfAdmitActionPerformed

    private void txtPatientStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientStatusActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPatientStatusActionPerformed

    private void btnAssignDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDoctorActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = DoctorTable.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            Doctor doctor = (Doctor) DoctorTable.getValueAt(selectedRowIndex, 0);
            ecoSystem.getDoctorDirectory().AddPatient(doctor, patient);
            JOptionPane.showMessageDialog(null, "Doctor Assigned", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAssignDoctorActionPerformed
    
    
    
    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        DoctorAdminWorkArea doctorAdminWorkArea = new DoctorAdminWorkArea(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Admin Work Panel", doctorAdminWorkArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();

        model.setRowCount(0);

        for (Doctor Doctor : ecoSystem.getDoctorDirectory().getDoctors()) {

            Object[] row = new Object[9];
            row[0] = Doctor;
            row[1] = Doctor.getdLastName();
            row[2] = Doctor.getdWorkID();
            row[3] = Doctor.getdAddress();
            row[4] = Doctor.getdAge();
            row[5] = Doctor.getdGender();
            row[6] = Doctor.getdEmail();

            model.addRow(row);

        }
    }

     private void populatePatientInfo() {
        
        txtFirstName.setText(patient.getpFirstName());
        txtLastName.setText(patient.getpLastName());
        txtAge.setText(Integer.toString(patient.getpAge()));
        txtGender.setText(patient.getpGender());
        txtAddress.setText(patient.getpAddress());
        txtPhoneNumber.setText(patient.getpPhoneNo());
        txtEmail.setText(patient.getpEmailAddress());
        if(patient.getPdob()!= null)
        {
            txtDateOfBirth.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getPdob()));
        }
        if(patient.getpDateOfAdmit()!= null)
        {
            txtDateOfAdmit.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getPdob()));
        }
        
        txtInjuryType.setText(patient.getpInjuryType());
        txtBloodGroup.setText(patient.getpBloodType());
        txtPatientStatus.setText(patient.getpStatus());
        
        ImageIcon ii = new ImageIcon(patient.getpImageUrl());
        Image image = ii.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        lblPhotoImage.setIcon(new ImageIcon(image));


    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JButton btnAssignDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDisplayPatient;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientStatus;
    private javax.swing.JLabel lblPhoneNumber4;
    private javax.swing.JLabel lblPhoneNumber5;
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtDateOfAdmit;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtInjuryType;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPatientStatus;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

}
