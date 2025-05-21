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
    
    
    private void prepare()
    {
        Label label = new Label("Use <-- and --> to Move", 40);
        addObject(label,200,500);
        startGameButton startGameButton = new startGameButton();
        addObject(startGameButton,187,517);
        startGameButton.setLocation(197,550);
        UpGradeButton upGradeButton = new UpGradeButton();
        addObject(upGradeButton,198,638);
    }
}
