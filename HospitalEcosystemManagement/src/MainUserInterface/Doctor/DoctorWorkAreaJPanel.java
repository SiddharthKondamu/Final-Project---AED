/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorAdministratorRole.DisplayPatientInfoJPanel;
import userinterface.LabRole.LabWorkAreaJPanel;
import userinterface.PharmacyRole.PharmacyWorkAreaJPanel;
import userinterface.ReceptionRole.CreatePatientJPanel;

/**
 *
 * @author ronitchougule
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoSystem ecoSystem;
    UserAccount userAccount;

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        populatePatientTable();
        populatePatientTable1();
    }

    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();

        model.setRowCount(0);

        for (Doctor doctor : ecoSystem.getDoctorDirectory().getDoctorList()) {
            if (doctor.getUserName().equals(userAccount.getUsername())) {
                for (Patient patient : doctor.getTreatedPatientList()) 
                {
                    Object[] row = new Object[7];
                    row[0] = patient;
                    row[1] = patient.getPatientLastName();
                    row[2] = patient.getInjuryType();
                    row[3] = patient.getBloodType();
                    row[4] = patient.getAge();
                    row[5] = patient.getGender();
                    row[6] = patient.getPatientStatus();
                    if(!patient.getStatus().equals("Discharged")){
                    model.addRow(row);}
                }
            }

        }
    }
    private void populatePatientTable1() {
        DefaultTableModel model = (DefaultTableModel) PatientTable1.getModel();

        model.setRowCount(0);

        for (Doctor doctor : ecoSystem.getDoctorDirectory().getDoctorList()) {
            if (doctor.getUserName().equals(userAccount.getUsername())) {
                for (Patient patient : doctor.getTreatedPatientList()) 
                {
                    Object[] row = new Object[7];
                    row[0] = patient;
                    row[1] = patient.getPatientLastName();
                    row[2] = patient.getInjuryType();
                    row[3] = patient.getBloodType();
                    row[4] = patient.getAge();
                    row[5] = patient.getGender();
                    row[6] = patient.getPatientStatus();
                    if(patient.getStatus().equals("Discharged")){
                    model.addRow(row);}
                }
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

        lblManageCustomers = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        btnVisitPatient = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        PatientTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageCustomers.setBackground(new java.awt.Color(0, 153, 204));
        lblManageCustomers.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCustomers.setText("Doctor WorkArea");
        add(lblManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 20, 1238, -1));

        PatientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Injury", "Blood Type", "Age", "Gender", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PatientTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 740, 191));

        btnVisitPatient.setBackground(new java.awt.Color(255, 255, 255));
        btnVisitPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnVisitPatient.setForeground(new java.awt.Color(0, 153, 204));
        btnVisitPatient.setText("Visit");
        btnVisitPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitPatientActionPerformed(evt);
            }
        });
        add(btnVisitPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 120, 44));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 1404, 10));

        PatientTable1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        PatientTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Injury", "Blood Type", "Age", "Gender", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(PatientTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 730, 191));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Previously Treated Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 280, 34));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patients Assigned to me");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 220, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisitPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitPatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PatientTable.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            Patient patient = (Patient) PatientTable.getValueAt(selectedRowIndex, 0);
            if(patient.getStatus().equals("Doctor Visiting")){
            JOptionPane.showMessageDialog(null, "Patient is in visit.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
            patient.setStatus("Doctor Visiting");
            DoctorVisitJPanel doctorVisit = new DoctorVisitJPanel(userProcessContainer, userAccount, ecoSystem, patient);
            userProcessContainer.add("Visit Doctor", doctorVisit);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            }
        }
        
        
    }//GEN-LAST:event_btnVisitPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientTable;
    private javax.swing.JTable PatientTable1;
    private javax.swing.JButton btnVisitPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblManageCustomers;
    // End of variables declaration//GEN-END:variables
}
