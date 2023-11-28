/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.Hero;
import main.Manor;

/**
 *
 * @author grand
 */
public class SleepAction implements Action{

    public void doAction(Manor manor) {
        Hero hero = manor.getHero();
        //si il n'est pas dans la pièce du lit, non
        //sinon, afficher 2 phrases s'endort/se réveille + les hp sont au max = méthode hpMax dans le hero  (+ sauvegarde)
        if(isInTheRoom(bed)){
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
