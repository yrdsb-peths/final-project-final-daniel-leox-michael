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
        setImage("images/final7.png");
        if (newSpawn){
            checkPosition();
            newSpawn=false;
        }
        move(10);
        // Add your action code here.
    }
    public void checkPosition(){
        Jet jet = (Jet) getWorld().getObjects(Jet.class).get(0);
        turnTowards(jet.getX(), jet.getY());
    }
}
