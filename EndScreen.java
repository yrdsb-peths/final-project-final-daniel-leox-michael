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
    static int coin =0;
    static int hp;
    static int rateOfFire;
    static int damge;
    static int speed;
    public EndScreen(int coinGetInThisRound, int hp,int rateOfFire,int damge,int speed)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1);
        Coin = new Label(coinGetInThisRound,80);
        Label label = new Label("Game Over", 40);
        addObject(label,202,346);
        addObject(Coin,50,700);
        UpGradeButton upGradeButton = new UpGradeButton();
        addObject(upGradeButton, 350, 650);
        coin = coinGetInThisRound;
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
    }
    public static void goUpGradeScreen(){
        UpGradeScreen upGradeScreen = new UpGradeScreen(coin,hp,rateOfFire,damge,speed);
        Greenfoot.setWorld(upGradeScreen);
    }
}
