import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The red bar for hp
 * 
 * @author Leo, Daniel, Michael
 * @version 6/10/2025
 */
public class Red extends Actor
{
    public void act()
    {
        // Create the red bar to show the hp bar
        MyWorld world = (MyWorld) getWorld();
        GreenfootImage image = new GreenfootImage(200, 20);
        image.setColor(Color.RED);
        image.fillRect(0, 0, 600, 200);
        setImage(image);
    }
}
