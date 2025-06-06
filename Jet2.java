import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPCJet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet2 extends Actor
{
    /**
     * Act - do whatever the NPCJet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int rateOfFire;
    int damge;
    int speed;
    SimpleTimer CD = new SimpleTimer();
    public Jet2(int rateOfFire,int damge, int speed) {
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
