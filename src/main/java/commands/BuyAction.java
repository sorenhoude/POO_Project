/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.Hero;
import main.Manor;
import main.Room;
import main.Character;
import main.Inventory;
import main.Item;
import main.Merchant;

/**
 *
 * @author grand
 */
public class BuyAction implements Action{
    
        @Override
    public void doAction(Manor manor, String noun){
        Hero hero = manor.getHero();
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
         Character character = currentRoom.findCharacterByName("Rich_Business_man");
        if(character != null){
            Inventory merchantInventory = ((Merchant) character).getInventoryMarchant();
            Item item = merchantInventory.findItemByName(noun);
            if(item != null){
                if(hero.buyStuff(item)){
                    System.out.println(noun + " was added to your inventory.");
                }
            } else{
                System.out.println("The merchant doesn't sell " + noun + " at the moment.");
            }
        } else{
            System.out.println("The merchant isn't in this room.");
        }
    }
}
