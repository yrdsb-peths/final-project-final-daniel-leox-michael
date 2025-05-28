import greenfoot.*;

public class MyWorld extends World {
    Label Coin;
    Label HP;
    int totalCoin=0;
    int hp;
    int rateOfFire;
    int damge;
    int speed;
    int currentHp;
    public MyWorld(int coin, int hp,int rateOfFire,int damge,int speed) {
        super(400, 750, 1, false);
        Coin = new Label(totalCoin,80);
        addObject(Coin,105,30);
        setBackground("images/space.jpg");
        Jet jet = new Jet(hp,rateOfFire,damge,speed);
        addObject(jet, 200,650);
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
        this.currentHp=hp;
        Coin coins = new Coin();
        addObject(coins,35,30);
        HP Hp = new HP();
        addObject(Hp, 35, 725);
        HP = new Label(hp, 80);
        addObject(HP, 350, 715);
        Red red = new Red();
        addObject(red,200,725);
        Green green = new Green();
        addObject(green,200,725);
    }
    public void shootBillet(int x){
        Bullet bullet = new Bullet();
        addObject(bullet,x,600);
    }
    public void shootEnemyBillet(int x, int y){
        EnemyBullet bullet = new EnemyBullet();
        addObject(bullet,x,y);
    }
    public void spawnEnemy(int x){
        EnemyJetOne Enemy1 = new EnemyJetOne();
        addObject(Enemy1,x,0);
    }
    public void setHp(int x){
        currentHp=x;
    }
    public void end(){
        EndScreen end = new EndScreen(totalCoin,hp,rateOfFire,damge,speed);
        Greenfoot.setWorld(end);
    }
    public void addCoin(){
        totalCoin++;
        Coin.setValue(totalCoin);
    }
    public void setCurrentHp(int hp){
        currentHp=hp;
    }
    public int getCureentHp(){
        return currentHp;
    }
    public int getHp(){
        return hp;
    }
}
