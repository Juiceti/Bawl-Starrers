import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World
{

    /**
     * Constructor for objects of class Map.
     * 
     */
    public Map()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
    }
    public void act(){
        Looser();
    }
    public void Looser(){
        BrawlChoose world = new BrawlChoose();
        showText("GAME OVER!" , 400, 300);
        Greenfoot.stop();
    }
}
