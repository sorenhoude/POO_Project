/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package commands;

import main.Manor;

/**
 *
 * @author grand
 */
public interface Action {
    
    public abstract void doAction(Manor manor, String noun);
    
}
