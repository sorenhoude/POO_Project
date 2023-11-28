/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Bed extends Item{
    private final int BED_WEIGHT = 100;
    private boolean isInBed;
    
    public Bed() {
        super();
        this.weight = BED_WEIGHT;
        this.name = "Comfortable Bed";
        this.description = "You notice in the middle of the room a king sized bed with many pillows and blankets. It looks like the perfect place to get some rest..";
        this.isInBed = false;
    }
}
