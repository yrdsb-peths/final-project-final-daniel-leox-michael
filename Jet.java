import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy bullet
 * 
 * @author Leo, Daniel, Michael
 * @version 6/9/2025
 */
public class Jet extends Actor
{
    // Add shot and background sound
    GreenfootSound shootSoundEffect = new GreenfootSound("shootSound.mp3");
    GreenfootSound backgroundSound = new GreenfootSound("backgroundSound.mp3");
    
    // Define variables
    SimpleTimer spawnJet = new SimpleTimer();
    SimpleTimer CD = new SimpleTimer();
    int hp;
    int rateOfFire;
    int damage;
    int speed;
    int round;   
    int boss =1;
    GreenfootImage[] jet = new GreenfootImage[4];
    public Jet(int hp, int rateOfFire,int damage, int speed) {
        // Take datas from other worlds
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damage=damage;
        this.speed=speed;
    }
    public void act()
    {
        // Play the background sound
        backgroundSound.play();
        
        // Set Jet image
        setImage("images/jet2.png");
        
        // Create animations for the man Jet
        if(getX()-1>0){
            // Turn left
            if(Greenfoot.isKeyDown("left"))
            {
              move(-speed);  
              setImage("images/jet3.png");
            }
        }
        if(getX()+1<400){
            // Turn right
            if(Greenfoot.isKeyDown("Right"))
            {
              move(speed);  
              setImage("images/jet1.png");
            } 
        }
        // Run these methods
        spawnJet();
        shoot();
        getDamage();
        spawnBoss();
    }
    
    // Press space to shot
    public void shoot(){
        if(CD.millisElapsed()<rateOfFire*100)
        {
            return;
        }
        if (Greenfoot.isKeyDown("Space")){
            shootSoundEffect.play();
            MyWorld world = (MyWorld) getWorld();
            world.shootBullet(getX());
            CD.mark();
        }
    }
    
    // Spawn the main Jet
    public void spawnJet(){
        if(spawnJet.millisElapsed()<1000-round*2)
        {
            return;
        }
        MyWorld world = (MyWorld) getWorld();
        world.spawnEnemy(Greenfoot.getRandomNumber(400));
        spawnJet.mark();
    }
    
    // Spawn boss
    public void spawnBoss(){
        if(round>=20*boss)
        {
            MyWorld world = (MyWorld) getWorld();
            world.spawnBoss(damage,boss);
            boss+=2; 
        }  
    }
    public void getDamage(){
        // Set up
        MyWorld world = (MyWorld) getWorld();
        world.setHp(hp);
        round = world.returnRound();
        
        // Loss hp when get hit with enemies
        if(isTouching(EnemyJetOne.class))
        {
            removeTouching(EnemyJetOne.class);
            hp--;
            world.setHp(hp);
        }
        
        // Loss hp when get hit with enemies bullets
        if(isTouching(EnemyBullet.class))
        {
            removeTouching(EnemyBullet.class);
            hp--;
            world.setHp(hp);
        }
        
        // Game over when hp is 0
        if (hp<=0){
            backgroundSound.stop();
            world.end();
        }
    }
}
