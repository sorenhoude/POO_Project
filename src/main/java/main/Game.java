package main;

import commands.UserInput;
import java.util.Scanner;

/**
 *
 * @author grand
 */
public class Game {
    
    public static String getName(Scanner sc){
        System.out.println("Hi there! Enter your name : ");
        
        String input = sc.nextLine();
        return input;
    }
    public static void gameLoop(Manor manor, Hero hero ,Scanner sc){
        UserInput userInput = new UserInput();
        String input = "";
        while (!"quit".equals(input) && hero.isAlive() && hero.getRoomNumber()!= 13){
        System.out.println("Enter a command ");
        input = sc.nextLine();
        userInput.runCommand(input, manor);
       }
    }
    public static void gameBegining(Manor manor, Hero hero){
        System.out.println("*************************************************************************************************************************");
        System.out.println("Welcome "+ hero.name+ "!\n");
        System.out.println ("You are a poor student who needs to find the treasure in this manor to be able to afford to stop eating at the crous.\n"+
        "You will have to go from room to room until you find the treasure.\n"+
        "Beware in some rooms there are bad guys you will have to fight.\n"+
        "In some rooms you will find good guys who will try to help you.\n"+ 
        "You will also find some buisness men who can sell you some stuff.");
        System.out.println("You will have to type commands to advance in the game. To see all the commands enter help.");
        System.out.println("*************************************************************************************************************************\n");

        System.out.println("You are in : " + manor.findRoomByNumber(hero.getRoomNumber()).getName());
        System.out.println(manor.findRoomByNumber(hero.getRoomNumber()).getDescription());
        manor.findRoomByNumber(hero.getRoomNumber()).printCharactersRoom();
        manor.findRoomByNumber(hero.getRoomNumber()).printItemsRoom();
        manor.findRoomByNumber(hero.getRoomNumber()).printExits();
        
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = getName(sc);
       Manor manor = new Manor(name);
       Hero hero = manor.getHero();
       String input = "";
       UserInput userInput = new UserInput();
       //Room currentRoom = manor.findRoomByNumber(hero.getRoomNumber());
       gameBegining(manor, hero);
       gameLoop(manor,hero,sc);
     
        
      if (hero.getRoomNumber()==13){
        do{
         System.out.println("You have to fight the dragon to win.Enter Command");
        input = sc.nextLine();
        } while (!"attack Dragon".equals(input));
        userInput.runCommand(input, manor);
        if (hero.isAlive()){
            System.out.println("You won the game.");
        }

       }
       sc.close();
       
       System.out.println("THE END");
    }
}
