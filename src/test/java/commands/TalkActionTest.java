/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import main.Hero;
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
public class TalkActionTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public TalkActionTest() {
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
     * Test of doAction method, of class TalkAction.
     * return a character's dialogue if the hero is in the same room
     */
    @Test
    public void testDoAction() {
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        hero.setRoomNumber(4);    //we put the hero in the Living Room
        
        String noun = "Angry_Santa";
        TalkAction instance = new TalkAction();
        instance.doAction(manor, noun);
        System.setOut(System.out);
        
        Room currentRoom = manor.findRoomByNumber(hero.getRoomNumber());
        main.Character character = currentRoom.findCharacterByName(noun);
        String s = character.getDialogue();
        
        assertEquals(s, outputStreamCaptor.toString().trim());
    }
    
}
