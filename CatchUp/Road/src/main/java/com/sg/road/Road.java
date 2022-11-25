/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.road;

/**
 *
 * @author steph
 */
public class Road {

    public static void main(String[] args) {
        
        boolean isThereTraffic = true;
        
        // instantiate objects
        Car car = new Car("red", 4, "Ford Fiesta", false);
        Motorcycle bike = new Motorcycle("blue", 2, "Suzuki GS500");
        
        // road activity
        car.accelerate();
        bike.accelerate();
        
        bike.trafficNavigation(isThereTraffic);
        car.beep();
        
        car.drive();
        car.drivingSound();
        car.turnOff();
        bike.turnOff();
    }
}
