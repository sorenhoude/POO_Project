/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Friendly extends Character {
    
    public Friendly(String name, String description, Inventory inventory){
        this.name = name;
        this.description = description;
        //setInventory(inventory);
        setDialogue("I am " + this.name + " : " + this.description + ". I am here to help you.");
    }

    @Override
    public String toString(){
        String s = name + "\n" + description;
        return s;
    }
}
