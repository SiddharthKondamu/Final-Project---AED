/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import javax.swing.JPanel;
import BusinessModel.UserAccount.User;

/**
 *
 * @author Your Name <Puja>
 */
public class RoleOfInsuranceAuthority extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business)
    {
        return new InsuranceWorkAreaJPanel(userProcessContainer, user, business);
    }
    
}
