/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BusinessUtil.GoogleMaps;

import BusinessModel.Ambulance.Ambulance;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import MainUserInterface.Ambulance.ReceptionAmbulanceWorkAreaJPanel;
import com.kingaspx.util.BrowserUtil;
import com.kingaspx.version.Version;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.dom.By;
import com.teamdev.jxbrowser.chromium.dom.DOMDocument;
import com.teamdev.jxbrowser.chromium.dom.DOMElement;
import com.teamdev.jxbrowser.chromium.dom.DOMInputElement;
import com.teamdev.jxbrowser.chromium.dom.events.DOMEventType;
import com.teamdev.jxbrowser.chromium.events.ConsoleEvent;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.events.TitleEvent;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author siddh
 */
public class GoogleMapsAmbulanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GoogleMapsAmbulanceJPanel
     */
    String accidentLocation;
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    private final Ambulance ambulance;
    private final Patient patient;
    User userAccount;
    
    public GoogleMapsAmbulanceJPanel(JPanel userProcessContainer, Ecosystem system,User account, Ambulance ambulance, String accidentLocation) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecoSystem = system;
        this.ambulance = ambulance;
        this.accidentLocation = accidentLocation;
        this.patient = new Patient();
        open_site();
    }
    
    public GoogleMapsAmbulanceJPanel(JPanel userProcessContainer, Ecosystem system,User account, Ambulance ambulance, String accidentLocation, Patient p) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecoSystem = system;
        this.ambulance = ambulance;
        this.accidentLocation = accidentLocation;
        this.patient = p;
        open_site();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Map_JPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        headingLbl = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new java.awt.BorderLayout());

        Map_JPanel.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        Map_JPanel.setLayout(new java.awt.BorderLayout());
        add(Map_JPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 204));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 100, 30));

        headingLbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        headingLbl.setForeground(new java.awt.Color(255, 255, 255));
        headingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLbl.setText("Route from driver's location to accident location");
        jPanel1.add(headingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 770, 50));

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("Get Route");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 140, 30));

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DOMDocument doc = browser.getDocument();
        DOMElement start_element = doc.findElement(By.id("start"));
        DOMElement end_element = doc.findElement(By.id("end"));
        DOMElement btn_element = doc.findElement(By.id("submit"));
        DOMElement button = (DOMElement) btn_element;

        DOMInputElement startLocation = (DOMInputElement) start_element;
        DOMInputElement endLocation = (DOMInputElement) end_element;
        startLocation.setValue("Northeastern University, Boston");
        endLocation.setValue(this.accidentLocation);
        button.click();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //ReceptionAmbulanceWorkAreaJPanel
        ReceptionAmbulanceWorkAreaJPanel emergencyRegistrationPanel = new ReceptionAmbulanceWorkAreaJPanel(userProcessContainer,ecoSystem, userAccount,ambulance, this.patient);
        userProcessContainer.add("Patient Bill", emergencyRegistrationPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Map_JPanel;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    Browser browser;
    BrowserView view;
    
    private void open_site() {
        
        BrowserUtil.setVersion(Version.V6_22);
        browser = new Browser();
        view = new BrowserView(browser);

        Map_JPanel.add(view, BorderLayout.CENTER);

        browser.addTitleListener((TitleEvent evt) -> {
            headingLbl.setText("   " + evt.getTitle());
        });

        browser.addConsoleListener((ConsoleEvent evt) -> {
            System.out.println("LOG: " + evt.getMessage());
        });

        browser.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent evt) {
                evt.getBrowser().setZoomLevel(-2);
            }
        });
        browser.loadURL("C:\\Users\\siddh\\AED-1\\AED_Final_Project\\AED Project Implementation\\simple_map.html");
    }

}
