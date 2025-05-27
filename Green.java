import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Actor
{
    /**
     * Act - do whatever the Green wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hp;
    double currentHp;
    public void act()
    {
        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        hp = world.getHp();
        currentHp = world.getCureentHp();
        currentHp = currentHp/hp*200;
        int x = (int)currentHp;
        GreenfootImage image = new GreenfootImage(x, 20);
        image.setColor(Color.GREEN);
        image.fillRect(0, 0, 600, 200);
        setImage(image);
    }
    
}
