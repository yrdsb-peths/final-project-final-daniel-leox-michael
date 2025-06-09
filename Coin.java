import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The coin image
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class Coin extends Actor
{
    public void act()
    {
        // Set coin image
        setImage("coin.png");
        GreenfootImage image = getImage();
        
        // Set the size
        image.scale(50, 50);
        setImage(image);
    }
}
