/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.Hero;
import main.Manor;
import main.Room;

/**
 *
 * @author grand
 */
public class GoAction implements Action{

    @Override
    public void doAction(Manor manor, String noun){
        /*
        SI la pièce actuelle va vers String piece, alors
        getNum (room = noun)
        hero.numRoom = setNumRoom();
        dialogue de la room dont on vient d'entrer;
        */
        //System.out.println("ACTION = GO IS WORKING");
        Hero hero = manor.getHero();
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
        if(currentRoom.hasAnExit(noun)){
            Room nextRoom = manor.findRoomByName(noun);
            int numNextRoom = nextRoom.getNumberRoom();
            hero.setRoomNumber(numNextRoom);
            String s = nextRoom.getDescription();
            System.out.println(s);
        } else{
            System.out.println("You can't access the " + noun + " from there.");
        }
    }
    
}
