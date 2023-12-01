/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;
import main.Merchant;
import main.Room;
import main.Character;
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
public class BuyActionTest {
    
    public BuyActionTest() {
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
     * Test of doAction method, of class BuyAction.
     * verify if the hero buys a potion, it should be added to his inventory
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        hero.setRoomNumber(9);          //the merchant is in the Corridor of the first floor.
        hero.addCoins(5);   //he needs to have enough coins to buy the potion
        
        String noun = "Strength_Potion";
        BuyAction instance = new BuyAction();
        instance.doAction(manor, noun);
        
        Room currentRoom = manor.findRoomByNumber(9);
        Character character = currentRoom.findCharacterByName("Rich_Business_Man");
        Inventory merchantInventory = ((Merchant) character).getInventoryMarchant();
        Item item = merchantInventory.findItemByName(noun);
        
        assertEquals(true, hero.getInventory().isItemInList(item));     //the potion should now be in the hero's inventory
    }
    
}
