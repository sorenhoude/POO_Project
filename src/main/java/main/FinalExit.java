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
public class FinalExit extends ExitWithKey {
    //private boolean lockStatus;
    private final String WORD = "TREASURE";

    public FinalExit(int number){
        super(number);
    }
    
    public String getWord(){
        System.out.println("Enter the keyword to unlock the door : ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        return input;
    }

    public void unlock(String word){
        if(word.equals(this.WORD)){
            this.lockStatus = false;
        }
        else{
            System.out.println("The keyword is incorrect! Please retry.");
        }
    }

    @Override
    public void open(){
        super.open();
    }
}