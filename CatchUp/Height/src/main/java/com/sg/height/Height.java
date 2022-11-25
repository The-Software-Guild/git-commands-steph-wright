/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.height;

/**
 *
 * @author steph
 */
public class Height {

    private int feet, inches;
    

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }
    
    
    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
    public void addHeights(Height h1, Height h2) {
        int totalInchesH1 = h1.getInches() + (h1.getFeet() * 12);
        int totalInchesH2 = h2.getInches() + (h2.getFeet() * 12);
        int totalInches = totalInchesH1 + totalInchesH2;
        this.feet = Math.floorDiv(totalInches, 12);
        this.inches = totalInches % 12;
    }
}
