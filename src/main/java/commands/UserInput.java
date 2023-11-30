/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import main.Manor;

/**
 *
 * @author grand
 */
public class UserInput {
    
    Command c = new Command();
    
    List<String> verbs = new ArrayList<>(Arrays.asList(
            "go", "help", "quit", "look", "take", "use",
            "attack", "buy", "read", "talk", "sleep", "drop"));
    
     List<String> objects = new ArrayList<>(Arrays.asList(
            "Kitchen", "Pantry", "Basement", "Bathroom", "Attic", "Library", "Bedroom", "Office", "Garage",
             "Corridor_first_floor", "Main_corridor", "Living_room", "Dining_room", "Fluorescent_Ghost", 
             "Old_Bear", "Shrek", "Your_Old_Friend_Samuel", "Tooth_Fairy", "Rich_Business_Man", "Dragon", 
             "Small_Goblin", "Bob_the_Zombie", "Angry_Santa", "Sparkling_Devil", "Strength_Potion", "Healing_Potion", 
             "Bow", "Gun", "Clue1", "Clue2", "Clue3", "Clue4", "Clue5", "Clue6", "Clue7", "Clue8", "Goldcoin",
              "Key", "Magical_Chest", "Sword", "Mace", "Dagger", "Flower", "Mirror", "Apple", "Bracelet", "Ring",
               "Cool_Hat"));

    public void parseCommand(List <String> wordlist, Manor manor){
        String verb = wordlist.get(0);
        String noun1 = (wordlist.size() > 1) ? wordlist.get(1) : "";
        String noun2 = (wordlist.size() > 2) ? wordlist.get(2) : "";
        
        if(wordlist.size() > 3){
            System.out.println("That's way too many words...");
            return;
        } 
        
        if(!verbs.contains(verb)){
            System.out.println(verb + " isn't a usable command!");
            return;
        }
        
        if(wordlist.size() > 1 && !objects.contains(noun1)){
            System.out.println(noun1 + " isn't a known noun!");
            return;
        }
        
        if(wordlist.size() > 2 && !objects.contains(noun2)){
            System.out.println(noun2 + " isn't a known noun!");
            return;
        }
        
        c.doCommand(manor, verb, noun1, noun2);
        
    }
    
    //retourne une liste des mots que l'utilisateur a tapé
    public List<String> wordList(String input){
        String delims = " \t,.:;?!\"'";
        List<String> strlist = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(input, delims);
        String t;
        while(tokenizer.hasMoreTokens()){
            t = tokenizer.nextToken();
            strlist.add(t);
        }
        return strlist;
    }
    
    public void runCommand(String input, Manor manor){
        List<String> wordlist;
        String lowstr = input.trim().toLowerCase();
        if(lowstr.equals("")){
            System.out.println("You must return a command!");
        } else{
            wordlist = wordList(lowstr);
            parseCommand(wordlist, manor);
        }
    }
}
