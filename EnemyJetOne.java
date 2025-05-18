import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyJetOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyJetOne extends Enemy
{
    /**
     * Act - do whatever the EnemyJetOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    boolean start = true;
    public void act()
    {
        setLocation(getX(), getY()+1);
    }

}
