/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Recharge extends Item {
    private final int RECHARGE_WEIGHT = 2;
    protected final static int OBJECT_TYPE = 7;

    public Recharge() {
        super();
        this.weight = RECHARGE_WEIGHT;
        this.name = "Recharge";
        this.description = "This item allow you to recharge any weapon !";
        this.objectType = OBJECT_TYPE;
    } 
}
