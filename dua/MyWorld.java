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
        baya baya = new baya();
        addObject(baya,114,372);
        ulo ulo = new ulo();
        addObject(ulo,67,297);
        wedus wedus = new wedus();
        addObject(wedus,61,234);
        wedus.setLocation(57,67);
        ulo.setLocation(67,204);
        baya baya2 = new baya();
        addObject(baya2,450,72);
        ulo ulo2 = new ulo();
        addObject(ulo2,454,359);
        wedus wedus2 = new wedus();
        addObject(wedus2,294,209);
        removeObject(baya2);
        ulo ulo3 = new ulo();
        addObject(ulo3,461,122);
        wedus wedus3 = new wedus();
        addObject(wedus3,90,316);
        ulo ulo4 = new ulo();
        addObject(ulo4,208,41);
        ulo ulo5 = new ulo();
        addObject(ulo5,570,278);
        wedus wedus4 = new wedus();
        addObject(wedus4,218,262);
        ulo ulo6 = new ulo();
        addObject(ulo6,280,139);
        wedus wedus5 = new wedus();
        addObject(wedus5,575,75);
        wedus wedus6 = new wedus();
        addObject(wedus6,547,214);
        wedus wedus7 = new wedus();
        addObject(wedus7,556,364);
        wedus wedus8 = new wedus();
        addObject(wedus8,336,288);
        wedus wedus9 = new wedus();
        addObject(wedus9,358,18);
        wedus wedus10 = new wedus();
        addObject(wedus10,135,141);
    }
}
