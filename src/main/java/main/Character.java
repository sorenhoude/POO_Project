package main;

/**
 * Abstract class to group characters and their common characteristics
 * @author Gabrielle
 * @see Thing
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
