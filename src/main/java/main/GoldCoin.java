/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class GoldCoin extends Item {
    protected final static int OBJECT_TYPE = 4;
    private int nbCoins;
    
    public GoldCoin(int nbCoins){
        this.weight = 1;
        this.name = "Gold coin";
        this.description = "Having gold is always a pleasure.";
        this.objectType = OBJECT_TYPE;
        this.nbCoins = nbCoins;
    }
    
    public int getNbCoins(){
        return this.nbCoins;
    }
}
