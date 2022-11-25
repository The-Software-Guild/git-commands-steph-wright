/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.road;

/**
 *
 * @author steph
 */
public class Motorcycle extends Vehicle {

    public Motorcycle(String colour, int wheels, String model) {
        super(colour, wheels, model);
    }
    
    public void zoom() {
        System.out.println("Zoooooooooom");
    }
    
    public void trafficNavigation(boolean isThereTraffic) {
        if (isThereTraffic) {
            System.out.println("A " + this.colour + " " + this.model + 
                    " is winding through the traffic!");
        } else {
            System.out.println("A " + this.colour + " " + this.model + 
                    "zips down the road.");
        }
    }
}
