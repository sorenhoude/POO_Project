/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.HealingPotion;
import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;
import main.Weapon;
import main.Recharge;

/**
 *
 * @author grand
 */
public class UseAction implements Action{

    @Override
    public void doAction(Manor manor, String noun){
        Hero hero = manor.getHero();
        Inventory heroInventory = hero.getInventory();
        Item object = heroInventory.findItemByName(noun);
        if(object != null){
            if(object instanceof Weapon){
                hero.putWeaponFromBagToHand((Weapon) object);
            } else if(object.getObjectType() == 2){
                if(object instanceof HealingPotion){
                    System.out.println("The potion has been used.");
                    hero.isHealed();
                    //heroInventory.removeItem(object);
                    hero.takeItemOutOfBag(object);
                } else{
                    System.out.println("The potion has been used.");
                    hero.isHealed();
                    heroInventory.removeItem(object);
                }
            }else {  
                System.out.println("You can't use that object.");       
            }
        } else{
            System.out.println("You don't have " + noun + " in your inventory.");
        }
    }
    
    public void doAction(Manor manor, String noun1, String noun2){
        Hero hero = manor.getHero();
        Inventory heroInventory = hero.getInventory();
        Item weapon = heroInventory.findItemByName(noun1);
        Item recharge = heroInventory.findItemByName(noun2);
        if(weapon != null && recharge != null){
            if(weapon instanceof Weapon && recharge instanceof Recharge)
            {
                ((Weapon) weapon).reload();
                heroInventory.removeItem(recharge);
            }else{
                System.out.println("You can't do that.");
            }
        }else{
            System.out.println("You can't use items that aren't in your inventory.");
        }
    }
}