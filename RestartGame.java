import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Restart game button
 * 
 * @author Leo, Daniel, Michael
 * @version 6/10/2025
 */
public class RestartGame extends Actor
{
    // Define variables
    GreenfootSound backgroundSound = new GreenfootSound("5528.mp3");
    static int coin;
    static int hp;
    static int rateOfFire;
    static int damge;
    static int numOfJet2;
    static int speed;
    public RestartGame(int coin, int hp,int rateOfFire,int damge,int speed,int numOfJet2)
    {
        // Take datas from other worlds
        this.coin = coin;
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
        this.numOfJet2=numOfJet2;
    }
    public void act()
    {
        // Set Image
        setImage("startGameButton.png");
        GreenfootImage image = getImage();
        
        // Set size
        image.scale(300, 50);
        setImage(image);
        
        // Play background sound
        backgroundSound.play();
        
        // Mouse click to go to the actual game from up grade screen and end screen.
        if(Greenfoot.mouseClicked(this))
        {
            MyWorld upGradeScreen = new MyWorld(coin,hp,rateOfFire,damge,speed,numOfJet2);
            Greenfoot.setWorld(upGradeScreen);
            backgroundSound.stop();
        }
    }
}
