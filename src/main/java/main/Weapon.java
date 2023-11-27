/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public abstract class Weapon extends Item {
    protected int damage;
    protected int ammo;
    protected final int AMMO_MAX = 1;
    
    public Weapon() {
        this.ammo = AMMO_MAX;
    }

    public void reload(){
        this.ammo = AMMO_MAX;

    }
    public Boolean shoot(){
        if (this.ammo>0){
             this.ammo=-1;
            return true;
        }
            else{
                System.out.println("No more ammo, reload to shoot."); 
                return false;
            }
    }
}
