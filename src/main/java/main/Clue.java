/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Clue extends Item {
    private final int CLUE_WEIGHT = 2;
    protected final static int OBJECT_TYPE = 3;

    public Clue(String name, String description) {
        super();
        this.weight = CLUE_WEIGHT;
        this.name = name;
        this.description = description;
        this.objectType = OBJECT_TYPE;
    }
    
}
