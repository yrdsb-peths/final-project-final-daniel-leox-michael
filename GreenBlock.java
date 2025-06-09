import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The up grade green blocks
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class GreenBlock extends Actor
{
    public void act()
    {
        // Create green blocks for up grade (for player to know they up graded).
        GreenfootImage image = new GreenfootImage(20, 20);
        image.setColor(Color.GREEN);
        image.fillRect(0, 0, 100, 50);
        setImage(image);
    }
}
