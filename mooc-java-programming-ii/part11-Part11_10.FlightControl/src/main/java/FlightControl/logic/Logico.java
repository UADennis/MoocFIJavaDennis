/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Dennis Mayer
 */
public class Logico {
    
    private HashMap<String,Airplane> planeDB = new HashMap<>();
    private HashMap<String,Place> placeDB = new HashMap<>();
    private HashMap<String,Flight> flightDB = new HashMap<>();
    
    public Logico(){
        
    }
    
    public void addPlane(String id, int capacity){
        planeDB.put(id, new Airplane(id,capacity));
    }
    
    public void addFlight(Airplane plane, String departure, String arrival){
        placeDB.putIfAbsent(departure, new Place(departure));
        placeDB.putIfAbsent(arrival, new Place(arrival));
        
        Flight tempF = new Flight(plane, placeDB.get(departure), placeDB.get(arrival));
        flightDB.put(tempF.toString(), tempF);
    }
    
    public Airplane planeSearch(String id){
        return planeDB.get(id);
    }
    
    public void printAllPlanes(){
        Collection<Airplane> temp  = planeDB.values();
        temp.toArray();
        temp.forEach(t -> System.out.println(t));
        
    }
    
    public void printAllFlights(){
        Collection<Flight> temp  = flightDB.values();
        temp.toArray();
        temp.forEach(t -> System.out.println(t));
        
    }
}
