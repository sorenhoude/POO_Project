/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.Clue;
import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;

/**
 *
 * @author grand
 */
public class ReadAction implements Action{

    @Override
    public void doAction(Manor manor, String noun){
        //System.out.println("ACTION = READ IS WORKING");
        Hero hero = manor.getHero();
        Inventory heroInventory = hero.getInventory();
        Item object = heroInventory.findItemByName(noun);
        if(object != null && object instanceof Clue){
            String s = object.getDescription();
            System.out.println(s);
        } else{
            System.out.println("You can't read that.");
        }
    }
    
}
