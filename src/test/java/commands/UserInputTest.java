/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
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
public class UserInputTest {
    
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public UserInputTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parseCommand method, of class UserInput.
     * verify the user can't give an unknown command
     */
    @Test
    public void testParseCommand() {
        List<String> wordlist = new ArrayList<>(Arrays.asList("eat", "apple"));
        Manor manor = null;
        UserInput instance = new UserInput();
        instance.parseCommand(wordlist, manor);
        System.setOut(System.out);
        
        String s = "eat isn't a usable command!";
        assertEquals(s, outputStreamCaptor.toString().trim());
    }

    /**
     * Test of wordList method, of class UserInput.
     * verify it transforms a string into a list of strings
     */
    @Test
    public void testWordList() {
        String input = "talk Tooth_Fairy";
        UserInput instance = new UserInput();
        //List<String> expResult = null;
        List<String> result = instance.wordList(input);
        //assertEquals(expResult, result);
        
        List<String> s = new ArrayList<>(Arrays.asList("talk", "Tooth_Fairy"));
        assertEquals(s, result);
    }

    /**
     * Test of runCommand method, of class UserInput.
     *  verify the user has to write something
     */
    @Test
    public void testRunCommand() {
        String input = "";
        Manor manor = null;
        UserInput instance = new UserInput();
        instance.runCommand(input, manor);
        System.setOut(System.out);
        
        String s = "You must return a command!";
        assertEquals(s, outputStreamCaptor.toString().trim());
    }
    
}
