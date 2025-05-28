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
        setBackground("titleScreenBackground.png");
        if(Greenfoot.mouseClicked(this))
        {
            StartScreen startGameWorld = new StartScreen();
            Greenfoot.setWorld(startGameWorld);
        }
    }
    
    private void prepare()
    {
        Label label = new Label("Mouse < Click > to Start", 40);
        addObject(label,202,346);
        label.setLocation(200,334);
        label.setLocation(199,352);
        label.setLocation(186,338);
        label.setLocation(186,337);
        label.setLocation(210,344);
    }
}
