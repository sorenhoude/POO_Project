/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class ExitWithCode extends Exit {
    private int code;
    private boolean lockStatus;

    public boolean getLockStatus(){
        return this.lockStatus;
    }

    public ExitWithCode(int number, int code){
        super(number);
        this.lockStatus = true;
        this.code = code;
    }

    public int getCode(){
        System.out.println("Enter door code : ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        s.close();
        return input;
    }

    public void unlock(int code){
        if(code == this.code){
            this.lockStatus = false;
        }
    }
    
    @Override
    public void open(){
        if(! this.lockStatus){
            super.open();
        }
    }
}
