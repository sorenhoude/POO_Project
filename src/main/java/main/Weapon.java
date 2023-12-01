/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Weapon extends Item {
    protected int damage;
    protected int ammo;
    protected final int AMMO_MAX = 3;
    protected final static int OBJECT_TYPE = 1;
    
    public int getAmmo(){
        return this.ammo;
    }
    
    public Weapon(int damage, int weight, String name, String description){
        this.ammo = AMMO_MAX;
        this.objectType = OBJECT_TYPE;
        this.damage = damage;
        this.weight = weight;
        this.name = name;
        this.description = description;
    }
    
    public Weapon(int damage, int weight, String name, String description, int price){
        this.ammo = AMMO_MAX;
        this.objectType = OBJECT_TYPE;
        this.damage = damage;
        this.weight = weight;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void reload(){
        this.ammo = AMMO_MAX;

    }
    public Boolean shoot(){
        if (this.ammo>0){
            this.ammo=-1;
            return true;
        } else{
            System.out.println("No more ammo, reload to shoot."); 
            return false;
        }
    }
}

