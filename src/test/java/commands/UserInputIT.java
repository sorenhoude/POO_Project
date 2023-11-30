/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import java.util.List;
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
public class UserInputIT {
    
    public UserInputIT() {
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
    
    /*
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
    }*/

    /**
     * Test of parseCommand method, of class UserInput.
     */
    @org.junit.Test
    public void testParseCommand() {
        System.out.println("parseCommand");
        List<String> wordlist = null;
        Manor manor = null;
        UserInput instance = new UserInput();
        instance.parseCommand(wordlist, manor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wordList method, of class UserInput.
     */
    @org.junit.Test
    public void testWordList() {
        System.out.println("wordList");
        String input = "";
        UserInput instance = new UserInput();
        List<String> expResult = null;
        List<String> result = instance.wordList(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runCommand method, of class UserInput.
     */
    @org.junit.Test
    public void testRunCommand() {
        System.out.println("runCommand");
        String input = "";
        Manor manor = null;
        UserInput instance = new UserInput();
        instance.runCommand(input, manor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
