import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wedus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wedus extends Actor
{
    /**
     * Act - do whatever the wedus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(2);
        for(int i=0;i<10;i++){
            if(isAtEdge()){
            turn(180);
            move(2);
            }
            
            if(isTouching(null)){
            turn(-60);
            }
        }
    }    
}
