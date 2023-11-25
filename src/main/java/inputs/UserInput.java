/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author grand
 */
public class UserInput {
    
    Command c = new Command();
    
    List<String> commands = new ArrayList<>(Arrays.asList(
            "go", "help", "quit", "look", "take", "use",
            "attack", "buy", "read", "talk", "sleep", "save"));
    
     List<String> objects = new ArrayList<>(Arrays.asList(
            "sword", "mirror"));
     
     List<String> secondObject = new ArrayList<>(Arrays.asList(
            "arrow"));
    
    
    public String getName(){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return "Hello" + name + "!";
    }

    public void ParseCommand(List <String> wordlist){
        String verb = wordlist.get(0);
        String noun1 = wordlist.get(1);
        String noun2 = "";
        // List<String> commands = new ArrayList<>(Arrays.asList("take", "drop"));
        //List<String> objects = new ArrayList<>(Arrays.asList("sword", "potion"));
        //List<String> objects2 = new ArrayList<>(Arrays.asList("arrow"));
        if(wordlist.size() > 3){
            System.out.println("Only 3 word commands allowed!");
        } 
        else if(!commands.contains(verb)){
            System.out.println(verb + "isn't a known verb!");
        }
        else if(!objects.contains(noun1)){
            System.out.println(noun1 + "isn't a known noun!");
        }
        else if (!wordlist.get(2).equals("")){
            noun2 = wordlist.get(2);
            if(!secondObject.contains(noun2)){
            System.out.println(noun2 + "isn't a known noun!");
            }
        }
        else {
            c.doCommand(verb, noun1, noun2);
        }
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
    
    public void runCommand(String input){
        List<String> wordlist;
        String lowstr = input.trim().toLowerCase();
        if(lowstr.equals("")){
            System.out.println("You must return a command");
        } else{
            wordlist = wordList(lowstr);
            ParseCommand(wordlist);
        }
    }
    
    /*
    public void monMain(){
        String input, output;
        //faire l'affichage de la zone ou l'utilisateur doit écrire
        do{
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            runCommand(input);
        } while (!"quit".equals(input));
    }
    */
    
}
