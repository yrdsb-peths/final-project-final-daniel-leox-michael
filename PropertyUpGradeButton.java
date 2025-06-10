import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Press the button to upp grade
 * 
 * @author Leo, Daniel, Michael
 * @version 6/10/2025
 */
public class PropertyUpGradeButton extends Actor
{
    public void act()
    {
        // Set up grade image
        setImage("images/final3.png");
        GreenfootImage image = getImage();
        // Set size
        image.scale(75, 50);
        
        // Mouse click to up grade
        if(Greenfoot.mouseClicked(this)){
            UpGradeScreen world = (UpGradeScreen) getWorld();
            UpGradeScreen.upGrade(this);
        }
    }
}
