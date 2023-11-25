/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

/**
 *
 * @author grand
 */
public class HelpAction implements Action{

    @Override
    public void doAction() {
        System.out.println("Here is the list of all the commands you can use: ");
        System.out.println("attack *enemy* : allow yous to attack someone you encounter.");
        System.out.println("buy *item* : allows you to purchase the item of your choice from a merchant.");
        System.out.println("go *room* : allows you to go to another room through the exit (if it exists).");
        System.out.println("look *something* : allows you to learn more about something of your choice.");
        System.out.println("quit : closes the game.");
        System.out.println("read *something* : allows you to read the clue you have found.");
        System.out.println("save : saves your current game.");
        System.out.println("sleep : allows you to rest peacefully.");
        System.out.println("take *item* : allows you to add the item of yout choice to your inventory.");
        System.out.println("talk *character* : allows you to engage in a conversation with a character.");
        System.out.println("use *item* : allows you to .");
        System.out.println("use *item1* *item2* : .");
    }
    
}
