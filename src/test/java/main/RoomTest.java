/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import java.util.List;
import java.util.Map;
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
public class RoomTest {
    
    public RoomTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumberRoom method, of class Room.
     */
    @Test
    public void testGetNumberRoom() {
        System.out.println("getNumberRoom");
        Room instance = null;
        int expResult = 0;
        int result = instance.getNumberRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExits method, of class Room.
     */
    @Test
    public void testGetExits() {
        System.out.println("getExits");
        Room instance = null;
        Map<String, Exit> expResult = null;
        Map<String, Exit> result = instance.getExits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExitByNameRoom method, of class Room.
     */
    @Test
    public void testGetExitByNameRoom() {
        System.out.println("getExitByNameRoom");
        String nameNextRoom = "";
        Room instance = null;
        Exit expResult = null;
        Exit result = instance.getExitByNameRoom(nameNextRoom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharactersRoom method, of class Room.
     */
    @Test
    public void testGetCharactersRoom() {
        System.out.println("getCharactersRoom");
        Room instance = null;
        List<Character> expResult = null;
        List<Character> result = instance.getCharactersRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventoryRoom method, of class Room.
     */
    @Test
    public void testGetInventoryRoom() {
        System.out.println("getInventoryRoom");
        Room instance = null;
        Inventory expResult = null;
        Inventory result = instance.getInventoryRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExits method, of class Room.
     */
    @Test
    public void testSetExits() {
        System.out.println("setExits");
        String nameRoom = "";
        Exit exit = null;
        Room instance = null;
        instance.setExits(nameRoom, exit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharacterRoom method, of class Room.
     */
    @Test
    public void testSetCharacterRoom() {
        System.out.println("setCharacterRoom");
        Character character = null;
        Room instance = null;
        instance.setCharacterRoom(character);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInventoryRoom method, of class Room.
     */
    @Test
    public void testSetInventoryRoom() {
        System.out.println("setInventoryRoom");
        Item item = null;
        Room instance = null;
        instance.setInventoryRoom(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printExits method, of class Room.
     */
    @Test
    public void testPrintExits() {
        System.out.println("printExits");
        Room instance = null;
        instance.printExits();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printCharactersRoom method, of class Room.
     */
    @Test
    public void testPrintCharactersRoom() {
        System.out.println("printCharactersRoom");
        Room instance = null;
        instance.printCharactersRoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printItemsRoom method, of class Room.
     */
    @Test
    public void testPrintItemsRoom() {
        System.out.println("printItemsRoom");
        Room instance = null;
        instance.printItemsRoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCharacterByName method, of class Room.
     */
    @Test
    public void testFindCharacterByName() {
        System.out.println("findCharacterByName");
        String characterName = "";
        Room instance = null;
        Character expResult = null;
        Character result = instance.findCharacterByName(characterName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasAnExit method, of class Room.
     */
    @Test
    public void testHasAnExit() {
        System.out.println("hasAnExit");
        String nameRoom = "";
        Room instance = null;
        boolean expResult = false;
        boolean result = instance.hasAnExit(nameRoom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasHostile method, of class Room.
     */
    @Test
    public void testHasHostile() {
        System.out.println("hasHostile");
        Room instance = null;
        boolean expResult = false;
        boolean result = instance.hasHostile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
