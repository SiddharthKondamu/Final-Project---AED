/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Lab;

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
 * @author sahil
 */
public class LabPastRequestedTests extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    Patient p;
    JPanel userProcessContainer;
    User account;
    Ecosystem ecoSystem;
    public LabPastRequestedTests(JPanel userProcessContainer, User account, Patient p,Ecosystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.p = p;
        populateBillTable();
        jLabel2.setText("Customer Name: "+p.getpFirstName()+" "+p.getpLastName());

    }
        private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

        model.setRowCount(0);

        for (PatientBills b : p.getpBills()) {

            Object[] row = new Object[6];
            row[0] = b.getName();
            row[1] = b.getOrgType();
            row[2] = b.getAmount();
            row[3] = b.getStatus();
            row[4] = b.getResult();
            row[5] = b;
            if(row[1].equals("Lab")){
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
        BillTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 18, 460, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1400, 10));

        BillTable.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        BillTable.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount", "Status", "Result", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BillTable);
        if (BillTable.getColumnModel().getColumnCount() > 0) {
            BillTable.getColumnModel().getColumn(5).setMinWidth(0);
            BillTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            BillTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 1035, 280));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 140, 40));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 380, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        LabWorkAreaJPanel bill = new LabWorkAreaJPanel(userProcessContainer, account, ecoSystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
