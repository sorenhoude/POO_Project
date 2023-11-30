/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class StrengthPotion extends Potion {
    
    public StrengthPotion() {
        super();
        this.name = "Strength_Potion";
        this.description = "Multiplies the damage of the hero by 2.";
    }
    
    public StrengthPotion(int price) {
        super();
        this.name = "Strength_Potion";
        this.description = "Multiplies the damage of the hero by 2.";
        this.price = price;
    }
    
}
