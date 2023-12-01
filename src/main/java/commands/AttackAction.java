/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.Hero;
import main.Manor;
import main.Character;
import main.Hostile;
import main.Room;

/**
 *
 * @author grand
 */
public class AttackAction implements Action{

    @Override
    public void doAction(Manor manor, String noun){
        Hero hero = manor.getHero();
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
        Character character = currentRoom.findCharacterByName(noun);
        if(character != null){
           if(character instanceof Hostile){
               if( ((Hostile) character).isAlive()){
                   hero.attack(((Hostile)character));
               } else{
                   System.out.println("It looks like " + noun + "has already died.");
               }
           } else{
               System.out.println("You shouldn't attack defenceless creatures.");
           }
        } else{
           System.out.println(noun + " isn't in the room.");
        }
    }
}
