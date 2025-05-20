import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("StarFighter", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1);
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            StartScreen startGameWorld = new StartScreen();
            Greenfoot.setWorld(startGameWorld);
        }
    }
    
    private void prepare()
    {
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,202,346);
    }
}
