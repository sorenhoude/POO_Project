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
public class ExitTest {
    
    public ExitTest() {
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
     * Test of getNumber method, of class Exit.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Exit instance = new Exit(1);
        int expResult = 1;
        int result = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIsOpen method, of class Exit.
     */
    @Test
    public void testGetIsOpen() {
        System.out.println("getIsOpen");
        Exit instance = new Exit(1);
        boolean expResult = false;
        boolean result = instance.getIsOpen();
        assertEquals(expResult, result);
    }

    /**
     * Test of open method, of class Exit.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        Exit instance = new Exit(1);
        instance.open();
        assertEquals(true, instance.getIsOpen());
    }
    
}
