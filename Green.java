import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The hp bar
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class Green extends Actor
{
    // Define variables
    int hp;
    double currentHp;
    public void act()
    {
        // Create a green bar for the hp display in the game
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
