import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            MyWorld gameWorld = new MyWorld(0,50,3,1,10);
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare()
    {
        Label label3 = new Label("Press <enter> to Start", 40);
        addObject(label3,202,348);
        Label label2 = new Label("Use <-- and --> to Move", 40);
        addObject(label2,205,424);
    }
}
