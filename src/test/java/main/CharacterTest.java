/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

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
public class CharacterTest {
    
    public CharacterTest() {
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
     * Test of getDialogue method, of class Character.
     */
    @Test
    public void testGetDialogue() {
        System.out.println("getDialogue");
        Character instance = new CharacterImpl();
        String result = instance.getDialogue();
        assertEquals(null, result);
    }

    /**
     * Test of setDialogue method, of class Character.
     */
    @Test
    public void testSetDialogue() {
        System.out.println("setDialogue");
        String dialogue = "You can find a Healing Potion in the kitchen!";
        Character instance = new CharacterImpl();
        instance.setDialogue(dialogue);
        
        assertEquals(dialogue, instance.getDialogue());
    }

    public class CharacterImpl extends Character {
    }
    
}
