/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.Exit;
import main.ExitWithCode;
import main.ExitWithKey;
import main.FinalExit;
import main.Hero;
import main.Inventory;
import main.Key;
import main.Manor;
import main.Room;

/**
 *
 * @author grand
 */
public class GoAction implements Action{

    @Override
    public void doAction(Manor manor, String noun){
        Hero hero = manor.getHero();
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
        if(currentRoom.hasAnExit(noun)){
            if(!currentRoom.hasHostile()){
                Exit exit = currentRoom.getExitByNameRoom(noun);
                Room nextRoom = manor.findRoomByName(noun);
                int numNextRoom = nextRoom.getNumberRoom();
                if(exit instanceof ExitWithKey){
                    if(((ExitWithKey) exit).getLockStatus()){
                        Inventory heroInventory = hero.getInventory();
                        if(heroInventory.hasKeyInInventory()){
                            Key key = (Key) heroInventory.findItemByName("Key");
                            ((ExitWithKey) exit).unlock(key);
                            hero.takeItemOutOfBag(key);
                        }
                        ((ExitWithKey) exit).open();
                    }
                    if(!((ExitWithKey) exit).getLockStatus()){
                        hero.setRoomNumber(numNextRoom);
                        String s = nextRoom.getDescription();
                        System.out.println(s);
                    }else{
                        System.out.println("Without the key, you couldn't open the door.");
                    }
                } else if(exit instanceof ExitWithCode){
                    if(((ExitWithCode) exit).getLockStatus()){
                        System.out.println("Please, unlock the exit and retry.");
                    }
                    ((ExitWithCode) exit).open();
                    if(!((ExitWithCode) exit).getLockStatus()){
                        hero.setRoomNumber(numNextRoom);
                        String s = nextRoom.getDescription();
                        System.out.println(s);
                    }
            } else if(exit instanceof FinalExit){
                //il faut avoir tous les indices et former le mot gagnant  :  " T R E A S U R E  "
                if(((FinalExit) exit).getLockStatus()){
                    System.out.println("Please, unlock the exit and retry.");
                }
                ((FinalExit) exit).open();
                if(!((FinalExit) exit).getLockStatus()){
                    hero.setRoomNumber(numNextRoom);
                    String s = nextRoom.getDescription();
                    System.out.println(s);
                }
            } else{
                if(!exit.getIsOpen()){
                    exit.open();
                }
                hero.setRoomNumber(numNextRoom);
                String s = nextRoom.getDescription();
                System.out.println(s);
            }
            }else{
                System.out.println("It looks like there are still enemies in the room preventing you from reaching the exit.");
            }
        } else{
            System.out.println("You can't access the " + noun + " from there.");
        }
    }
}
