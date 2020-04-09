import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @aksal.sf 
 * @beta_version (23-3-2020)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        TepiBalik();
        if(isTouching(null)) {
            turn(Greenfoot.getRandomNumber(180));
        }
    }
    
    public void TepiBalik () {
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(180));
        }
    }
}
