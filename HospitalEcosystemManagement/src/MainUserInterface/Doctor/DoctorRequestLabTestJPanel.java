/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.Doctor;

import BusinessModel.Ecosystem;
import BusinessModel.Lab.Tests;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import static java.lang.Integer.sum;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ronitchougule
 */
public class DoctorRequestLabTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRequestLabTestJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private User userAccount;
    private Patient patient;
    
    ArrayList<Tests> items=new ArrayList<Tests>();

    
    public DoctorRequestLabTestJPanel(JPanel userProcessContainer, User account, Ecosystem ecosystem, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.patient = patient;
        populatetableTests();
        //populatePatientTable();
    }
        
    private void populatetableTests() {
        DefaultTableModel model = (DefaultTableModel) tableTests1.getModel();

        model.setRowCount(0); 

        for (Tests t : ecosystem.getLab().getTestList()) {

            
                Object[] row = new Object[3];                
                row[0] = t;
                row[1] = t.getUsage();
                row[2] = t.getPrice();
                model.addRow(row);
            

        }
    }
    private void populatePatientTable() {
        //DefaultTableModel model = (DefaultTableModel) tableAddedLabTest.getModel();

        //model.setRowCount(0);

        for (Patient patient : ecosystem.getPatientDirectory().getPatientList()) {

            Object[] row = new Object[7];
            row[0] = patient.getpUserName();
            row[1] = patient.getpHealthInsuranceID();
            row[2] = patient.getpFirstName();
            row[3] = patient.getpLastName();
            row[4] = patient.getpAge();
            row[5] = patient.getpAddress();
            row[6] = patient.getpEmailAddress();
            
          //  model.addRow(row);

        }
    }
     public void populateCart(Tests item){
        DefaultTableModel model = (DefaultTableModel) carttable.getModel();
        model.setRowCount(0);
        
         items.add(item);
         Object[] row = new Object[3];
                for(Tests t:items){
                     row[0] = t;
                     row[1] = t.getUsage();
                     row[2] = t.getPrice();
                     //sum=sum+IntegetPriceger.parseInt(t.getPrice());
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carttable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTests1 = new javax.swing.JTable();
        btnAddTest = new javax.swing.JButton();
        btnRemoveTest = new javax.swing.JButton();
        Request = new javax.swing.JButton();
        Request1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request Lab Tests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 500, 60));

        carttable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        carttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Name", "Test Usage", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carttable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 430, 210));

        tableTests1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tableTests1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Name", "Test Usage", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableTests1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 410, 210));

        btnAddTest.setBackground(new java.awt.Color(255, 255, 255));
        btnAddTest.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btnAddTest.setForeground(new java.awt.Color(0, 153, 204));
        btnAddTest.setText("ADD >>");
        btnAddTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTestActionPerformed(evt);
            }
        });
        add(btnAddTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 110, 50));

        btnRemoveTest.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveTest.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btnRemoveTest.setForeground(new java.awt.Color(0, 153, 204));
        btnRemoveTest.setText("<< REMOVE ");
        btnRemoveTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTestActionPerformed(evt);
            }
        });
        add(btnRemoveTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 120, 50));

        Request.setBackground(new java.awt.Color(255, 255, 255));
        Request.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        Request.setForeground(new java.awt.Color(0, 153, 204));
        Request.setText("REQUEST TESTS");
        Request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestActionPerformed(evt);
            }
        });
        add(Request, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 170, 50));

        Request1.setBackground(new java.awt.Color(255, 255, 255));
        Request1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        Request1.setForeground(new java.awt.Color(0, 153, 204));
        Request1.setText("BACK");
        Request1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request1ActionPerformed(evt);
            }
        });
        add(Request1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 110, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Tests");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selected Tests");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Tests item=(Tests)tableTests1.getValueAt(selectedRow, 0);           
            int i =0;
            for(Tests ite:items){
            //System.out.print(ite.getTestName());
            if(ite==item){
            i=1;
            JOptionPane.showMessageDialog(null,"Test already exist.","Warning",JOptionPane.WARNING_MESSAGE);
            break;
            }
            }
            if(i==0){
            populateCart(item);}
        }
    }//GEN-LAST:event_btnAddTestActionPerformed

    private void btnRemoveTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTestActionPerformed
        // TODO add your handling code here:
         int selectedRow = carttable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Tests item=(Tests)carttable.getValueAt(selectedRow, 0);
            items.remove(item);
            DefaultTableModel model = (DefaultTableModel) carttable.getModel();
        model.setRowCount(0);
            Object[] row = new Object[3];
                for(Tests t:items){
                     row[0] = t;
                     row[1] = t.getUsage();
                     row[2] = t.getPrice();
                     model.addRow(row);
                }  
          
        }
    }//GEN-LAST:event_btnRemoveTestActionPerformed

    private void RequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestActionPerformed
        // TODO add your handling code here:
        if(items.size()==0){
          JOptionPane.showMessageDialog(null,"Please add test to the cart.","Warning",JOptionPane.WARNING_MESSAGE);

        }
        else{
        for(Tests t:items){
            //String itemName,String organization1,float itemAmount, String result, String itemStatus
            JOptionPane.showMessageDialog(null,"Request Placed.","Success",JOptionPane.INFORMATION_MESSAGE);        
             PatientBills bill = new PatientBills(t.getTestName(), "Lab", t.getPrice(),"Awaiting","Requested");
             patient.addbill(bill);
             DoctorVisitJPanel doctorVisit = new DoctorVisitJPanel(userProcessContainer, userAccount, ecosystem, patient);
            userProcessContainer.add("Visit Doctor", doctorVisit);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
             //ecosystem.AddTreatedPatientList(patient);
        }
        ecosystem.getLab().AddTreatedPatientList(patient);
        patient.setLabStatus("Requested");
        }
     
    }//GEN-LAST:event_RequestActionPerformed

    private void Request1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request1ActionPerformed
        // TODO add your handling code here:
        DoctorVisitJPanel doctorVisit = new DoctorVisitJPanel(userProcessContainer, userAccount, ecosystem, patient);
        userProcessContainer.add("Visit Doctor", doctorVisit);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_Request1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Request;
    private javax.swing.JButton Request1;
    private javax.swing.JButton btnAddTest;
    private javax.swing.JButton btnRemoveTest;
    private javax.swing.JTable carttable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableTests1;
    // End of variables declaration//GEN-END:variables
}
