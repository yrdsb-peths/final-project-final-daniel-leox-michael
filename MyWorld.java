import greenfoot.*;

public class MyWorld extends World {
    Label Hp;
    Label Coin;
    int totalCoin=0;
    int hp;
    int rateOfFire;
    int damge;
    int speed;
    public MyWorld(int coin, int hp,int rateOfFire,int damge,int speed) {
        super(400, 750, 1, false);
        Hp = new Label(0,80);
        addObject(Hp,350,700);
        Coin = new Label(totalCoin,80);
        addObject(Coin,105,700);
        setBackground("images/space.jpg");
        Jet jet = new Jet(hp,rateOfFire,damge,speed);
        addObject(jet, 200,650);
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
        HP hP = new HP();
        addObject(hP,285,700);
        Coin coins = new Coin();
        addObject(coins,50,700);
    }
    public void shootBillet(int x){
        Bullet bullet = new Bullet();
        addObject(bullet,x,650);
    }
    public void shootEnemyBillet(int x, int y){
        EnemyBullet bullet = new EnemyBullet();
        addObject(bullet,x,y);
    }
    public void spawnEnemy(int x){
        EnemyJetOne Enemy1 = new EnemyJetOne();
        addObject(Enemy1,x,0);
    }
    public void getHp(int x){
        Hp.setValue(x);
    }
    public void end(){
        EndScreen end = new EndScreen(totalCoin,hp,rateOfFire,damge,speed);
        Greenfoot.setWorld(end);
    }
    public void addCoin(){
        totalCoin++;
        Coin.setValue(totalCoin);
    }
}
