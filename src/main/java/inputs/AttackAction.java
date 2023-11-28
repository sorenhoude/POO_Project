/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.Hero;
import static main.Hero.getTheHero;
import main.Manor;

/**
 *
 * @author grand
 */
public class AttackAction implements Action{

    @Override
    public void doAction(Manor manor, String noun){
        //si il y a un *noun* dans la pièce et qu'il est en vie et qu'il est hostile,
        //on fait attack() dans Hero
       // System.out.println("ACTION = ATTACK IS WORKING");
       if(isInTheRoom(noun) && isHostile(noun)){
           Hero hero = manor.getHero();
           if(isAlive(room)){
               hero.attack();
           } else{
               System.out.println("It looks like this enemy has already died.");
           }
       } else {
           System.out.println(noun + " can't be attacked.");
       }
    }
}
