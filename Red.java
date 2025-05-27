import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red extends Actor
{
    /**
     * Act - do whatever the Rad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        GreenfootImage image = new GreenfootImage(200, 20);
        image.setColor(Color.RED);
        image.fillRect(0, 0, 600, 200);
        setImage(image);
    }
}
