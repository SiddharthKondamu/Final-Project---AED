/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import javax.swing.JPanel;

/**
 *
 * @author Your Name <Puja>
 */
public class PharmacistRole {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem business) {
        return new PharmacyWorkAreaJPanel(userProcessContainer, account, business);
    }
    
}
