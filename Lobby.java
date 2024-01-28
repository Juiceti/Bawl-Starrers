import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobby extends World
{

    /**
     * Constructor for objects of class Lobby.
     * 
     */
    public Lobby()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
        setMap();
    }
    private void prepare(){
        Load load = new Load();
        addObject(load, 400, 175);
        showText("A - DUEL", 400, 325);
        showText("B - HOW TO PLAY", 400, 375);
        showText("C - Credits", 400, 425);
    }
    private void setMap(){
        if(Greenfoot.isKeyDown("a")){
            Greenfoot.setWorld(new Map());
        }
    }
    private void switchb(){
        
    }
    private void switchc(){
        
    }
}
