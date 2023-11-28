/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import main.Manor;

/**
 *
 * @author grand
 */
public class QuitAction implements Action{

    public void doAction() {
        System.exit(0);
    }

    @Override
    public void doAction(Manor manor, String noun) {
        
    }
    
}
