/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.ReceptionRole;


import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Ambulance.AmbulanceWorkAreaJPanel;
import MainUserInterface.Ambulance.ReceptionAmbulanceWorkAreaJPanel;

/**
 *
 * @author sahilmattoo
 */
public class ReceptionDischarge extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;

    public ReceptionDischarge(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) ManageCustomersTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getPatientDirectory().getPatientList()) {

            Object[] row = new Object[10];
            row[0] = patient;
            row[1] = patient.getpLastName();
            row[2] = patient.getpGender();
            row[3] = patient.getpHealthInsuranceID();
            row[4] = patient.getpAge();
            row[5] = patient.getpEmailAddress();
            row[6] = patient.getpInsuranceStatus();
            row[7] = patient.getpStatus();
            if(patient.getpStatus().equals("Ready to Discharge")){
            model.addRow(row);
            }

        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageCustomersTable = new javax.swing.JTable();
        btnUpdateAmbulanceRecord = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnUpdateAmbulanceRecord1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DISCHARGE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-470, 20, 1260, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 1260, 10));

        ManageCustomersTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ManageCustomersTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ManageCustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "Gender", "HealthId", "Age", "Email", "Payment", "Patien Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ManageCustomersTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1190, 216));

        btnUpdateAmbulanceRecord.setBackground(new java.awt.Color(15, 85, 177));
        btnUpdateAmbulanceRecord.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnUpdateAmbulanceRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateAmbulanceRecord.setText("Discharge");
        btnUpdateAmbulanceRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAmbulanceRecordActionPerformed(evt);
            }
        });
        add(btnUpdateAmbulanceRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 235, 70));

        btnUpdate1.setBackground(new java.awt.Color(15, 85, 177));
        btnUpdate1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("Send to Insurance Check");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 240, 70));

        btnUpdateAmbulanceRecord1.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateAmbulanceRecord1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        btnUpdateAmbulanceRecord1.setText("Back");
        btnUpdateAmbulanceRecord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAmbulanceRecord1ActionPerformed(evt);
            }
        });
        add(btnUpdateAmbulanceRecord1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateAmbulanceRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAmbulanceRecordActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = ManageCustomersTable.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            Patient patient = (Patient) ManageCustomersTable.getValueAt(selectedRowIndex, 0);
            
            if(patient.getpInsuranceStatus().equals("Verifying Insurance")){
            JOptionPane.showMessageDialog(null, "Cannot discharge verifying insurance.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(patient.getpInsuranceStatus().equals("Cash")||patient.getpInsuranceStatus().equals("Rejected")){
            patient.setpStatus("Discharged");
            JOptionPane.showMessageDialog(null, "Cash payment Received.Patient Discharged.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            patient.setpStatus("Discharged");
           //patient.setPoliceStatus("Not Verified");
            JOptionPane.showMessageDialog(null, "Insurance payment Received.Patient Discharged.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
            //patient.setStatus("Insurance Verification");
            populateNetworkTable();
            //ManageCustomersTable doctorRequestLabTestJPanel = new ManageCustomersTable(userProcessContainer, userAccount,patient);
            //userProcessContainer.add("Request Lab Tests", doctorRequestLabTestJPanel);
            //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdateAmbulanceRecordActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        
              
        int selectedRowIndex = ManageCustomersTable.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Patient patient = (Patient) ManageCustomersTable.getValueAt(selectedRowIndex, 0);

            if(patient.getpInsuranceStatus().equals("Verifying Insurance")||patient.getpInsuranceStatus().equals("Rejected")||patient.getpInsuranceStatus().equals("Approved")){
                JOptionPane.showMessageDialog(null, "Already Verifying or verified", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(patient.getpInsuranceStatus().equals("Cash")){
                JOptionPane.showMessageDialog(null, "Cash payment method is not eligible.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                ecoSystem.getInsuranceDirectory().addServedCustomers(patient);
                patient.setpInsuranceStatus("Verifying Insurance");
                patient.setpPoliceStatus("Not Verified");
                try{
        ecoSystem.sendEmail("insurance.aed@zohomail.com", "Approval Request for "+ patient.getpFirstName(), "Please verify insurance approval request of "+patient.getpFirstName()+" "+patient.getpLastName()+" Insurance ID "+patient.getpHealthInsuranceID(), "hospital.aed@zohomail.com", "Bangbang@8899");
                ecoSystem.smsTwillio(patient.getpFirstName()+" "+patient.getpLastName());
                }
        catch(Exception e){}
                JOptionPane.showMessageDialog(null, "Sent to Insurance Approval", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
            //patient.setStatus("Insurance Verification");
            populateNetworkTable();
            //ManageCustomersTable doctorRequestLabTestJPanel = new ManageCustomersTable(userProcessContainer, userAccount,patient);
            //userProcessContainer.add("Request Lab Tests", doctorRequestLabTestJPanel);
            //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnUpdateAmbulanceRecord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAmbulanceRecord1ActionPerformed
        // TODO add your handling code here:
        ReceptionWorkAreaJPanel patientBillJPanel = new ReceptionWorkAreaJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Patient Bill", patientBillJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateAmbulanceRecord1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageCustomersTable;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdateAmbulanceRecord;
    private javax.swing.JButton btnUpdateAmbulanceRecord1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}