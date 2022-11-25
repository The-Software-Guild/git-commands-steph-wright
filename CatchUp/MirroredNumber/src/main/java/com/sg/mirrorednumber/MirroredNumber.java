/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.mirrorednumber;

/**
 *
 * @author steph
 */
public class MirroredNumber {

    public static void main(String[] args) {
        MirroringClass m = new MirroringClass();
        m.setToBeMirrored(876);
        System.out.println(m.getMirroredNo());
    }
}
