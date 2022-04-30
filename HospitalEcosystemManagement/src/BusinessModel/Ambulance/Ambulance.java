/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Ambulance;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class Ambulance {
    
    private String driverFirstName;
    private String driverLastName;
    private String vehicleNo;
    private String driverPhoneNo;
    private String Status;
    private int driverAge;
    private String accidentLocation;
    private ArrayList<Patient> ambulancePatientsList;

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getDriverPhoneNo() {
        return driverPhoneNo;
    }

    public void setDriverPhoneNo(String driverPhoneNo) {
        this.driverPhoneNo = driverPhoneNo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    public String getAccidentLocation() {
        return accidentLocation;
    }

    public void setAccidentLocation(String accidentLocation) {
        this.accidentLocation = accidentLocation;
    }

    public ArrayList<Patient> getAmbulancePatientsList() {
        return ambulancePatientsList;
    }

    public void setAmbulancePatientsList(ArrayList<Patient> ambulancePatientsList) {
        this.ambulancePatientsList = ambulancePatientsList;
    }
    
    
    
    @Override
    public String toString() {
        return driverFirstName;
    }
}
