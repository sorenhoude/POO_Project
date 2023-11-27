/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Exit {
    private int number;
    private boolean isOpen;

    public int getNumber(){
        return number;
    }

    public boolean getIsOpen(){
        return isOpen;
    }

    public Exit(int number){
        this.number = number;
        this.isOpen = false;
    }

    @Override
    public String toString(){
        String s = "The exit is open -> " + getIsOpen();
        return s;
    }

    public void open(){
        isOpen = true;
    }
}
