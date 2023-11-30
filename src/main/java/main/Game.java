/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import commands.UserInput;
import java.util.Scanner;

/**
 *
 * @author grand
 */
public class Game {
    
    public static String getName(){
        System.out.println("Hi there! Enter your name : ");
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();
        sc1.close();
        return input;
    }
    
    public static void main(String[] args) {
       
       String input = "";
       String name = getName();

       Manor manor = new Manor(name);

       UserInput userInput = new UserInput();
       Scanner sc = new Scanner(System.in);
       while (!"quit".equals(input)){
        System.out.println("Enter a command ");
        input = sc.nextLine();
        userInput.runCommand(input, manor);
       }
       sc.close();
       
       System.out.println("THE END");
    }
    
}
