import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpGradeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpGradeScreen extends World
{

    /**
     * Constructor for objects of class UpGradeScreen.
     * 
     */
    static int coin;
    static int hp;
    static int rateOfFire;
    static int damge;
    static int speed;
    static GreenBlock[] greenBlock = new GreenBlock[25];
    static RadBlock[] radBlock = new RadBlock[25];
    static PropertyUpGradeButton[] buttun = new PropertyUpGradeButton[5];
    RestartGame restartGame;
    public UpGradeScreen(int coin,int hp,int rateOfFire,int damge,int speed)
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1); 
        this.hp=hp;
        this.coin=coin;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
        restartGame = new RestartGame(coin,hp,rateOfFire,damge,speed);
        addObject(restartGame,200,580);
        HP hP = new HP();
        setUp();
        addObject(hP,30,80);
        fireRate FR = new fireRate();
        addObject(FR,25,180);
        damage dmg = new damage();
        addObject(dmg,30,280);
        speed spd = new speed();
        addObject(spd,30,380);
        Label label = new Label("HP", 30);
        addObject(label,85,120);
        Label label1 = new Label("Fire Rate", 30);
        addObject(label1,85,220);
        Label label2 = new Label("Damage", 30);
        addObject(label2,85,320);
        Label label3 = new Label("Speed", 30);
        addObject(label3,85,420);
        for(int i=0; i<5;i++){
            buttun[i] = new PropertyUpGradeButton();
            addObject(buttun[i], 80,80+100*i);
        }
    }
    public static void upGrade(PropertyUpGradeButton x){
        if (x==buttun[0]){
            hp+=20;
        }
        if (x==buttun[1]){
            rateOfFire--;
        }
        if (x==buttun[2]){
            damge++;
        }  
        if (x==buttun[3]){
            speed++;
        }
    }
    public void act(){
        setUp();
        restartGame = new RestartGame(coin,hp,rateOfFire,damge,speed);
    }
    public void setUp(){
        hp();
        rate();
        damge();
        speed();
    }
    public void hp(){
        int checkUpGrade = hp/20;
        for(int i=0; i<5;i++){
            if(checkUpGrade >0){
                greenBlock[i] = new GreenBlock();
                addObject(greenBlock[i], 150+i*50,80);
                checkUpGrade--;
            }
            else{
                radBlock[i] = new RadBlock();
                addObject(radBlock[i], 150+i*50,80);
            }
        }
    }
    public void rate(){
        int checkUpGrade = rateOfFire-5;
        for(int i=0; i<5;i++){
            if(checkUpGrade <=0){
                greenBlock[i+4] = new GreenBlock();
                addObject(greenBlock[i+4], 150+i*50,180);
                checkUpGrade++;
            }
            else{
                radBlock[i+4] = new RadBlock();
                addObject(radBlock[i+4], 150+i*50,180);
            }
        }
    }
    public void damge(){
        int checkUpGrade = damge;
        for(int i=0; i<5;i++){
            if(checkUpGrade >=1){
                greenBlock[i+8] = new GreenBlock();
                addObject(greenBlock[i+8], 150+i*50,280);
                checkUpGrade--;
            }
            else{
                radBlock[i+8] = new RadBlock();
                addObject(radBlock[i+8], 150+i*50,280);
            }
        }
    }
    public void speed(){
        int checkUpGrade = speed;
        for(int i=0; i<5;i++){
            if(checkUpGrade >=5){
                greenBlock[i+12] = new GreenBlock();
                addObject(greenBlock[i+12], 150+i*50,380);
                checkUpGrade--;
            }
            else{
                radBlock[i+12] = new RadBlock();
                addObject(radBlock[i+12], 150+i*50,380);
            }
        }
    }
}
