package main;

import java.util.Scanner;

/**
 * This is the class to define exits with an unlock code.
 * @author Gabrielle
 * @see Exit
 * @see ExitWithKey
 */

public class ExitWithCode extends Exit {
    /**The code of exit.*/
    private int code;

    /**The lock status of exit (true -> the exit is locked, false -> the exit is unlock)*/
    private boolean lockStatus;

    /**
     * @return The exit lock status
     * */
    public boolean getLockStatus(){
        return this.lockStatus;
    }

    /**
     * Constructor of ExitWithCode
     * @param number : The exit number
     * @param code : The exit code
     */
    public ExitWithCode(int number, int code){
        super(number);
        this.lockStatus = true;
        this.code = code;
    }

    /**
     * Method to retrieve the code entered by user
     * @return The code entered
     */
    public int getCode(){
        System.out.println("Enter door code : ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        s.close();
        return input;
    }

    /**
     * Method to unlock an exit
     * @param code : The exit code
     */
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
