import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baya extends Actor
{
    /**
     * Act - do whatever the baya wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(2);
        for(int i=0;i<10;i++){
            if(isAtEdge()){
            turn(-15);
            move(2);
            }
            if(isTouching(null)){
            removeTouching(null);
            }
        }
    }    
}
