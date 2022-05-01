/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.BloodBank;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class BloodBank {
    
    private String bloodBankName;
    private String bloodBankAddress;
    private String bloodBankPhone;
    private String bloodBankEmailAddress;
    private ArrayList<Patient> bloodRequestedPatients;
    ArrayList<BloodTypeRecord> bloodDetailsList;

    public BloodBank() {
        bloodRequestedPatients = new ArrayList<>();
        bloodRequestedPatients = bloodRequestedPatients == null ? new ArrayList<>() : bloodRequestedPatients;
    }

    public ArrayList<BloodTypeRecord> getBloodDetailsList() {
        return bloodDetailsList;
    }

    public void setBloodDetailsList(ArrayList<BloodTypeRecord> bloodTypeRecord) {
        this.bloodDetailsList = bloodTypeRecord;
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getBloodBankAddress() {
        return bloodBankAddress;
    }

    public void setBloodBankAddress(String bloodBankAddress) {
        this.bloodBankAddress = bloodBankAddress;
    }

    public String getBloodBankPhone() {
        return bloodBankPhone;
    }

    public void setBloodBankPhone(String bloddBankPhone) {
        this.bloodBankPhone = bloddBankPhone;
    }

    public String getBloodBankEmailAddress() {
        return bloodBankEmailAddress;
    }

    public void setBloodBankEmailAddress(String bloddBankEmailAddress) {
        this.bloodBankEmailAddress = bloddBankEmailAddress;
    }

    public ArrayList<Patient> getBloodrequestedPatients() {
        return bloodRequestedPatients;
    }

    public void setBloodrequestedPatients(ArrayList<Patient> bloodrequestedPatients) {
        this.bloodRequestedPatients = bloodrequestedPatients;
    }
    
    public void AddTreatedPatientList(Patient patient)
    {
        bloodRequestedPatients.add(patient);
    }
    
}
