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
    private static final int INVENTORY_MAX_WEIGHT = 200;
    
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
        this.inventoryRoom = new Inventory(INVENTORY_MAX_WEIGHT);
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
    
    public boolean hasAnExit(String nameRoom){
        boolean res = false;
        for(int i = 0; i < exits.size(); i++){
            if(exits.containsKey(nameRoom)){
                res = true;
            }
        }
        return res;
    }
    
    public Exit getExitByName(String nameNextRoom){
        Exit exit = null;
        for(int i = 0; i < exits.size(); i++){
            if(exits.containsKey(nameNextRoom)){
                exit = exits.get(nameNextRoom);
            }
        }
        return exit;
    }

    public void setExits(String nameRoom, Exit exit){
        this.exits.put(nameRoom, exit);
    }

    public void setCharacterRoom(Character character){
        charactersRoom.add(character);
    }
}
