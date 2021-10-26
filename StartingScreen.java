import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingScreen extends World
{
    
    
    /**
     * Constructor for objects of class StartingScreen.
     * 
     */
    public StartingScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
    }
    
    public void act()
    {
        checkKeyPress();
        
    }
    
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            greenFoot.setWorld(Level1);
        }
    }
}
