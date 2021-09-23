import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
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

        SmBrickWall smbrickwall4 = new SmBrickWall();
        addObject(smbrickwall4,1150,100);
        
        SmBrickWall smBrickWall5 = new SmBrickWall();
        addObject(smBrickWall5,1050,130);

        Player player = new Player();
        addObject(player,41,753);

        Floor floor = new Floor();
        addObject(floor,600,800);

        BrickWall brickwall = new BrickWall();
        addObject(brickwall,650,500); 

        BrickWall brickwall3 = new BrickWall();
        addObject(brickwall3,550,150);

        BrickWall brickwall2 = new BrickWall();
        addObject(brickwall2,100,350);

        TrapDoor trapdoor = new TrapDoor();
        addObject(trapdoor,300,650); 

        TrapDoor trapdoor2 = new TrapDoor();
        addObject(trapdoor2,775,350); 

        TrapDoor trapdoor3 = new TrapDoor();
        addObject(trapdoor,700,350);

        SmBrickWall smbrickwall = new SmBrickWall();
        addObject(smbrickwall,1100,650);

        SmBrickWall smbrickwall2 = new SmBrickWall();
        addObject(smbrickwall2,1100,400);

        Gem gem = new Gem();
        addObject(gem,1100, 355);

        Gem gem2 = new Gem();
        addObject(gem2,1100, 605);

        Gem gem3 = new Gem();
        addObject(gem3,130, 305);
        
        SmBrickWall smbrickwall3 = new SmBrickWall();
        addObject(smbrickwall3,850,350);

        Bomb bomb = new Bomb();
        addObject(bomb,300,765);

        Bomb bomb2 = new Bomb();
        addObject(bomb2,725,455);
        
        Bomb bomb3 = new Bomb();
        addObject(bomb3,25,305);


        
        
    }
}
