/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.Hero;
import main.Character;
import main.Friendly;
import main.Hostile;
import main.Manor;
import main.Room;


/**
 *
 * @author grand
 */
public class TalkAction implements Action{

   @Override
    public void doAction(Manor manor, String noun){
        Hero hero = manor.getHero();
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
        Character character = currentRoom.findCharacterByName(noun);
        if(character != null){
            /*if(character instanceof Friendly && ((Friendly) character).getHasCode()){
                ((Friendly) character).setHasGivenCode();
            }*/
            String s = character.getDialogue();
            System.out.println(s);
        } else{
            System.out.println(noun + " isn't in the room..");
        }
    }
}
