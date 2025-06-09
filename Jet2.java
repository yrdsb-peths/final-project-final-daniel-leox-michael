import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The small Jets 
 * 
 * @author Leo, Daniel, and Michael
 * @version 6/6/2025
 */
public class Jet2 extends Actor
{
    // Define variables
    int rateOfFire;
    int damge;
    int speed;
    SimpleTimer CD = new SimpleTimer();
    public Jet2(int rateOfFire,int damge, int speed) {
        // Take datas from other worlds
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
    }
    public void act()
    {
        setImage("images/final2.png");
        GreenfootImage image = getImage();
        image.scale(25,25);
        setImage(image);
        if(Greenfoot.isKeyDown("left"))
        {
          move(-speed);  
        }
        if(Greenfoot.isKeyDown("Right"))
            {
              move(speed);    
        }
        shoot();
    }
    public void shoot(){
        if(CD.millisElapsed()<rateOfFire*100)
        {
            return;
        }
        if (Greenfoot.isKeyDown("Space")){
            MyWorld world = (MyWorld) getWorld();
            world.shootBullet(getX());
            CD.mark();
        }
    }
}
