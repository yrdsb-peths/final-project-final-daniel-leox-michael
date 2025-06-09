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
    SimpleTimer CD = new SimpleTimer();
    int hp;
    int damage;
    public Boss(int damage, int round){
        this.damage=damage;
        hp=50*round;
    }
    public void act()
    {
        setImage("images/final6.png");
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
        
        // Run spawn
        spwan();
        shoot();
        damage();
    }
    public void spwan(){
        if(spawnJet.millisElapsed()<5000){
            return;
        }
        MyWorld world = (MyWorld) getWorld();
        world.spawnEnemy(Greenfoot.getRandomNumber(400));
        spawnJet.mark();
    }
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
            removeTouching(Bullet.class);
            hp-=damage;
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
