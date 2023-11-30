package main;

/**
 *  This is a class to define standard exits.
 * @author Gabrielle
 * @see ExitWithKey
 * @see ExitWithCode
 */

public class Exit {
    /**The exit number*/
    private int number;

    /**The exit opening status (true -> exit is open, false -> exit is closed)*/
    private boolean isOpen;

    /**
     * @return The exit number
     * */
    public int getNumber(){
        return number;
    }

    /**
     * @return The exit status
     * */
    public boolean getIsOpen(){
        return isOpen;
    }

    /**
     * Exit constructor
     * @param number : The exit number
     */
    public Exit(int number){
        this.number = number;
        this.isOpen = false;
    }

    /**
     * Method to open an exit
     */
    public void open(){
        isOpen = true;
    }
}
