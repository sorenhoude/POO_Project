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
    //private String name;  //pas besoin, déja dans thing + mettre une description
    private int hp;
    private int damage;
    private int goldCount;
    private int roomNumber;
    private Inventory inventory;
    private Weapon weaponInHand;
    //private static final Hero THE_HERO = new Hero("Bob"); // Singleton (?)

    private Hero(String name) {
        this.name = name;
        this.description = "You are the hero of your own adventure.";
        this.hp = MAX_HP;
        this.damage = 3;
        this.inventory = new Inventory(30);
        this.goldCount = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
    
    //ajout Gabrielle
    public void setInventoryHero(Item item){
        inventory.addItem(item);
    }
    
    public boolean handEmpty(){
        return this.weaponInHand == null;
    }

    public void takeItemOutOfBag(Item item) {
        // Implement the logic to add the item to the inventory
        this.inventory.removeItem(item);
    }

    public void pay(int cost){
        this.goldCount -= cost;
    }
    public void takeDamage(int damage){
        if (this.hp > damage){
            this.hp -= damage;
        }else System.out.println("You died.");

    }

    public void putWeaponInHand(Weapon weapon){
        if (handEmpty()){
            this.weaponInHand= weapon;
        }else System.out.println("You already have an item in hand.");
    }
    public void putWeaponInHandInInventory(){
        if (!handEmpty()){
            inventory.addItem(weaponInHand);
            this.weaponInHand=null;
        }
    }
    public void putWeaponFromBagToHand(Weapon weapon){
            putWeaponInHand(weapon);
            inventory.removeItem(weapon);
    }
    public void updateDamage(){
        if (!handEmpty()){
            this.damage= this.weaponInHand.damage;
        }
    }
/*
    public void AttackBadGuy(Hostile badguy){
            badguy.setHp(badguy.getHp() - this.damage);
            this.hp -= badguy.getDamage();
    }
 */   
    public void dropItem(){
        this.weaponInHand = null;
    }
    
    
    
    
    
    public void isHealed(){
        this.hp = MAX_HP;
        System.out.println("You regained full life.");
        showHP();
    }
    
    public void showHP(){
        System.out.println("You have " + hp + " HP.");
    }
    
    public boolean isInTheRoom(String noun){
        int num = 
    }
    
    public Room getCurrentRoom(){
        return 
    }
    
    public int getRoomNumber(){
        return this.roomNumber;
    }
    
}
