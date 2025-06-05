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
    static int numOfJet2;
    static int hp;
    static int rateOfFire;
    static int damage;
    static int speed;
    static GreenBlock[] greenBlock = new GreenBlock[25];
    static RedBlock[] redBlock = new RedBlock[25];
    static PropertyUpGradeButton[] buttun = new PropertyUpGradeButton[5];
    RestartGame restartGame;
    public UpGradeScreen(int coin,int hp,int rateOfFire,int damage,int speed,int numOfJet2)
    {    
        
        // Create a new world with 400x750 cells with a cell size of 1x1 pixels.
        super(400, 750, 1); 
        this.hp=hp;
        this.coin=coin;
        this.rateOfFire=rateOfFire;
        this.damage=damage;
        this.speed=speed;
        //setBackground("UpGradeScreenBackground.png");
        this.numOfJet2= numOfJet2;
        restartGame = new RestartGame(coin,hp,rateOfFire,damage,speed,numOfJet2);
        addObject(restartGame,200,580);
        setUp();
        
        // Add HP image into up grade world
        HP hP = new HP();
        addObject(hP,30,80);
        
        // Add fire rate into up grade world
        fireRate FR = new fireRate();
        addObject(FR,25,180);
        
        // Add damage image into up grade world
        damage dmg = new damage();
        addObject(dmg,30,280);
        
        // Add speed image into up grade world
        speed spd = new speed();
        addObject(spd,30,380);
        
        // Add HP label into up grade world
        Label label = new Label("HP", 30);
        addObject(label,85,120);
        
        // Add fire rate label into up grade world
        Label label1 = new Label("Fire Rate", 30);
        addObject(label1,85,220);
        
        // Add damage label into up grade world
        Label label2 = new Label("Damage", 30);
        addObject(label2,85,320);
        
        // Add speed label into up grade world
        Label label3 = new Label("Speed", 30);
        addObject(label3,85,420);
        
        // Add five up grade buttons
        for(int i=0; i<5;i++){
            buttun[i] = new PropertyUpGradeButton();
            addObject(buttun[i], 80,80+100*i);
        }
    }
    
    public static void upGrade(PropertyUpGradeButton x){
        // Add 20 hp when the first button is pressed
        if (x==buttun[0]){
            if (hp < 100)
            {
                hp+=20;
            }
        }
        // Add fire rate when the second button is pressed
        if (x==buttun[1]){
            if (rateOfFire > 1)
            {
            rateOfFire--;
            }
        }
        if (x==buttun[2]){
            damage++;
        }  
        if (x==buttun[3]){
            if (speed < 10)
            {
                speed++;
            }
        }
        if (x==buttun[4]){
            if (numOfJet2 < 5)
            {
                numOfJet2++;
            }
        }
    }
    public void act(){
        setUp();
        restartGame = new RestartGame(coin,hp,rateOfFire,damage,speed,numOfJet2);
    }
    public void setUp(){
        hp();
        rate();
        damage();
        speed();
        jet2();
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
                redBlock[i] = new RedBlock();
                addObject(redBlock[i], 150+i*50,80);
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
                redBlock[i+4] = new RedBlock();
                addObject(redBlock[i+4], 150+i*50,180);
            }
        }
    }
    public void damage(){
        int checkUpGrade = damage;
        for(int i=0; i<5;i++){
            if(checkUpGrade >=1){
                greenBlock[i+8] = new GreenBlock();
                addObject(greenBlock[i+8], 150+i*50,280);
                checkUpGrade--;
            }
            else{
                redBlock[i+8] = new RedBlock();
                addObject(redBlock[i+8], 150+i*50,280);
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
                redBlock[i+12] = new RedBlock();
                addObject(redBlock[i+12], 150+i*50,380);
            }
        }
    }
    public void jet2(){
        int checkUpGrade = numOfJet2;
        for(int i=0; i<5;i++){
            if(checkUpGrade >=0){
                greenBlock[i+16] = new GreenBlock();
                addObject(greenBlock[i+16], 150+i*50,480);
                checkUpGrade--;
            }
            else{
                redBlock[i+16] = new RedBlock();
                addObject(redBlock[i+16], 150+i*50,480);
            }
        }
    }
}
