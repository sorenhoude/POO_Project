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
public class GoActionTest {
    
    public GoActionTest() {
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
     * Test of doAction method, of class GoAction.
     * we're in the Basement (number 1), we try to go to the Garage (number 3)
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        String noun = "Garage";
        GoAction instance = new GoAction();
        instance.doAction(manor, noun);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(3, hero.getRoomNumber());
    }
    
}
