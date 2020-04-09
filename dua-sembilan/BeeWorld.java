import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Fly(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(500));
        addObject(new Fly(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(500));
        addObject(new Fly(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(500));
        addObject(new Fly(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(500));
        addObject(new Fly(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(500));
        Bee bee = new Bee();
        addObject(bee,360,206);
    }
}
