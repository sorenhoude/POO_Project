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
    protected final static int OBJECT_TYPE = 2;

    public Potion() {
        super();
        this.weight = POTION_WEIGHT;
        this.objectType = OBJECT_TYPE;
    }
    
}
