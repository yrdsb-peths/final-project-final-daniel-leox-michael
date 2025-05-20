import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet extends Actor
{
    /**
     * Act - do whatever the Jet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer spawn = new SimpleTimer();
    SimpleTimer CD = new SimpleTimer();
    public void act()
    {
        setImage("images/rocket.png");
        // Add your action code here.
        if(getX()-1>0){
            if(Greenfoot.isKeyDown("left"))
            {
              move(-3);  
            }
        }
        if(getX()+1<400){
            if(Greenfoot.isKeyDown("Right"))
            {
              move(3);  
            } 
            
        }
        spawnJet();
        shoot();
        
    }
    public void shoot(){
        if(CD.millisElapsed()<500)
        {
            return;
        }
        if (Greenfoot.isKeyDown("Space")){
            MyWorld world = (MyWorld) getWorld();
            world.shootBillet(getX());
            CD.mark();
        }
    }
        public void spawnJet(){
        if(spawn.millisElapsed()<1000)
        {
            return;
        }
        MyWorld world = (MyWorld) getWorld();
        world.spawnEnemy(Greenfoot.getRandomNumber(400));
        spawn.mark();
    }
}
