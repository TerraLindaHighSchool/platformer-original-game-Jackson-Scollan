import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrapDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrapDoor extends Actor
{
     private float yVelocity;
    private final float GRAVITY;
    
    public TrapDoor (float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        fall();
    }
    
    protected void fall()
    {
        
    }
}
