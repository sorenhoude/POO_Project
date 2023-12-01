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
public class FinalExitTest {
    
    public FinalExitTest() {
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
     * Test of unlock method, of class FinalExit.
     */
    @Test
    public void testUnlock() {
        System.out.println("unlock");
        String word = "";
        FinalExit instance = new FinalExit(14);
        instance.unlock(word);
    }

    /**
     * Test of open method, of class FinalExit.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        FinalExit instance = new FinalExit(14);
        instance.open();
    }
    
}
