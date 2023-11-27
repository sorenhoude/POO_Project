/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import inputs.UserInput;
import java.util.Scanner;

/**
 *
 * @author grand
 */
public class Manor {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
       // Game game = new Game();
       
       System.out.println("Enter a command ");
       String input, output;
       UserInput userInput = new UserInput();
       do{
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            userInput.runCommand(input);
        } while (!"quit".equals(input));
       
       System.out.println("THE END");
    }
}
