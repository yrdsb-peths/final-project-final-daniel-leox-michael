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
    int hp;
    int rateOfFire;
    int damge;
    int speed;
    public UpGradeScreen(int coin,int hp,int rateOfFire,int damge,int speed)
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1); 
        GreenBlock[] block = new GreenBlock[5];
        this.hp=hp;
        this.rateOfFire=rateOfFire;
        this.damge=damge;
        this.speed=speed;
        for(int i=0; i<speed;i++){
            block[i] = new GreenBlock();
            addObject(block[i], 200+i*50,650);
        }
        
    }
}
