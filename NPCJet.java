import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPCJet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPCJet extends Actor
{
    /**
     * Act - do whatever the NPCJet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("images/final2.png");
        GreenfootImage image = getImage();
        image.scale(25,25);
        setImage(image);
    }
}
