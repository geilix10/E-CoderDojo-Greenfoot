import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Obstacle
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Asteroid(int speed){
        super(speed);
    }
    public void act() 
    {
        if(!tryToDestroyWombat()){
            fall();
        }
    }
    
    public boolean tryToDestroyWombat(){
        Actor wombat = getOneObjectAtOffset(0,0, SpaceWombat.class);
        if(wombat != null){
            getWorld().removeObjects(getWorld().getObjects(null));
            Greenfoot.setWorld(new GameOver());
            return true;
        }
        return false;
    }
}
