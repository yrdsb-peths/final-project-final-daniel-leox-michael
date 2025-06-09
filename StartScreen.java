import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world that tells the player how to play the game.
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class StartScreen extends World
{
    public StartScreen()
    {    
        // Create a new world with 400x750 cells
        super(400, 750, 1);
        
        // Run prepare
        prepare();
        
        // Set background
        setBackground("images/space.jpg");
    }
    
    private void prepare()
    {
        // The labels for for player to understand how to play the game
        Label label = new Label("Use <-- and --> to Move", 40);
        addObject(label,200,500);
        Label label1 = new Label("Use <space> to shot", 40);
        addObject(label1,200,450);
        
        // A start game button
        startGameButton startGameButton = new startGameButton();
        addObject(startGameButton,187,517);
        startGameButton.setLocation(197,550);
    }
}
