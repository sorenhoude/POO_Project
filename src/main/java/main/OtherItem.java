/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class OtherItem extends Item {
    protected final static int OBJECT_TYPE = 5;
    
    public OtherItem(String name, int weight, String description){
        this.weight = weight;
        this.objectType = OBJECT_TYPE;
        this.name = name;
        this.description = description;
    }
    
    public OtherItem(String name, int weight, String description, int price){
        this.weight = weight;
        this.objectType = OBJECT_TYPE;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
