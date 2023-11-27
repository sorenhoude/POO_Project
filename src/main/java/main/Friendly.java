/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Friendly extends Thing implements Character {
    
    public Friendly(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString(){
        String s = name + "\n" + description;
        return s;
    }

    public void give(){

    }
}
