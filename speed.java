import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Speed symbol image
 * 
 * @author Leo, Daniel, Michael
 * @version 6/10/2025
 */
public class speed extends Actor
{
    public void act()
    {
        // Set image
        setImage("speed.png");
        GreenfootImage image = getImage();
        // Image size
        image.scale(50, 50);
        setImage(image);
    }
}
