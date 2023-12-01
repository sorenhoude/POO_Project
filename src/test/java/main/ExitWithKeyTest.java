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
public class ExitWithKeyTest {
    
    public ExitWithKeyTest() {
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
        ExitWithKey instance = new ExitWithKey(11);
        boolean expResult = true;
        boolean result = instance.getLockStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of unlock method, of class ExitWithKey.
     */
    @Test
    public void testUnlock() {
        System.out.println("unlock");
        Key key = new Key();
        ExitWithKey instance = new ExitWithKey(11);
        instance.unlock(key);
        assertEquals(false, instance.getLockStatus());      //with a key the door is unlocked
    }

    /**
     * Test of open method, of class ExitWithKey.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        ExitWithKey instance = new ExitWithKey(11);
        instance.open();
        assertEquals(true, instance.getLockStatus());   //the door is still locked since we didn't use the key.
    }
    
}
