/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import javax.swing.JPanel;

/**
 *
 * @author Your Name <Puja>
 */
public class Reception extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new ReceptionWorkAreaJPanel(userProcessContainer, user, business);
}

   
    
}
