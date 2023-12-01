/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import main.Hero;
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
public class SleepActionTest {
    
    public SleepActionTest() {
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
     * Test of doAction method, of class SleepAction.
     * sleeping should increase the HP of the hero to the maximum
     */
    @Test
    public void testDoAction_Manor() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        hero.setRoomNumber(10);  //the hero must be in the bedroom to be able to sleep
        
        SleepAction instance = new SleepAction();
        instance.doAction(manor);
        
        assertEquals(50, hero.getHp());          //MAX_HP = 50 in the class Hero
    }
    
}
