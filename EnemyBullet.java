import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Actor
{
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
