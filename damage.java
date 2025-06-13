import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Damage symbol image
 * 
 * @author Leo, Daniel, Michael
 * @version 6/6/2025
 */
public class Damage extends Actor
{
    public void act()
    {
        // Set image
        setImage("damage.png");
        GreenfootImage image = getImage();
        // Image size
        image.scale(50, 50);
        setImage(image);
    }
}
