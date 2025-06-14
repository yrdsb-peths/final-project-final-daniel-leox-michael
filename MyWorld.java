import greenfoot.*;

/**
 * The actual game
 * 
 * @author Leo, Daniel, Michael
 * @version 6/6/2025
 */
public class MyWorld extends World {
    // Define variables
    Label Coin;
    Label Hp;
    int totalCoin;
    int hp;
    int rateOfFire;
    int damage;
    int speed;
    int currentHp;
    int numOfJet2;
    int round=0;
    Jet2[] jet2 = new Jet2[5];
    public MyWorld(int coin, int hp,int rateOfFire,int damage,int speed, int numOfJet2) {
        // Create a new world with 400x750 cells
        super(400, 750, 1, false);
        
        // Take datas from other worlds
        totalCoin =coin;
        this.hp=hp;
        this.numOfJet2=numOfJet2;
        this.rateOfFire=rateOfFire;
        this.damage=damage;
        this.speed=speed;
        this.currentHp=hp;
        
        // Shows the number of coins that player gets in the game
        Coin = new Label(totalCoin,80);
        addObject(Coin,105,30);
        
        // Add a background
        setBackground("images/space.jpg");
        
        // Creates the main jet
        Jet jet = new Jet(hp,rateOfFire,damage,speed);
        addObject(jet, 200,650);
        
        // Add the coin image
        Coin coins = new Coin();
        addObject(coins,35,30);
        
        // Creates the health bar
        Red red = new Red();
        addObject(red,200,725);
        Green green = new Green();
        addObject(green,200,725);
        Hp = new Label(hp,20);
        Label maxHp = new Label(hp,20);
        Label slash = new Label("/",20);
        addObject(maxHp,250,725);
        addObject(slash,200,725);
        addObject(Hp,150,725);
        for(int i=1; i<=numOfJet2; i++){
            int x=1;
            if (i%2==0){
                x=-1;
            }
            jet2[i] = new Jet2(rateOfFire,damage,speed);
            addObject(jet2[i], 220+50*i*x, 650);
        }
    }
    // Spawn the bullets
    public void shootBullet(int x){
        Bullet bullet = new Bullet();
        addObject(bullet,x,600);
    }
    // Spawn the enemy bullets
    public void shootEnemyBillet(int x, int y){
        EnemyBullet bullet = new EnemyBullet();
        addObject(bullet,x,y);
    }
    // Spawn the enemy
    public void spawnEnemy(int x){
        EnemyJetOne Enemy1 = new EnemyJetOne(damage,round);
        addObject(Enemy1,x,0);
    }
    // Spawn the boss
    public void spawnBoss(int x, int y){
        Boss boss = new Boss(x,y);
        addObject(boss,200,0);
    }
    // Set up hp
    public void setHp(int x){
        currentHp=x;
        Hp.setValue(x);
    }
    // Connect to the end screen
    public void end(){
        EndScreen end = new EndScreen(totalCoin,hp,rateOfFire,damage,speed,numOfJet2);
        Greenfoot.setWorld(end);
    }
    // Add coins
    public void addCoin(){
        totalCoin++;
        Coin.setValue(totalCoin);
    }
    // Set current hp
    public void setCurrentHp(int hp){
        currentHp=hp;
    }
    // Get current hp
    public int getCureentHp(){
        return currentHp;
    }
    // Get hp
    public int getHp(){
        return hp;
    }
    // Add round
    public void addRound(){
        round++;    
    }
    // Return round
    public int returnRound(){
        return round;    
    }
}
