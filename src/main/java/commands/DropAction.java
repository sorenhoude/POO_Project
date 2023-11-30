/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.Hero;
import main.Inventory;
import main.Item;
import main.MagicalChest;
import static main.MagicalChest.getTheMagicalChest;
import main.Manor;

/**
 *
 * @author grand
 */
public class DropAction implements Action{

    @Override
    public void doAction(Manor manor, String noun){
        //System.out.println("ACTION = DROP IS WORKING");
        Hero hero = manor.getHero();
        Inventory heroInventory = hero.getInventory();
        Item object = heroInventory.findItemByName(noun);
        if(object != null){
             hero.takeItemOutOfBag(object);
             //mettre l'item dans le coffre magique
             MagicalChest magicalChest = getTheMagicalChest();
             Inventory chestInventory = magicalChest.getInventory();
             chestInventory.addItem(object);
             System.out.println(noun + "has been dropped!");
        } else {
            System.out.println(noun + " wasn't in your inventory...");
        }
    }
}
