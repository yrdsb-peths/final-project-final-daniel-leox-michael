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
        // play background sound
        if (this.getWorld().getClass() == UpGradeScreen.class)
            {
                UpGradeScreen world = (UpGradeScreen) getWorld();
                world.playSound();
            }
        // Mouse click to go to the actual game from up grade screen and end screen.
        if(Greenfoot.mouseClicked(this))
        {
            if (this.getWorld().getClass() == EndScreen.class)
            {
                EndScreen world = (EndScreen) getWorld();
                world.stopSound();
            }else if (this.getWorld().getClass() == UpGradeScreen.class)
            {
                UpGradeScreen world = (UpGradeScreen) getWorld();
                world.stopSound();
            }
            MyWorld game = new MyWorld(coin,hp,rateOfFire,damge,speed,numOfJet2);
            Greenfoot.setWorld(game);
            
        }
    }
}
