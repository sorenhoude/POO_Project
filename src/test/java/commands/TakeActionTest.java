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
public class TakeActionTest {
    
    public TakeActionTest() {
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
     * Test of doAction method, of class TakeAction.
     * take an item from a room
     * Goldcoin add the number of coins the hero have found to the goldCount
     */
    @Test
    public void testDoAction_Manor_String() {
        System.out.println("doAction");
        
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        
        String noun = "Goldcoin";
        TakeAction instance = new TakeAction();
        instance.doAction(manor, noun);
        
        assertEquals(2, hero.getGoldCount());
    }

    /**
     * Test of doAction method, of class TakeAction.
     * the hero can take an item from the Magical Chest
     */
    @Test
    public void testDoAction_3args() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        
        Item healingPotion = new HealingPotion();
        MagicalChest magicalChest = getTheMagicalChest();
        Inventory chestInventory = magicalChest.getInventory();
        chestInventory.addItem(healingPotion);
        
        String noun1 = "Magical_Chest";
        String noun2 = "Healing_Potion";
        
        TakeAction instance = new TakeAction();
        instance.doAction(manor, noun1, noun2);
        
        
        assertEquals(true, hero.getInventory().isItemInList(healingPotion));     //the potion should now be in the hero's inventory
        assertEquals(false, chestInventory.isItemInList(healingPotion));         //it shouldn't be in the chest's inventory
    }
    
}
