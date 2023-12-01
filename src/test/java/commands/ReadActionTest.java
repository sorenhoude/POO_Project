/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import main.Clue;
import main.HealingPotion;
import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;
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
public class ReadActionTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public ReadActionTest() {
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
     * Test of doAction method, of class ReadAction.
     * add a Clue to the hero's Inventory, then try to read it
     * it should print its description
     */
    @Test
    public void testDoAction() {
        //System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        Item clue1 = new Clue("Clue1", "You've found this piece of paper with a single letter on it : T");
        Inventory heroInventory = hero.getInventory();
        heroInventory.addItem(clue1);
        
        String noun = "Clue1";
        ReadAction instance = new ReadAction();
        instance.doAction(manor, noun);
        System.setOut(System.out);
        
        String s = clue1.getDescription();
        
        assertEquals(s, outputStreamCaptor.toString().trim());
    }
    
}
