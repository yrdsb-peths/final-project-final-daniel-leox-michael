import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The button that can start the game.
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class startGameButton extends Actor
{
    // Set background sound
    GreenfootSound backgroundSound = new GreenfootSound("backgroundSound2.mp3");
    public void act()
    {
        // Set the button image
        setImage("startGameButton.png");
        GreenfootImage image = getImage();
        // Button size
        image.scale(300, 50);
        setImage(image);
        
        // Play the sound
        backgroundSound.play();
        
        // Mouse click to go to MyWorld(actual game)
        if(Greenfoot.mouseClicked(this))
        {
            backgroundSound.stop();
            MyWorld gameWorld = new MyWorld(0,20,5,1,5,0);
            Greenfoot.setWorld(gameWorld);
        }
    }
}
