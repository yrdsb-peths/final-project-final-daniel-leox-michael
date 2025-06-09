import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The title screen (the title of the game).
 * 
 * @author Leo, Daniel, and Michael
 * @version 6/9/2025
 */
public class TitleScreen extends World
{
    // Label the name of the game
    Label titleLabel = new Label("StarFighter", 60);
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1);
        addObject(titleLabel, getWidth()/2, 200);
        
        // Run prepare
        prepare();
    }
    
    public void act()
    {
        // Set background
        setBackground("titleScreenBackground.png");
        
        // Mouse click to go to the start screen
        if(Greenfoot.mouseClicked(this))
        {
            StartScreen startGameWorld = new StartScreen();
            Greenfoot.setWorld(startGameWorld);
        }
    }
    
    private void prepare()
    {
        // The label that tells the player how to start the game
        Label label = new Label("Mouse < Click > to Start", 40);
        addObject(label,200,375);
    }
}
