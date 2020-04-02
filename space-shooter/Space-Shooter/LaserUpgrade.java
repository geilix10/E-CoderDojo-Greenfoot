import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserUpgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserUpgrade extends Obstacle
{
    public LaserUpgrade(int speed){
        super(speed);
    }
    
    /**
     * Act - do whatever the LaserUpgrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall();
    }    
}
