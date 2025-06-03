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
    static int damage;
    static int speed;
    static int numOfJet2;
    public EndScreen(int coinGetInThisRound, int hp,int rateOfFire,int damage,int speed,int numOfJet2)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1);
        coin = coinGetInThisRound;
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damage=damage;
        this.speed=speed;
        this.numOfJet2=numOfJet2;
        Coin = new Label(coinGetInThisRound,65);
        Label label = new Label("Game Over", 80);
        addObject(label,200,350);
        addObject(Coin,120,35);
        UpGradeButton upGradeButton = new UpGradeButton();
        addObject(upGradeButton, 200, 500);
        RestartGame startGameButton = new RestartGame(coin,hp,rateOfFire,damage,speed,numOfJet2);
        addObject(startGameButton,200,580);
        Coin coins = new Coin();
        addObject(coins,50,35);
    }
    public static void goUpGradeScreen(){
        UpGradeScreen upGradeScreen = new UpGradeScreen(coin,hp,rateOfFire,damage,speed,numOfJet2);
        Greenfoot.setWorld(upGradeScreen);
    }
}
