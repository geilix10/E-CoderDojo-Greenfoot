import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWombat extends Actor
{
    private final int movementSpeed = 4;
    private boolean foundLaserUpgrade = false;
    /**
     * Act - do whatever the SpaceWombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        basicMovement();
        shootLaserBeam();
        collectUpgrades();
    }
    
    public void basicMovement(){
        setRotation(-90);
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-this.movementSpeed,getY());
        }
        else if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+this.movementSpeed,getY());
        }
    }
    
    public void shootLaserBeam(){
        String key = Greenfoot.getKey();
        if("space".equals(key)){
            if(this.foundLaserUpgrade){
                getWorld().addObject(new BlueLaserBeam(), getX(), getY());
            }
            else{
                getWorld().addObject(new LaserBeam(), getX(), getY());
            }
            //Greenfoot.playSound("laser.wav");
        }
    }
    
    public void collectUpgrades(){
        Actor upgrade = getOneObjectAtOffset(0,0,LaserUpgrade.class);
        if(upgrade != null){
            getWorld().removeObject(upgrade);
            this.foundLaserUpgrade = true;
        }
    }
}
