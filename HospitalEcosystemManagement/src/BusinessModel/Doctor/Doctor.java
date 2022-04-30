/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Doctor;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author siddh
 */
public class Doctor {
    
    private String dUserName;
    private String dPassword;
    private String dFirstName;
    private String dLastName;
    private String dGender;
    private int dAge;
    private Date dDOB;
    private String dPhoneNumber;
    private String dEmail;
    private String dAddress;
    private String dWorkID;
    private String dSpecialization;
    private String dExperience;
    private String dImageUrl;
    private ArrayList<Patient> treatedPatientList;
    
    public Doctor() {
    
    }
     
    public Doctor(String dUserName) {
        this.dUserName = dUserName;
    }
    public ArrayList<Patient> getTreatedPatientList() {
        return treatedPatientList;
    }

    public void setTreatedPatientList(ArrayList<Patient> treatedPatientList) {
        this.treatedPatientList = treatedPatientList;
    }

    public String getdUserName() {
        return dUserName;
    }

    public void setdUserName(String dUserName) {
        this.dUserName = dUserName;
    }

    public String getdPassword() {
        return dPassword;
    }

    public void setdPassword(String dPassword) {
        this.dPassword = dPassword;
    }

    public String getdFirstName() {
        return dFirstName;
    }

    public void setdFirstName(String dFirstName) {
        this.dFirstName = dFirstName;
    }

    public String getdLastName() {
        return dLastName;
    }

    public void setdLastName(String dLastName) {
        this.dLastName = dLastName;
    }

    public String getdGender() {
        return dGender;
    }

    public void setdGender(String dGender) {
        this.dGender = dGender;
    }

    public int getdAge() {
        return dAge;
    }

    public void setdAge(int dAge) {
        this.dAge = dAge;
    }

    public Date getdDOB() {
        return dDOB;
    }

    public void setdDOB(Date dDOB) {
        this.dDOB = dDOB;
    }

    public String getdPhoneNumber() {
        return dPhoneNumber;
    }

    public void setdPhoneNumber(String dPhoneNumber) {
        this.dPhoneNumber = dPhoneNumber;
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    public String getdWorkID() {
        return dWorkID;
    }

    public void setdWorkID(String dWorkID) {
        this.dWorkID = dWorkID;
    }

    public String getdSpecialization() {
        return dSpecialization;
    }

    public void setdSpecialization(String dSpecialization) {
        this.dSpecialization = dSpecialization;
    }

    public String getdExperience() {
        return dExperience;
    }

    public void setdExperience(String dExperience) {
        this.dExperience = dExperience;
    }

    public String getdImageUrl() {
        return dImageUrl;
    }

    public void setdImageUrl(String dImageUrl) {
        this.dImageUrl = dImageUrl;
    }
    
    @Override
    public String toString() {
        return dFirstName;
    }
}
