/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import java.util.Scanner;
import FlightControl.logic.Logico;

/**
 *
 * @author Dennis Mayer
 */
public class Ui {

    private Scanner scan;
    private Logico log;

    public Ui(Scanner scan, Logico log) {
        this.scan = scan;
        this.log = log;
    }

    public void start() {
        startAssetControl();
        startFlightControl();
    }

    public void startAssetControl() {
        System.out.println("Airport Asset Control");

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("x")) {
                break;
            }

            switch (input) {
                case "1":
                    System.out.println("Give the airplane id: ");
                    String temp = scan.nextLine();
                    System.out.println("Give the airplane capacity: ");
                    int capa = Integer.valueOf(scan.nextLine());
                    log.addPlane(temp, capa);
                    break;
                case "2":
                    System.out.println("Give the airplane id: ");
                    temp = scan.nextLine();
                    System.out.println("Give the departure airport id: ");
                    String dep = scan.nextLine();
                    System.out.println("Give the target airport id: ");
                    String arr = scan.nextLine();
                    log.addFlight(log.planeSearch(temp), dep, arr);
                    break;

            }

        }

    }

    public void startFlightControl() {
        System.out.println("Flight Control");

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("x")) {
                break;
            }
            
            switch (input){
                case "1" :
                    log.printAllPlanes();
                    break;
                case "2" :
                    log.printAllFlights();
                    break;
                case "3" :
                    System.out.println("Give the airplane id: ");
                    String temp = scan.nextLine();
                    System.out.println(log.planeSearch(temp));
                    break;
            }

        }
    }

}
