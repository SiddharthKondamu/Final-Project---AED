/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.BloodBank;

import BusinessModel.BloodBank.BloodBank;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Puja
 */
public class BloodBankWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    BloodBank bloodBank;
    Patient billPatient;

    public BloodBankWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        this.billPatient = null;
        BloodRequestStatusBox.addItem("Select Status");
        BloodRequestStatusBox.addItem("Blood Delivered");
        BloodRequestStatusBox.addItem("Unavailable");
        populatePatientTable();
    }

    private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

        model.setRowCount(0);

        for (PatientBills b : billPatient.getpBills()) {
            
                Object[] row = new Object[4];
                row[0] = b.getName();
                row[1] = b.getOrgType();
                row[2] = b.getAmount();
                row[3] = b;
                if(b.getOrgType().toLowerCase().equals("blood bank"))
                {
                    model.addRow(row);
                }
        }
    }

    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) ManagePatientTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getPatientDirectory().getPatientList()) {
            if (patient.getpBloodBankStatus().equals("Requested") || patient.getpBloodBankStatus().equals("Unavailable")) {
                Object[] row = new Object[10];
                row[0] = patient.getpFirstName();
                row[1] = patient.getpHealthInsuranceID();
                row[2] = patient.getpUserName();
                row[3] = patient.getpLastName();
                row[4] = patient.getpAge();
                row[5] = patient.getpInsuranceStatus();
                row[6] = patient.getpEmailAddress();
                row[7] = patient.getpBloodBankStatus();
                row[8] = patient.getpBloodBagQuantity();
                row[9] = patient;
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

        lblPatientBill = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ManagePatientTable = new javax.swing.JTable();
        btnBloodBankInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        lblCommunity = new javax.swing.JLabel();
        BloodRequestStatusBox = new javax.swing.JComboBox<>();
        btnProcessRequest = new javax.swing.JButton();
        btnTreatedPatientList = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientBill.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientBill.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblPatientBill.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientBill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientBill.setText("BILLS");
        add(lblPatientBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 360, 1270, 83));

        ManagePatientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ManagePatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User Name", "HealthId", "First", "Last", "Age", "Address", "Email", "Request Status", "Blood Quantity", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ManagePatientTable);
        if (ManagePatientTable.getColumnModel().getColumnCount() > 0) {
            ManagePatientTable.getColumnModel().getColumn(9).setMinWidth(0);
            ManagePatientTable.getColumnModel().getColumn(9).setPreferredWidth(0);
            ManagePatientTable.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 860, 191));

        btnBloodBankInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnBloodBankInfo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnBloodBankInfo.setForeground(new java.awt.Color(0, 153, 204));
        btnBloodBankInfo.setText("Blood Bank Information");
        btnBloodBankInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloodBankInfoActionPerformed(evt);
            }
        });
        add(btnBloodBankInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 700, 270, 40));

        BillTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(BillTable);
        if (BillTable.getColumnModel().getColumnCount() > 0) {
            BillTable.getColumnModel().getColumn(3).setMinWidth(0);
            BillTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            BillTable.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 456, 1270, 191));

        lblCommunity.setBackground(new java.awt.Color(255, 255, 255));
        lblCommunity.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunity.setText("Blood Request Status");
        add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, -1, 30));

        BloodRequestStatusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodRequestStatusBoxActionPerformed(evt);
            }
        });
        add(BloodRequestStatusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 140, 162, 30));

        btnProcessRequest.setBackground(new java.awt.Color(255, 255, 255));
        btnProcessRequest.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnProcessRequest.setForeground(new java.awt.Color(0, 153, 204));
        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });
        add(btnProcessRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 200, 190, 40));

        btnTreatedPatientList.setBackground(new java.awt.Color(255, 255, 255));
        btnTreatedPatientList.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnTreatedPatientList.setForeground(new java.awt.Color(0, 153, 204));
        btnTreatedPatientList.setText("Show Treated Patient List");
        btnTreatedPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatedPatientListActionPerformed(evt);
            }
        });
        add(btnTreatedPatientList, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 300, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BLOOD BANK");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1270, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBloodBankInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloodBankInfoActionPerformed
        // TODO add your handling code here:
        BloodBankInfoJPanel bloodBankInfoJPanel = new BloodBankInfoJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Blood Bank Information", bloodBankInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnBloodBankInfoActionPerformed

    private void BloodRequestStatusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodRequestStatusBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodRequestStatusBoxActionPerformed

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = ManagePatientTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Patient patient = (Patient) ManagePatientTable.getValueAt(selectedRowIndex, 9);

            for (Patient p : ecoSystem.getPatientDirectory().getPatientList()) {
                if (patient.getpUserName().equals(p.getpUserName())) {
                    if (!((String) BloodRequestStatusBox.getSelectedItem()).equals("Select Status")) {
                        p.setpBloodBankStatus((String) BloodRequestStatusBox.getSelectedItem());
                        billPatient = p;
                        if (p.getpBloodBankStatus().equals("Blood Delivered")) {
                            for (int bloodBag = 0; bloodBag < Integer.parseInt(billPatient.getpBloodBagQuantity()); bloodBag++) {
                                ecoSystem.getPatientDirectory().AddBill(billPatient, "Blood Charges", "Blood Bank", "");
                                ecoSystem.getBloodBank().AddTreatedPatientList(billPatient);
                            }
                        }
                        break;
                    }
                }
            }

            populatePatientTable();
            populateBillTable();

        }


    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void btnTreatedPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatedPatientListActionPerformed
        // TODO add your handling code here:
        TreatedPatientJPanel treatedPatientJPanel = new TreatedPatientJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Display Treated Patient", treatedPatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnTreatedPatientListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JComboBox<String> BloodRequestStatusBox;
    private javax.swing.JTable ManagePatientTable;
    private javax.swing.JButton btnBloodBankInfo;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JButton btnTreatedPatientList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblPatientBill;
    // End of variables declaration//GEN-END:variables

}
