/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.HealingPotion;
import main.Hero;
import static main.Hero.getTheHero;
import main.Inventory;
import main.Item;
import main.Manor;
import main.Weapon;

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
            } else if(object.objectType == 2){
                if(object instanceof HealingPotion){
                    
                } else{
                    
                }
            }else {  
                System.out.println("You can't use that object.");       
            }
        } else{
            System.out.println("You don't have " + noun + " in your inventory.");
        }
    }
    
    public void doAction(Manor manor, String noun1, String noun2){
        
    }
    
}
