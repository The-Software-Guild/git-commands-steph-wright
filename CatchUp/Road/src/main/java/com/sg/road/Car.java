/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.road;

/**
 *
 * @author steph
 */
public class Car extends Vehicle {
    
    protected boolean isElectric;
    
    public Car(String colour, int wheels, String model, boolean isElectric) {
        super(colour, wheels, model);
        this.isElectric = isElectric;
    }

    public boolean isIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
    
    
    
    public void beep() {
        System.out.println("A " + this.getColour() + " " + this.getModel() + 
                " goes BEEP!");
    }
    
    public void drivingSound() {
        if (this.isElectric == false) {
            System.out.println("Broom Broom...");
        } else {
            System.out.println("Silence...");
        }
    }
}
