import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player can up grade the hp, fire rate, damage, and speed of the main jet
 * and add small jet beside the main jet to help fight.
 * 
 * @author Leo, Daniel, Michael
 * @version 6/6/2025
 */
public class UpGradeScreen extends World
{
    // Define variables
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
        
        // Take datas from other worlds
        this.hp=hp;
        this.coin=coin;
        this.rateOfFire=rateOfFire;
        this.damage=damage;
        this.speed=speed;
        this.numOfJet2= numOfJet2;
        
        // Add the restart button
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
        
        // Add addjets image into up grade world
        AddJets AJ = new AddJets();
        addObject(AJ,30,480);
        
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
        
        // Add speed label into up grade world
        Label label4 = new Label("Add jets", 30);
        addObject(label4,85,520);
        
        // Add five up grade buttons
        for(int i=0; i<5;i++){
            buttun[i] = new PropertyUpGradeButton();
            addObject(buttun[i], 80,80+100*i);
        }
    }
    
    public static void upGrade(PropertyUpGradeButton x){
        // Add 20 hp when the first button is pressed
        if (x==buttun[0]){
            // Create a maximum number of hp for up grade
            if (hp < 100)
            {
                hp+=20;
            }
        }
        // Add fire rate when the second button is pressed
        if (x==buttun[1]){
            // Create a maximum number of fire rate for up grade
            if (rateOfFire > 1)
            {
            rateOfFire--;
            }
        }
        // Add 1 damage when the third button is pressed
        if (x==buttun[2]){
            // Create a maximum number of damage for up grade
            if (damage < 10)
            {
                damage++;
            }
        }  
        // Add 1 speed when the fourth button is pressed
        if (x==buttun[3]){
            // Create a maximum number of speed for up grade
            if (speed < 10)
            {
                speed++;
            }
        }
        // Add a small jet beside the main jet when the last button is pressed
        if (x==buttun[4]){
            // Create a maximum number of small jet for up grade
            if (numOfJet2 < 4)
            {
                numOfJet2++;
            }
        }
    }
    // Run the code
    public void act(){
        setUp();
        restartGame = new RestartGame(coin,hp,rateOfFire,damage,speed,numOfJet2);
    }
    // Set up hp, fire rate, damage, speed, and add jets
    public void setUp(){
        hp();
        rate();
        damage();
        speed();
        jet2();
    }
    // When the hp up grade button is pressed, add a green block to tell the player it up graded
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
    // When the fire rate up grade button is pressed, add a green block to tell the player it up graded
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
    // When the damage up grade button is pressed, add a green block to tell the player it up graded
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
    // When the speed up grade button is pressed, add a green block to tell the player it up graded
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
    // When the add jets up grade button is pressed, add a green block to tell the player it up graded
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
