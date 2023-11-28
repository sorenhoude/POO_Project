/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public abstract class Character extends Thing{
    private Inventory inventoryCharacter;
    private String dialogue;

    public Inventory getInventoryCharacter(){
        return inventoryCharacter;
    }

    public void setInventoryCharacter(Inventory inventory){
        this.inventoryCharacter = inventory;
    }

    public String getDialogue(){
        return dialogue;
    }

    public void setDialogue(String dialogue){
        this.dialogue = dialogue;
    }
}
