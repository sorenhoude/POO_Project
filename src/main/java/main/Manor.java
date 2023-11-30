/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.HashSet;
import java.util.Set;
import static main.MagicalChest.getTheMagicalChest;

/**
 *
 * @author grand
 */
public class Manor {
    
    private Set<Room> setRooms;
    private Hero hero;
    
    public Manor(String nameHero){

        //All exits
        Exit exit1 = new Exit(1);
        Exit exit2 = new Exit(2);
        Exit exit3 = new Exit(3);
        Exit exit4 = new Exit(4);
        Exit exit5 = new ExitWithCode(5, 141); //trois chiffre après la virgule de pi
        Exit exit6 = new Exit(6);
        Exit exit7 = new Exit(7);
        Exit exit8 = new Exit(8);
        Exit exit9 = new Exit(9);
        Exit exit10 = new ExitWithKey(10);
        Exit exit11 = new ExitWithKey(11);
        Exit exit12 = new Exit(12);
        Exit exit13 = new ExitWithCode(5, 113); //code : 6*8+65
        Exit exit14 = new FinalExit(14);



        //All characters

        //Friendly
        Character ghost = new Friendly("Fluorescent_Ghost", "This small creature seems inoffensive.", 
            "There's a zombie in the garage. Don't go!");

        Character bear = new Friendly("Old_Bear", "Always eating something.", 
            "Library code : the three digits after the decimal point of the number pi.");
        
        Character shrek = new Friendly("Shrek", "The sweetest ogre in the world.", 
            "If you want to open the library, go see the Old Bear.");

        Character samuel = new Friendly("Your_Old_Friend_Samuel", "He is giving away flyers.", 
            "There is a merchant on the first floor.");

        Character fairy = new Friendly("Tooth_Fairy", "This flying whimsical creature who has a giant tooth collection and will help you.", 
            "To achieve your goal, go to the office. The code is the answer to 6*8+65.");


        //Hostile
        Character dragon = new Hostile("Dragon", "This creature is very fierce.", 
            "You will not have my treasure!", 30, 15);

        Character goblin = new Hostile("Small_Goblin", "What is small is not necessarily cute.", 
            "Ih ih ih !", 10, 3);

        Character zombie = new Hostile("Bob_the_Zombie", "This creature will eat your brain.", 
            " *Growl* !!!", 10, 1);

        Character devil = new Hostile("Sparkling_Devil", "He will try to get your soul.", 
            "Do you want to make a deal ?", 15, 5);

        Character santa = new Hostile("Angry_Santa", "Some have not been nice.", 
            "No gift for you!", 10, 3);
        
        
        //Merchant
        Item healingpotionM = new HealingPotion(3);
        Item strengthpotionM = new StrengthPotion(5);
        Item weapon1 = new Weapon(5, 5, "Bow","This will help you kill bad guys.", 5);
        Item weapon2 = new Weapon(7, 7, "Gun","This is a little sparkling pink weapon.", 7);
        Inventory businessmanInventory = new Inventory(30);
        businessmanInventory.addItem(healingpotionM);
        businessmanInventory.addItem(strengthpotionM);
        businessmanInventory.addItem(weapon1);
        businessmanInventory.addItem(weapon2);
        Merchant businessman = new Merchant("Rich_Business_Man", "He has everything you need.", 
            "Can I help you ? Potion or weapon ?", businessmanInventory);

        
        //All Clues
        Item clue1 = new Clue("Clue1", "You've found this piece of paper with a single letter on it : T");
        Item clue2 = new Clue("Clue2", "You've found this piece of paper with a single letter on it : R");
        Item clue3 = new Clue("Clue3", "You've found this piece of paper with a single letter on it : E");
        Item clue4 = new Clue("Clue4", "You've found this piece of paper with a single letter on it : A");
        Item clue5 = new Clue("Clue5", "You've found this piece of paper with a single letter on it : S");
        Item clue6 = new Clue("Clue6", "You've found this piece of paper with a single letter on it : U");
        Item clue7 = new Clue("Clue7", "You've found this piece of paper with a single letter on it : R");
        Item clue8 = new Clue("Clue8", "You've found this piece of paper with a single letter on it : E");

        
        //All Item
        Item goldCoin1 = new GoldCoin(1);
        Item goldCoin2 = new GoldCoin(2);
        Item goldCoin3 = new GoldCoin(3);
        Item goldCoin4 = new GoldCoin(5);
        Item healingPotion = new HealingPotion();
        Item strengthPotion = new StrengthPotion();
        Item pantryKey = new Key();
        Item bedRoomKey = new Key();
        //Item magicalChest = new MagicalChest();
        Item magicalChest = getTheMagicalChest();
        Item weaponRoom1 = new Weapon(7, 5, "Sword", "This will help you kill bad guys.");
        Item weaponRoom2 = new Weapon(9, 7, "Mace", "This will help you kill bad guys.");
        Item weaponRoom3 = new Weapon(5, 3, "Dagger", "This will help you kill bad guys.");
        Item bed = new OtherItem("Bed", 100, 
            "You notice in the middle of the room a king sized bed with many pillows and blankets.\n" + 
            "It looks like the perfect place to get some rest.");
        Item mirror = new OtherItem("Mirror", 5, "A pocket mirror. Classic, practical.");
        Item flower = new OtherItem("Flower", 1, "A small dried flower, still looks beautiful.");
        Item apple = new OtherItem("Apple", 3, "Who's hungry? Bite an apple..");
        Item bracelet = new OtherItem("Bracelet", 2, "A silver bracelet. Might be valuable.");
        Item ring = new OtherItem("Ring", 1, "A golden ring. No signs of who it might have belonged to.");
        Item coolHat = new OtherItem("Cool_Hat", 3, "A cool hat. We take those. Or not.");
        Item recharge1 = new Recharge();
        Item recharge2 = new Recharge();
        Item recharge3 = new Recharge();
        Item recharge4 = new Recharge();


        //All rooms
        Room basement = new Room("Basement", 
            "You have made it to the basement. The room is obscure and cold, you feel uneasy.", 1);
        basement.setExits("Main_corridor", exit1);
        basement.setExits("Garage", exit2);
        basement.setCharacterRoom(ghost);
        basement.setInventoryRoom(clue1);
        basement.setInventoryRoom(goldCoin2);
        basement.setInventoryRoom(magicalChest);

        Room mainCorridor = new Room("Main_corridor", 
            "You are in the main corridor. You can access the rooms on your left and right, or go to the first floor.", 2);
        mainCorridor.setExits("Basement", exit1);
        mainCorridor.setExits("Living_Room", exit3);
        mainCorridor.setExits("Kitchen", exit4);
        mainCorridor.setExits("Library", exit5);
        mainCorridor.setExits("Corridor_1st_floor", exit6);
        mainCorridor.setInventoryRoom(clue2);
        mainCorridor.setInventoryRoom(weaponRoom3);
        mainCorridor.setInventoryRoom(recharge2);

        Room garage = new Room("Garage", "You enter the garage. The room seems almost empty.", 3);
        garage.setExits("Kitchen", exit7);
        garage.setCharacterRoom(zombie);
        garage.setInventoryRoom(goldCoin4);
        garage.setInventoryRoom(weaponRoom2);

        Room livingRoom = new Room("Living_Room", 
    "You are in the living room. The place is warm, you can hear the fire from the fireplace crackling. You feel welcomed.", 4);
        livingRoom.setExits("Main_corridor", exit3);
        livingRoom.setExits("Dining_room", exit8);
        livingRoom.setCharacterRoom(shrek);
        livingRoom.setCharacterRoom(santa);
        livingRoom.setInventoryRoom(flower);

        Room diningRoom = new Room("Dining_room", 
            "You are in the dining room. There's a huge table in the centre of the room.", 5);
        diningRoom.setExits("Kitchen", exit9);
        diningRoom.setInventoryRoom(clue3);
        diningRoom.setInventoryRoom(goldCoin1);

        Room kitchen = new Room("Kitchen", "You're in the kitchen, it smells delicious in here.", 6);
        kitchen.setExits("Main_corridor", exit4);
        kitchen.setExits("Garage", exit7);
        kitchen.setExits("Pantry", exit10);
        kitchen.setInventoryRoom(clue4);
        kitchen.setInventoryRoom(strengthPotion);
        kitchen.setInventoryRoom(pantryKey);
        kitchen.setInventoryRoom(apple);
        kitchen.setInventoryRoom(recharge1);

        Room pantry = new Room("Pantry", 
            "You're in the pantry. There are many different boxes in the small room. What could they contain?", 7);
        pantry.setExits("Kitchen", exit10);
        pantry.setCharacterRoom(bear);
        pantry.setInventoryRoom(weaponRoom1);
        pantry.setInventoryRoom(ring);

        Room library = new Room("Library", "You enter the library. The room has massive shelves with tons of books.", 8);
        library.setExits("Main corridor", exit5);
        library.setCharacterRoom(samuel);
        library.setCharacterRoom(goblin);
        library.setInventoryRoom(clue5);
        library.setInventoryRoom(recharge4);

        Room corridor_1_floor = new Room("Corridor_1st_floor", 
            "You are in the corridor of the first floor. You can access the rooms on your left and right.", 9);
        corridor_1_floor.setExits("Main_corridor", exit6);
        corridor_1_floor.setExits("Bedroom", exit11);
        corridor_1_floor.setExits("Office", exit13);
        corridor_1_floor.setExits("Attic", exit14);
        corridor_1_floor.setCharacterRoom(businessman);
        corridor_1_floor.setInventoryRoom(clue6);
        corridor_1_floor.setInventoryRoom(bedRoomKey);

        Room bedroom = new Room("Bedroom", 
            "You are in the main bedroom. It looks like the perfect place to get some rest.", 10);
        bedroom.setExits("Corridor_1st_floor", exit11);
        bedroom.setExits("Bathroom", exit12);
        bedroom.setCharacterRoom(devil);
        bedroom.setInventoryRoom(healingPotion);
        bedroom.setInventoryRoom(bed);

        Room bathroom = new Room("Bathroom", "You enter the bathroom. The room looks.. magical.", 11);
        bathroom.setExits("Bedroom", exit12);
        bathroom.setCharacterRoom(fairy);
        bathroom.setInventoryRoom(goldCoin3);
        bathroom.setInventoryRoom(mirror);
        bathroom.setInventoryRoom(bracelet);

        Room office = new Room("Office", 
            "You are in the office. There's a desk in front of you but the chair is empty.", 12);
        office.setExits("Corridor_1st_floor", exit13);
        office.setInventoryRoom(clue7);
        office.setInventoryRoom(coolHat);
        office.setInventoryRoom(recharge3);

        Room attic = new Room("Attic", 
        "You have made it to the attic! You're the closest to the treasure you've ever been!\n" + 
        "All that's left to do is fight… a dragon.", 13);
        attic.setCharacterRoom(dragon);
        attic.setInventoryRoom(clue8);
        
        this.setRooms = new HashSet<Room>();
        setRooms.add(basement);
        setRooms.add(mainCorridor);
        setRooms.add(garage);
        setRooms.add(livingRoom);
        setRooms.add(diningRoom);
        setRooms.add(kitchen);
        setRooms.add(pantry);
        setRooms.add(library);
        setRooms.add(corridor_1_floor);
        setRooms.add(bedroom);
        setRooms.add(bathroom);
        setRooms.add(office);
        setRooms.add(attic);

        this.hero = new Hero(nameHero);
        this.hero.setRoomNumber(1);
    }
    
    public Hero getHero(){
        return this.hero;
    }
    
    public Room findRoomByNumber(int roomNumber) {
        for (Room room : setRooms) {
            if (room.getNumberRoom() == roomNumber) {
                return room;
            }
        }
        return null; // Retourne null si la chambre n'est pas trouvée
    }
    
    public Room findRoomByName(String roomName) {
        for (Room room : setRooms) {
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        return null; // Retourne null si la chambre n'est pas trouvée
    }
}
