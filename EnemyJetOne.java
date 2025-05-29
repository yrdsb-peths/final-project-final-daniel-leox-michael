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
    int hp=5;
    int damage;
    SimpleTimer CD = new SimpleTimer();
    public void act()
    {
        setImage("images/final4.png");
        moveToPlayer();
        shoot();
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
        damage();
    }
    public EnemyJetOne(int damage){
        this.damage=damage;
    }
    public void moveToPlayer()
    {
        move(1);
        Jet jet = (Jet) getWorld().getObjects(Jet.class).get(0);
        turnTowards(jet.getX(), jet.getY());
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
                world.addCoin();
            }
        }
    }
}
