/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author Dennis Mayer
 */
public class Flight {
    
    private Airplane plane;
    private Place departure;
    private Place arrival;

    public Flight(Airplane plane, Place departure, Place arrival) {
        this.plane = plane;
        this.departure = departure;
        this.arrival = arrival;
    }

    public Airplane getPlane() {
        return plane;
    }

    public void setPlane(Airplane plane) {
        this.plane = plane;
    }

    public Place getDeparture() {
        return departure;
    }

    public void setDeparture(Place departure) {
        this.departure = departure;
    }

    public Place getArrival() {
        return arrival;
    }

    public void setArrival(Place arrival) {
        this.arrival = arrival;
    }
    
    public String toString() {
        return this.plane.toString() + " (" + this.departure + "-" + this.arrival + ")";
    }
    
    
    
}
