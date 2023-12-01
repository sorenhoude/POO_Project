/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import main.Hero;
import main.Manor;
import main.Room;
import main.Character;
import main.Hostile;
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
public class AttackActionTest {
    
    public AttackActionTest() {
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
     * Test of doAction method, of class AttackAction.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        hero.setRoomNumber(8); 
        
        String noun = "Small_Goblin";
        AttackAction instance = new AttackAction();
        instance.doAction(manor, noun);
        
        Room currentRoom = manor.findRoomByNumber(8);
        Character character = currentRoom.findCharacterByName(noun);
        
        assertEquals(false, !((Hostile) character).isAlive());       //verify that the enemy has been killed
    }
    
}
