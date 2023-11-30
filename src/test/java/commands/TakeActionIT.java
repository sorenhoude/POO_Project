/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

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
public class TakeActionIT {
    
    public TakeActionIT() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
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
     * Test of doAction method, of class TakeAction.
     */
    @Test
    public void testDoAction_Manor_String() {
        System.out.println("doAction");
        Manor manor = null;
        String noun = "";
        TakeAction instance = new TakeAction();
        instance.doAction(manor, noun);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class TakeAction.
     */
    @Test
    public void testDoAction_3args() {
        System.out.println("doAction");
        Manor manor = null;
        String noun1 = "";
        String noun2 = "";
        TakeAction instance = new TakeAction();
        instance.doAction(manor, noun1, noun2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class TakeAction.
     */
    @org.junit.Test
    public void testDoAction() {
        System.out.println("doAction");
        Manor manor = null;
        String noun = "";
        TakeAction instance = new TakeAction();
        instance.doAction(manor, noun);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
