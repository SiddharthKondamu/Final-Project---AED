/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.ReceptionRole;


import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.Roles.Patient_role;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sahilmattoo
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientPanel
     */
    private final JPanel userProcessContainer;

    private final Ecosystem ecoSystem;
    User userAccount;
    String globalSelectedImagePath;
    Boolean IsconcentFormSigned;

    public CreatePatientJPanel(JPanel userProcessContainer, Ecosystem system, User user) {

        initComponents();
        this.userAccount = user;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        globalSelectedImagePath = "";
        IsconcentFormSigned = false;

        GenderComboBox.removeAllItems();
        GenderComboBox.addItem("Male");
        GenderComboBox.addItem("Female");
        GenderComboBox.addItem("Other");

        BloodGroupComboBox.removeAllItems();
        BloodGroupComboBox.addItem("A+");
        BloodGroupComboBox.addItem("A-");
        BloodGroupComboBox.addItem("B+");
        BloodGroupComboBox.addItem("B-");
        BloodGroupComboBox.addItem("O+");
        BloodGroupComboBox.addItem("O-");
        BloodGroupComboBox.addItem("AB+");
        BloodGroupComboBox.addItem("AB-");
        Date today = new Date();
        txtDOB.setDate(today);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatientFirstName = new javax.swing.JLabel();
        lblRestaurantInfo = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        lblPatientHealthInsuranceID = new javax.swing.JLabel();
        txtHealthInsuranceID = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPatientPhone = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        txtInjuryType = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        lblRestaurantName4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblRestaurantName5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jRadioCash = new javax.swing.JRadioButton();
        jRadioInsurance = new javax.swing.JRadioButton();
        btnBrowse = new javax.swing.JButton();
        lblPhotoImage = new javax.swing.JLabel();
        lblPaymentMethod = new javax.swing.JLabel();
        GenderComboBox = new javax.swing.JComboBox<>();
        BloodGroupComboBox = new javax.swing.JComboBox<>();
        lblAccidentLocation = new javax.swing.JLabel();
        txtAccidentLocation = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblErrorFname = new javax.swing.JLabel();
        lblErrorLname = new javax.swing.JLabel();
        lblErrorHId = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        lblErrorInjury = new javax.swing.JLabel();
        lblErrorUserName = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorAccidentLocation = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnSubmit1 = new javax.swing.JButton();
        lblPaymentMethod1 = new javax.swing.JLabel();
        txtDOB = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblRestaurantInfo.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantInfo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        lblRestaurantInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblRestaurantInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestaurantInfo.setText("Create Patient");
        add(lblRestaurantInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1394, 82));

        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, 40));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 110, 40));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPatientGender.setText("Sex");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        lblPatientHealthInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID.setText("Insurance Id");
        add(lblPatientHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, -1));

        txtHealthInsuranceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthInsuranceIDActionPerformed(evt);
            }
        });
        txtHealthInsuranceID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHealthInsuranceIDKeyReleased(evt);
            }
        });
        add(txtHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 110, 40));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPatientAddress.setText("Patient address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 140, 20));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 130, 40));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPatientPhone.setText("Mobile Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 130, 40));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDOB.setText("Date of Birth");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 40));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblEmail.setText("Email address");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 130, 40));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblAddress4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress4.setText("Blood Type");
        add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 116, -1));

        txtInjuryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInjuryTypeActionPerformed(evt);
            }
        });
        txtInjuryType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInjuryTypeKeyReleased(evt);
            }
        });
        add(txtInjuryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 150, 40));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPhoneNumber4.setText("Injury Type");
        add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        lblRestaurantName4.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantName4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblRestaurantName4.setText("UserName");
        add(lblRestaurantName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, -1, -1));

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 216, 150, 40));

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 660, 159, 46));

        lblRestaurantName5.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantName5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblRestaurantName5.setText("Password");
        add(lblRestaurantName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 300, -1, -1));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 150, 40));

        jRadioCash.setBackground(new java.awt.Color(255, 255, 255));
        jRadioCash.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jRadioCash.setText("Cash Payment");
        jRadioCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCashActionPerformed(evt);
            }
        });
        add(jRadioCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, -1, -1));

        jRadioInsurance.setBackground(new java.awt.Color(255, 255, 255));
        jRadioInsurance.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jRadioInsurance.setText("Insurance ");
        jRadioInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInsuranceActionPerformed(evt);
            }
        });
        add(jRadioInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        btnBrowse.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 100, 40));
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 160, 140));

        lblPaymentMethod.setBackground(new java.awt.Color(255, 255, 255));
        lblPaymentMethod.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblPaymentMethod.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentMethod.setText("Login Credentials");
        add(lblPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, -1, -1));

        GenderComboBox.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboBoxActionPerformed(evt);
            }
        });
        add(GenderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 92, 30));

        BloodGroupComboBox.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BloodGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodGroupComboBoxActionPerformed(evt);
            }
        });
        add(BloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 120, -1));

        lblAccidentLocation.setBackground(new java.awt.Color(255, 255, 255));
        lblAccidentLocation.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblAccidentLocation.setText("Accident Location");
        add(lblAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, 25));

        txtAccidentLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAccidentLocationKeyReleased(evt);
            }
        });
        add(txtAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 150, 40));

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPhoto.setText("Photo");
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        lblErrorFname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorFname.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 242, 110, 21));

        lblErrorLname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorLname.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 242, 77, 21));

        lblErrorHId.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorHId.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorHId, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 124, 21));

        lblErrorPhone.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorPhone.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 385, 135, 20));

        lblErrorAddress.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAddress.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 232, 74, 21));

        lblErrorEmail.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 129, 22));

        lblErrorInjury.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorInjury.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 87, 22));

        lblErrorUserName.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorUserName.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 200, 26));

        lblErrorPassword.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 200, 26));

        lblErrorAccidentLocation.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAccidentLocation.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 116, 22));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Accident Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 210, 34));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personal Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, 31));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact Details");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 190, 31));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1434, 5));

        btnSubmit1.setBackground(new java.awt.Color(153, 153, 153));
        btnSubmit1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnSubmit1.setText("Back");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        add(btnSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 20, 159, 46));

        lblPaymentMethod1.setBackground(new java.awt.Color(255, 255, 255));
        lblPaymentMethod1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblPaymentMethod1.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentMethod1.setText("Payment Method");
        add(lblPaymentMethod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, -1, -1));

        txtDOB.setBackground(new java.awt.Color(204, 204, 204));
        txtDOB.setDateFormatString("MM-dd-yyyy");
        txtDOB.setMaxSelectableDate(new Date());
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtHealthInsuranceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthInsuranceIDActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtInjuryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInjuryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInjuryTypeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (ecoSystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())
                && (lblErrorFname.getText() == null || lblErrorFname.getText().equals(""))
                && (lblErrorLname.getText() == null || lblErrorLname.getText().equals(""))
                && (lblErrorAddress.getText() == null || lblErrorAddress.getText().equals(""))
                && (lblErrorEmail.getText() == null || lblErrorEmail.getText().equals(""))
                && (lblErrorHId.getText() == null || lblErrorHId.getText().equals(""))
                && (lblErrorInjury.getText() == null || lblErrorInjury.getText().equals(""))
                && (lblErrorPassword.getText() == null || lblErrorPassword.getText().equals(""))
                && (lblErrorPhone.getText() == null || lblErrorPhone.getText().equals(""))
                && (lblErrorUserName.getText() == null || lblErrorUserName.getText().equals(""))) {
            Patient patient = new Patient(txtUserName.getText());

            patient.setpFirstName(txtFirstName.getText());
            patient.setpLastName(txtLastName.getText());
            patient.setpAge(CalculateAge(txtDOB.getDate(), java.util.Calendar.getInstance().getTime()));
            patient.setpGender((String) GenderComboBox.getSelectedItem());
            patient.setpHealthInsuranceID(txtHealthInsuranceID.getText());
            patient.setpAddress(txtAddress.getText());
            patient.setpPhoneNo(txtPhoneNumber.getText());
            patient.setpEmailAddress(txtEmail.getText());
            patient.setPdob(txtDOB.getDate());
            patient.setpInjuryType(txtInjuryType.getText());
            patient.setpAccidentLocation(txtAccidentLocation.getText());
            patient.setpBloodType((String) BloodGroupComboBox.getSelectedItem());
            patient.setpBloodBankStatus("New Patient");
            patient.setpPharmaStatus("New Patient");
            patient.setpLabStatus("New Patient");
            patient.setpStatus("New Patient");
            patient.setpUserName(txtUserName.getText());
            patient.setpImageUrl(globalSelectedImagePath);
            patient.setpIsConcentFormSigned(IsconcentFormSigned);
            patient.setpDateOfAdmit(java.util.Calendar.getInstance().getTime());
            if (jRadioInsurance.isSelected()) {
                patient.setpInsuranceStatus("Insurance");
            } else {
                patient.setpInsuranceStatus("Cash");
            }

            ecoSystem.getUserAccountDirectory().createUser(txtUserName.getText(), txtPassword.getText(), null, new Patient_role());
            ecoSystem.getPatientDirectory().createPatient(patient);
            for (Patient p : ecoSystem.getPatientDirectory().getPatientList()) {
                if (p.getpUserName().equals(txtUserName.getText())) {
                    ecoSystem.getPatientDirectory().AddBill(p, "Bed Charge", "Hospital", "Ammount");
                }
            }

            JOptionPane.showMessageDialog(null, "Patient Created");
            
            System.out.println("existing patients in the portal ---");
            for (Patient p : ecoSystem.getPatientDirectory().getPatientList()) {
                System.out.println("patient---"+p.getpFirstName());
            }

            ReceptionWorkAreaJPanel receptionWorkAreaJPanel = new ReceptionWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            userProcessContainer.add("Reception Work Area", receptionWorkAreaJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Username is not Unique and Please Fill Correct Details");
        }


    }//GEN-LAST:event_btnSubmitActionPerformed

    public int CalculateAge(Date birthDate, Date currentDate) {
        // validate inputs ...                                                                               
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(currentDate));
        int age = (d2 - d1) / 10000;
        return age;
    }

    private void jRadioCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCashActionPerformed
        // TODO add your handling code here:
        jRadioCash.setSelected(true);
        jRadioInsurance.setSelected(false);
    }//GEN-LAST:event_jRadioCashActionPerformed

    private void jRadioInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInsuranceActionPerformed
        // TODO add your handling code here:
        jRadioCash.setSelected(false);
        jRadioInsurance.setSelected(true);
    }//GEN-LAST:event_jRadioInsuranceActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            globalSelectedImagePath = selectedImagePath;

            ImageIcon ii = new ImageIcon(selectedImagePath);
            //Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lblPhotoImage.getWidth(), lblPhotoImage.getHeight(), Image.SCALE_SMOOTH);
            lblPhotoImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void GenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboBoxActionPerformed

    private void BloodGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodGroupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodGroupComboBoxActionPerformed

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtFirstName.getText());
        if (!match.matches()) {
            lblErrorFname.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorFname.setText(null);
        }


    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtLastName.getText());
        if (!match.matches()) {
            lblErrorLname.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorLname.setText(null);
        }

    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtHealthInsuranceIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtHealthInsuranceID.getText());
        if (!match.matches()) {
            lblErrorHId.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorHId.setText(null);
        }

    }//GEN-LAST:event_txtHealthInsuranceIDKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[a-zA-Z0-9 ,'/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtAddress.getText());
        if (!match.matches()) {
            lblErrorAddress.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorAddress.setText(null);
        }


    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[0-9 +()-]{10,18}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtPhoneNumber.getText());
        if (!match.matches()) {
            lblErrorPhone.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorPhone.setText(null);
        }

    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtEmail.getText());
        if (!match.matches()) {
            lblErrorEmail.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorEmail.setText(null);
        }

    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtAccidentLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccidentLocationKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccidentLocationKeyReleased

    private void txtInjuryTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInjuryTypeKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtInjuryType.getText());
        if (!match.matches()) {
            lblErrorInjury.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorInjury.setText(null);
        }

    }//GEN-LAST:event_txtInjuryTypeKeyReleased

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtUserName.getText());
        if (!match.matches()) {
            lblErrorUserName.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorUserName.setText(null);
        }

    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:

        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtPassword.getText());
        if (!match.matches()) {
            lblErrorPassword.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorPassword.setText(null);
        }

    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        ReceptionWorkAreaJPanel patientBillJPanel = new ReceptionWorkAreaJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Patient Bill", patientBillJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmit1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BloodGroupComboBox;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioCash;
    private javax.swing.JRadioButton jRadioInsurance;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAccidentLocation;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErrorAccidentLocation;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorFname;
    private javax.swing.JLabel lblErrorHId;
    private javax.swing.JLabel lblErrorInjury;
    private javax.swing.JLabel lblErrorLname;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorPhone;
    private javax.swing.JLabel lblErrorUserName;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHealthInsuranceID;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPaymentMethod;
    private javax.swing.JLabel lblPaymentMethod1;
    private javax.swing.JLabel lblPhoneNumber4;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JLabel lblRestaurantInfo;
    private javax.swing.JLabel lblRestaurantName4;
    private javax.swing.JLabel lblRestaurantName5;
    private javax.swing.JTextField txtAccidentLocation;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHealthInsuranceID;
    private javax.swing.JTextField txtInjuryType;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
