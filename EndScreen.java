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
    static int coin;
    static int hp;
    static int rateOfFire;
    static int damge;
    static int speed;
    public EndScreen(int coinGetInThisRound, int hp,int rateOfFire,int damge,int speed)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1);
        coin = coinGetInThisRound;
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
        Coin = new Label(coinGetInThisRound,65);
        Label label = new Label("Game Over", 80);
        addObject(label,200,350);
        addObject(Coin,120,700);
        UpGradeButton upGradeButton = new UpGradeButton();
        addObject(upGradeButton, 200, 500);
        RestartGame startGameButton = new RestartGame(coin,hp,rateOfFire,damge,speed);
        addObject(startGameButton,200,580);
        Coin coins = new Coin();
        addObject(coins,50,700);
    }
    public static void goUpGradeScreen(){
        UpGradeScreen upGradeScreen = new UpGradeScreen(coin,hp,rateOfFire,damge,speed);
        Greenfoot.setWorld(upGradeScreen);
    }
}
