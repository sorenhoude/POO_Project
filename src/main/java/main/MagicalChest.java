/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class MagicalChest extends Item{
    private final int CHEST_WEIGHT = 100;
    private Inventory inventory;
    private static final MagicalChest THE_MAGICAL_CHEST = new MagicalChest();

    public MagicalChest() {
        super();
        this.weight = CHEST_WEIGHT;
        this.name = "Magical Chest";
        this.description = "You notice in front of you a shiny chest. It is so large, it should be able to contain pretty much anything you want..";
        this.inventory = new Inventory(500);
    }
    
    public Inventory getInventory() {
        return this.inventory;
    }
    
    // Use a static method to get the singleton instance
    public static MagicalChest getTheMagicalChest() {
        return THE_MAGICAL_CHEST;
    }
}
