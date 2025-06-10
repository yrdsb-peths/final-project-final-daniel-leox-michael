import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The boss
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class Boss extends Enemy
{
    // Define variables
    SimpleTimer spawnJet = new SimpleTimer();
    SimpleTimer CD = new SimpleTimer();
    int hp;
    int damage;
    public Boss(int damage, int round){
        // Take datas from other worlds
        this.damage=damage;
        hp=50*round;
    }
    public void act()
    {
        // Set image
        setImage("images/final6.png");
        GreenfootImage image = getImage();
        // Set size
        image.scale(100, 100);
        setImage(image);
        
        // Run spawn, shoot, and damage
        spwan();
        shoot();
        damage();
    }
    // Spawn enemies
    public void spwan(){
        if(spawnJet.millisElapsed()<5000){
            return;
        }
        MyWorld world = (MyWorld) getWorld();
        for (int i = 0; i <= 5; i++)
        {
            world.spawnEnemy(Greenfoot.getRandomNumber(400));
        }
        spawnJet.mark();
    }
    // Boss shot
    public void shoot(){
        if(CD.millisElapsed()<500)
        {
            return;
        }
        MyWorld world = (MyWorld) getWorld();
        world.shootEnemyBillet(getX(),getY());
        CD.mark();
    }
    public void damage(){
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Bullet.class))
        {
            // Remove bullet when hits the boss
            removeTouching(Bullet.class);
            // Loss hp
            hp-=damage;
            
            // Boss hp <= 0 remove and add coins
            if (hp<=0){
                getWorld().removeObject(this);
                for (int i=0; i<50; i++){
                    world.addCoin();
                }
                world.addRound();
            }
        }
    }
}
