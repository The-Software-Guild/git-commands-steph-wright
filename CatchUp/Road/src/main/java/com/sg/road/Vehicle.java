/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.road;

/**
 *
 * @author steph
 */
public class Vehicle {
    
    protected String colour;
    protected int wheels;
    protected String model;

    public Vehicle(String colour, int wheels, String model) {
        this.colour = colour;
        this.wheels = wheels;
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void accelerate() {
        System.out.println("A " + this.getColour() + " " + this.getModel() + 
                " is accelerating!");
    }
    
    
    public void drive() {
        System.out.println("A " + this.getColour() + " " + this.getModel() + 
                " is driving along the road.");
    }
    
    public void turnOff() {
        System.out.println("A " + this.getColour() + " " + this.getModel() + 
                " has turned onto a different road.");
    }
}
