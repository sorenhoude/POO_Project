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
public class ExitWithCodeIT {
    
    public ExitWithCodeIT() {
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
        ExitWithCode instance = null;
        boolean expResult = false;
        boolean result = instance.getLockStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCode method, of class ExitWithCode.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        ExitWithCode instance = null;
        int expResult = 0;
        int result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unlock method, of class ExitWithCode.
     */
    @Test
    public void testUnlock() {
        System.out.println("unlock");
        int code = 0;
        ExitWithCode instance = null;
        instance.unlock(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class ExitWithCode.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        ExitWithCode instance = null;
        instance.open();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
