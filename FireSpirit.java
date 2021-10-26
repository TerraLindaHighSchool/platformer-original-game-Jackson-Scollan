import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireSpirit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireSpirit extends Actor
{
    /**
     * Act - do whatever the FireSpirit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        turnBack();
        
    }
    
    public void turnBack()
    {
        if(getX()==750)
        {
            mirrorImages();
            move(2);
        }
        
        if(getX()==480)
        {
            mirrorImages();
            move(2);
        }
    }
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            mirrorImages();
            move(2);
        }
   
    }
    
    private void mirrorImages() 
        {
            {   
            getImage().mirrorHorizontally();
            }
        }
    
}
    
    
    

