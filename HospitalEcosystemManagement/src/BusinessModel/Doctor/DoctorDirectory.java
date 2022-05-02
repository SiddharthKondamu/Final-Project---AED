/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Doctor;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctors;
    
    public DoctorDirectory() {
        doctors = new ArrayList<Doctor>();
    }
    
    public Doctor createDoctor(Doctor doc) {
        Doctor doctor = new Doctor(doc.getdUserName());
        doctors.add(doc);
        return doctor;
    }

    public void deleteDoc(Doctor p) {
        doctors.remove(p);
    }

    public Doctor AddPatient(Doctor doctor, Patient patient) {
        System.out.println("doc existing patients--"+doctor.getTreatedPatientList());
        doctor.getTreatedPatientList().add(patient);
        return doctor;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    
}
