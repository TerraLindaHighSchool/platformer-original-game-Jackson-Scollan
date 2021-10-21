import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 6;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
 
    }
    
    public void act()
    {
        spawn();
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
        addObject(new TrapDoor(GRAVITY),1030,100);

        addObject(new SmBrickWall(),850,250);

        addObject(new BrickWall(),1030,400);
        addObject(new Bomb(GRAVITY),1025,355);

        addObject(new SmBrickWall(),1150,700);
        addObject(new Gem(),1150, 665);
        addObject(new TrapDoor(GRAVITY),1030,700);
        addObject(new SmBrickWall(),910,700);

        addObject(new SmBrickWall(),650,775);
        addObject(new SmBrickWall(),620,500);

        addObject(new SmBrickWall(),490,130);
        addObject(new Gem(),460, 95);

        addObject(new BrickWall(),240,625);
        addObject(new Bomb(GRAVITY),220,580);

        addObject(new SmBrickWall(),240,475);
        addObject(new TrapDoor(GRAVITY),120,475);
        addObject(new Gem(),110, 440);

        addObject(new SmBrickWall(),60,325);
        addObject(new TrapDoor(GRAVITY),180,325);
        addObject(new SmBrickWall(),300,325);

        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, 
                MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);

        addObject(player, 45, 750); 

        addObject(new Floor(),600,800);
        addObject(new Bomb(GRAVITY),800,765);

        
        
        Egg egg = new Egg();
        addObject(egg,619,342);
    }
    
     public void spawn()
    {
        if(Math.random() < 0.0013)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        
        if(Math.random() < 0.024)
        {
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }   
}
