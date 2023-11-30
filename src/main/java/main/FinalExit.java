package main;

import java.util.Scanner;

/**
 *  This is a class to define exits with an unlock keyword 
 * @author Gabrielle
 * @see ExitWithKey
 * @see ExitWithCode
 * @see Exit
 */
public class FinalExit extends ExitWithKey {
    /**The unlock keyword*/
    private final String WORD = "TREASURE";

    /**
     * Constructor of FinalExit
     * @param number : The exit number
     */
    public FinalExit(int number){
        super(number);
    }
    
    /**
     * Method to retrieve the keyword entered by user
     * @return The keyword entered
     */
    public String getWord(){
        System.out.println("Enter the keyword to unlock the door : ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        return input;
    }

    /**
     * Method to unlock the exit
     * @param word : The keyword
     */
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