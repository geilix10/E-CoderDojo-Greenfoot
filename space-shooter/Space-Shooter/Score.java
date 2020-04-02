import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int score = 0;
    public void act() 
    {
        GreenfootImage image = new GreenfootImage("Score: " + this.score,24, Color.GREEN, Color.BLACK);
        setImage(image);
    }    
    
    public static void scoreUp(){
        Score.score++;
    }
}
