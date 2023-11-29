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
    private int numberRoom;
    private Map<String, Exit> exits;
    private List<Character> charactersRoom;
    private Inventory inventoryRoom;
    private static final int INVENTORY_MAW_WEIGHT = 5;
    
    public int getNumberRoom(){
        return this.numberRoom;
    }

    public Map<String, Exit> getExits(){
        return exits;
    }

    public List<Character> getCharactersRoom(){
        return charactersRoom;
    }
    
    public Inventory getInventoryRoom(){
        return inventoryRoom;
    }
    
    public Character findCharacterByName(String characterName){
        for (Character character : charactersRoom) {
            if (character.getName().equals(characterName)) {
                return character; // Character found
            }
        }
        return null; // Character not found
    } 

    public void setCharacterRoom(int i, Character character){
        charactersRoom.add(i, character);
    }

    public void setInventoryRoom(Item item){
        inventoryRoom.addItem(item);
    }

    public Room(String name, String description, int numberRoom){
        this.name = name;
        this.description = description;
        this.numberRoom = numberRoom;
        this.exits = new HashMap<>();
        this.charactersRoom = new ArrayList<>();
        this.inventoryRoom = new Inventory(INVENTORY_MAW_WEIGHT);
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
