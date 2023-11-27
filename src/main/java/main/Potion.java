/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public abstract class Potion extends Item{
    private final int POTION_WEIGHT = 3;

    public Potion() {
        super();
        this.weight = POTION_WEIGHT;
    }
    
}
