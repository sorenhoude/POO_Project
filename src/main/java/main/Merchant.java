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
    private Inventory inventoryMerchant;

    public Inventory getInventoryMarchant(){
        return inventoryMerchant;
    }
    
    public Merchant(String name, String description, String dialogue, Inventory inventory){
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;
        this.inventoryMerchant = inventory;
    }
}
