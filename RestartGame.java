import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartGame extends Actor
{
    /**
     * Act - do whatever the RestartGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int coin;
    static int hp;
    static int rateOfFire;
    static int damge;
    static int speed;
    static int numOfJet2;
    public RestartGame(int coin, int hp,int rateOfFire,int damge,int speed,int numOfJet2){
        this.coin = coin;
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
        this.numOfJet2=numOfJet2;
    }
    public void act()
    {
        // Add your action code here.
        setImage("startGameButton.png");
        GreenfootImage image = getImage();
        image.scale(300, 50);
        setImage(image);
        if(Greenfoot.mouseClicked(this))
        {
            MyWorld upGradeScreen = new MyWorld(coin,hp,rateOfFire,damge,speed,numOfJet2);
            Greenfoot.setWorld(upGradeScreen);
        }
    }
}
