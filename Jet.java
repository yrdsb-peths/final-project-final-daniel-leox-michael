import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet extends Actor
{
    /**
     * Act - do whatever the Jet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.

        if(Greenfoot.isKeyDown("left"))
        {
          move(-1);  
        }
        if(Greenfoot.isKeyDown("Right"))
        {
          move(1);  
        } 
        shoot();
    }
    public void shoot(){
        if (Greenfoot.isKeyDown("Space")){
            MyWorld world = (MyWorld) getWorld();
            world.shootBillet(getX());
        }
    }
}
