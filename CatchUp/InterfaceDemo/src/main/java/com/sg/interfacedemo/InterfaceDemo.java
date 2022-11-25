/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.interfacedemo;

/**
 *
 * @author steph
 */
public class InterfaceDemo {

    public static void main(String[] args) {
        
        Line line = new Line();
        line.drawingColor();
        line.thickness();
        
        Circle circle = new Circle();
        circle.drawingColor();
        circle.thickness();
        circle.fillingColor();
        circle.size();
        
        Square square = new Square();
        square.drawingColor();
        square.thickness();
        square.fillingColor();
        square.size();
    }
}
