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
public class ExitWithKeyIT {
    
    public ExitWithKeyIT() {
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
     * Test of getLockStatus method, of class ExitWithKey.
     */
    @Test
    public void testGetLockStatus() {
        System.out.println("getLockStatus");
        ExitWithKey instance = null;
        boolean expResult = false;
        boolean result = instance.getLockStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unlock method, of class ExitWithKey.
     */
    @Test
    public void testUnlock() {
        System.out.println("unlock");
        Key key = null;
        ExitWithKey instance = null;
        instance.unlock(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class ExitWithKey.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        ExitWithKey instance = null;
        instance.open();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
