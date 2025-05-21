import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startGameButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startGameButton extends Actor
{
    /**
     * Act - do whatever the startGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("startGameButton.jpg");
        GreenfootImage image = getImage();
        image.scale(300, 50);
        setImage(image);
        if(Greenfoot.mouseClicked(this))
        {
            MyWorld gameWorld = new MyWorld(0,20,5,1,5);
            Greenfoot.setWorld(gameWorld);
        }
    }
}
