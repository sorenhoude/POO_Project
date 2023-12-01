/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import java.util.List;
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
public class InventoryTest {
    
    public InventoryTest() {
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
     * Test of getItems method, of class Inventory.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        Inventory instance = null;
        List<Item> expResult = null;
        List<Item> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printIventory method, of class Inventory.
     */
    @Test
    public void testPrintIventory() {
        System.out.println("printIventory");
        Inventory instance = null;
        instance.printIventory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isItemInList method, of class Inventory.
     */
    @Test
    public void testIsItemInList() {
        System.out.println("isItemInList");
        Item item = null;
        Inventory instance = null;
        boolean expResult = false;
        boolean result = instance.isItemInList(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasKeyInInventory method, of class Inventory.
     */
    @Test
    public void testHasKeyInInventory() {
        System.out.println("hasKeyInInventory");
        Inventory instance = null;
        boolean expResult = false;
        boolean result = instance.hasKeyInInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findItemByName method, of class Inventory.
     */
    @Test
    public void testFindItemByName() {
        System.out.println("findItemByName");
        String itemName = "";
        Inventory instance = null;
        Item expResult = null;
        Item result = instance.findItemByName(itemName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class Inventory.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        Item item = null;
        Inventory instance = null;
        instance.removeItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class Inventory.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Item item = null;
        Inventory instance = null;
        boolean expResult = false;
        boolean result = instance.addItem(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findItem method, of class Inventory.
     */
    @Test
    public void testFindItem() {
        System.out.println("findItem");
        Item searchedItem = null;
        Inventory instance = null;
        Item expResult = null;
        Item result = instance.findItem(searchedItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
