import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bullet of the fighter.
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class Bullet extends Actor
{
    public void act()
    {
        // Set bullet image and location
        setImage("images/final1.png");
        setLocation(getX(),getY()-5);
    }
}
