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
    //protected ItemType type; (?) pas utile
    //protected String itemName;
    //protected String description; extends Thing donc pas besoin

    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
}
