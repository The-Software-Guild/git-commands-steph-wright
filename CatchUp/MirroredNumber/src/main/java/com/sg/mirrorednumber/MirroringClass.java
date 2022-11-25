/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.mirrorednumber;

/**
 *
 * @author steph
 */
public class MirroringClass {
    private int toBeMirrored, mirroredNo;

    public void setToBeMirrored(int toBeMirrored) {
        this.toBeMirrored = toBeMirrored;
    }

    public int getMirroredNo() {
        this.mirroredNo = mirror(this.toBeMirrored);
        return this.mirroredNo;
    }

    
    private int mirror(int toBeMirrored){
        while (toBeMirrored != 0) {
            mirroredNo = mirroredNo * 10;
            mirroredNo = mirroredNo + toBeMirrored % 10;
            toBeMirrored = toBeMirrored / 10;
                    }
        return mirroredNo;
    }
    
}
