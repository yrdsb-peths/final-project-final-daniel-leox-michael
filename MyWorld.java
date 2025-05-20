import greenfoot.*;

public class MyWorld extends World {
    Label Hp;
    public MyWorld() {
        super(400, 750, 1, false);
        Hp = new Label(0,80);
        addObject(Hp,350,700);
        setBackground("images/space.jpg");
        Jet jet = new Jet();
        addObject(jet, 200,650);
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
        EndScreen end = new EndScreen();
        Greenfoot.setWorld(end);
    }
}
