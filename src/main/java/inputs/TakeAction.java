/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;

/**
 *
 * @author grand
 */
public class TakeAction implements Action{

     @Override
    public void doAction(Manor manor, String noun){
        if(isInTheRoom(noun)){
            Inventory heroInventory = hero.getInventory();
            Inventory roomInventory = hero.getInventory();
            Item object = roomInventory.findItemByName(noun);
            heroInventory.addItem(object);
        } else{
            System.out.println("You can't take " + noun + ". It isn't in the room.");
        }
    }
}
