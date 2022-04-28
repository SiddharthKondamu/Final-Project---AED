/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Patient;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author siddh
 */
public class Patient {
    
    private String patientFirstName;
    private String patientLastName;
    private int age;
    private String gender;
    private String healthInsuranceID;
    private String patientaddress;
    private String patientPhoneNumber;
    private Date dateofBirth;
    private String emailAddress;
    private Date dateOfAdmit;
    private String injuryType;
    private String bloodType;
    private String bloodBagQuantity;
    private String userName;
    private String patientStatus;
    private String bloodBankStatus;
    private String labStatus;
    private String insuranceStatus;
    private String policeStatus;
    private String pharmaStatus;
    private String AccidentLocation;
    private String photo_path;
    private boolean isConcentFormSigned;
    private ArrayList<Bills> billsList;
}
