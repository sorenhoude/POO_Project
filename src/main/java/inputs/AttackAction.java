/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

/**
 *
 * @author grand
 */
public class AttackAction implements Action{

    @Override
    public void doAction() {
        System.out.println();
    }
    
    public void doAction(String noun){
        //si il y a un *noun* dans la pièce et qu'il est en vie,
        //on fait attack() dans Hero
        System.out.println("ACTION = ATTACK IS WORKING");
    }
}
