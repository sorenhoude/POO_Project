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
public class HostileTest {
    
    public HostileTest() {
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
     * Test of getHpHostile method, of class Hostile.
     */
    @Test
    public void testGetHpHostile() {
        System.out.println("getHpHostile");
        Hostile instance = null;
        int expResult = 0;
        int result = instance.getHpHostile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDamageHostile method, of class Hostile.
     */
    @Test
    public void testGetDamageHostile() {
        System.out.println("getDamageHostile");
        Hostile instance = null;
        int expResult = 0;
        int result = instance.getDamageHostile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHpHostile method, of class Hostile.
     */
    @Test
    public void testSetHpHostile() {
        System.out.println("setHpHostile");
        int damage = 0;
        Hostile instance = null;
        instance.setHpHostile(damage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlive method, of class Hostile.
     */
    @Test
    public void testIsAlive() {
        System.out.println("isAlive");
        Hostile instance = null;
        boolean expResult = false;
        boolean result = instance.isAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
