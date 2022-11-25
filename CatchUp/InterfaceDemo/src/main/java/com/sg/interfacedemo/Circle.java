/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.interfacedemo;

/**
 *
 * @author steph
 */
public class Circle implements Drawable, Fillable{

    @Override
    public void drawingColor() {
        System.out.println("The circle is being drawn in a color");
    }

    @Override
    public void thickness() {
        System.out.println("The circle has a specified thickness");
    }

    @Override
    public void fillingColor() {
        System.out.println("The circle has been filled in in color");
    }

    @Override
    public void size() {
        System.out.println("The circle has a size");
    }
    
}
