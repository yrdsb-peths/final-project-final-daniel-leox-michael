import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class upGradeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpGradeButton extends Actor
{
    /**
     * Act - do whatever the upGradeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage("images/upgrade.png");
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
        
    }
}
