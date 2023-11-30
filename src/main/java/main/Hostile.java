/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Hostile extends Character{
    
    private int hpHostile;
    private int damageHostile;
    
    public int getHpHostile(){
        return hpHostile;
    }
    public int getDamageHostile(){
        return damageHostile;
    }
    public void setHpHostile(int damage){
        this.hpHostile -= damage;
    }
    
    public Hostile(String name, String description, String dialogue, int hpHostile, int damageHostile){
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;
        this.hpHostile = hpHostile;
        this.damageHostile = damageHostile;
    }
    
    public boolean isAlive(){
        return hpHostile > 0;
    }
}
