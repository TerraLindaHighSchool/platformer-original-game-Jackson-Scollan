import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");

    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);

        Door door = new Door();
        addObject(door,1150,50);


        addObject(new SmBrickWall(),1150,100);
        addObject(new SmBrickWall(),1050,130);
        addObject(new Player(),41,753);
        addObject(new Floor(),600,800);
        addObject(new BrickWall(),650,500); 
        addObject(new BrickWall(),550,150);
        addObject(new BrickWall(),100,350);
        addObject(new TrapDoor(GRAVITY),300,650); 
        addObject(new TrapDoor(GRAVITY),775,350); 
        addObject(new TrapDoor(GRAVITY),700,350);
        addObject(new SmBrickWall(),1100,650);
        addObject( new SmBrickWall(),1100,400);
        addObject(new Gem(),1100, 355);
        addObject(new Gem(),1100, 605);
        addObject(new Gem(),130, 305);
        addObject(new SmBrickWall(),850,350);
        addObject(new Bomb(GRAVITY),300,765);
        addObject(new Bomb(GRAVITY),725,455);
        addObject(new Bomb(GRAVITY),25,305);


        
        
    }
}
