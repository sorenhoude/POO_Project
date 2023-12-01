/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;
import main.Room;

/**
 *
 * @author grand
 */
public class SleepAction implements Action{

    public void doAction(Manor manor) {
        Hero hero = manor.getHero();
        Room currentRoom = manor.findRoomByNumber(hero.getRoomNumber());
        Inventory inventoryRoom = currentRoom.getInventoryRoom();
        Item item = inventoryRoom.findItemByName("Bed");
        if(item != null){
            System.out.println("After a few hours of dreamless slumber, you've waken up. You're fully rested.");
            hero.isHealed();
        } else{
            System.out.println("You shouldn't sleep on the floor. You should keep an eye out for a bed.");
        }
    }

    @Override
    public void doAction(Manor manor, String noun) {
        
    }
    
}
