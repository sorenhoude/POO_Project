/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author grand
 */
public class Room extends Thing {
    private int numberRoom;
    private Map<String, Exit> exits;
    private List<Character> charactersRoom;
    private Inventory inventoryRoom;
    private static final int INVENTORY_MAX_WEIGHT = 500;
    
    public int getNumberRoom(){
        return this.numberRoom;
    }
    public Map<String, Exit> getExits(){
        return exits;
    }
    public Exit getExitByNameRoom(String nameNextRoom){
        Exit exit = null;
        for(int i = 0; i < exits.size(); i++){
            if(exits.containsKey(nameNextRoom)){
                exit = exits.get(nameNextRoom);
            }
        }
        return exit;
    }
    public List<Character> getCharactersRoom(){
        return charactersRoom;
    }
    public Inventory getInventoryRoom(){
        return inventoryRoom;
    }

    public void setExits(String nameRoom, Exit exit){
        this.exits.put(nameRoom, exit);
    }

    public void setCharacterRoom(Character character){
        charactersRoom.add(character);
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
    
    public void printExits(){
        System.out.println("You have " + exits.size() + " possible exit(s).");
        Set<String> nextRooms = exits.keySet();
        for(String nextRoom : nextRooms){
            System.out.println("- to the " +nextRoom);
        }
    }

    public void printCharactersRoom(){
        if(charactersRoom.isEmpty()){
            System.out.println("There are no characters in this room.");
        }
        else{
            System.out.println("There is/are " + charactersRoom.size() + " chraracter(s) in this room.");
            for(Character c : this.charactersRoom){
                System.out.println("-" + c.name);
            }      
        }
    }

    public void printItemsRoom(){
        if(inventoryRoom.getItems().isEmpty()){
            System.out.println("There are no items here.");
        }
        else{
            inventoryRoom.printIventory();
        }
    }

    public Character findCharacterByName(String characterName){
        for (Character character : charactersRoom) {
            if (character.getName().equals(characterName)) {
                return character; // Character found
            }
        }
        return null; // Character not found
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

    public boolean hasHostile(){
        boolean res = false;
        for(int i = 0; i < charactersRoom.size(); i++){
            if(charactersRoom.get(i) instanceof Hostile ){
                res = true;
            }
        }
        return res;
    }
}
