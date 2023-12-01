/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package commands;

import main.HealingPotion;
import main.Hero;
import main.Inventory;
import main.Item;
import main.Manor;
import main.Recharge;
import main.Weapon;
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
public class UseActionTest {
    
    public UseActionTest() {
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
     * Test of doAction method, of class UseAction.
     * verify that a Healing Potion is used
     */
    @Test
    public void testDoAction_Manor_String() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        Item healingPotion = new HealingPotion();
        Inventory heroInventory = hero.getInventory();
        heroInventory.addItem(healingPotion);
        
        
        String noun = "Healing_Potion";
        UseAction instance = new UseAction();
        instance.doAction(manor, noun);
        
        assertEquals(50, hero.getHp());          //MAX_HP = 50 in the class Hero
        assertEquals(false, hero.getInventory().isItemInList(healingPotion));        //it shouldn't be in the hero's inventory now that it's consumed
    }

    /**
     * Test of doAction method, of class UseAction.
     * verify that a weapon is recharged to its maximum (3)
     */
    @Test
    public void testDoAction_3args() {
        System.out.println("doAction");
        Manor manor = new Manor("Name");
        Hero hero = manor.getHero();
        
        Item weapon = new Weapon(5, 3, "Dagger", "This will help you kill bad guys.");
        Item recharge = new Recharge();
        Inventory heroInventory = hero.getInventory();
        heroInventory.addItem(weapon);
        heroInventory.addItem(recharge);
        
        String noun1 = "Dagger";
        String noun2 = "Recharge";
        UseAction instance = new UseAction();
        instance.doAction(manor, noun1, noun2);
        
        assertEquals(true, ((Weapon) weapon).getAmmo() == 3);       //ammo should be equals to AMMO_MAX
    }
    
}
