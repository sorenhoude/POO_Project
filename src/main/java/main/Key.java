/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Key extends Item {
    private static final int KEY_WEIGHT = 1;
    private static final int OBJECT_TYPE = 6;
    private static final int PRICE = 1;

    public Key(){
        this.name = "Key";
        this.description = "It opens a door.";
        this.weight = KEY_WEIGHT;
        this.objectType = OBJECT_TYPE;
        this.price = PRICE;
    }
}
