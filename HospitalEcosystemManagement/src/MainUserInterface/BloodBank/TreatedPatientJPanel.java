/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.BloodBank;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Puja
 */
public class TreatedPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TreatedPatientJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;

    public TreatedPatientJPanel(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.ecoSystem = system;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        populatePatientTable();
    }

    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) ManagePatientTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getBloodBank().getBloodrequestedPatients()) {

            Object[] row = new Object[9];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpHealthInsuranceID();
            row[2] = patient.getpUserName();
            row[3] = patient.getpLastName();
            row[4] = patient.getpAge();
            row[5] = patient.getpInsuranceStatus();
            row[6] = patient.getpEmailAddress();
            row[7] = patient.getpBloodBankStatus();
            row[8] = patient;
            model.addRow(row);

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

        jScrollPane3 = new javax.swing.JScrollPane();
        ManagePatientTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManagePatientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ManagePatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User Name", "HealthId", "First", "Last", "Age", "Address", "Email", "Blood Request Status", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
            ManagePatientTable.getColumnModel().getColumn(8).setMinWidth(0);
            ManagePatientTable.getColumnModel().getColumn(8).setPreferredWidth(0);
            ManagePatientTable.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1260, 191));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("                REQUESTED PATIENTS HISTORY");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1260, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1270, 10));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 700, 240, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/bloodDonation-modified.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 390, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        BloodBankWorkAreaJPanel bloodBankWorkAreaJPanel = new BloodBankWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Display Treated Patient", bloodBankWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManagePatientTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
