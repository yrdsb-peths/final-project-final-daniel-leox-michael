import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy bullet
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class EnemyBullet extends Actor
{
    // Define variables
    boolean newSpawn = true;
    public void act()
    {
        // Set bullet image
        setImage("images/final7.png");
        if (newSpawn){
            // Run method checkPosition
            checkPosition();
            newSpawn=false;
        }
        // Set speed of the bullets
        move(10);
    }
    
    // Check player position
    public void checkPosition(){
        Jet jet = (Jet) getWorld().getObjects(Jet.class).get(0);
        turnTowards(jet.getX(), jet.getY());
    }
}
