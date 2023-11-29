/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.GoldCoin;
import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;
import main.Room;

/**
 *
 * @author grand
 */
public class TakeAction implements Action{

     @Override
    public void doAction(Manor manor, String noun){
        Hero hero = manor.getHero();
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
        Inventory inventoryRoom = currentRoom.getInventoryRoom();
        Item object = inventoryRoom.findItemByName(noun);
        if(object != null){
            Inventory heroInventory = hero.getInventory();
            if(heroInventory.addItem(object)){
                inventoryRoom.removeItem(object);
                System.out.println(noun + " has been added to your inventory.");
                if(object.getObjectType() == 4){
                    int number = ((GoldCoin) object).getNbCoins();
                    hero.addCoins(number);
                    System.out.println("You've found " + number + " gold coins! How lucky.");
                }
            }
        } else{
            System.out.println("You can't take " + noun + ". It isn't in the room.");
        }
    }
}
