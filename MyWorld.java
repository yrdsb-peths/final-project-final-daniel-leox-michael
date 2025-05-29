import greenfoot.*;

public class MyWorld extends World {
    Label Coin;
    Label Hp;
    int totalCoin;
    int hp;
    int rateOfFire;
    int damage;
    int speed;
    int currentHp;
    int numOfJet2;
    Jet2[] jet2 = new Jet2[5];
    public MyWorld(int coin, int hp,int rateOfFire,int damage,int speed, int numOfJet2) {
        super(400, 750, 1, false);
        this.hp=hp;
        this.totalCoin=coin;
        this.rateOfFire=rateOfFire;
        this.damage=damage;
        this.speed=speed;
        this.currentHp=hp;
        this.numOfJet2=numOfJet2;
        Coin = new Label(totalCoin,80);
        addObject(Coin,105,30);
        setBackground("images/space.jpg");
        Jet jet = new Jet(hp,rateOfFire,damage,speed);
        addObject(jet, 200,650);
        Coin coins = new Coin();
        addObject(coins,35,30);
        Red red = new Red();
        addObject(red,200,725);
        Green green = new Green();
        addObject(green,200,725);
        Hp = new Label(hp,20);
        Label maxHp = new Label(hp,20);
        Label d = new Label("/",20);
        addObject(maxHp,250,725);
        addObject(d,200,725);
        addObject(Hp,150,725);
        for(int i=1; i<numOfJet2; i++){
            int x=1;
            if (i%2==0){
                x=-1;
            }
            jet2[i] = new Jet2(rateOfFire,damage,speed);
            addObject(jet2[i], 220+50*i*x, 650);
        }
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
        EnemyJetOne Enemy1 = new EnemyJetOne(damage);
        addObject(Enemy1,x,0);
    }
    public void setHp(int x){
        currentHp=x;
        Hp.setValue(x);
    }
    public void end(){
        EndScreen end = new EndScreen(totalCoin,hp,rateOfFire,damage,speed,numOfJet2);
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
