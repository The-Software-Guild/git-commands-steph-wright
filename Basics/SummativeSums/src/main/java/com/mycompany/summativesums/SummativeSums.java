/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.summativesums;

/**
 *
 * @author steph
 */
public class SummativeSums {

    public static void main(String[] args) {
        int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arr2 = { 999, -60, -77, 14, 160, 301 };
        int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
        140, 150, 160, 170, 180, 190, 200, -99 } ;
        
        System.out.println(sumArray(arr1));
        System.out.println(sumArray(arr2));
        System.out.println(sumArray(arr3));
        
    }
    
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int x: array) {
            sum += x;
        }
        return sum;
    }
}
