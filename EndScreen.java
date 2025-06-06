import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player can choose to restart the game or go to up grade screen.
 * 
 * @author Leo, Daniel, and Michael
 * @version 6/6/2025
 */

public class EndScreen extends World
{
    // Define variables
    Label Coin;
    static int coin;
    static int hp;
    static int rateOfFire;
    static int damage;
    static int speed;
    static int numOfJet2;
    public EndScreen(int coinGetInThisRound, int hp,int rateOfFire,int damage,int speed,int numOfJet2)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1);
        
        // Take datas from other worlds
        coin = coinGetInThisRound;
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damage=damage;
        this.speed=speed;
        this.numOfJet2=numOfJet2;
        
        // Display the coins of the player gets in this round
        Coin = new Label(coinGetInThisRound,65);
        addObject(Coin,120,35);
        
        // Add Gameover label
        Label label = new Label("Game Over", 80);
        addObject(label,200,350);
        
        // Add a up grade button that can go to up grade screen
        UpGradeButton upGradeButton = new UpGradeButton();
        addObject(upGradeButton, 200, 500);
        
        // The restart button
        RestartGame startGameButton = new RestartGame(coin,hp,rateOfFire,damage,speed,numOfJet2);
        addObject(startGameButton,200,580);
        
        // Add a coin image
        Coin coins = new Coin();
        addObject(coins,50,35);
    }
    // Conver the end screen to the up grade screen
    public static void goUpGradeScreen(){
        UpGradeScreen upGradeScreen = new UpGradeScreen(coin,hp,rateOfFire,damage,speed,numOfJet2);
        Greenfoot.setWorld(upGradeScreen);
    }
}
