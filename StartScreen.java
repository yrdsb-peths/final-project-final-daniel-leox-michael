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
        super(400, 750, 1);
        prepare();
        setBackground("images/space.jpg");
    }
    
    
    private void prepare()
    {
        Label label = new Label("Use <-- and --> to Move", 40);
        addObject(label,200,500);
        startGameButton startGameButton = new startGameButton();
        addObject(startGameButton,187,517);
        startGameButton.setLocation(197,550);
    }
}
