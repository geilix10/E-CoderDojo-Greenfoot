import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    private int speed = 5;
    public Obstacle(int speed){
        this.speed = speed;
    }
    
    public void fall(){
        setRotation(90);
        move(speed);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
