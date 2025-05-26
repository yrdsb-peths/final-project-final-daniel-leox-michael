import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartGame extends Actor
{
    /**
     * Act - do whatever the RestartGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage("startGameButton.png");
        GreenfootImage image = getImage();
        image.scale(300, 50);
        setImage(image);
        if(Greenfoot.mouseClicked(this))
        {
            UpGradeScreen world = (UpGradeScreen) getWorld();
            UpGradeScreen.restart();
        }
    }
}
