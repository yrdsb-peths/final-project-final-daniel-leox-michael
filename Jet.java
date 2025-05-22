import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet extends Actor
{
    /**
     * Act - do whatever the Jet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer spawn = new SimpleTimer();
    SimpleTimer CD = new SimpleTimer();
    int hp;
    int rateOfFire;
    int damge;
    int speed;
    GreenfootImage[] jet = new GreenfootImage[4];
    public Jet(int hp, int rateOfFire,int damge, int speed) {
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
    }
    public void act()
    {
        setImage("images/jet0.png");
        // Add your action code here.
        if(getX()-1>0){
            if(Greenfoot.isKeyDown("left"))
            {
              move(-speed);  
            }
            setImage("images/jet0.png");
        }
        if(getX()+1<400){
            if(Greenfoot.isKeyDown("Right"))
            {
              move(speed);  
            } 
            setImage("images/jet0.png");
        }
        spawnJet();
        shoot();
    }
    public void shoot(){
        if(CD.millisElapsed()<rateOfFire*100)
        {
            return;
        }
        if (Greenfoot.isKeyDown("Space")){
            MyWorld world = (MyWorld) getWorld();
            world.shootBillet(getX());
            CD.mark();
        }
        getDamage();
    }
    public void spawnJet(){
        if(spawn.millisElapsed()<1000)
        {
            return;
        }
        MyWorld world = (MyWorld) getWorld();
        world.spawnEnemy(Greenfoot.getRandomNumber(400));
        spawn.mark();
    }
    public void getDamage(){
        MyWorld world = (MyWorld) getWorld();
        world.getHp(hp);
        if(isTouching(EnemyJetOne.class))
        {
            removeTouching(EnemyJetOne.class);
            hp--;
            world.getHp(hp);
        }
        if(isTouching(EnemyBullet.class))
        {
            removeTouching(EnemyBullet.class);
            hp--;
            world.getHp(hp);
        }
        if (hp<=0){
            world.end();
        }
    }
}
