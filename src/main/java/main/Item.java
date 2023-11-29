/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public abstract class Item extends Thing{
    protected int weight;
    protected int objectType;
    protected int price;
    //protected ItemType type; (?) pas utile
    //protected String itemName;
    //protected String description; extends Thing donc pas besoin
    
    public int getPrice(){
        return this.price;
    }
    
    public int getObjectType(){
        return this.objectType;
    }
}
