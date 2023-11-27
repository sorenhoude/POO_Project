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
    
    /* pas utile pour l'instant
    public Inventory(){
        this.maxWeight = 30;
        this.items = new ArrayList<>();
        this.weight = 0;
    }*/
    
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

    public Boolean isItemInList(Item item){
        return this.items.contains(item);
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
    
    public void addItem(Item item){
        if ((weight+item.weight) < maxWeight){
            items.add(item);
        } else {
            System.out.println("Maximal weight reached : you can't add any more items!");
            System.out.println("You should try the command *drop something* to make room for something else.");
        } 
    }
    
    public Object findItem(Item searchedItem){
        for (Item item : items) {
            if (item.equals(searchedItem)) {
                return item; // Item found
            }
        }
        return null; // Item not found
    } 
}
