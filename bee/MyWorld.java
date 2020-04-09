import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,200,200);
        Bee bee2 = new Bee();
        addObject(bee2,70,78);
        Bee bee3 = new Bee();
        addObject(bee3,116,317);
        Bee bee4 = new Bee();
        addObject(bee4,468,27);
        Bee bee5 = new Bee();
        addObject(bee5,377,354);
    }
}
