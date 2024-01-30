import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrawlChoose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrawlChoose extends World
{

    /**
     * Constructor for objects of class BrawlChoose.
     * 
     */
    public BrawlChoose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        act();
        prepareSprites();
        prepareText();
        addObject(new Test(), 100, 100);
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new Map());
        }
    }
    public void prepareSprites(){
        addObject(new DisCat(), 200, 200);
        addObject(new DisGoku(), 400, 200);
        addObject(new DisIchi(), 600, 200);
        addObject(new DisLuffy(), 200, 400);
        addObject(new DisNaruto(), 400, 400);
        addObject(new DisSans(), 600, 400);
    }
    public void prepareText(){
        showText("CHOOSE YOUR CHARACTER", 400, 75);
        showText("1 - KIT", 200, 275);
        showText("2 - GOKU", 400, 275);
        showText("3 - ICHIGO", 600, 275);
        showText("4 - LUFFY", 200, 475);
        showText("5 - NARUTO", 400, 475);
        showText("6 - SANS", 600, 475);
    }
    public void test(){
        Lobby lobby = new Lobby();
        String newTest = lobby.test;
        showText(newTest, 400, 300);
    }
}
