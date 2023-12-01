/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class HelpActionTest {
    
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public HelpActionTest() {
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
     * Test of doAction method, of class HelpAction.
     */
    @Test
    public void testDoAction() {
        
        //System.out.println("doAction");

        HelpAction instance = new HelpAction();
        instance.doAction();
        System.setOut(System.out);

        String s = ("Here is the list of all the commands you can use: \n" +
                "attack *enemy* : allows you to attack someone you encounter.\n" +
                "buy *item* : allows you to purchase the item of your choice from a merchant.\n" +
                "go *room* : allows you to go to another room through the exit (if it exists).\n" +
                "look : gives you the description of the room you're currently in.\n" +
                "look *something* : allows you to learn more about something of your choice.\n" +
                "look *something* *something else* : allows you to learn more about two things of your choice.\n" +
                "quit : closes the game.\n" +
                "read *something* : allows you to read the clue you have found.\n" +
                "sleep : allows you to rest peacefully.\n" +
                "take *item* : allows you to add the item of your choice to your inventory.\n" +
                "take *item* : allows you to add the item of your choice from the Magical_Chest to your inventory.\n" +
                "talk *character* : allows you to engage in a conversation with a character.\n" +
                "use *item* : allows you to take an item from a room and put it in your inventory.\n" +
                "use *item1* *item2* : allows you to recharge a weapon.\n" +
                "unlock *room* *code* : allows you to unlock the door taking you to the next room.");
        assertEquals(s, outputStreamCaptor.toString().trim());
    }
}
