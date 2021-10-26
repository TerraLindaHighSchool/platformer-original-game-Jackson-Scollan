import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 6;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
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
        addObject(door,1150,65);
        addObject(new SmMossWall(),1150,115);

        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, 
                MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);

        addObject(player, 45, 750); 

        addObject(new Floor(),600,800);
        addObject(new FireSpirit(),600,770);
        

        addObject(new SmMossWall(),550,720);
        
        addObject(new TrapDoor2(),330,620);
        addObject(new TrapDoor2(),500,435);

        addObject(new SmMossWall(),715,530);
        addObject(new SmMossWall(),85,540);
        addObject(new Bomb(GRAVITY),28,495);
        
        addObject(new SmMossWall(),250,345);
        addObject(new Gem(),250,310);

        
        addObject(new MossWall(),990,660);
        addObject(new FireSpirit(),990,620);
        addObject(new Bomb(GRAVITY),845,615);
        addObject(new Port1(),1150,620);

        
        addObject(new SmMossWall(),1150,320);
        
        addObject(new SmMossWall(),800,340);
        addObject(new TrapDoor2(),800,150);
        addObject(new Gem(),800,115);
        


        addObject(new MossWall(),240,200);
        addObject(new Gem(),200,165);
        addObject(new Egg(),400,160);
        addObject(new FireSpirit(),300,160);       
        addObject(new ExitPort2(),50,160);
        




        

        
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
