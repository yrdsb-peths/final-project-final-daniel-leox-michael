import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The button that can go to up grade screen.
 * 
 * @author Leo, Daniel, Michael
 * @version 6/10/2025
 */
public class UpGradeButton extends Actor
{
    public void act()
    {
        // Set image
        setImage("upGradeButton.png");
        GreenfootImage image = getImage();
        // Image size
        image.scale(300, 100);
        setImage(image);
        EndScreen worldEnd = (EndScreen) getWorld();
        worldEnd.playSound();
        // Mouse click the button go to up grade screen
        if(Greenfoot.mouseClicked(this))
        {
            worldEnd.stopSound();
            EndScreen world = (EndScreen) getWorld();
            world.goUpGradeScreen();
        }
    }
}
