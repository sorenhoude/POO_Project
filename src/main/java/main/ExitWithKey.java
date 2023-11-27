/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class ExitWithKey extends Exit{
    
    private boolean lockStatus;

    public boolean getLockStatus(){
        return this.lockStatus;
    }

    public ExitWithKey(int number){
        super(number);
        this.lockStatus = true;
    }

    @Override
    public String toString(){
        String s =  "The exit is locked -> " + getLockStatus() + "\nThe exit is open -> " + getIsOpen();
        return s;
    }

    public void unlock(){

    }

    @Override
    public void open(){
        if(! this.lockStatus){
            super.open();
        }
    }
    
}
