/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.Exit;
import main.ExitWithCode;
import main.FinalExit;
import main.Manor;
import main.Room;

/**
 *
 * @author grand
 */
public class UnlockAction implements Action {

    public void doAction(Manor manor, String noun, String code){
        int numroom = manor.getHero().getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numroom);
        
        if(currentRoom.hasAnExit(noun)){
            Exit exit = currentRoom.getExitByNameRoom(noun);
            if(exit instanceof ExitWithCode){
                ((ExitWithCode)exit).unlock(Integer.parseInt(code));
            }else if(exit instanceof FinalExit){
                ((FinalExit)exit).unlock(code);
            }
        }
    }

    @Override
    public void doAction(Manor manor, String noun) {
        
    }
}