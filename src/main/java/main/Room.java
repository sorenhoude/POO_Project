/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author grand
 */
public class Room extends Thing {
    private Map<String, Exit> exits;
    private List<Character> charactersRoom;

    public Map<String, Exit> getExits(){
        return exits;
    }

    public List<Character> getCharactersRoom(){
        return charactersRoom;
    }

    public Room(String name, String description){
        this.name = name;
        this.description = description;
        this.exits = new HashMap<>();
        this.charactersRoom = new ArrayList<Character>();
    }

    public void printListcharactersRoom(){
        System.out.println("There are " + charactersRoom.size() + " chraracter(s) in this room.");
        for(Character n : this.charactersRoom){
            System.out.println(n);
        }
    }

    @Override
    public String toString(){
        String s = "You're in " +  name + ".\n" + description; 
        return s;
    }

    public void addCharacter(int i, Friendly character){
        charactersRoom.add(i, character);
    }
}
