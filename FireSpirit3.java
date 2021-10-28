import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireSpirit3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireSpirit3 extends Actor
{
   private int speed = -2;
    
    /**
     * Act - do whatever the FireSpirit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        move(speed);
        
    }
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            mirrorImages();
            speed *= -1;
            move(speed);
        }
    }
    
    private void mirrorImages() 
        {
            {   
            getImage().mirrorHorizontally();
            }
        }
}
