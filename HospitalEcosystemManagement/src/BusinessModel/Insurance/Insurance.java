/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Insurance;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class Insurance {
    private String nameOftheInsuranceCompany;
    private String address;
    private String number;
    private String emailId;
    private ArrayList<Patient> labRecordsList;

    public ArrayList<Patient> getLabRecordsList() {
        return labRecordsList;
    }

    public void setLabRecordsList(ArrayList<Patient> labRecordsList) {
        this.labRecordsList = labRecordsList;
    }
    
    public String getNameOftheInsuranceCompany() {
        return nameOftheInsuranceCompany;
    }

    public void setNameOftheInsuranceCompany(String nameOftheInsuranceCompany) {
        this.nameOftheInsuranceCompany = nameOftheInsuranceCompany;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    
}
