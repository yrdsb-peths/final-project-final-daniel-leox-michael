import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PropertyUpGradeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PropertyUpGradeButton extends Actor
{
    /**
     * Act - do whatever the PropertyUpGradeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage("images/final3.png");
        GreenfootImage image = getImage();
        image.scale(100, 50);
        if(Greenfoot.mouseClicked(this)){
            UpGradeScreen world = (UpGradeScreen) getWorld();
            UpGradeScreen.upGrade(this);
        }
    }
}
