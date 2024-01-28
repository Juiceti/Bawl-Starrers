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
        act();
        blah();
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new Map());
        }
    }
    private void prepare(){
        Load load = new Load();
        addObject(load, 400, 175);
        addObject(new Text(), getWidth() / 2, getHeight() / 2);
        showText("CLICK ANYWHERE TO DUEL", 400, 325);
        showText("B - HOW TO PLAY", 400, 375);
        showText("C - Credits", 400, 425);
    }    
    private void pressB(){
        if(Greenfoot.isKeyDown("b")){
            showText("", 400, 325);
            showText("", 400, 375);
            showText("", 400, 425);
        }
    }
    private void switchc(){
        
    }
    public void blah()
    {
        // Check if a specific key is pressed (for example, the spacebar)
        if (Greenfoot.isKeyDown("space")) {
            // Display text when the spacebar is pressed
            showText("Spacebar pressed", getWidth() / 2, getHeight() / 2);
        } else {
            // Clear the text
            showText("", getWidth() / 2, getHeight() / 2);
        }
    }
}

