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
    static GreenBlock[] block = new GreenBlock[5];
    static PropertyUpGradeButton[] buttun = new PropertyUpGradeButton[5];
    public UpGradeScreen(int coin,int hp,int rateOfFire,int damge,int speed)
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1); 
        this.hp=hp;
        this.coin=coin;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
        for(int i=0; i<5;i++){
            block[i] = new GreenBlock();
            addObject(block[i], 20+i*50,650);
        }
        for(int i=0; i<5;i++){
            buttun[i] = new PropertyUpGradeButton();
            addObject(buttun[i], 80,80+100*i);
        }
        
    }
    public static void upGrade(PropertyUpGradeButton x){
        if (x==buttun[0]){
            hp+=10;
        }
        if(x==buttun[4]){
            MyWorld upGradeScreen = new MyWorld(coin,hp,rateOfFire,damge,speed);
            Greenfoot.setWorld(upGradeScreen);
        }
    }
}
