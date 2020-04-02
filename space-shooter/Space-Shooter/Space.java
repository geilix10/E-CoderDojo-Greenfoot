import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    private final int width = 1280;
    private int timeForAsteroidCreation = 0;
    private int timeForUpgrade = Greenfoot.getRandomNumber(1000);
    public void act(){
        createAsteroids();
        createLaserUpgrades();
        
    }
    
    public void createLaserUpgrades(){
        if(this.timeForUpgrade < 0){
            int x = Greenfoot.getRandomNumber(1280);
            addObject(new LaserUpgrade(Greenfoot.getRandomNumber(12)),x, 0);
            this.timeForUpgrade = Greenfoot.getRandomNumber(1000);
        }
        else{
            this.timeForUpgrade--;
        }
    }
    
    public void createAsteroids(){
        if(this.timeForAsteroidCreation < 0){
            int x = Greenfoot.getRandomNumber(1280);
            addObject(new Asteroid(Greenfoot.getRandomNumber(12)),x, 0);
            this.timeForAsteroidCreation = 20;
        }
        else{
            this.timeForAsteroidCreation--;
        }
    }
    
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SpaceWombat spaceWombat = new SpaceWombat();
        addObject(spaceWombat,602,646);
        addObject(new Score(),120,80);
    }
}
