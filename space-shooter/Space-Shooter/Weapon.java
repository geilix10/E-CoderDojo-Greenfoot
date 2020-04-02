import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    public void shoot(){
        setRotation(-90);
        move(10);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
