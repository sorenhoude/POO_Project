/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class HealingPotion extends Potion {
    
    public HealingPotion() {
        super();
        this.name = "Healing_Potion";
        this.description = "Heals the user completely.";
    }
    
    public HealingPotion(int price) {
        super();
        this.name = "Healing_Potion";
        this.description = "Heals the user completely.";
        this.price = price;
    }
}
