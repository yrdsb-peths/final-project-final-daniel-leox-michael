import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy jet
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class EnemyJetOne extends Enemy
{
    // Define variables
    SimpleTimer CD = new SimpleTimer();
    int hp;
    int damage;
    public void act()
    {
        // Set Jet image
        setImage("images/final4.png");
        GreenfootImage image = getImage();
        // Set the size
        image.scale(50, 50);
        setImage(image);
        
        // Run method moveToPlayer
        moveToPlayer();
        
        // Run method shoot
        shoot();
        
        // Run method damage
        damage();
    }
    public EnemyJetOne(int damage, int round){
        this.damage=damage;
        hp=1+round/5;
    }
    
    // Make the enemies move to player
    public void moveToPlayer(){
        move(1);
        Jet jet = (Jet) getWorld().getObjects(Jet.class).get(0);
        turnTowards(jet.getX(), jet.getY());
    }
    
    // Make enemies to shot 
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
            // Remove the bullet
            removeTouching(Bullet.class);
            hp-=damage;
            
            // Remove the object when hp is 0
            if (hp<=0){
                getWorld().removeObject(this);
                world.addCoin();
                world.addRound();
            }
        }
    }
}
