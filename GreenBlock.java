import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenBlock extends Actor
{
    /**
     * Act - do whatever the GreenBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = new GreenfootImage(20, 20);
        image.setColor(Color.GREEN);
        image.fillRect(0, 0, 100, 50);
        setImage(image);
    }
}
