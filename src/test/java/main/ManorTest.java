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
public class ManorTest {
    
    public ManorTest() {
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
     * Test of getHero method, of class Manor.
     */
    @Test
    public void testGetHero() {
        System.out.println("getHero");
        Manor instance = null;
        Hero expResult = null;
        Hero result = instance.getHero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRoomByNumber method, of class Manor.
     */
    @Test
    public void testFindRoomByNumber() {
        System.out.println("findRoomByNumber");
        int roomNumber = 0;
        Manor instance = null;
        Room expResult = null;
        Room result = instance.findRoomByNumber(roomNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRoomByName method, of class Manor.
     */
    @Test
    public void testFindRoomByName() {
        System.out.println("findRoomByName");
        String roomName = "";
        Manor instance = null;
        Room expResult = null;
        Room result = instance.findRoomByName(roomName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
