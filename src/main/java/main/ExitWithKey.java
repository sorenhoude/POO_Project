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
    
    protected boolean lockStatus;

    public boolean getLockStatus(){
        return this.lockStatus;
    }

    public ExitWithKey(int number){
        super(number);
        this.lockStatus = true;
    }

    public void unlock(Key key){
        this.lockStatus = false;
    }

    @Override
    public void open(){
        if(! this.lockStatus){
            super.open();
        }
    }
}
