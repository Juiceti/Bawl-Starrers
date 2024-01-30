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
        addObject(new Text(), 400, 175);
        prepare();
        act();
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new Map());
        }
    }
    private void prepare(){
        Load load = new Load();
        addObject(load, 400, 175);
        showText("CLICK ANYWHERE TO DUEL", 400, 325);
        showText("HOLD SPACE FOR INSTRUCTIONS", 400, 375);
    }    
}

