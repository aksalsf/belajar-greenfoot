import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;

/**
 * A world where wombats live.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class WombatWorld extends World
{
    /**
     * Create a new world with 8x8 cells and
     * with a cell size of 60x60 pixels
     */
    public WombatWorld() 
    {
        super(8, 8, 60);        
        setBackground("cell.jpg");
        setPaintOrder(Wombat.class, Leaf.class);

        prepare();
    }

    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */    
    public void populate()
    {
        Wombat w1 = new Wombat();
        addObject(w1, 3, 3);

        Wombat w2 = new Wombat();
        addObject(w2, 1, 7);

        Leaf l1 = new Leaf();
        addObject(l1, 5, 3);

        Leaf l2 = new Leaf();
        addObject(l2, 0, 2);

        Leaf l3 = new Leaf();
        addObject(l3, 7, 5);

        Leaf l4 = new Leaf();
        addObject(l4, 2, 6);

        Leaf l5 = new Leaf();
        addObject(l5, 5, 0);

        Leaf l6 = new Leaf();
        addObject(l6, 4, 7);
    }

    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomLeaves(int howMany)
    {
        for(int i=0; i<howMany; i++) {
            Leaf leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(leaf, x, y);
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Wombat wombat = new Wombat();
        addObject(wombat, 1, 1);
        Leaf leaf = new Leaf();
        addObject(leaf, 6, 2);
        Leaf leaf2 = new Leaf();
        addObject(leaf2, 1, 4);
        Leaf leaf3 = new Leaf();
        addObject(leaf3, 4, 5);
        removeObject(leaf);
        removeObject(leaf3);
        removeObject(leaf2);
        removeObject(wombat);
        Leaf leaf4 = new Leaf();
        addObject(leaf4, 5, 2);
        Leaf leaf5 = new Leaf();
        addObject(leaf5, 1, 4);
        Leaf leaf6 = new Leaf();
        addObject(leaf6, 5, 6);
        Wombat wombat2 = new Wombat();
        addObject(wombat2, 1, 1);
        leaf6.setLocation(4, 5);
        removeObject(leaf4);
        removeObject(leaf5);
        removeObject(leaf6);
        removeObject(wombat2);
        Wombat wombat3 = new Wombat();
        addObject(wombat3, 1, 1);
        Leaf leaf7 = new Leaf();
        addObject(leaf7, 6, 1);
        Leaf leaf8 = new Leaf();
        addObject(leaf8, 0, 3);
        Leaf leaf9 = new Leaf();
        addObject(leaf9, 3, 7);
        Leaf leaf10 = new Leaf();
        addObject(leaf10, 3, 0);
        Leaf leaf11 = new Leaf();
        addObject(leaf11, 3, 4);
        removeObject(wombat3);
        removeObject(leaf8);
        removeObject(leaf10);
        removeObject(leaf7);
        removeObject(leaf11);
        removeObject(leaf9);
        Wombat wombat4 = new Wombat();
        addObject(wombat4,0,0);
        Leaf leaf12 = new Leaf();
        addObject(leaf12,3,0);
        Leaf leaf13 = new Leaf();
        addObject(leaf13,6,0);
        Leaf leaf14 = new Leaf();
        addObject(leaf14,7,2);
        Leaf leaf15 = new Leaf();
        addObject(leaf15,7,5);
        Leaf leaf16 = new Leaf();
        addObject(leaf16,3,7);
        Leaf leaf17 = new Leaf();
        addObject(leaf17,5,7);
        Leaf leaf18 = new Leaf();
        addObject(leaf18,0,5);
        Leaf leaf19 = new Leaf();
        addObject(leaf19,0,2);
        Wombat wombat5 = new Wombat();
        addObject(wombat5,0,3);
        Wombat wombat6 = new Wombat();
        addObject(wombat6,0,7);
        Wombat wombat7 = new Wombat();
        addObject(wombat7,0,1);
        Wombat wombat8 = new Wombat();
        addObject(wombat8,0,6);
        Leaf leaf20 = new Leaf();
        addObject(leaf20,0,4);
        Leaf leaf21 = new Leaf();
        addObject(leaf21,7,7);
    }
}