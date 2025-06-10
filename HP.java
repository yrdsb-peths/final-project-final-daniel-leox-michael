import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * HP image
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class HP extends Actor
{
    public void act()
    {
        // Set hp image
        setImage("HP.png");
        GreenfootImage image = getImage();
        // Set size
        image.scale(50, 50);
        setImage(image);
    }
}
