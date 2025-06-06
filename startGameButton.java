import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startGameButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startGameButton extends Actor
{
    GreenfootSound backgroundSound = new GreenfootSound("backgroundSound2.mp3");
    /**
     * Act - do whatever the startGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("startGameButton.png");
        GreenfootImage image = getImage();
        image.scale(300, 50);
        setImage(image);
        backgroundSound.play();
        if(Greenfoot.mouseClicked(this))
        {
            backgroundSound.stop();
            MyWorld gameWorld = new MyWorld(0,20,5,1,5,0);
            Greenfoot.setWorld(gameWorld);
        }
    }
}
