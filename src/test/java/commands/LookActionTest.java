/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;
import main.Room;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author grand
 */
public class LookActionTest {
    
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public LookActionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doAction method, of class LookAction.
     * doAction : renvoie la description d'un objet/personnage
     */
    @Test
    public void testDoAction_Manor_String() {
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        
        String noun = "Clue1";
        LookAction instance = new LookAction();
        instance.doAction(manor, noun);
        System.setOut(System.out);
        
        
        Room currentRoom = manor.findRoomByNumber(hero.getRoomNumber());
        Inventory inventoryRoom = currentRoom.getInventoryRoom();
        Item item = inventoryRoom.findItemByName(noun);
        String s = item.getDescription();
        
        assertEquals(s, outputStreamCaptor.toString().trim());
    }

    /**
     * Test of doAction method, of class LookAction.
     * doAction : renvoie la description de deux objets/personnages
     */
    @Test
    public void testDoAction_3args() {
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        
        String noun = "Clue1";
        String noun2 = "Goldcoin";
        
        LookAction instance = new LookAction();
        instance.doAction(manor, noun, noun2);
        System.setOut(System.out);
        
        Room currentRoom = manor.findRoomByNumber(hero.getRoomNumber());
        Inventory inventoryRoom = currentRoom.getInventoryRoom();
        Item item = inventoryRoom.findItemByName(noun);
        Item secondItem = inventoryRoom.findItemByName(noun2);
        String s = item.getDescription() + " " + secondItem.getDescription();
        
        assertEquals(s, outputStreamCaptor.toString().trim());
    }

    /**
     * Test of doAction method, of class LookAction.
     * doAction : renvoie la description de la classe
     */
    @Test
    public void testDoAction_Manor() {
        
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        
        LookAction instance = new LookAction();
        instance.doAction(manor);
        System.setOut(System.out);
        
        int numRoom = hero.getRoomNumber();
        Room currentRoom = manor.findRoomByNumber(numRoom);
        String s = currentRoom.getDescription();
        
        assertEquals(s, outputStreamCaptor.toString().trim());
        
    }
    
}
