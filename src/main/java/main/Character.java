/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public abstract class Character extends Thing{
    protected String dialogue;

    public String getDialogue(){
        return dialogue;
    }

    public void setDialogue(String dialogue){
        this.dialogue = dialogue;
    }
}
