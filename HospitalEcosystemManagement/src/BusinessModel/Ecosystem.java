/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel;

import BusinessModel.Ambulance.AmbulanceDirectory;
import BusinessModel.BloodBank.BloodBank;
import BusinessModel.Doctor.DoctorDirectory;
import BusinessModel.Patient.PatientDirectory;
import BusinessModel.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class Ecosystem extends Organisation{
    
    private static Ecosystem business;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private AmbulanceDirectory ambulanceDirectory;
    private BloodBank bloodBank;
    private Lab lab;
    private Pharmacy pharmacy;
    private InsuranceDirectory insuranceDirectory;
    private PoliceDepartment policeRecords;
    
    public static Ecosystem getInstance()
    {
        if(business==null)
        {
            business=new Ecosystem();
        }
        
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
