/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.interfacedemo;

/**
 *
 * @author steph
 */
public class Line implements Drawable {

    @Override
    public void drawingColor() {
        System.out.println("The line has been drawn in a color.");
    }

    @Override
    public void thickness() {
        System.out.println("The line has a specific thickness.");
    }
    
}
