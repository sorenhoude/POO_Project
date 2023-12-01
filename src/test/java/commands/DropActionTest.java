/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import main.HealingPotion;
import main.Hero;
import main.Inventory;
import main.Item;
import main.MagicalChest;
import static main.MagicalChest.getTheMagicalChest;
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
public class DropActionTest {
    
    public DropActionTest() {
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
     * Test of doAction method, of class DropAction.
     * add an Healing Potion to the hero's Inventory, then try to drop it
     * if it works, the potion should be in the Magical Chest
     * since that's where everything goes.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        Item healingPotion = new HealingPotion();
        Inventory heroInventory = hero.getInventory();
        heroInventory.addItem(healingPotion);
        
        String noun = "Healing_Potion";
        DropAction instance = new DropAction();
        instance.doAction(manor, noun);
        
        MagicalChest magicalChest = getTheMagicalChest();
        Inventory chestInventory = magicalChest.getInventory();
        
        assertEquals(true, chestInventory.isItemInList(healingPotion));
    }
    
}
