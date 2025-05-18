import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(400, 750, 1, false);
        Jet jet = new Jet();
        addObject(jet, 200,650);
        
    }
    public void shootBillet(int x){
        Bullet bullet = new Bullet();
        addObject(bullet,x,650);
    }
    public void spawnEnemy(int x){
        EnemyJetOne Enemy1 = new EnemyJetOne();
        addObject(Enemy1,200,0);
    }
}
