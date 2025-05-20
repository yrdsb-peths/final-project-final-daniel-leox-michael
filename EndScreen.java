import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class EndScreen extends World
{
    Label Coin;
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen(int coinGetInThisRound)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1);
        Coin = new Label(coinGetInThisRound,80);
        addObject(Coin,50,700);
        UpGradeButton upGradeButton = new UpGradeButton();
        addObject(upGradeButton, 350, 650);
    }
}
