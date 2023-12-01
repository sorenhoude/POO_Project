/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grand
 */
public class Inventory {
    private int maxWeight;
    private List<Item> items;
    private int weight;
    
    public List<Item> getItems(){
        return items;
    }
    
    public Inventory(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.weight = 0;
    }
    
    public Inventory(int maxWeight, List<Item> items, int weight){
        this.maxWeight = maxWeight;
        this.items = items;
        this.weight = weight;
    }
    
    public void printIventory(){
        System.out.println("There are " + this.items.size() + " items.");
        for(Item n : this.items){
            System.out.println(n.name);
        }
    }

    public boolean isItemInList(Item item){
        return this.items.contains(item);
    }
    
    public boolean hasKeyInInventory(){
        for (Item item : items) {
            if (item.getName().equals("Key")) {
                return true;
            }
        }
        return false;
    }
    
    public Item findItemByName(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                return item; // Item found
            }
        }
        return null; // Item not found
    } 
    
    public void removeItem(Item item){
        this.weight -= item.weight;
        items.remove(item);
    }
    
    public boolean addItem(Item item){
        if ((weight+item.weight) < maxWeight){
            items.add(item);
            return true;
        } else {
            System.out.println("Maximal weight reached : you can't add any more items!");
            System.out.println("You should try the command *drop something* to make room for something else.");
        } 
        return false;
    }
    
    public Item findItem(Item searchedItem){
        for (Item item : items) {
            if (item.equals(searchedItem)) {
                return item; // Item found
            }
        }
        return null; // Item not found
    } 
}
