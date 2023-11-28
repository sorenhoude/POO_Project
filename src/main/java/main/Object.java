/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Object extends Item {
    protected final static int OBJECT_TYPE = 5;
    
    public Object(String name, int weight, String description){
        this.weight = weight;
        this.objectType = OBJECT_TYPE;
        this.name = name;
        this.description = description;
    }
}
