import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The boss
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class Boss extends Enemy
{
    
    SimpleTimer spawnJet = new SimpleTimer();
    
    public void act()
    {
        setImage("images/final6.png");
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
        
        // Run spawn
        spwan();
    }
    public void spwan(){
        if(spawnJet.millisElapsed()<5000){
            return;
        }
        MyWorld world = (MyWorld) getWorld();
        world.spawnEnemy(Greenfoot.getRandomNumber(400));
        spawnJet.mark();
    }
}
