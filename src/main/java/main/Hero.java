/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author grand
 */
public class Hero extends Thing {
    
    private static final int MAX_HP = 50;
    private int hp;
    private int damage;
    private int goldCount;
    private int roomNumber;
    private Inventory inventory;
    private Weapon weaponInHand;

    public Hero(String name) {
        this.name = name;
        this.description = "You are the hero of your own adventure.";
        this.hp = MAX_HP;
        this.damage = 3;
        this.inventory = new Inventory(30);
        this.goldCount = 0;
    }
    
    public int getHp(){
        return this.hp;
    }
    
    public int getGoldCount(){
        return this.goldCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
    
    //ajout Gabrielle
    public void setInventoryHero(Item item){
        this.inventory.addItem(item);
    }
    
    public boolean handEmpty(){
        return this.weaponInHand == null;
    }

    public void takeItemOutOfBag(Item item) {
        // Implement the logic to add the item to the inventory
        this.inventory.removeItem(item);
    }
    
    public boolean isWeaponInHand(Weapon weapon){
        return this.weaponInHand == weapon;
    }

    public void putWeaponInHandInInventory(){
        if (!handEmpty()){
            this.weaponInHand = null;
        }
    }
    public void putWeaponFromBagToHand(Weapon weapon){
        if (handEmpty()){
            this.weaponInHand = weapon;
            updateDamage();
        }else {
            System.out.println("You already have an item in hand.");
        }
    }
    public void updateDamage(){
        if (!handEmpty()){
            this.damage = this.weaponInHand.damage;
        }
    }
    
    public Weapon getWeaponInHand(){
        return this.weaponInHand;
    }

    public void attack(Hostile badguy){
        Weapon heroWeapon = getWeaponInHand();
        if(heroWeapon == null){
            System.out.println("You should *use* a weapon before attempting to fight someone..");
        } else{
            while(this.isAlive() || badguy.isAlive()){
                if (heroWeapon.shoot()){
                badguy.setHpHostile(badguy.getHpHostile() - this.damage);
                }
                this.hp -= badguy.getDamageHostile();                    //pb : les hp peuvent descendre en dessous de 0
            }
            if(this.isAlive()){
                System.out.println("You have slained your enemies.");
            } else{
                System.out.println("You've perished. GAME OVER");
                System.exit(0);
            }
            
        }
    }
   
    public void dropItem(){
        this.weaponInHand = null;
    }
    
    public boolean isAlive(){
        return hp >= 0;
    }
    
    
    public void isStronger(){
        this.damage = this.damage * 2;
        System.out.println("You became a lot stronger.");
    }
    
    
    public void isHealed(){
        this.hp = MAX_HP;
        System.out.println("You regained full life.");
        showHP();
    }
    
    public void showHP(){
        System.out.println("You have " + hp + " HP.");
    }
    
    public int getRoomNumber(){
        return this.roomNumber;
    }
    
    public void setRoomNumber(int num){
        this.roomNumber = num;
    }
    
    public boolean buyStuff(Item item){
        int price = item.getPrice();
        if(price > goldCount){
            System.out.println("It looks like you can't afford that.");
        }else{
            this.goldCount -= price;
            setInventoryHero(item);
            return true;
        }
        return false;
    }
    
    public void addCoins(int coins){
        this.goldCount += coins;
    }
}

