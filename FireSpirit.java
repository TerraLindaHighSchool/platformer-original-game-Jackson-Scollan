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
        move(-2);
        turnAtEdge();
        turnOnCollison();
        mirrorImages();
    }
    
    public void turnOnCollison()
    {
        if(isTouching(Dangerv2.class))
        {
              mirrorImages();
        }
    }
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            mirrorImages();
        }
    }
    
    private void mirrorImages() 
    {
        {
            mirrorHorizontally();
        }
    }
    
}
    
    
    

