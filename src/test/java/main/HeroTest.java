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
public class HeroTest {
    
    public HeroTest() {
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
     * Test of setName method, of class Hero.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Hero instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventory method, of class Hero.
     */
    @Test
    public void testGetInventory() {
        System.out.println("getInventory");
        Hero instance = null;
        Inventory expResult = null;
        Inventory result = instance.getInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInventoryHero method, of class Hero.
     */
    @Test
    public void testSetInventoryHero() {
        System.out.println("setInventoryHero");
        Item item = null;
        Hero instance = null;
        instance.setInventoryHero(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handEmpty method, of class Hero.
     */
    @Test
    public void testHandEmpty() {
        System.out.println("handEmpty");
        Hero instance = null;
        boolean expResult = false;
        boolean result = instance.handEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeItemOutOfBag method, of class Hero.
     */
    @Test
    public void testTakeItemOutOfBag() {
        System.out.println("takeItemOutOfBag");
        Item item = null;
        Hero instance = null;
        instance.takeItemOutOfBag(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWeaponInHand method, of class Hero.
     */
    @Test
    public void testIsWeaponInHand() {
        System.out.println("isWeaponInHand");
        Weapon weapon = null;
        Hero instance = null;
        boolean expResult = false;
        boolean result = instance.isWeaponInHand(weapon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putWeaponInHandInInventory method, of class Hero.
     */
    @Test
    public void testPutWeaponInHandInInventory() {
        System.out.println("putWeaponInHandInInventory");
        Hero instance = null;
        instance.putWeaponInHandInInventory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putWeaponFromBagToHand method, of class Hero.
     */
    @Test
    public void testPutWeaponFromBagToHand() {
        System.out.println("putWeaponFromBagToHand");
        Weapon weapon = null;
        Hero instance = null;
        instance.putWeaponFromBagToHand(weapon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDamage method, of class Hero.
     */
    @Test
    public void testUpdateDamage() {
        System.out.println("updateDamage");
        Hero instance = null;
        instance.updateDamage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeaponInHand method, of class Hero.
     */
    @Test
    public void testGetWeaponInHand() {
        System.out.println("getWeaponInHand");
        Hero instance = null;
        Weapon expResult = null;
        Weapon result = instance.getWeaponInHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attack method, of class Hero.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        Hostile badguy = null;
        Hero instance = null;
        instance.attack(badguy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dropItem method, of class Hero.
     */
    @Test
    public void testDropItem() {
        System.out.println("dropItem");
        Hero instance = null;
        instance.dropItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlive method, of class Hero.
     */
    @Test
    public void testIsAlive() {
        System.out.println("isAlive");
        Hero instance = null;
        boolean expResult = false;
        boolean result = instance.isAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStronger method, of class Hero.
     */
    @Test
    public void testIsStronger() {
        System.out.println("isStronger");
        Hero instance = null;
        instance.isStronger();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHealed method, of class Hero.
     */
    @Test
    public void testIsHealed() {
        System.out.println("isHealed");
        Hero instance = null;
        instance.isHealed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showHP method, of class Hero.
     */
    @Test
    public void testShowHP() {
        System.out.println("showHP");
        Hero instance = null;
        instance.showHP();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomNumber method, of class Hero.
     */
    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        Hero instance = null;
        int expResult = 0;
        int result = instance.getRoomNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomNumber method, of class Hero.
     */
    @Test
    public void testSetRoomNumber() {
        System.out.println("setRoomNumber");
        int num = 0;
        Hero instance = null;
        instance.setRoomNumber(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyStuff method, of class Hero.
     */
    @Test
    public void testBuyStuff() {
        System.out.println("buyStuff");
        Item item = null;
        Hero instance = null;
        boolean expResult = false;
        boolean result = instance.buyStuff(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCoins method, of class Hero.
     */
    @Test
    public void testAddCoins() {
        System.out.println("addCoins");
        int coins = 0;
        Hero instance = null;
        instance.addCoins(coins);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
