import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Fire rate symbol image
 * 
 * @author Leo, Daniel, Michael
 * @version 6/10/2025
 */
public class FireRate extends Actor
{
    public void act()
    {
        // Set image
        setImage("fireRate.png");
        GreenfootImage image = getImage();
        // Image size
        image.scale(50, 50);
        setImage(image);
    }
}
