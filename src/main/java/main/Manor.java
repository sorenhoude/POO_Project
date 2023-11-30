/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import commands.UserInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author grand
 */
public class Manor {
    
    private List<Room> rooms;
    private Hero hero;
    
    public Manor(String name){
        
        this.hero = new Hero(name);
        
        this.rooms = new ArrayList<>();
        
        Exit exit1 = new Exit(1);
        Exit exit2 = new Exit(2);
        ExitWithKey exit3 = new ExitWithKey(3);
        ExitWithKey exit4 = new ExitWithKey(4);

        //cuisine
        Room kitchen = new Room("Kitchen", "", 1);
        kitchen.setExits("Pantry", exit3);
        

        //garde-manger
        Room pantry = new Room("Pantry", "", 2);
        //sous-sol
        Room basement = new Room("Basement", "", 3);
        //douche
        Room bathroom = new Room("Bathroom", "", 4);
        //bibliothèque
        Room library = new Room("Library", "", 5);
        //grenier
        Room attic = new Room("Attic", "", 6);
        //chambre
        Room bedroom = new Room("Bedroom", "", 7);
        //bureau
        Room office = new Room("Office", "", 8);

        Room garage = new Room("Garage", "", 9);

        Room corridor_1_floor = new Room("Corridor 1st floor", "", 10);

        Room mainCorridor = new Room("Main corridor", "", 11);
        //salon
        Room livingRoom = new Room("Living Room", "", 12);
        //salle à manger
        Room diningRoom = new Room("Dining Room", "", 13);

        rooms.add(kitchen);
        rooms.add(pantry);
        rooms.add(basement);
        rooms.add(bathroom);
        rooms.add(library);
        rooms.add(attic);
        rooms.add(bedroom);
        rooms.add(office);
        rooms.add(garage);
        rooms.add(corridor_1_floor);
        rooms.add(mainCorridor);
        rooms.add(livingRoom);
        rooms.add(diningRoom);

    }
    
    public Hero getHero(){
        return this.hero;
    }
    
    public Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getNumberRoom() == roomNumber) {
                return room;
            }
        }
        return null; // Retourne null si la chambre n'est pas trouvée
    }
    
    public Room findRoomByName(String roomName) {
        for (Room room : rooms) {
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        return null; // Retourne null si la chambre n'est pas trouvée
    }
}
