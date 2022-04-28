/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.UserAccount;

import BusinessModel.Employee.Employee;
import BusinessModel.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Your Name <Puja>
 */
public class UserDirectory {
    
     private final ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userList;
    }

    public User authenticateUser(String username, String password) {
        for (User ua : userList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public User createUser(String username, String password, Employee employee, Role role) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmployee(employee);
        user.setRole(role);
        userList.add(user);
        return user;
    }
    public void deleteUser(String username){
       
    for (User ua : userList) {
            if (ua.getUsername().equals(username)) {
                userList.remove(ua);
                break;
            }
        }
        
    }
    public boolean findIfUsernameIsUnique(String username) {
        for (User ua : userList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
}
