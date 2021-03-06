import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        handleMovement();
        eatFly();
        atTepi();
    }    
    
    public void handleMovement()
    {
        //kecepatan 2 dan akan berbelok kekiri sebesar 2 derajat ketika ada tombol left dari keyboard ditekan.
        //Dan begitu pula sebaliknya, Bee akan berbelok ke kanan sebesar 2 derajat ketika tombol right dari keyboard ditekan. 
        move(2);
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(2);
        }
    }
    
    public void eatFly()
    {
        //Buat method eatFly() di class Bee untuk menerapkan collision detection. 
        //Jika Bee berada dilokasi yang sama dengan objek Fly, maka objek Fly akan hilang / di remove dari BeeWorld. 
        //Kemudian objek Fly baru akan ditambahkan kedalam BeeWorld secara acak dengan jarak minimal 10 dari tepi. 
        //Panggil method yang anda buat di method act() 
        if (isTouching(Fly.class))
        {
            removeTouching(Fly.class);
            getWorld().addObject(new Fly(),Greenfoot.getRandomNumber(690),Greenfoot.getRandomNumber(490));
        }
    }
    
    public void atTepi()
    {
        if (getY() < 5) //Atas
        {
            setLocation(getX(), getWorld().getHeight()-5);
        } else if(getY() > getWorld().getHeight()-5) //Bawah
        {
            setLocation(getX(), 5);
        } else if(getX() < 5 ) //Kiri
        {
            setLocation(getWorld().getWidth()-5, getY());
        } else if(getX() > getWorld().getWidth()-5) //Kanan
        {
            setLocation(5, getY());
        }
    }
}
