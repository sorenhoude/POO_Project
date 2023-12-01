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
public class ExitWithCodeTest {
    
    public ExitWithCodeTest() {
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
     * Test of getLockStatus method, of class ExitWithCode.
     */
    @Test
    public void testGetLockStatus() {
        System.out.println("getLockStatus");
        ExitWithCode instance = new ExitWithCode(5, 113);
        boolean expResult = true;
        boolean result = instance.getLockStatus();
        assertEquals(expResult, result);        //the door is locked 
    }

    /**
     * Test of unlock method, of class ExitWithCode.
     */
    @Test
    public void testUnlock() {
        System.out.println("unlock");
        int code = 113;
        ExitWithCode instance = new ExitWithCode(5, 113);
        instance.unlock(code);
        assertEquals(false, instance.getLockStatus());      //with the right code, the door is unlocked
    }

    /**
     * Test of open method, of class ExitWithCode.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        ExitWithCode instance = new ExitWithCode(5, 113);
        instance.open();
        assertEquals(true, instance.getLockStatus());   //the door is still locked since we didn't put the code in.
    }
    
}
