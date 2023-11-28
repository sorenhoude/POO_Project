/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.Item;
import main.Manor;

/**
 *
 * @author grand
 */
public class LookAction implements Action{
    
    @Override
    public void doAction(Manor manor, String noun){
        //System.out.println("ACTION = LOOK IS WORKING");
        if(isInTheRoom(noun)){
            Item object = roomInventory.findItemByName(noun);
            String s = object.getDescription();
            System.out.println(s);
        } else{
            System.out.println(noun + " isn't in the room..");
        }
    }
    
    public void doAction(Manor manor, String noun, String noun2){
        
    }
    
    public void doAction(Manor manor){
        
    }
    
}
