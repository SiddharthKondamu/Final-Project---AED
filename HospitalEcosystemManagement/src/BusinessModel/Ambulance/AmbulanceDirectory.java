/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Ambulance;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class AmbulanceDirectory {
    
     private ArrayList<Ambulance> Ambulances;

    public ArrayList<Ambulance> getAmbulances() {
        return Ambulances;
    }

    public void setAmbulances(ArrayList<Ambulance> Ambulances) {
        this.Ambulances = Ambulances;
    }

    public AmbulanceDirectory()
    {
         Ambulances = new ArrayList<>();
    }
     
    public Ambulance createAmbulance(Ambulance ambulance) 
    {
        Ambulances.add(ambulance);
        return ambulance;
    }
}
