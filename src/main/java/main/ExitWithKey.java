package main;

/**
 * This is the class to define exits with a unlock key.
 * @author Gabrielle
 * @see Exit
 * @see ExitWithCode
 */
public class ExitWithKey extends Exit{
    /**The lock status of exit*/
    protected boolean lockStatus;

    /**
     * @return The lock status of exit
     * */
    public boolean getLockStatus(){
        return this.lockStatus;
    }

    /**
     * Constructor of ExitWithkey
     * @param number : The exit number
     */
    public ExitWithKey(int number){
        super(number);
        this.lockStatus = true;
    }

    /**
     * Method to unlock an exit with an unlock key
     * @param key : The object to unlock exit
     */
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

