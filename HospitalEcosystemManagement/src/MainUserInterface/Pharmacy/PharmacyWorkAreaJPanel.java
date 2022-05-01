/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Pharmacy;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.Pharmacy.medicine;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Puja
 */
public class PharmacyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Ecosystem ecosystem;
    UserAccount userAccount;
    Medicine m;
    
    public PharmacyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.userAccount = account;
        //populatetableMedicine();
        populatePatientTable();
        populatePatientTable1();
    }
    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) managePatientTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecosystem.getPharmacy().getPharmaRecordList()) {

            Object[] row = new Object[7];
            
            row[0] = patient;
            row[1] = patient.getPatientLastName();
            row[2] = patient.getPharmaStatus();
            row[3] = patient.getHealthInsuranceID();
            row[4] = patient.getAge();
            row[5] = patient.getPatientaddress();
            row[6] = patient.getEmailAddress();
           if(patient.getPharmaStatus().equals("Requested")){
            model.addRow(row);
           }
        }
    }
        private void populatePatientTable1() {
        DefaultTableModel model = (DefaultTableModel) managePatientTable1.getModel();

        model.setRowCount(0);

        for (Patient patient : ecosystem.getPharmacy().getPharmaRecordList()) {

            Object[] row = new Object[7];
            
            row[0] = patient;
            row[1] = patient.getPatientLastName();
            row[2] = patient.getPharmaStatus();
            row[3] = patient.getHealthInsuranceID();
            row[4] = patient.getAge();
            row[5] = patient.getPatientaddress();
            row[6] = patient.getEmailAddress();
           if(patient.getPharmaStatus().equals("Delivered")){
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        managePatientTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        managePatientTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pharmacy");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1211, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1221, 10));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("View Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 354, -1, 41));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("Update Inventory");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 354, -1, 41));

        managePatientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        managePatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First", "Last", "PharmaStatus", "HealthId", "Age", "Address", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane4.setViewportView(managePatientTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 132, 931, 195));

        managePatientTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        managePatientTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First", "Last", "PharmaStatus", "HealthId", "Age", "Address", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane5.setViewportView(managePatientTable1);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 441, 942, 191));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 204));
        jButton3.setText("View Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 650, -1, 41));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = managePatientTable.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            Patient patient = (Patient) managePatientTable.getValueAt(selectedRowIndex, 0);
            PharmacyRequestedTests doctorRequestLabTestJPanel = new PharmacyRequestedTests(userProcessContainer, userAccount,patient,ecosystem);
            userProcessContainer.add("Request Lab Tests", doctorRequestLabTestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PharmacyCRUDJpanel doctorRequestLabTestJPanel = new PharmacyCRUDJpanel(userProcessContainer, userAccount,ecosystem);
        userProcessContainer.add("Request Lab Tests", doctorRequestLabTestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = managePatientTable1.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            Patient patient = (Patient) managePatientTable1.getValueAt(selectedRowIndex, 0);
            PharmacypastReq doctorRequestLabTestJPanel = new PharmacypastReq(userProcessContainer, userAccount,patient,ecosystem);
            userProcessContainer.add("Past Tests", doctorRequestLabTestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable managePatientTable;
    private javax.swing.JTable managePatientTable1;
    // End of variables declaration//GEN-END:variables
}