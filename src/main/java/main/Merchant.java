/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Merchant extends Character {
    
    public Merchant(String name, String description, Inventory inventoryMerchant){
        this.name = name;
        this.description = description;
        setInventoryCharacter(inventoryMerchant);
        setDialogue("I am " + this.name + " : " + this.description + ". You can buy item here.");
    }

    @Override
    public String toString(){
        String s = name + "\n" + description;
        return s;
    }
}
