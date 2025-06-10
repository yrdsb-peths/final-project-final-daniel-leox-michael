import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The small Jets 
 * 
 * @author Leo, Daniel, and Michael
 * @version 6/10/2025
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
        // Set small jets image
        setImage("images/final2.png");
        GreenfootImage image = getImage();
        // Set image size
        image.scale(25,25);
        setImage(image);
        
        // Make movements of the small jets
        // Move left
        if(Greenfoot.isKeyDown("left"))
        {
          move(-speed);  
        }
        // Move right
        if(Greenfoot.isKeyDown("Right"))
            {
              move(speed);    
        }
        
        // Run method shoot
        shoot();
    }
    public void shoot(){
        // The fire rate
        if(CD.millisElapsed()<rateOfFire*100)
        {
            return;
        }
        // Press space to fire for small Jets
        if (Greenfoot.isKeyDown("Space")){
            MyWorld world = (MyWorld) getWorld();
            world.shootBullet(getX());
            CD.mark();
        }
    }
}
