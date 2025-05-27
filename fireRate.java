import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fireRate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireRate extends Actor
{
    /**
     * Act - do whatever the fireRate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("fireRate.png");
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }
}
