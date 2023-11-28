/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class GoldCoin extends Item {
    protected final static int OBJECT_TYPE = 4;
    
    public GoldCoin(){
        this.weight = 1;
        this.name = "Gold coin";
        this.description = "Having gold is always a pleasure.";
        this.objectType = OBJECT_TYPE;
    }
}
