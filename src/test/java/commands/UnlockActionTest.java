/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import main.Exit;
import main.ExitWithCode;
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
public class UnlockActionTest {
    
    public UnlockActionTest() {
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
     * Test of doAction method, of class UnlockAction.
     * opens a door by giving the right code
     */
    @Test
    public void testDoAction_3args() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        hero.setRoomNumber(2);          //in the main corridor (number 2) we have a door with a code access the Library
        
        String noun = "Library";
        String code = "141";
        UnlockAction instance = new UnlockAction();
        instance.doAction(manor, noun, code);
        
        Room currentRoom = manor.findRoomByNumber(hero.getRoomNumber());
        Exit exit = currentRoom.getExitByNameRoom(noun);
        
        assertEquals(false, ((ExitWithCode) exit).getLockStatus());   //should be false since the door is now open
    }
}
