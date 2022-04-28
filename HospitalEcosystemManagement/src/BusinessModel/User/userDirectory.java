/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.User;

import BusinessModel.Employee.Employee;
import BusinessModel.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class userDirectory {
    
    private final ArrayList<User> usersList;
    
    public userDirectory() {
        usersList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return usersList;
    }

    public User authenticateUser(String username, String password) {
        for (User ua : usersList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public User createUserAccount(String username, String password, Employee employee, Role role) {
        User userAccount = new User();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        usersList.add(userAccount);
        return userAccount;
    }
    public void deleteUserAccount(String username){
       
    for (User ua : usersList) {
            if (ua.getUsername().equals(username)) {
                usersList.remove(ua);
                break;
            }
        }
        
    }
    public boolean checkIfUsernameIsUnique(String username) {
        for (User ua : usersList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
