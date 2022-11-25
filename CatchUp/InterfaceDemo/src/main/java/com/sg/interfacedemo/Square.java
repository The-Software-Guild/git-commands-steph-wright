/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.interfacedemo;

/**
 *
 * @author steph
 */
public class Square implements Drawable, Fillable {

    @Override
    public void drawingColor() {
        System.out.println("The square is being drawn in a color.");
    }

    @Override
    public void thickness() {
        System.out.println("The square is being drawn with a specific thickness");
    }

    @Override
    public void fillingColor() {
        System.out.println("The square is being filled with a color");
    }

    @Override
    public void size() {
        System.out.println("The square is a size");
    }
    
}
