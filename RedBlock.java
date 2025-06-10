import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The red block for up grade
 * 
 * @author Leo, Daniel, Michael
 * @version 6/10/2025
 */
public class RedBlock extends Actor
{
    public void act()
    {
        // Create red block
        GreenfootImage image = new GreenfootImage(20, 20);
        image.setColor(Color.RED);
        image.fillRect(0, 0, 100, 50);
        setImage(image);
    }
}
