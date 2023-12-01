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
import main.Character;

/**
 *
 * @author grand
 */
public class LookAction implements Action{
    
    @Override
    public void doAction(Manor manor, String noun){
        String s;
        Hero hero = manor.getHero();
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
        Inventory inventoryRoom = currentRoom.getInventoryRoom();
        Item item = inventoryRoom.findItemByName(noun);
        Character character= currentRoom.findCharacterByName(noun);
        if(item != null){
            s = item.getDescription();
            System.out.println(s);
        } else if (character!= null){
            s= character.getDescription();
            System.out.println(s);
        } else{
            System.out.println(noun + " isn't in the room..");
        }
    }
    
    public void doAction(Manor manor, String noun, String noun2){
        doAction(manor, noun);
        doAction(manor, noun2);
    }
    
    public void doAction(Manor manor){
        Hero hero = manor.getHero();
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
        String s = currentRoom.getDescription();
        System.out.println(s);
    }
}
